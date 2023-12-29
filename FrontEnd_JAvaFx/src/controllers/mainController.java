package controllers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.ResourceBundle;

import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Reflection;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class mainController implements Initializable {

    @FXML
    private ImageView foto_fondo;
    
    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private Button btn_añadir;

    @FXML
    private Button btn_añadir1;

    @FXML
    private Button btn_lista;

    @FXML
    private TextField tf_Email;

    @FXML
    private PasswordField tf_passWord;
    
    @FXML
    private AnchorPane anchorPane;

    
    
    

    byte[] fotobytes;
    String codificadoString;

    @FXML
    void EventoClickInicio(MouseEvent event) {

        // Crear un FileChooser
        FileChooser fileChooser = new FileChooser();

        // Configurar el filtro de archivos para mostrar solo imágenes
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Archivos de imagen", "*.jpg", "*.jpeg", "*.png", "*.gif");
        fileChooser.getExtensionFilters().add(imageFilter);

        // Obtener la ventana actual
        Stage stage = (Stage) btn_añadir.getScene().getWindow();

        // Mostrar el diálogo de selección de archivos
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            try {
                // Cargar la imagen seleccionada en el ImageView
                Image image = new Image(file.toURI().toString());
                // img_avatar.setImage(image);

                // Leer los bytes de la imagen seleccionada
                FileInputStream fileInputStream = new FileInputStream(file);
                ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    byteOutputStream.write(buffer, 0, bytesRead);
                }
                fotobytes = byteOutputStream.toByteArray();

                // Cerrar los streams
                byteOutputStream.close();
                fileInputStream.close();

                // Codificar los bytes en base64
                codificadoString = Base64.getEncoder().encodeToString(fotobytes);

                // Mostrar el string codificado
                System.out.println(codificadoString);
                
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    

    @FXML
    void EventoClickLogin(MouseEvent event) {
    	
       	Alert informationDialogs = new Alert(Alert.AlertType.INFORMATION);
    	informationDialogs.setHeaderText(null);
        informationDialogs.setContentText("Espere a que se inicie sesion..");
        informationDialogs.showAndWait();
        
    	//Aqui empieza la clase
    	 try {
    	        String email = tf_Email.getText();
    	        String password = tf_passWord.getText();
    	        System.out.println("contraseña es: "+password);

    	        String urlString = "https://localhost:7264/api/Usuario/Login?email=" + email + "&password=" + password;
    	        URL url = new URL(urlString);
    	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    	        connection.setRequestMethod("POST");

    	        int responseCode = connection.getResponseCode();
    	        if (responseCode == HttpURLConnection.HTTP_OK) {
    	        	
    	        	Alert informationDial = new Alert(Alert.AlertType.INFORMATION);
    	        	informationDial.setHeaderText(null);
    	        	informationDial.setContentText("Iniciado Correctamente, Bienvenido.");
    	        	informationDial.showAndWait();
    	            
    	            // Lectura de la respuesta si es necesario
    	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    	            String responseBody = reader.readLine();
    	            reader.close();
    	            
    	            System.out.println(responseBody);
    //--------------------------------------PARTE USUARIO	                	            
    	          if(responseBody.equalsIgnoreCase("usuario")) {
    	        	  
			    	       cargarDatosUsuario();
			    	       if(tieneMonitor) {
			    	    	   System.out.println("si");
			    	    	   System.out.println("SitieneMonitor " + tieneMonitor);
			   	            
				            	// Cargar la vista Principal.fxml
			    	            FXMLLoader loader = new FXMLLoader();
			    	            loader.setLocation(getClass().getResource("/views/Principal.fxml"));
			    	            Parent registrarseRoot = loader.load();
			    	            
			        	        PaneAñadirSWitch.getChildren().clear();
			    	            PaneAñadirSWitch.getChildren().setAll(registrarseRoot);
			    	            
			    	            ((PrincipalController)loader.getController()).setStageUsuario(rootParent, scene, stage);

			    	            
			    	       }else {
			    	    	   System.out.println("no");
			    	    	   System.out.println("NoTieneMonitor " + tieneMonitor);
					                // Cargar la vista Principal.fxml
				    	            FXMLLoader loader = new FXMLLoader();
				    	            loader.setLocation(getClass().getResource("/views/Monitor.fxml"));
				    	            Parent registrarseRoot = loader.load();

			        	        PaneAñadirSWitch.getChildren().clear();
			    	            PaneAñadirSWitch.getChildren().setAll(registrarseRoot); 
			    	            System.out.println("no tengo monitor y las escenas son.");
			    	    		System.out.println(rootParent+" "+this.scene+""+this.stage);
			    	            ((MonitorController)loader.getController()).setStage(rootParent,scene, stage);

			    	       }

    	    }
    	          
    	    //-----PARTE DEL MONITOR      
    	          
    	          if(responseBody.equalsIgnoreCase("monitor")) {
    	        	  System.out.println("monitor");
    	        	  
    	        		// Cargar la vista Principal.fxml
	    	            FXMLLoader loader = new FXMLLoader();
	    	            loader.setLocation(getClass().getResource("/views/Principal.fxml"));
	    	            Parent registrarseRoot = loader.load();
	    	            
	        	        PaneAñadirSWitch.getChildren().clear();
	    	            PaneAñadirSWitch.getChildren().setAll(registrarseRoot);
	    	            
	    	            ((PrincipalController)loader.getController()).setStageMonitor(rootParent, scene, stage);
    	        	     	        	  
    	          }
     
    	          
    	        } else {
    	            // Error en la solicitud
    	            System.out.println("Error en la solicitud: " + responseCode);
    	         	Alert informationDials = new Alert(Alert.AlertType.WARNING);
    	         	informationDials.setHeaderText(null);
    	         	informationDials.setContentText("No existe el usuario, Intentelo de nuevo.");
    	         	informationDials.showAndWait();
    	        }

    	        connection.disconnect();
    	    } catch (IOException e) {
    	     	Alert information = new Alert(Alert.AlertType.WARNING);
    	     	information.setHeaderText(null);
    	     	information.setContentText("No existe conexion con el servidor.");
    	     	information.showAndWait();
    	        e.printStackTrace();
    	    }
    }

    @FXML
    void EventoClickRegistrar(MouseEvent event) {
    	
      	 try {
    	        FXMLLoader loader = new FXMLLoader();
    	        loader.setLocation(getClass().getResource("/views/Registrarse.fxml"));
    	        Parent registrarseRoot = loader.load();
    	        anchorPane.getChildren().clear();
    	        anchorPane.getChildren().setAll(registrarseRoot);
    	        
    	        
                ((RegistrarseController)loader.getController()).setStage(rootParent,scene, stage);

    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }
      	 
      	 
    }

	DropShadow sombreaDropShadow;
	Reflection relexionReflection;
	Lighting iluminacionLighting;
   
    @FXML
    void EventoEnteredARegistrar(MouseEvent event) {

    }

    @FXML
    void EventoEnteredInicio(MouseEvent event) {
    	
    }

    @FXML
    void EventoEnteredLogin(MouseEvent event) {
    	 sombreaDropShadow =new DropShadow();
    	 sombreaDropShadow.setRadius(20);
    	 sombreaDropShadow.setColor(Color.WHITESMOKE);
    	
    	 btn_añadir1.setEffect(sombreaDropShadow);
    }

    @FXML
    void EventoExistedInicio(MouseEvent event) {

    }

    @FXML
    void EventoExitedLogin(MouseEvent event) {
    	 btn_añadir1.setEffect(null);
    }

    @FXML
    void EventoExitedRegistrar(MouseEvent event) {
    	btn_añadir.setEffect(null);
    }
    
    String contraseñaString;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		        
		btn_lista.setVisible(false);
		// TODO Auto-generated method stub
		 // Establecer restricciones del AnchorPane
	    AnchorPane.setTopAnchor(anchorPane, 0.0);
	    AnchorPane.setBottomAnchor(anchorPane, 0.0);
	    AnchorPane.setLeftAnchor(anchorPane, 0.0);
	    AnchorPane.setRightAnchor(anchorPane, 0.0);
       Image image1 = new Image(getClass().getResourceAsStream("/img/Main.jpg"));
	    foto_fondo.setImage(image1);

	    // Establecer el ajuste automático del tamaño del ImageView al PaneAñadirSWitch
	    foto_fondo.fitWidthProperty().bind(PaneAñadirSWitch.widthProperty());
	    foto_fondo.fitHeightProperty().bind(PaneAñadirSWitch.heightProperty());
	    foto_fondo.setPreserveRatio(false);
	    foto_fondo.setSmooth(false);
	    
	 
	}
		
boolean tieneMonitor=false;
	private void cargarDatosUsuario() {
	    try {
	        // Construir la URL de la solicitud GET
	        URL url = new URL("https://localhost:7264/api/Usuario/CargarDatosUsuario");
	        
	        // Crear la conexión HTTP
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        
	        // Obtener la respuesta de la conexión
	        int responseCode = connection.getResponseCode();
	        
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            // Leer la respuesta JSON
	            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            StringBuilder response = new StringBuilder();
	            String line;
	            
	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }
	            
	            reader.close();
	            
	            // Parsear la respuesta JSON y asignar los valores a las variables correspondientes
	            JSONObject usuarioJson = new JSONObject(response.toString());
	            
	            tieneMonitor = usuarioJson.getBoolean("tienemonitor");
	          	            
	  
	            
	        } else {
	            // Error en la solicitud HTTP
	            System.out.println("Error en la solicitud HTTP: " + responseCode);
	        }
	        
	        // Cerrar la conexión
	        connection.disconnect();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}




	Parent rootParent;
	Scene scene;
	Stage stage;
	
	public void setStage(Parent root, Scene scene, Stage stage) {
		
		this.rootParent = root;
		this.scene = scene;
		this.stage = stage;
		
	}
	

}
