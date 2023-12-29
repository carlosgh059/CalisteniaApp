module c3 {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires org.apache.httpcomponents.httpcore;
	requires org.apache.httpcomponents.httpclient;
	requires org.json;
	requires java.desktop;
	requires javafx.media;
	
	exports c3;
	exports controllers;
	opens controllers; 	//Para que funcione la reflexión
	
}