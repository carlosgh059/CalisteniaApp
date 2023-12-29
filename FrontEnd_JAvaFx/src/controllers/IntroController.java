package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class IntroController  implements Initializable{

    @FXML
    private Label lblCargando;

    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ImageView foto_fondo;
    private static final int DELAY_SECONDS = 3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		    AnchorPane.setTopAnchor(anchorPane, 0.0);
		    AnchorPane.setBottomAnchor(anchorPane, 0.0);
		    AnchorPane.setLeftAnchor(anchorPane, 0.0);
		    AnchorPane.setRightAnchor(anchorPane, 0.0);

		 // Establecer el ajuste automático del tamaño del ImageView al PaneAñadirSWitch
		   
            Task<Void> loadTask = new Task<Void>() {

				@Override
				protected Void call() throws Exception {
					 try {
							FileInputStream inputstream = new FileInputStream("C://Users//Carlos//Desktop//GS//introoo.gif");
							
							Image image = new Image(inputstream); 
							foto_fondo.setImage(image);
							foto_fondo.fitWidthProperty().bind(PaneAñadirSWitch.widthProperty());
							foto_fondo.fitHeightProperty().bind(PaneAñadirSWitch.heightProperty());
							foto_fondo.setPreserveRatio(false);
							foto_fondo.setSmooth(false);
							foto_fondo.toFront();
							    
	                    } catch (FileNotFoundException e) {
	                        e.printStackTrace();
	                    }
	                    return null;
				   }
            };

           
    	 //   lblCargando.setVisible(false);		
    	    lblCargando.toBack();

            loadTask.setOnSucceeded(event -> {
              
                new Thread(() -> {
                    try {
                	    lblCargando.setVisible(false);		
                	    lblCargando.toBack();
                     	 String filePath = getClass().getResource("/img/pro.mp3").toString();
                 	    Media sound = new Media(filePath);
                 	    MediaPlayer mediaPlayer = new MediaPlayer(sound);
                 	    mediaPlayer.play();
                        Thread.sleep((long) (3.6f * 1000));
                        //Esperar 3 segundos y mostrar el mensaje
                        Platform.runLater(() -> {         
                           try {
			            	// Cargar la vista Principal.fxml
		    	            FXMLLoader loader = new FXMLLoader();
		    	            loader.setLocation(getClass().getResource("/views/main.fxml"));
		    	            Parent registrarseRoot;
							
						    registrarseRoot = loader.load();
					
		    	            PaneAñadirSWitch.getChildren().clear();
		    	            PaneAñadirSWitch.getChildren().setAll(registrarseRoot);
		    	            
		    	            ((mainController)loader.getController()).setStage(rootParent, scene, stage);
                            
                        	} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}    
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            });

            new Thread(loadTask).start();
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
