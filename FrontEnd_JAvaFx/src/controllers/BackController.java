package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BackController  implements Initializable{
 
    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private AnchorPane anchorPane;

    
    @FXML
    private ImageView foto1;

    @FXML
    private ImageView foto2;

    @FXML
    private ImageView foto3;

    @FXML
    private ImageView foto4;

    @FXML
    private ImageView foto5;

    @FXML
    private ImageView foto6;

    @FXML
    private ImageView foto7;

    @FXML
    private ImageView foto8;

    @FXML
    private ImageView foto9;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		
		
	       Image image1 = new Image(getClass().getResourceAsStream("/img/b1.jpg"));
	       Image image2 = new Image(getClass().getResourceAsStream("/img/b2.jpg"));
	       Image image3 = new Image(getClass().getResourceAsStream("/img/b3.jpg"));
	       Image image4 = new Image(getClass().getResourceAsStream("/img/b4.jpg"));
	       Image image5 = new Image(getClass().getResourceAsStream("/img/b5.jpg"));
	       Image image6 = new Image(getClass().getResourceAsStream("/img/b6.jpg"));
	       Image image7 = new Image(getClass().getResourceAsStream("/img/b7.jpg"));
	       Image image8 = new Image(getClass().getResourceAsStream("/img/b4.jpg"));
	       Image image9 = new Image(getClass().getResourceAsStream("/img/b5.jpg"));

	       
		    foto1.setImage(image1);
		    foto2.setImage(image2);
		    foto3.setImage(image3);
		    foto4.setImage(image4);
		    foto5.setImage(image5);
		    foto6.setImage(image6);
		    foto7.setImage(image7);
		    foto8.setImage(image8);
		    foto9.setImage(image9);

		    
			   AnchorPane.setTopAnchor(anchorPane, 85.0);
			   AnchorPane.setBottomAnchor(anchorPane, 20.0);
			   AnchorPane.setLeftAnchor(anchorPane, 25.0);
			   AnchorPane.setRightAnchor(anchorPane, 25.0);

	}

}
