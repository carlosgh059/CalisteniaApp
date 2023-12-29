package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ResourceBundle;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



public class MonitorController implements Initializable{
    @FXML
    private VBox VBOXENETRENADOR;
    @FXML
    private HBox HBoxFOTO;
    @FXML
    private ImageView fotoEntrenador;

    @FXML
    private ImageView foto_fondo;

	   @FXML
	    private Label Label1Monitor1;

	    @FXML
	    private Label Label1Monitor2;

	    @FXML
	    private Label Label1Monitor3;

	 

	    @FXML
	    private Label LabelNombrePersona;

	    @FXML
	    private AnchorPane PaneAñadirSWitch;


	    @FXML
	    private Button btn_Inicio;

	    @FXML
	    private ImageView foto1;

	    @FXML
	    private ImageView foto2;

	    @FXML
	    private ImageView foto3;
	
	
	
    @FXML
    private AnchorPane anchorPane;
  
    @FXML
    void EventoClickFoto1(MouseEvent event) {
        
    	
    	Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmDialog.setHeaderText("¿Estás seguro de que deseas elegir a Adrian como monitor?");
        confirmDialog.setContentText("Esta acción es irreversible.");
        confirmDialog.showAndWait().ifPresent(response -> {
        	
            if (response == ButtonType.OK) {
            	
                Alert successDialoguns = new Alert(Alert.AlertType.INFORMATION);
                successDialoguns.setHeaderText(null);
                successDialoguns.setContentText("Registro Completado");
                successDialoguns.showAndWait();
                
                
                	try {
                	
                	//-------------------------------------------------
                    //aqui
                    CloseableHttpClient httpClient = HttpClients.createDefault();

                    //la url
                    String url = "https://localhost:7264/api/Usuario/ActualizarTablaMonitor/1";
                	System.out.println(2);

                    // el hhttpGet
                    HttpPut httpGet = new HttpPut(url);
                    
                    // El get
                    CloseableHttpResponse responses = httpClient.execute(httpGet);
                    
                    // Obtenemos la respuesta
                    HttpEntity responseEntity = responses.getEntity();
                    String responseBody;
					
						responseBody = EntityUtils.toString(responseEntity);
					
               if(responseBody.equalsIgnoreCase("si")) {
                    	
                    	  Alert successDialogs = new Alert(Alert.AlertType.INFORMATION);
                 	      successDialogs.setHeaderText(null);
                 	     successDialogs.setContentText("Monitor Elegido Completado");
                      //    successDialog.showAndWait();
                    	
		             	        FXMLLoader loader = new FXMLLoader();
		             	        loader.setLocation(getClass().getResource("/views/Principal.fxml"));
		             	        Parent registrarseRoot = loader.load();
		             	        
		             	        
		             	        anchorPane.getChildren().clear();
		             	        anchorPane.getChildren().setAll(registrarseRoot);
		             	       System.out.println("Dentro la opcion ede monitor 1");
		             			System.out.println(rootParent+" "+this.scene+""+this.stage);
			    	            ((PrincipalController)loader.getController()).setStageUsuario(rootParent,scene, stage);

		             	        
             	       Alert successDialogsers = new Alert(Alert.AlertType.INFORMATION);
	             	   successDialogsers.setHeaderText(null);
	             	   successDialogsers.setContentText("Bienvenido a la aplicacion");
	             	  successDialogsers.showAndWait();
             	        
                    }else {
                    	
                    	 Alert successDialogse = new Alert(Alert.AlertType.WARNING);
                    	 successDialogse.setHeaderText(null);
                    	 successDialogse.setContentText("Error vuelva a intentarlo");
                    	 successDialogse.showAndWait();
                    }
                   
                    // cerramos para cerrar
                     responses.close();
                    httpClient.close();		
                	
                	
                	//--------------------------------------------------
                	
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	
               
 
              //  successDialoguns.showAndWait();
                
                
            }
        });
    
    }

    @FXML
    void EventoClickFoto2(MouseEvent event) {
    	
    	Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmDialog.setHeaderText("¿Estás seguro de que deseas elegir al entrenador Vera como monitor?");
        confirmDialog.setContentText("Esta acción es irreversible.");
        confirmDialog.showAndWait().ifPresent(response -> {
        	
            if (response == ButtonType.OK) {
            	
                Alert successDialoguns = new Alert(Alert.AlertType.INFORMATION);
                successDialoguns.setHeaderText(null);
                successDialoguns.setContentText("Registro Completado");
                successDialoguns.showAndWait();
                
                
                	try {
                	
                	//-------------------------------------------------
                    //aqui
                    CloseableHttpClient httpClient = HttpClients.createDefault();

                    //la url
                    String url = "https://localhost:7264/api/Usuario/ActualizarTablaMonitor/2";
                	System.out.println(2);

                    // el hhttpGet
                    HttpPut httpGet = new HttpPut(url);
                    
                    // El get
                    CloseableHttpResponse responses = httpClient.execute(httpGet);
                    
                    // Obtenemos la respuesta
                    HttpEntity responseEntity = responses.getEntity();
                    String responseBody;
					
						responseBody = EntityUtils.toString(responseEntity);
					
               if(responseBody.equalsIgnoreCase("si")) {
                    	
                    	  Alert successDialogs = new Alert(Alert.AlertType.INFORMATION);
                 	      successDialogs.setHeaderText(null);
                 	     successDialogs.setContentText("Monitor Elegido Completado");
                      //    successDialog.showAndWait();
                    	
		             	        FXMLLoader loader = new FXMLLoader();
		             	        loader.setLocation(getClass().getResource("/views/Principal.fxml"));
		             	        Parent registrarseRoot = loader.load();

		             	        System.out.println("Dentro la opcion ede monitor 2");
		             			System.out.println(rootParent+" "+this.scene+""+this.stage);
		             	        
		             	        anchorPane.getChildren().clear();
		             	        anchorPane.getChildren().setAll(registrarseRoot);
		             	       System.out.println("Dentro la opcion ede monitor 2");
		             			System.out.println(rootParent+" "+this.scene+""+this.stage);
			    	            ((PrincipalController)loader.getController()).setStageUsuario(rootParent, scene, stage);
		             	        
		             	        
             	       Alert successDialogsers = new Alert(Alert.AlertType.INFORMATION);
	             	   successDialogsers.setHeaderText(null);
	             	   successDialogsers.setContentText("Bienvenido a la aplicacion");
	             	  successDialogsers.showAndWait();
             	        
                    }else {
                    	
                    	 Alert successDialogse = new Alert(Alert.AlertType.WARNING);
                    	 successDialogse.setHeaderText(null);
                    	 successDialogse.setContentText("Error vuelva a intentarlo");
                    	 successDialogse.showAndWait();
                    }
                   
                    // cerramos para cerrar
                     responses.close();
                    httpClient.close();		
                	
                	
                	//--------------------------------------------------
                	
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	
               
 
              //  successDialoguns.showAndWait();
                
                
            }
        });


    }

    @FXML
    void EventoClickFoto3(MouseEvent event) {
     	
    	Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmDialog.setHeaderText("¿Estás seguro de que deseas elegir a Edu como monitor?");
        confirmDialog.setContentText("Esta acción es irreversible.");
        confirmDialog.showAndWait().ifPresent(response -> {
        	
            if (response == ButtonType.OK) {
            	
                Alert successDialoguns = new Alert(Alert.AlertType.INFORMATION);
                successDialoguns.setHeaderText(null);
                successDialoguns.setContentText("Registro Completado");
                successDialoguns.showAndWait();
                
                
                	try {
                	
                	//-------------------------------------------------
                    //aqui
                    CloseableHttpClient httpClient = HttpClients.createDefault();

                    //la url
                    String url = "https://localhost:7264/api/Usuario/ActualizarTablaMonitor/3";
                	System.out.println(2);

                    // el hhttpGet
                    HttpPut httpGet = new HttpPut(url);
                    
                    // El get
                    CloseableHttpResponse responses = httpClient.execute(httpGet);
                    
                    // Obtenemos la respuesta
                    HttpEntity responseEntity = responses.getEntity();
                    String responseBody;
					
						responseBody = EntityUtils.toString(responseEntity);
					
               if(responseBody.equalsIgnoreCase("si")) {
                    	
                    	  Alert successDialogs = new Alert(Alert.AlertType.INFORMATION);
                 	      successDialogs.setHeaderText(null);
                 	     successDialogs.setContentText("Monitor Elegido Completado");
                      //    successDialog.showAndWait();
                    	
		             	        FXMLLoader loader = new FXMLLoader();
		             	        loader.setLocation(getClass().getResource("/views/Principal.fxml"));
		             	        Parent registrarseRoot = loader.load();
		             	        
		             	        System.out.println(rootParent);
		             	        System.out.println(scene);
		             	        System.out.println(stage);
		             	        anchorPane.getChildren().clear();
		             	        anchorPane.getChildren().setAll(registrarseRoot);
		             	        
		             	        System.out.println("Dentro la opcion ede monitor 3");
		             			System.out.println(rootParent+" "+this.scene+""+this.stage);
			    	            ((PrincipalController)loader.getController()).setStageUsuario(rootParent, scene, stage);
		             	        
		             	        
             	       Alert successDialogsers = new Alert(Alert.AlertType.INFORMATION);
	             	   successDialogsers.setHeaderText(null);
	             	   successDialogsers.setContentText("Bienvenido a la aplicacion");
	             	  successDialogsers.showAndWait();
             	        
                    }else {
                    	
                    	 Alert successDialogse = new Alert(Alert.AlertType.WARNING);
                    	 successDialogse.setHeaderText(null);
                    	 successDialogse.setContentText("Error vuelva a intentarlo");
                    	 successDialogse.showAndWait();
                    }
                   
                    // cerramos para cerrar
                     responses.close();
                    httpClient.close();		
                	
                	
                	//--------------------------------------------------
                	
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	
               
 
              //  successDialoguns.showAndWait();
                
                
            }
        });
    	
    }

    @FXML
    void EventoClickInicio(MouseEvent event) {
     	 try {
 	        FXMLLoader loader = new FXMLLoader();
 	        loader.setLocation(getClass().getResource("/views/main.fxml"));
 	        Parent registrarseRoot = loader.load();

 	       anchorPane.getChildren().clear();
	        anchorPane.getChildren().setAll(registrarseRoot);
	         	        
 	    } catch (IOException e) {
 	        e.printStackTrace();
 	    }
    }
    DropShadow sombreaDropShadow;

    @FXML
    void EventoEnteredFoto1(MouseEvent event) {
   	 sombreaDropShadow =new DropShadow();
	 sombreaDropShadow.setRadius(20);
	 sombreaDropShadow.setColor(Color.WHITESMOKE);
	
	 foto1.setEffect(sombreaDropShadow);
	 
    	 Image image123 = new Image(getClass().getResourceAsStream("/img/adrianEntrenador.png"));
		 fotoEntrenador.setImage(image123);	
	        fotoEntrenador.fitWidthProperty().bind(HBoxFOTO.widthProperty());
	        fotoEntrenador.fitHeightProperty().bind(HBoxFOTO.heightProperty());
    }

    @FXML
    void EventoEnteredFoto2(MouseEvent event) {
   	 sombreaDropShadow =new DropShadow();
   	 sombreaDropShadow.setRadius(20);
   	 sombreaDropShadow.setColor(Color.WHITESMOKE);
   	
   	 foto2.setEffect(sombreaDropShadow);
    	 Image image123 = new Image(getClass().getResourceAsStream("/img/VeraPersonalElegir.png"));
		 fotoEntrenador.setImage(image123);	
	        fotoEntrenador.fitWidthProperty().bind(HBoxFOTO.widthProperty());
	        fotoEntrenador.fitHeightProperty().bind(HBoxFOTO.heightProperty());
    }

    @FXML
    void EventoEnteredFoto3(MouseEvent event) {
   	 sombreaDropShadow =new DropShadow();
   	 sombreaDropShadow.setRadius(20);
   	 sombreaDropShadow.setColor(Color.WHITESMOKE);
   	
   	 foto3.setEffect(sombreaDropShadow);
    	 Image image123 = new Image(getClass().getResourceAsStream("/img/EduEntrenador.png"));
		 fotoEntrenador.setImage(image123);	
	        fotoEntrenador.fitWidthProperty().bind(HBoxFOTO.widthProperty());
	        fotoEntrenador.fitHeightProperty().bind(HBoxFOTO.heightProperty());
	 
    }

    @FXML
    void EventoEnteredInicio(MouseEvent event) {
     	 sombreaDropShadow =new DropShadow();
    	 sombreaDropShadow.setRadius(20);
    	 sombreaDropShadow.setColor(Color.WHITESMOKE);
    	
    	 btn_Inicio.setEffect(sombreaDropShadow);
    }

    @FXML
    void EventoExistedInicio(MouseEvent event) {
    	btn_Inicio.setEffect(null);
    }

    @FXML
    void EventoExitedFoto1(MouseEvent event) {
   	 fotoEntrenador.setImage(null);
   	 foto1.setEffect(null);

    }

    @FXML
    void EventoExitedFoto2(MouseEvent event) {
   	 fotoEntrenador.setImage(null);
   	 foto2.setEffect(null);

    }

    @FXML
    void EventoExitedFoto3(MouseEvent event) {	    
	 fotoEntrenador.setImage(null);
   	 foto3.setEffect(null);

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//COLOCAR LA IMAGEN PRINCIPAL DEL ENTRENADOR PRINCIPAL
		 Image image123 = new Image(getClass().getResourceAsStream("/img/adrianEntrenador.png"));
		 fotoEntrenador.setImage(image123);	
	        fotoEntrenador.fitWidthProperty().bind(HBoxFOTO.widthProperty());
	        fotoEntrenador.fitHeightProperty().bind(HBoxFOTO.heightProperty());

	    // Carga la imagen en el ImageView al inicializar la vista
        Image image1 = new Image(getClass().getResourceAsStream("/img/adrianM.png"));
        foto1.setImage(image1);	
        Image image2 = new Image(getClass().getResourceAsStream("/img/veraM.png"));
        foto2.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("/img/eduM.png"));
        foto3.setImage(image3);
      
        Image image12 = new Image(getClass().getResourceAsStream("/img/LOGO.jpg"));
	    foto_fondo.setImage(image12);

	    // Establecer el ajuste automático del tamaño del ImageView al PaneAñadirSWitch
	    foto_fondo.fitWidthProperty().bind(PaneAñadirSWitch.widthProperty());
	    foto_fondo.fitHeightProperty().bind(PaneAñadirSWitch.heightProperty());
	    foto_fondo.setPreserveRatio(false);
	    foto_fondo.setSmooth(false);
	    
           
        // Ajustar la imagen al tamaño de la celda
        foto1.setPreserveRatio(true);
      
    
        
		 // Establecer restricciones del AnchorPane
	    AnchorPane.setTopAnchor(anchorPane, 0.0);
	    AnchorPane.setBottomAnchor(anchorPane, 0.0);
	    AnchorPane.setLeftAnchor(anchorPane, 0.0);
	    AnchorPane.setRightAnchor(anchorPane, 0.0);
	    
	    
	    Label1Monitor1.setVisible(true);
	    Label1Monitor2.setVisible(true);
	    Label1Monitor3.setVisible(true);
	    
	   
	   
	}

	private static String nombre;
	private static String apellido;
	private static String email;
	private static String pass;
	private static String peso;
	private static String edad;
	private static String foto;
	
	public void setVariable1(String nombres, String apellidos, String emails, String passs, String edads, String nombre2) {
		nombre= nombres;
		apellido = apellidos;
		email = emails;
		pass = passs;
		edad = edads;
		peso = nombre2;
		
	}
	
	Parent rootParent;
	Scene scene;
	Stage stage;
	public void setStage(Parent root, Scene scene, Stage stage) {
		this.rootParent = root;
		this.scene = scene;
		this.stage = stage;	
		System.out.println("Dentro del  monitor del metodo setStage");
		System.out.println(rootParent+" "+this.scene+""+this.stage);
	}

}
