	package controllers;
	
	import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.input.MouseEvent;
	import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
	import javafx.stage.FileChooser;
import javafx.stage.Stage;
	
	public class UsuarioController  implements Initializable{
	
		private static String nombreString;
		private static String apellidoString;
		private static String edadString;
		private static String pesoString;
		private static String emailString;
		private static String passString;
		private static String fotoString;
	
		
		 	@FXML
		    private AnchorPane PaneAñadirSWitch;
	
		    @FXML
		    private AnchorPane anchorPane;
	
		    @FXML
		    private Button btn_Actualizar;
	
		    @FXML
		    private ImageView img_avatar;
	
		    @FXML
		    private Text tf_Apellido;
	
		    @FXML
		    private TextField tf_apellido;
	
		    @FXML
		    private TextField tf_edad;
	
		    @FXML
		    private TextField tf_email;
	
		    @FXML
		    private TextField tf_nombre;
	
		    @FXML
		    private PasswordField tf_passWord;
	
		    @FXML
		    private TextField tf_peso;
		    
		    private static Circle circulosCircle;
		
	    @FXML
	    void EventoClickActualzar(MouseEvent event) {
	    	if(!monitorBoolean) {
	    		System.out.println("soy un usuario");
		       actualizarUsuario();

	    	}else {
	    		System.out.println("Quiero actualizar el monitor!!!!!!!!!!!!!!!!");
	    		actulizarMonitor();
	    	}
	    	
	    }
	
	    
	    private void actulizarMonitor() {
			// TODO Auto-generated method stub
			cargarDatosMonitor();
			

	    	String nombreString;
	    	String apelliString;
	    	String pesoString;
	    	String edadString;
	    	String emaiString;
	    	String passWordString;
	    	String imagenstring;
	    	
	    	nombreString = tf_nombre.getText();
	    	apelliString = tf_apellido.getText();
	    	pesoString = tf_peso.getText();
	    	edadString = tf_edad.getText();
	    	emaiString = tf_email.getText();
	    	passWordString =tf_passWord.getText();
	    	

	    	imagenstring = Base64.getEncoder().encodeToString(fotoBytes);
	    	
	    	String jsonInput = "{\n" +
	    		            "  \"idMonitor\": 0,\n" +
	    	    	        "  \"nombre\":  \"" + nombreString + "\",\n" +
	    	    	        "  \"apellidos\": \"" + apelliString + "\",\n" +
	    	    	        "  \"peso\": \"" + pesoString + "\",\n" +
	    	    	        "  \"edad\": \"" + edadString + "\",\n" +
	    	    	        "  \"foto\": \"" + imagenstring + "\",\n" +
	    	    	        "  \"email\": \"" + emaiString + "\",\n" +
	    	    	        "  \"password\": \"" + passWordString + "\",\n" +
	    	    	        "  \"tabla\": {\n" +
	    	    	        "    \"idTabla\": 0,\n" +
	    	    	        "    \"horario1\": \"7:00-10:00\",\n" +
	    	    	        "    \"horario2\": \"10:00-12:00\",\n" +
	    	    	        "    \"horario3\": \"12:00-13:00\",\n" +
	    	    	        "    \"horario4\": \"15:00-16:00\",\n" +
	    	    	        "    \"horario5\": \"16:00-18:00\",\n" +
	    	    	        "    \"horario6\": \"18:00-19:00\",\n" +
	    	    	        "    \"horario7\": \"19:00-20:00\",\n" +
	    	    	        "    \"horario8\": \"22:00\",\n" +
	    	    	        "    \"lunes1\": \"Entrenamiento Lunes 1\",\n" +
	    	    	        "    \"lunes2\": \"Entrenamiento Lunes 2\",\n" +
	    	    	        "    \"lunes3\": \"Entrenamiento Lunes 3\",\n" +
	    	    	        "    \"lunes4\": \"Entrenamiento Lunes 4\",\n" +
	    	    	        "    \"lunes5\": \"Entrenamiento Lunes 5\",\n" +
	    	    	        "    \"lunes6\": \"Entrenamiento Lunes 6\",\n" +
	    	    	        "    \"lunes7\": \"Entrenamiento Lunes 7\",\n" +
	    	    	        "    \"lunes8\": \"Entrenamiento Lunes 8\",\n" +
	    	    	        "    \"martes1\": \"Entrenamiento Martes 1\",\n" +
	    	    	        "    \"martes2\": \"Entrenamiento Martes 2\",\n" +
	    	    	        "    \"martes3\": \"Entrenamiento Martes 3\",\n" +
	    	    	        "    \"martes4\": \"Entrenamiento Martes 4\",\n" +
	    	    	        "    \"martes5\": \"Entrenamiento Martes 5\",\n" +
	    	    	        "    \"martes6\": \"Entrenamiento Martes 6\",\n" +
	    	    	        "    \"martes7\": \"Entrenamiento Martes 7\",\n" +
	    	    	        "    \"martes8\": \"Entrenamiento Martes 8\",\n" +
	    	    	        "    \"miercoles1\": \"Entrenamiento Miercoles 1\",\n" +
	    	    	        "    \"miercoles2\": \"Entrenamiento Miercoles 2\",\n" +
	    	    	        "    \"miercoles3\": \"Entrenamiento Miercoles 3\",\n" +
	    	    	        "    \"miercoles4\": \"Entrenamiento Miercoles 4\",\n" +
	    	    	        "    \"miercoles5\": \"Entrenamiento Miercoles 5\",\n" +
	    	    	        "    \"miercoles6\": \"Entrenamiento Miercoles 6\",\n" +
	    	    	        "    \"miercoles7\": \"Entrenamiento Miercoles 7\",\n" +
	    	    	        "    \"miercoles8\": \"Entrenamiento Miercoles 8\",\n" +
	    	    	        "    \"jueves1\": \"Entrenamiento Jueves 1\",\n" +
	    	    	        "    \"jueves2\": \"Entrenamiento Jueves 2\",\n" +
	    	    	        "    \"jueves3\": \"Entrenamiento Jueves 3\",\n" +
	    	    	        "    \"jueves4\": \"Entrenamiento Jueves 4\",\n" +
	    	    	        "    \"jueves5\": \"Entrenamiento Jueves 5\",\n" +
	    	    	        "    \"jueves6\": \"Entrenamiento Jueves 6\",\n" +
	    	    	        "    \"jueves7\": \"Entrenamiento Jueves 7\",\n" +
	    	    	        "    \"jueves8\": \"Entrenamiento Jueves 8\",\n" +
	    	    	        "    \"viernes1\": \"Entrenamiento Viernes 1\",\n" +
	    	    	        "    \"viernes2\": \"Entrenamiento Viernes 2\",\n" +
	    	    	        "    \"viernes3\": \"Entrenamiento Viernes 3\",\n" +
	    	    	        "    \"viernes4\": \"Entrenamiento Viernes 4\",\n" +
	    	    	        "    \"viernes5\": \"Entrenamiento Viernes 5\",\n" +
	    	    	        "    \"viernes6\": \"Entrenamiento Viernes 6\",\n" +
	    	    	        "    \"viernes7\": \"Entrenamiento Viernes 7\",\n" +
	    	    	        "    \"viernes8\": \"Entrenamiento Viernes 8\",\n" +    	
	    	    	        "    \"sabado1\": \"Entrenamiento Sabado 1\",\n" +
	    	    	        "    \"sabado2\": \"Entrenamiento Sabado 2\",\n" +
	    	    	        "    \"sabado3\": \"Entrenamiento Sabado 3\",\n" +
	    	    	        "    \"sabado4\": \"Entrenamiento Sabado 4\",\n" +
	    	    	        "    \"sabado5\": \"Entrenamiento Sabado 5\",\n" +
	    	    	        "    \"sabado6\": \"Entrenamiento Sabado 6\",\n" +
	    	    	        "    \"sabado7\": \"Entrenamiento Sabado 7\",\n" +
	    	    	        "    \"sabado8\": \"Entrenamiento Sabado 8\",\n" +   
	    	    	        "    \"domingo1\": \"Entrenamiento Domingo 1\",\n" +
	    	    	        "    \"domingo2\": \"Entrenamiento Domingo 2\",\n" +
	    	    	        "    \"domingo3\": \"Entrenamiento Domingo 3\",\n" +
	    	    	        "    \"domingo4\": \"Entrenamiento Domingo 4\",\n" +
	    	    	        "    \"domingo5\": \"Entrenamiento Domingo 5\",\n" +
	    	    	        "    \"domingo6\": \"Entrenamiento Domingo 6\",\n" +
	    	    	        "    \"domingo7\": \"Entrenamiento Domingo 7\",\n" +
	    	    	        "    \"domingo8\": \"Entrenamiento Domingo 8\"\n" +
	    		            "  },\n" +
	    		            "  \"dieta\": {\n" +
	    		            "    \"idDieta\": 0,\n" +
	    		            "    \"horario1\": \"7:00-10:00\",\n" +
	    	    	        "    \"horario2\": \"10:00-12:00\",\n" +
	    	    	        "    \"horario3\": \"12:00-13:00\",\n" +
	    	    	        "    \"horario4\": \"15:00-16:00\",\n" +
	    	    	        "    \"horario5\": \"16:00-18:00\",\n" +
	    	    	        "    \"horario6\": \"18:00-19:00\",\n" +
	    	    	        "    \"horario7\": \"19:00-20:00\",\n" +
	    	    	        "    \"horario8\": \"22:00\",\n" +
	    	    	        "    \"lunes1\": \"Dieta Lunes 1\",\n" +
	    	    	        "    \"lunes2\": \"Dieta Lunes 2\",\n" +
	    	    	        "    \"lunes3\": \"Dieta Lunes 3\",\n" +
	    	    	        "    \"lunes4\": \"Dieta Lunes 4\",\n" +
	    	    	        "    \"lunes5\": \"Dieta Lunes 5\",\n" +
	    	    	        "    \"lunes6\": \"Dieta Lunes 6\",\n" +
	    	    	        "    \"lunes7\": \"Dieta Lunes 7\",\n" +
	    	    	        "    \"lunes8\": \"Dieta Lunes 8\",\n" +
	    	    	        "    \"martes1\": \"Dieta martes 1\",\n" +
	    	    	        "    \"martes2\": \"Dieta martes 2\",\n" +
	    	    	        "    \"martes3\": \"Dieta martes 3\",\n" +
	    	    	        "    \"martes4\": \"Dieta martes 4\",\n" +
	    	    	        "    \"martes5\": \"Dieta martes 5\",\n" +
	    	    	        "    \"martes6\": \"Dieta martes 6\",\n" +
	    	    	        "    \"martes7\": \"Dieta martes 7\",\n" +
	    	    	        "    \"martes8\": \"Dieta martes 8\",\n" +
	    	    	        "    \"miercoles1\": \"Dieta Miercoles 1\",\n" +
	    	    	        "    \"miercoles2\": \"Dieta Miercoles 2\",\n" +
	    	    	        "    \"miercoles3\": \"Dieta Miercoles 3\",\n" +
	    	    	        "    \"miercoles4\": \"Dieta Miercoles 4\",\n" +
	    	    	        "    \"miercoles5\": \"Dieta Miercoles 5\",\n" +
	    	    	        "    \"miercoles6\": \"Dieta Miercoles 6\",\n" +
	    	    	        "    \"miercoles7\": \"Dieta Miercoles 7\",\n" +
	    	    	        "    \"miercoles8\": \"Dieta Miercoles 8\",\n" +
	    	    	        "    \"jueves1\": \"Dieta Jueves 1\",\n" +
	    	    	        "    \"jueves2\": \"Dieta Jueves 2\",\n" +
	    	    	        "    \"jueves3\": \"Dieta Jueves 3\",\n" +
	    	    	        "    \"jueves4\": \"Dieta Jueves 4\",\n" +
	    	    	        "    \"jueves5\": \"Dieta Jueves 5\",\n" +
	    	    	        "    \"jueves6\": \"Dieta Jueves 6\",\n" +
	    	    	        "    \"jueves7\": \"Dieta Jueves 7\",\n" +
	    	    	        "    \"jueves8\": \"Dieta Jueves 8\",\n" +
	    	    	        "    \"viernes1\": \"Dieta Viernes 1\",\n" +
	    	    	        "    \"viernes2\": \"Dieta Viernes 2\",\n" +
	    	    	        "    \"viernes3\": \"Dieta Viernes 3\",\n" +
	    	    	        "    \"viernes4\": \"Dieta Viernes 4\",\n" +
	    	    	        "    \"viernes5\": \"Dieta Viernes 5\",\n" +
	    	    	        "    \"viernes6\": \"Dieta Viernes 6\",\n" +
	    	    	        "    \"viernes7\": \"Dieta Viernes 7\",\n" +
	    	    	        "    \"viernes8\": \"Dieta Viernes 8\",\n" +    	
	    	    	        "    \"sabado1\": \"Dieta Sabado 1\",\n" +
	    	    	        "    \"sabado2\": \"Dieta Sabado 2\",\n" +
	    	    	        "    \"sabado3\": \"Dieta Sabado 3\",\n" +
	    	    	        "    \"sabado4\": \"Dieta Sabado 4\",\n" +
	    	    	        "    \"sabado5\": \"Dieta Sabado 5\",\n" +
	    	    	        "    \"sabado6\": \"Dieta Sabado 6\",\n" +
	    	    	        "    \"sabado7\": \"Dieta Sabado 7\",\n" +
	    	    	        "    \"sabado8\": \"Dieta Sabado 8\",\n" +   
	    	    	        "    \"domingo1\": \"Dieta Domingo 1\",\n" +
	    	    	        "    \"domingo2\": \"Dieta Domingo 2\",\n" +
	    	    	        "    \"domingo3\": \"Dieta Domingo 3\",\n" +
	    	    	        "    \"domingo4\": \"Dieta Domingo 4\",\n" +
	    	    	        "    \"domingo5\": \"Dieta Domingo 5\",\n" +
	    	    	        "	 \"domingo6\": \"Dieta Domingo 6\",\n" +
	    	    	        "	 \"domingo7\": \"Dieta Domingo 7\",\n" +
	    	    	        "    \"domingo8\": \"string\"\n" +
	    	    	        "    },\n" +
	    	    	        "  \"listaDeUsuarios\": []\n" +
	    	    	        "}";
	    		    try {
	        	        URL url = new URL("https://localhost:7264/api/Usuario/ActualizarDatosMonitor");
	        	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        	        connection.setRequestMethod("PUT");
	        	        connection.setRequestProperty("Content-Type", "application/json");
	        	        connection.setDoOutput(true);

	        	        OutputStream outputStream = connection.getOutputStream();
	        	        outputStream.write(jsonInput.getBytes());
	        	        outputStream.flush();

	        	        String responseCode = connection.getResponseMessage();
	        	        System.out.println("Response Code: " + responseCode);
	        	        System.out.println("RESOUESTA DEL SERVIDOR");
			            System.out.println(responseCode.toString());

	        	        if(responseCode.equalsIgnoreCase("OK")) {
	        	        	
	        	        	
	        	    		Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
	        	            confirmDialog.setHeaderText("¿Estás seguro de que desea Actualizar?");
	        	            confirmDialog.setContentText("Esta acción es irreversible.");
	        	            confirmDialog.showAndWait().ifPresent(response -> {
	        	             
	        	            	
	        	            	
	        	            	
	        	            	
	        	            	Alert informationDialogs = new Alert(Alert.AlertType.INFORMATION);
	            	        	informationDialogs.setHeaderText(null);
	        	                informationDialogs.setContentText("Actualizado  correctamente.");
	        	                informationDialogs.showAndWait();
	        	            
	        	            });
	        	            
	        	            
	        	        }else {
	        	        	
	        	        	Alert informationDialogs = new Alert(Alert.AlertType.WARNING);
	        	        	informationDialogs.setHeaderText(null);
	    	                informationDialogs.setContentText("No se ha podido Actualizar correctamente.");
	    	                informationDialogs.showAndWait();
	        	        }
	        	        

	        	        connection.disconnect();
	        	        
	        	     controladorPrincipalController.SetCirculo(imagenstring, nombreString);

	        	    } catch (IOException e) {
	        	        e.printStackTrace();
	        	    }
	    	
		}









		private void cargarDatosMonitor() {

			   try {
			        // Construir la URL de la solicitud GET
			        URL url = new URL("https://localhost:7264/api/Usuario/CargarDatosMonitor");
			        
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
			            
			            nombreString = usuarioJson.getString("nombre");
			            apellidoString = usuarioJson.getString("apellidos");
			            edadString = usuarioJson.getString("edad");
			            pesoString = usuarioJson.getString("peso");
			            passString = usuarioJson.getString("password");
			            emailString = usuarioJson.getString("email");
			            fotoString = usuarioJson.getString("foto");
			            
			        
			            //cargamos la imagen
			            byte[] fotoBytes = Base64.getDecoder().decode(fotoString);

			         // Crear un objeto Image a partir del arreglo de bytes
			            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fotoBytes)) {
			            Image image = new Image(inputStream);

			             // Ajustar la imagen al círculo existente
			       //      Ciruclo.setFill(new ImagePattern(image));
			        //     label_usuario.setText(nombreString);

			             // Resto del código...
			         } catch (IOException e) {
			             e.printStackTrace();
			         }
			            
			            
			           
			            

			         
			         
			            
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


		private byte[] convertirImagenABytes(Image image) {
	    	int width = (int) image.getWidth();
	        int height = (int) image.getHeight();

	        byte[] imageBytes = new byte[width * height * 4];
	        PixelReader pixelReader = image.getPixelReader();

	        int bufferIndex = 0;
	        for (int y = 0; y < height; y++) {
	            for (int x = 0; x < width; x++) {
	                Color color = pixelReader.getColor(x, y);
	                imageBytes[bufferIndex++] = (byte) (color.getRed() * 255);
	                imageBytes[bufferIndex++] = (byte) (color.getGreen() * 255);
	                imageBytes[bufferIndex++] = (byte) (color.getBlue() * 255);
	                imageBytes[bufferIndex++] = (byte) (color.getOpacity() * 255);
	            }
	        }

	        return imageBytes;
	    }

	    private void actualizarUsuario() {
			
	    	cargarDatosUsuario();
	    	
	    	String nombreString;
	    	String apelliString;
	    	String pesoString;
	    	String edadString;
	    	String emaiString;
	    	String passWordString;
	    	String imagenstring;
	    	
	    	nombreString = tf_nombre.getText();
	    	apelliString = tf_apellido.getText();
	    	pesoString = tf_peso.getText();
	    	edadString = tf_edad.getText();
	    	emaiString = tf_email.getText();
	    	passWordString =tf_passWord.getText();
	    	

	    	imagenstring = Base64.getEncoder().encodeToString(fotoBytes);
	    	
	    	String jsonInput = "{\n" +
	    		            "  \"idUSuario\": 0,\n" +
	    	    	        "  \"nombre\":  \"" + nombreString + "\",\n" +
	    	    	        "  \"apellidos\": \"" + apelliString + "\",\n" +
	    	    	        "  \"peso\": \"" + pesoString + "\",\n" +
	    	    	        "  \"edad\": \"" + edadString + "\",\n" +
	    	    	        "  \"foto\": \"" + imagenstring + "\",\n" +
	    	    	        "  \"email\": \"" + emaiString + "\",\n" +
	    	    	        "  \"password\": \"" + passWordString + "\",\n" +
	    	    	        "  \"tabla\": {\n" +
	    	    	        "    \"idTabla\": 0,\n" +
	    	    	        "    \"horario1\": \"7:00-10:00\",\n" +
	    	    	        "    \"horario2\": \"10:00-12:00\",\n" +
	    	    	        "    \"horario3\": \"12:00-13:00\",\n" +
	    	    	        "    \"horario4\": \"15:00-16:00\",\n" +
	    	    	        "    \"horario5\": \"16:00-18:00\",\n" +
	    	    	        "    \"horario6\": \"18:00-19:00\",\n" +
	    	    	        "    \"horario7\": \"19:00-20:00\",\n" +
	    	    	        "    \"horario8\": \"22:00\",\n" +
	    	    	        "    \"lunes1\": \"Entrenamiento Lunes 1\",\n" +
	    	    	        "    \"lunes2\": \"Entrenamiento Lunes 2\",\n" +
	    	    	        "    \"lunes3\": \"Entrenamiento Lunes 3\",\n" +
	    	    	        "    \"lunes4\": \"Entrenamiento Lunes 4\",\n" +
	    	    	        "    \"lunes5\": \"Entrenamiento Lunes 5\",\n" +
	    	    	        "    \"lunes6\": \"Entrenamiento Lunes 6\",\n" +
	    	    	        "    \"lunes7\": \"Entrenamiento Lunes 7\",\n" +
	    	    	        "    \"lunes8\": \"Entrenamiento Lunes 8\",\n" +
	    	    	        "    \"martes1\": \"Entrenamiento Martes 1\",\n" +
	    	    	        "    \"martes2\": \"Entrenamiento Martes 2\",\n" +
	    	    	        "    \"martes3\": \"Entrenamiento Martes 3\",\n" +
	    	    	        "    \"martes4\": \"Entrenamiento Martes 4\",\n" +
	    	    	        "    \"martes5\": \"Entrenamiento Martes 5\",\n" +
	    	    	        "    \"martes6\": \"Entrenamiento Martes 6\",\n" +
	    	    	        "    \"martes7\": \"Entrenamiento Martes 7\",\n" +
	    	    	        "    \"martes8\": \"Entrenamiento Martes 8\",\n" +
	    	    	        "    \"miercoles1\": \"Entrenamiento Miercoles 1\",\n" +
	    	    	        "    \"miercoles2\": \"Entrenamiento Miercoles 2\",\n" +
	    	    	        "    \"miercoles3\": \"Entrenamiento Miercoles 3\",\n" +
	    	    	        "    \"miercoles4\": \"Entrenamiento Miercoles 4\",\n" +
	    	    	        "    \"miercoles5\": \"Entrenamiento Miercoles 5\",\n" +
	    	    	        "    \"miercoles6\": \"Entrenamiento Miercoles 6\",\n" +
	    	    	        "    \"miercoles7\": \"Entrenamiento Miercoles 7\",\n" +
	    	    	        "    \"miercoles8\": \"Entrenamiento Miercoles 8\",\n" +
	    	    	        "    \"jueves1\": \"Entrenamiento Jueves 1\",\n" +
	    	    	        "    \"jueves2\": \"Entrenamiento Jueves 2\",\n" +
	    	    	        "    \"jueves3\": \"Entrenamiento Jueves 3\",\n" +
	    	    	        "    \"jueves4\": \"Entrenamiento Jueves 4\",\n" +
	    	    	        "    \"jueves5\": \"Entrenamiento Jueves 5\",\n" +
	    	    	        "    \"jueves6\": \"Entrenamiento Jueves 6\",\n" +
	    	    	        "    \"jueves7\": \"Entrenamiento Jueves 7\",\n" +
	    	    	        "    \"jueves8\": \"Entrenamiento Jueves 8\",\n" +
	    	    	        "    \"viernes1\": \"Entrenamiento Viernes 1\",\n" +
	    	    	        "    \"viernes2\": \"Entrenamiento Viernes 2\",\n" +
	    	    	        "    \"viernes3\": \"Entrenamiento Viernes 3\",\n" +
	    	    	        "    \"viernes4\": \"Entrenamiento Viernes 4\",\n" +
	    	    	        "    \"viernes5\": \"Entrenamiento Viernes 5\",\n" +
	    	    	        "    \"viernes6\": \"Entrenamiento Viernes 6\",\n" +
	    	    	        "    \"viernes7\": \"Entrenamiento Viernes 7\",\n" +
	    	    	        "    \"viernes8\": \"Entrenamiento Viernes 8\",\n" +    	
	    	    	        "    \"sabado1\": \"Entrenamiento Sabado 1\",\n" +
	    	    	        "    \"sabado2\": \"Entrenamiento Sabado 2\",\n" +
	    	    	        "    \"sabado3\": \"Entrenamiento Sabado 3\",\n" +
	    	    	        "    \"sabado4\": \"Entrenamiento Sabado 4\",\n" +
	    	    	        "    \"sabado5\": \"Entrenamiento Sabado 5\",\n" +
	    	    	        "    \"sabado6\": \"Entrenamiento Sabado 6\",\n" +
	    	    	        "    \"sabado7\": \"Entrenamiento Sabado 7\",\n" +
	    	    	        "    \"sabado8\": \"Entrenamiento Sabado 8\",\n" +   
	    	    	        "    \"domingo1\": \"Entrenamiento Domingo 1\",\n" +
	    	    	        "    \"domingo2\": \"Entrenamiento Domingo 2\",\n" +
	    	    	        "    \"domingo3\": \"Entrenamiento Domingo 3\",\n" +
	    	    	        "    \"domingo4\": \"Entrenamiento Domingo 4\",\n" +
	    	    	        "    \"domingo5\": \"Entrenamiento Domingo 5\",\n" +
	    	    	        "    \"domingo6\": \"Entrenamiento Domingo 6\",\n" +
	    	    	        "    \"domingo7\": \"Entrenamiento Domingo 7\",\n" +
	    	    	        "    \"domingo8\": \"Entrenamiento Domingo 8\"\n" +
	    		            "  },\n" +
	    		            "  \"dieta\": {\n" +
	    		            "    \"idDieta\": 0,\n" +
	    		            "    \"horario1\": \"7:00-10:00\",\n" +
	    	    	        "    \"horario2\": \"10:00-12:00\",\n" +
	    	    	        "    \"horario3\": \"12:00-13:00\",\n" +
	    	    	        "    \"horario4\": \"15:00-16:00\",\n" +
	    	    	        "    \"horario5\": \"16:00-18:00\",\n" +
	    	    	        "    \"horario6\": \"18:00-19:00\",\n" +
	    	    	        "    \"horario7\": \"19:00-20:00\",\n" +
	    	    	        "    \"horario8\": \"22:00\",\n" +
	    	    	        "    \"lunes1\": \"Dieta Lunes 1\",\n" +
	    	    	        "    \"lunes2\": \"Dieta Lunes 2\",\n" +
	    	    	        "    \"lunes3\": \"Dieta Lunes 3\",\n" +
	    	    	        "    \"lunes4\": \"Dieta Lunes 4\",\n" +
	    	    	        "    \"lunes5\": \"Dieta Lunes 5\",\n" +
	    	    	        "    \"lunes6\": \"Dieta Lunes 6\",\n" +
	    	    	        "    \"lunes7\": \"Dieta Lunes 7\",\n" +
	    	    	        "    \"lunes8\": \"Dieta Lunes 8\",\n" +
	    	    	        "    \"martes1\": \"Dieta martes 1\",\n" +
	    	    	        "    \"martes2\": \"Dieta martes 2\",\n" +
	    	    	        "    \"martes3\": \"Dieta martes 3\",\n" +
	    	    	        "    \"martes4\": \"Dieta martes 4\",\n" +
	    	    	        "    \"martes5\": \"Dieta martes 5\",\n" +
	    	    	        "    \"martes6\": \"Dieta martes 6\",\n" +
	    	    	        "    \"martes7\": \"Dieta martes 7\",\n" +
	    	    	        "    \"martes8\": \"Dieta martes 8\",\n" +
	    	    	        "    \"miercoles1\": \"Dieta Miercoles 1\",\n" +
	    	    	        "    \"miercoles2\": \"Dieta Miercoles 2\",\n" +
	    	    	        "    \"miercoles3\": \"Dieta Miercoles 3\",\n" +
	    	    	        "    \"miercoles4\": \"Dieta Miercoles 4\",\n" +
	    	    	        "    \"miercoles5\": \"Dieta Miercoles 5\",\n" +
	    	    	        "    \"miercoles6\": \"Dieta Miercoles 6\",\n" +
	    	    	        "    \"miercoles7\": \"Dieta Miercoles 7\",\n" +
	    	    	        "    \"miercoles8\": \"Dieta Miercoles 8\",\n" +
	    	    	        "    \"jueves1\": \"Dieta Jueves 1\",\n" +
	    	    	        "    \"jueves2\": \"Dieta Jueves 2\",\n" +
	    	    	        "    \"jueves3\": \"Dieta Jueves 3\",\n" +
	    	    	        "    \"jueves4\": \"Dieta Jueves 4\",\n" +
	    	    	        "    \"jueves5\": \"Dieta Jueves 5\",\n" +
	    	    	        "    \"jueves6\": \"Dieta Jueves 6\",\n" +
	    	    	        "    \"jueves7\": \"Dieta Jueves 7\",\n" +
	    	    	        "    \"jueves8\": \"Dieta Jueves 8\",\n" +
	    	    	        "    \"viernes1\": \"Dieta Viernes 1\",\n" +
	    	    	        "    \"viernes2\": \"Dieta Viernes 2\",\n" +
	    	    	        "    \"viernes3\": \"Dieta Viernes 3\",\n" +
	    	    	        "    \"viernes4\": \"Dieta Viernes 4\",\n" +
	    	    	        "    \"viernes5\": \"Dieta Viernes 5\",\n" +
	    	    	        "    \"viernes6\": \"Dieta Viernes 6\",\n" +
	    	    	        "    \"viernes7\": \"Dieta Viernes 7\",\n" +
	    	    	        "    \"viernes8\": \"Dieta Viernes 8\",\n" +    	
	    	    	        "    \"sabado1\": \"Dieta Sabado 1\",\n" +
	    	    	        "    \"sabado2\": \"Dieta Sabado 2\",\n" +
	    	    	        "    \"sabado3\": \"Dieta Sabado 3\",\n" +
	    	    	        "    \"sabado4\": \"Dieta Sabado 4\",\n" +
	    	    	        "    \"sabado5\": \"Dieta Sabado 5\",\n" +
	    	    	        "    \"sabado6\": \"Dieta Sabado 6\",\n" +
	    	    	        "    \"sabado7\": \"Dieta Sabado 7\",\n" +
	    	    	        "    \"sabado8\": \"Dieta Sabado 8\",\n" +   
	    	    	        "    \"domingo1\": \"Dieta Domingo 1\",\n" +
	    	    	        "    \"domingo2\": \"Dieta Domingo 2\",\n" +
	    	    	        "    \"domingo3\": \"Dieta Domingo 3\",\n" +
	    	    	        "    \"domingo4\": \"Dieta Domingo 4\",\n" +
	    	    	        "    \"domingo5\": \"Dieta Domingo 5\",\n" +
	    	    	        "    \"domingo6\": \"Dieta Domingo 6\",\n" +
	    	    	        "    \"domingo7\": \"Dieta Domingo 7\",\n" +
	    	    	        "    \"domingo8\": \"Dieta Domingo 8\"\n" +
	    		            "  }\n" +
	    		            "}";
	    	
	    			
	    		    try {
	        	        URL url = new URL("https://localhost:7264/api/Usuario/1");
	        	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        	        connection.setRequestMethod("PUT");
	        	        connection.setRequestProperty("Content-Type", "application/json");
	        	        connection.setDoOutput(true);

	        	        OutputStream outputStream = connection.getOutputStream();
	        	        outputStream.write(jsonInput.getBytes());
	        	        outputStream.flush();

	        	        String responseCode = connection.getResponseMessage();
	        	        System.out.println("Response Code: " + responseCode);
	        	      
	        	        if(responseCode.equalsIgnoreCase("OK")) {
	        	        	
	        	        	
	        	    		Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
	        	            confirmDialog.setHeaderText("¿Estás seguro de que desea Actualizar?");
	        	            confirmDialog.setContentText("Esta acción es irreversible.");
	        	            confirmDialog.showAndWait().ifPresent(response -> {
	        	             
	        	            	
	        	            	
	        	            	
	        	            	
	        	            	Alert informationDialogs = new Alert(Alert.AlertType.INFORMATION);
	            	        	informationDialogs.setHeaderText(null);
	        	                informationDialogs.setContentText("Actualizado  correctamente.");
	        	                informationDialogs.showAndWait();
	        	            
	        	            });
	        	            
	        	            
	        	        }else {
	        	        	
	        	        	Alert informationDialogs = new Alert(Alert.AlertType.WARNING);
	        	        	informationDialogs.setHeaderText(null);
	    	                informationDialogs.setContentText("No se ha podido Actualizar correctamente.");
	    	                informationDialogs.showAndWait();
	        	        }
	        	        

	        	        connection.disconnect();
	        	        
	        	     controladorPrincipalController.SetCirculo(imagenstring, nombreString);

	        	    } catch (IOException e) {
	        	        e.printStackTrace();
	        	    }
	    	
			
		}

	    
	    private static byte[] fotoBytes; // Cambiamos el tipo de variable a byte[]
		@FXML
	    void EventoClickFoto(MouseEvent event) {
	        // Crear un FileChooser
	        FileChooser fileChooser = new FileChooser();
	
	        // Configurar el filtro de archivos para mostrar solo imágenes
	        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Archivos de imagen", "*.jpg", "*.jpeg", "*.png", "*.gif");
	        fileChooser.getExtensionFilters().add(imageFilter);
	
	        // Obtener la ventana actual
	        // Obtener la ventana actual
	        Stage stage = (Stage) img_avatar.getScene().getWindow();	
	        // Mostrar el diálogo de selección de archivos
	        File file = fileChooser.showOpenDialog(stage);
	
	        if (file != null) {
	        	try {
	        		
	        	
	            // Cargar la imagen seleccionada en el ImageView
	            Image image = new Image(file.toURI().toString());
	            img_avatar.setImage(image);
	
	            // Leer los bytes de la imagen seleccionada
	            FileInputStream fileInputStream;
				
					fileInputStream = new FileInputStream(file);
				
	            ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
	            byte[] buffer = new byte[1024];
	            int bytesRead;
	            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
	                byteOutputStream.write(buffer, 0, bytesRead);
	            }
	            fotoBytes = byteOutputStream.toByteArray();

	            // Cerrar los streams
	            byteOutputStream.close();
	            fileInputStream.close();

	            
		        } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        }
	        
	
	    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		 Image image1 = new Image(getClass().getResourceAsStream("/img/1.jpg"));
	     img_avatar.setImage(image1);		
		
	   AnchorPane.setTopAnchor(anchorPane, 0.0);
	   AnchorPane.setBottomAnchor(anchorPane, 0.0);
	   AnchorPane.setLeftAnchor(anchorPane, 0.0);
	   AnchorPane.setRightAnchor(anchorPane, 0.0);

	}

	private static PrincipalController controladorPrincipalController;
	
	public void setUsuario(String nombreStrings, String apellidoStrings, String edadStrings, String pesoStrings,
			String emailStrings, String passStrings,String foto, Circle circulo, PrincipalController principalController) {
		 monitorBoolean=false;
		nombreString =nombreStrings;
		apellidoString = apellidoStrings;
		edadString = edadStrings;
		pesoString = pesoStrings;
		emailString = emailStrings;
		passString = passStrings;
		fotoString = foto;
		circulosCircle = circulo;
		controladorPrincipalController = principalController;
		
		   tf_nombre.setText(nombreString);
		   tf_apellido.setText(apellidoString);
		   tf_edad.setText(edadString);
		   tf_peso.setText(pesoString);
		   tf_email.setText(emailString);
		   tf_passWord.setText(passString);
		   
		   System.out.println("ME METI AL USUARIO BOTON COMO MONITOR");

		   // Decodificar la cadena Base64 a un arreglo de bytes
		    fotoBytes = Base64.getDecoder().decode(fotoString);

		    // Crear un objeto Image a partir del arreglo de bytes
		    try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fotoBytes)) {
		        Image image = new Image(inputStream);
		        img_avatar.setImage(image);

		        // Resto del código...
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		
	}
	
	Boolean monitorBoolean=false;
	public void setMonitor(String nombreStrings, String apellidoStrings, String edadStrings, String pesoStrings,
		String emailStrings, String passStrings,String foto, Circle circulo, PrincipalController principalController) {
		monitorBoolean=true;
		nombreString =nombreStrings;
		apellidoString = apellidoStrings;
		edadString = edadStrings;
		pesoString = pesoStrings;
		emailString = emailStrings;
		passString = passStrings;
		fotoString = foto;
		circulosCircle = circulo;
		controladorPrincipalController = principalController;
		
		   tf_nombre.setText(nombreString);
		   tf_apellido.setText(apellidoString);
		   tf_edad.setText(edadString);
		   tf_peso.setText(pesoString);
		   tf_email.setText(emailString);
		   tf_passWord.setText(passString);
		   
		   System.out.println("ME METI AL USUARIO BOTON COMO MONITOR");
		   
		   // Decodificar la cadena Base64 a un arreglo de bytes
		    fotoBytes = Base64.getDecoder().decode(fotoString);

		    // Crear un objeto Image a partir del arreglo de bytes
		    try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fotoBytes)) {
		        Image image = new Image(inputStream);
		        img_avatar.setImage(image);

		        // Resto del código...
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		
	}
	
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
	            
	            nombreString = usuarioJson.getString("nombre");
	            apellidoString = usuarioJson.getString("apellidos");
	            edadString = usuarioJson.getString("edad");
	            pesoString = usuarioJson.getString("peso");
	            passString = usuarioJson.getString("password");
	            emailString = usuarioJson.getString("email");
	            fotoString = usuarioJson.getString("foto");
	            

	         
	            
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
	

}
