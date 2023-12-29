package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AjusteController  implements Initializable{
 
    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ChoiceBox<String> BoxIdioma;

    @FXML
    private ChoiceBox<String> BoxTheme;
    
    @FXML
    private Button btnCerrarSesion;

    @FXML
    void EventoClickCambiarTheme(MouseEvent event) {

    }

    @FXML
    void EventoClickCerrarSEsion(MouseEvent event) {
   	 // Crear un cuadro de diálogo de confirmación
	    Alert alert = new Alert(AlertType.CONFIRMATION);
	    alert.setTitle("Confirmar salida");
	    alert.setHeaderText(null);
	    alert.setContentText("¿Estás seguro de que quieres salir?");

	    // Obtener la respuesta del usuario
	    ButtonType resultado = alert.showAndWait().orElse(ButtonType.CANCEL);

	    if (resultado == ButtonType.OK) {
	     
	    	
	      	 try {
	      		FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(getClass().getResource("/views/main.fxml"));
	            rootParent = loader.load();
	             
	            scene= new Scene(rootParent);
	            
	            stage.setScene(scene);
	            
	            stage.show();
	            
	            
	            ((mainController)loader.getController()).setStage(rootParent,scene, stage);

	    	        
	    	    } catch (IOException e) {
	    	        e.printStackTrace();
	    	    }	
	    	
	    	
	    	
	    	
	    	
	       
	    } else {
	        // Código adicional si deseas realizar alguna acción después de cancelar la salida
	    }
    }

    @FXML
    void EventoClickCmabiaridioma(MouseEvent event) {

    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		

	// Crear una lista de idiomas
	List<String> idiomasList = Arrays.asList("Inglés", "Español", "Alemán", "Francés");
	List<String> themeList = Arrays.asList("Oscuro", "Diurno");

	BoxIdioma.getItems().addAll(idiomasList);
	BoxTheme.getItems().addAll(themeList);
   
	
	
	
			   AnchorPane.setTopAnchor(anchorPane, 0.0);
			   AnchorPane.setBottomAnchor(anchorPane, 0.0);
			   AnchorPane.setLeftAnchor(anchorPane, 00.0);
			   AnchorPane.setRightAnchor(anchorPane, 0.0);

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
