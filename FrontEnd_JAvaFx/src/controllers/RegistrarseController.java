package controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegistrarseController implements Initializable {

    @FXML
    private Pane PANELES;
    
    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private ImageView foto_fondo;

    @FXML
    private Button btn_inicio;

    @FXML
    private Button btn_siguiente;

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
    private TextField tf_nombre2;

    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private PasswordField tf_passWord;
    
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

    @FXML
    void EventoClickSiguiente(MouseEvent event) {
   
    
    	    String nombreString = tf_nombre.getText();
	        String apellidoString = tf_apellido.getText();
	        String emailString = tf_email.getText();
	        String passString= tf_passWord.getText();
	        String edadString = tf_edad.getText();
	        String pesoString = tf_nombre2.getText();
	        
	    
	    	if(nombreString.isEmpty() || apellidoString.isEmpty()  || emailString.isEmpty()  || passString.isEmpty()  || edadString.isEmpty()  || pesoString.isEmpty() ) {
	    		 	Alert informationDialog = new Alert(Alert.AlertType.INFORMATION);
	                informationDialog.setHeaderText(null);
	                informationDialog.setContentText("Por favor, complete todos los campos para poder registrarse.");
	                informationDialog.showAndWait();
	                return;
	    	}
	    	
	    	String pattern = "[a-zA-Z1-9]{1,10}@[a-z]{5,8}\\.[a-z]{3}";
	        
	        Pattern regex = Pattern.compile(pattern);
	        Matcher matcher = regex.matcher(emailString);
	        
	        if (!matcher.matches()) {
	        	Alert informationDialog = new Alert(Alert.AlertType.INFORMATION);
                informationDialog.setHeaderText(null);
                informationDialog.setContentText("Por favor, Introduce correctamente el email, formato no valido");
                informationDialog.showAndWait();
                return;     
	        }
	        
   		Alert confirmDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmDialog.setHeaderText("¿Estás seguro de que desea registrarse?");
        confirmDialog.setContentText("Esta acción es irreversible.");
        confirmDialog.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
            	System.out.println("hola");
                Alert informationDialog = new Alert(Alert.AlertType.INFORMATION);
                informationDialog.setHeaderText(null);
                informationDialog.setContentText("Espere, se está registrando el usuario.");
                informationDialog.showAndWait();
                
                // Código para registrar al usuario------------------------------------------------------------------
                          	
            	String jsonInput = "{\n" +
        	            "  \"idUSuario\": 0,\n" +
        	            "  \"tienemonitor\": false,\n" +
            	        "  \"nombre\":  \"" + nombreString + "\",\n" +
            	        "  \"apellidos\": \"" + apellidoString + "\",\n" +
            	        "  \"peso\": \"" + pesoString + "\",\n" +
            	        "  \"edad\": \"" + edadString + "\",\n" +
            	        "  \"foto\": \"iVBORw0KGgoAAAANSUhEUgAAAxgAAAMYCAMAAAB/o7FWAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDE0IDc5LjE1Njc5NywgMjAxNC8wOC8yMC0wOTo1MzowMiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo2ODRhMmIzMi1jMjNlLTQ3NjUtOGM1Yi00OWY4NjczMDEyMzQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkZBMzk1RkQxOTAwMTFFNUFGQkFBOTZBODRFNERGMEUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkZBMzk1RkMxOTAwMTFFNUFGQkFBOTZBODRFNERGMEUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTQgKE1hY2ludG9zaCkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDowNTZhYzBlOC1hZWQ0LTRkMWItOGIxMS0xZmNiYjI5M2IzZDIiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6Njg0YTJiMzItYzIzZS00NzY1LThjNWItNDlmODY3MzAxMjM0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\",\n" +
            	        "  \"email\": \"" + emailString + "\",\n" +
            	        "  \"password\": \"" + passString + "\",\n" +
            	        "  \"tabla\": {\n" +
            	        "    \"idTabla\": 0,\n" +
            	        "    \"horario1\": \"7:00-7:15\",\n" +
            	        "    \"horario2\": \"7:15-7:30\",\n" +
            	        "    \"horario3\": \"7:30-7:45\",\n" +
            	        "    \"horario4\": \"7:45-8:00\",\n" +
            	        "    \"horario5\": \"8:00-8:15\",\n" +
            	        "    \"horario6\": \"8:15-8:30\",\n" +
            	        "    \"horario7\": \"\",\n" +
            	        "    \"horario8\": \"\",\n" +
            	        "    \"lunes1\": \"Aguantes de tuck planche con goma: 4x1 aguante de 3s\",\n" +
            	        "    \"lunes2\": \"Aguantes de lean planche: 4x1 aguante de 5\",\n" +
            	        "    \"lunes3\": \"Flexiones de pica: 5x4\",\n" +
            	        "    \"lunes4\": \"Paso de pica a lean: 3x3 (marcada de lean \",\n" +
            	        "    \"lunes5\": \"\",\n" +
            	        "    \"lunes6\": \"\",\n" +
            	        "    \"lunes7\": \"\",\n" +
            	        "    \"lunes8\": \"\",\n" +
            	        "    \"martes1\": \"EMOM de dominadas australianas: 10 minutos. 4 dominadas australianas por cada minuto.\",\n" +
            	        "    \"martes2\": \"Pirámide ascendente y descendente de dominadas pronas: 1-2-3-4-5 y bajar\",\n" +
            	        "    \"martes3\": \"Dominadas supinas: 4x4\",\n" +
            	        "    \"martes4\": \"\",\n" +
            	        "    \"martes5\": \"\",\n" +
            	        "    \"martes6\": \"\",\n" +
            	        "    \"martes7\": \"\",\n" +
            	        "    \"martes8\": \"\",\n" +
            	        "    \"miercoles1\": \"Fondos en paralelas: 4x4\",\n" +
            	        "    \"miercoles2\": \"EMOM de flexiones en suelo: 10 minutos. 4 flexiones por min\",\n" +
            	        "    \"miercoles3\": \"Dips o fondos en barra: 4x3\",\n" +
            	        "    \"miercoles4\": \"Flexiones con apoyo en barra: 3x6\",\n" +
            	        "    \"miercoles5\": \"\",\n" +
            	        "    \"miercoles6\": \"\",\n" +
            	        "    \"miercoles7\": \"\",\n" +
            	        "    \"miercoles8\": \"\",\n" +
            	        "    \"jueves1\": \"20 sentadillas\",\n" +
            	        "    \"jueves2\": \"20 zancadas\",\n" +
            	        "    \"jueves3\": \"25 jumping jacks\",\n" +
            	        "    \"jueves4\": \"Carrera continua suave: 25 minutos\",\n" +
            	        "    \"jueves5\": \"Carrera continua suave: 25 minutos\",\n" +
            	        "    \"jueves6\": \"Movilidad y flexibilidad\",\n" +
            	        "    \"jueves7\": \"\",\n" +
            	        "    \"jueves8\": \"\",\n" +
            	        "    \"viernes1\": \"Aguantes de tuck de front lever: 3x1 aguante de 3 segundos\",\n" +
            	        "    \"viernes2\": \"Dominadas australianas con pies en elevación: 4x4 repeticiones llevadas hacia la cintura \",\n" +
            	        "    \"viernes3\": \"Dominadas pronas con retracción escapular: 3x4\",\n" +
            	        "    \"viernes4\": \"Hollow Body: 4x1 aguante de 15 segundos\",\n" +
            	        "    \"viernes5\": \"\",\n" +
            	        "    \"viernes6\": \"\",\n" +
            	        "    \"viernes7\": \"\",\n" +
            	        "    \"viernes8\": \"\",\n" +    	
            	        "    \"sabado1\": \"Pino con apoyo en pared: 5x1 aguante de 5-7 segundos\",\n" +
            	        "    \"sabado2\": \"Leg raisers: 4x6\",\n" +
            	        "    \"sabado3\": \"Plancha abdominal: 3x1 aguante de 30 segundos\",\n" +
            	        "    \"sabado4\": \"Abdominales levantando piernas: 3x4\",\n" +
            	        "    \"sabado5\": \"\",\n" +
            	        "    \"sabado6\": \"\",\n" +
            	        "    \"sabado7\": \"\",\n" +
            	        "    \"sabado8\": \"\",\n" +   
            	        "    \"domingo1\": \"Rutina de pierna suave.\",\n" +
            	        "    \"domingo2\": \"Carrera continua suave\",\n" +
            	        "    \"domingo3\": \"Movilidad y flexibilidad(Igual que jueves\",\n" +
            	        "    \"domingo4\": \"\",\n" +
            	        "    \"domingo5\": \"\",\n" +
            	        "    \"domingo6\": \"\",\n" +
            	        "    \"domingo7\": \"\",\n" +
            	        "    \"domingo8\": \"\"\n" +
        	            "  },\n" +
        	            "  \"dieta\": {\n" +
        	            "    \"idDieta\": 0,\n" +
        	            "    \"horario1\": \"Desayuno\",\n" +
            	        "    \"horario2\": \"Media mañana\",\n" +
            	        "    \"horario3\": \"Comida\",\n" +
            	        "    \"horario4\": \"Merienda\",\n" +
            	        "    \"horario5\": \"Merienda2\",\n" +
            	        "    \"horario6\": \"Cena\",\n" +
            	        "    \"horario7\": \"\",\n" +
            	        "    \"horario8\": \"\",\n" +
            	        "    \"lunes1\": \"Café con leche semidesnatada y 2 tostadas con tomate rallado y aceite\",\n" +
            	        "    \"lunes2\": \"1 naranja\",\n" +
            	        "    \"lunes3\": \"Garbanzos con setas de temporada\",\n" +
            	        "    \"lunes4\": \"1 yogur proteinas\",\n" +
            	        "    \"lunes5\": \"1 yogur proteinas\",\n" +
            	        "    \"lunes6\": \"Merluza en salsa verde con almejas y gambas\",\n" +
            	        "    \"lunes7\": \"\",\n" +
            	        "    \"lunes8\": \"\",\n" +
            	        "    \"martes1\": \" Cereales y leche semidesnatada. Zumo de naranja natural\",\n" +
            	        "    \"martes2\": \" Sándwich de pavo\",\n" +
            	        "    \"martes3\": \"Alcachofas a la montillana con jamón\",\n" +
            	        "    \"martes4\": \"Café con leche semidesnatada\",\n" +
            	        "    \"martes5\": \"1 yogur proteinas\",\n" +
            	        "    \"martes6\": \"Tabulé de quinoa\",\n" +
            	        "    \"martes7\": \"\",\n" +
            	        "    \"martes8\": \"\",\n" +
            	        "    \"miercoles1\": \"Té y dos tostadas con mantequilla light\",\n" +
            	        "    \"miercoles2\": \"1 manzana\",\n" +
            	        "    \"miercoles3\": \"Calamares en salsa\",\n" +
            	        "    \"miercoles4\": \"Queso fresco desnatado\",\n" +
            	        "    \"miercoles5\": \"1 yogur proteinas\",\n" +
            	        "    \"miercoles6\": \"Crema de calabacín\",\n" +
            	        "    \"miercoles7\": \"\",\n" +
            	        "    \"miercoles8\": \"\",\n" +
            	        "    \"jueves1\": \"Zumo de naranja natural y dos tostadas con tomate rallado y aceite\",\n" +
            	        "    \"jueves2\": \"1 pera\",\n" +
            	        "    \"jueves3\": \"Guisantes con jamón\",\n" +
            	        "    \"jueves4\": \"1 yogur desnatado\",\n" +
            	        "    \"jueves5\": \"1 yogur proteinas\",\n" +
            	        "    \"jueves6\": \" Berenjena a la boloñesa vegana con bechamel de coliflor\",\n" +
            	        "    \"jueves7\": \"\",\n" +
            	        "    \"jueves8\": \"\",\n" +
            	        "    \"viernes1\": \"café con leche semidesnatada y una tostada con mantequilla light\",\n" +
            	        "    \"viernes2\": \"Sándwich de jamón york\",\n" +
            	        "    \"viernes3\": \"Espinacas con garbanzos\",\n" +
            	        "    \"viernes4\": \"1 yogur de gelatina\",\n" +
            	        "    \"viernes5\": \" 1 yogur proteinas\",\n" +
            	        "    \"viernes6\": \" Tabulé de quinoa\",\n" +
            	        "    \"viernes7\": \"\",\n" +
            	        "    \"viernes8\": \"\",\n" +    	
            	        "    \"sabado1\": \"Cereales y leche semidesnatada. Zumo de naranja natural\",\n" +
            	        "    \"sabado2\": \"1 naranja\",\n" +
            	        "    \"sabado3\": \"Merluza al cava con gambas\",\n" +
            	        "    \"sabado4\": \"Café con leche semidesnatada\",\n" +
            	        "    \"sabado5\": \" 1 yogur proteinas\",\n" +
            	        "    \"sabado6\": \" Espárragos salteados con setas\",\n" +
            	        "    \"sabado7\": \"\",\n" +
            	        "    \"sabado8\": \"\",\n" +   
            	        "    \"domingo1\": \"Zumo de naranja natural y dos tostadas con mermelada light\",\n" +
            	        "    \"domingo2\": \"1 melocotón\",\n" +
            	        "    \"domingo3\": \"Solomillo de cerdo en salsa de vino fino\",\n" +
            	        "    \"domingo4\": \"Queso fresco desnatado\",\n" +
            	        "    \"domingo5\": \" 1 yogur proteinas\",\n" +
            	        "    \"domingo6\": \"Verduras salteadas a la provenzal\",\n" +
            	        "    \"domingo7\": \"\",\n" +
            	        "    \"domingo8\": \"\"\n" +
        	            "  },\n" +
        	            "    \"monitorId\": \"2\"\n" +
        	            "}";
            	
            	
            	    try {
            	        URL url = new URL("https://localhost:7264/api/Usuario");
            	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            	        connection.setRequestMethod("POST");
            	        connection.setRequestProperty("Content-Type", "application/json");
            	        connection.setDoOutput(true);

            	        OutputStream outputStream = connection.getOutputStream();
            	        outputStream.write(jsonInput.getBytes());
            	        outputStream.flush();

            	        int responseCode = connection.getResponseCode();
            	        System.out.println("Response Code: " + responseCode);

            	        
            	        if(responseCode == 201 || responseCode ==200) {
            	        	Alert informationDialogs = new Alert(Alert.AlertType.INFORMATION);
            	        	informationDialogs.setHeaderText(null);
        	                informationDialogs.setContentText("Usuario "+ nombreString+ " registrado correctamente.");
        	                informationDialogs.showAndWait();
            	        }else {
            	        	Alert informationDialogsss = new Alert(Alert.AlertType.INFORMATION);
            	        	informationDialogsss.setHeaderText(null);
            	        	informationDialogsss.setContentText("ERROR, intentalo de nuevo, no se ha podido registrar el usuario.");
            	        	informationDialogsss.showAndWait();
            	        }
            	        
            	        
            		    if(responseCode == 201 || responseCode ==200) {
                	    	
                      	  
                            Platform.runLater(() -> {
                                Alert successDialog = new Alert(Alert.AlertType.INFORMATION);
                                successDialog.setHeaderText(null);
                                successDialog.setContentText("¡Volviendo a la pantalla de Inicio. Gracias!");
                                successDialog.showAndWait();
                            });
                            
                        	 try {
                     	        FXMLLoader loader = new FXMLLoader();
                     	        loader.setLocation(getClass().getResource("/views/main.fxml"));
                     	        Parent registrarseRoot = loader.load();
                     	        anchorPane.getChildren().clear();
                     	        anchorPane.getChildren().setAll(registrarseRoot);
                     	        
                                ((mainController)loader.getController()).setStage(rootParent,scene, stage);

                     	    } catch (IOException e) {
                     	        e.printStackTrace();
                     	    }
                            
                       }
            	        connection.disconnect();
            	    } catch (IOException e) {
            	        e.printStackTrace();
            	    }
                
            
               };
           
        }); 
    }
    


    @FXML
    void EventoEnteredInicio(MouseEvent event) {
    	DropShadow sombreaDropShadow =new DropShadow();
	 sombreaDropShadow.setRadius(20);
	 sombreaDropShadow.setColor(Color.WHITESMOKE);
	
	 btn_inicio.setEffect(sombreaDropShadow);
    }

    @FXML
    void EventoEnteredSiguiente(MouseEvent event) {
    	DropShadow sombreaDropShadow =new DropShadow();
	 sombreaDropShadow.setRadius(20);
	 sombreaDropShadow.setColor(Color.WHITESMOKE);
	
	 btn_siguiente.setEffect(sombreaDropShadow);
    }

    @FXML
    void EventoExistedInicio(MouseEvent event) {
    	btn_inicio.setEffect(null);
    }

    @FXML
    void EventoExitedSiguiente(MouseEvent event) {
    	btn_siguiente.setEffect(null);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// Establecer restricciones del AnchorPane
	    AnchorPane.setTopAnchor(anchorPane, 0.0);
	    AnchorPane.setBottomAnchor(anchorPane, 0.0);
	    AnchorPane.setLeftAnchor(anchorPane, 0.0);
	    AnchorPane.setRightAnchor(anchorPane, 0.0);
	    
	    Image image23 = new Image(getClass().getResourceAsStream("/img/Registratee.jpg"));
	    foto_fondo.setImage(image23);

	    // Establecer el ajuste automático del tamaño del ImageView al PaneAñadirSWitch
	    foto_fondo.fitWidthProperty().bind(PaneAñadirSWitch.widthProperty());
	    foto_fondo.fitHeightProperty().bind(PaneAñadirSWitch.heightProperty());
	    foto_fondo.setPreserveRatio(false);
	    foto_fondo.setSmooth(false);
	   
	    PANELES.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
	    
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
