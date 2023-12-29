package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class EjerciciosController implements Initializable{

    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private AnchorPane anchorPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	cargarlista();
	

	   AnchorPane.setTopAnchor(anchorPane, 85.0);
	   AnchorPane.setBottomAnchor(anchorPane, 20.0);
	   AnchorPane.setLeftAnchor(anchorPane, 25.0);
	   AnchorPane.setRightAnchor(anchorPane, 25.0);

	}

	private void cargarlista() {
	
	}

}
