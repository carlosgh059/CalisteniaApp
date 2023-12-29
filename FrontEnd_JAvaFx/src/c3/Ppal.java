package c3;

import java.io.IOException;

import controllers.IntroController;
import controllers.mainController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.PcModel;


public class Ppal extends Application {
	

    public Ppal () {
    	
    	
    }

	
	public void start(Stage stage) throws IOException {
	       Image image1 = new Image(getClass().getResourceAsStream("/img/logus.png"));

		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/Intro.fxml"));
        Parent root = loader.load();
         
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.show();
        
        stage.setTitle("Aplicacion calistenia");
        stage.getIcons().add(image1);
        stage.setWidth(1000);
        stage.setHeight(550);
        
       ((IntroController)loader.getController()).setStage(root,scene, stage);
        
    // ((mainController)loader.getController()).setStage(root,scene, stage);

   
        
	}

	public static void main(String[] args) {
		launch(args);
	}
}
