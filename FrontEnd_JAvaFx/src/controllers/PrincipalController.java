package controllers;

import javafx.scene.image.Image;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PrincipalController implements Initializable {
//datos usuario
	private static String nombreString;
	private static String apellidoString;
	private static String edadString;
	private static String pesoString;
	private static String emailString;
	private static String passString;
	private static String fotoString;
	


    @FXML
    private Circle Ciruclo;

    @FXML
    private AnchorPane SubMenu_Lista;

    @FXML
    private Button btn_Ajustes;

    @FXML
    private Button btn_Back;

    @FXML
    private Button btn_Expandir;

    @FXML
    private Button btn_Giros;

    @FXML
    private Button btn_Handstap;

    @FXML
    private Button btn_Muscle;

    @FXML
    private Button btn_dieta;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button btn_ejercicios;

    @FXML
    private Button btn_front;

    @FXML
    private Button btn_plancha;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_subMLista_SAI;

    @FXML
    private Button btn_subMLista_SAN;

    @FXML
    private Button btn_tabla;

    @FXML
    private Button btn_usuario;

    @FXML
    private Label label_usuario;

    @FXML
    private Pane pane_logo;

    @FXML
    private Pane pane_logo1;

    @FXML
    private AnchorPane panelPrincipal;

    @FXML
    private VBox vbox_izquierda;
    


    @FXML
    void EventoClickAjustes(MouseEvent event) {
		SubMenu_Lista.setVisible(false);
	  	try {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("/views/Ajustes.fxml"));
	        Parent registrarseRoot;

	        registrarseRoot = loader.load();
		
	        panelPrincipal.getChildren().clear();
	        panelPrincipal.getChildren().setAll(registrarseRoot);  
	        
	        
            ((AjusteController)loader.getController()).setStage(rootParent,scene, stage);


	} catch (IOException e) {
		e.printStackTrace();
	}
    }

    @FXML
    void EventoClickCirculo(MouseEvent event) {
		SubMenu_Lista.setVisible(false);

    }

    @FXML
    void EventoClickDieta(MouseEvent event) {
		SubMenu_Lista.setVisible(false);
		
		if(usuario) {
			System.out.println("si soy un usuario");
			 cargarDatosUsuario();
		 	 try {
			        FXMLLoader loader = new FXMLLoader();
			        loader.setLocation(getClass().getResource("/views/Dieta.fxml"));
			        Parent registrarseRoot = loader.load();
			        
			        panelPrincipal.getChildren().clear();
			        panelPrincipal.getChildren().setAll(registrarseRoot);
			        
			        ((DietaController)loader.getController()).setDieta(
			        		dietaHorario1,dietaHorario2,dietaHorario3,dietaHorario4,dietaHorario5,dietaHorario6,dietaHorario7,dietaHorario7,
			        		dietaLunes1,dietaLunes2,dietaLunes3,dietaLunes4,dietaLunes5,dietaLunes6,dietaLunes7,dietaLunes8,
			        		dietaMartes1,dietaMartes2,dietaMartes3,dietaMartes4,dietaMartes5,dietaMartes6,dietaMartes7,dietaMartes8,
			        		dietaMiercoles1,dietaMiercoles2,dietaMiercoles3,dietaMiercoles4,dietaMiercoles5,dietaMiercoles6,dietaMiercoles7,dietaMiercoles8,
			        		dietaJueves1,dietaJueves2,dietaJueves3,dietaJueves4,dietaJueves5,dietaJueves6,dietaJueves7,dietaJueves8,
			        		dietaViernes1,dietaViernes2,dietaViernes3,dietaViernes4,dietaViernes5,dietaViernes6,dietaViernes7,dietaViernes8,
			        		dietaSabado1,dietaSabado2,dietaSabado3,dietaSabado4,dietaSabado5,dietaSabado6,dietaSabado7,dietaSabado8,
			        		dietaDomingo1,dietaDomingo2,dietaDomingo3,dietaDomingo4,dietaDomingo5,dietaDomingo6,dietaDomingo7,dietaDomingo8
			        );
			        ((DietaController)loader.getController()).setUsuario();
			    } catch (IOException e) {
			        e.printStackTrace();
			    }	
		}else {
			System.out.println("si soy un monitor");
			cargarDatosMonitor();
		 	 try {
			        FXMLLoader loader = new FXMLLoader();
			        loader.setLocation(getClass().getResource("/views/Dieta.fxml"));
			        Parent registrarseRoot = loader.load();
			        
			        panelPrincipal.getChildren().clear();
			        panelPrincipal.getChildren().setAll(registrarseRoot);
			        
			        ((DietaController)loader.getController()).setDieta(
			        		dietaHorario1,dietaHorario2,dietaHorario3,dietaHorario4,dietaHorario5,dietaHorario6,dietaHorario7,dietaHorario7,
			        		dietaLunes1,dietaLunes2,dietaLunes3,dietaLunes4,dietaLunes5,dietaLunes6,dietaLunes7,dietaLunes8,
			        		dietaMartes1,dietaMartes2,dietaMartes3,dietaMartes4,dietaMartes5,dietaMartes6,dietaMartes7,dietaMartes8,
			        		dietaMiercoles1,dietaMiercoles2,dietaMiercoles3,dietaMiercoles4,dietaMiercoles5,dietaMiercoles6,dietaMiercoles7,dietaMiercoles8,
			        		dietaJueves1,dietaJueves2,dietaJueves3,dietaJueves4,dietaJueves5,dietaJueves6,dietaJueves7,dietaJueves8,
			        		dietaViernes1,dietaViernes2,dietaViernes3,dietaViernes4,dietaViernes5,dietaViernes6,dietaViernes7,dietaViernes8,
			        		dietaSabado1,dietaSabado2,dietaSabado3,dietaSabado4,dietaSabado5,dietaSabado6,dietaSabado7,dietaSabado8,
			        		dietaDomingo1,dietaDomingo2,dietaDomingo3,dietaDomingo4,dietaDomingo5,dietaDomingo6,dietaDomingo7,dietaDomingo8
			        );
			    	System.out.println("si soy un monitor de la dieta");	        
			        ((DietaController)loader.getController()).setMonitor();
			        
			        
			    } catch (IOException e) {
			        e.printStackTrace();
			    }	
	//----------------------mointor		
			
			 cargarDatosMonitor();
		}

	   
    }

 

	@FXML
    void EventoClickEjercicios(MouseEvent event) {
		SubMenu_Lista.setVisible(true);

	  	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Plancha.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }

   

    @FXML
    void EventoClickSalir(MouseEvent event) {
		SubMenu_Lista.setVisible(false);

		 // Crear un cuadro de diálogo de confirmación
	    Alert alert = new Alert(AlertType.CONFIRMATION);
	    alert.setTitle("Confirmar salida");
	    alert.setHeaderText(null);
	    alert.setContentText("¿Estás seguro de que quieres salir?");

	    // Obtener la respuesta del usuario
	    ButtonType resultado = alert.showAndWait().orElse(ButtonType.CANCEL);

	    if (resultado == ButtonType.OK) {
	        // Salir del programa
	        Platform.exit();
	    } else {
	        // Código adicional si deseas realizar alguna acción después de cancelar la salida
	    }
    }

    @FXML
    void EventoClickTabla(MouseEvent event) {
    	
    	if(usuario) {
			System.out.println("si soy un usuario");

    		SubMenu_Lista.setVisible(false);
    	    cargarDatosUsuario();
    	 	 try {
    		        FXMLLoader loader = new FXMLLoader();
    		        loader.setLocation(getClass().getResource("/views/Tabla.fxml"));
    		        Parent registrarseRoot = loader.load();
    		        
    		        panelPrincipal.getChildren().clear();
    		        panelPrincipal.getChildren().setAll(registrarseRoot);
    		        
    		        ((TablaController)loader.getController()).setTabla
    		        		(
    		        				tablaHorario1,tablaHorario2,tablaHorario3,tablaHorario4,tablaHorario5,tablaHorario6,tablaHorario7,tablaHorario7,
    		        				tablaLunes1,tablaLunes2,tablaLunes3,tablaLunes4,tablaLunes5,tablaLunes6,tablaLunes7,tablaLunes8,
    		        				tablaMartes1,tablaMartes2,tablaMartes3,tablaMartes4,tablaMartes5,tablaMartes6,tablaMartes7,tablaMartes8,
    		        				tablaMiercoles1,tablaMiercoles2,tablaMiercoles3,tablaMiercoles4,tablaMiercoles5,tablaMiercoles6,tablaMiercoles7,tablaMiercoles8,
    		        				tablaJueves1,tablaJueves2,tablaJueves3,tablaJueves4,tablaJueves5,tablaJueves6,tablaJueves7,tablaJueves8,
    		        				tablaViernes1,tablaViernes2,tablaViernes3,tablaViernes4,tablaViernes5,tablaViernes6,tablaViernes7,tablaViernes8,
    		        				tablaSabado1,tablaSabado2,tablaSabado3,tablaSabado4,tablaSabado5,tablaSabado6,tablaSabado7,tablaSabado8,
    		        				tablaDomingo1,tablaDomingo2,tablaDomingo3,tablaDomingo4,tablaDomingo5,tablaDomingo6,tablaDomingo7,tablaDomingo8

    		        		);
    		        
    		        
    		        ((TablaController)loader.getController()).setUsuario();
    		        
    		    } catch (IOException e) {
    		        e.printStackTrace();
    		    }
    	}else {
			System.out.println("si soy un monitor");
			
			cargarDatosMonitor();
		 	 try {
 		        FXMLLoader loader = new FXMLLoader();
 		        loader.setLocation(getClass().getResource("/views/Tabla.fxml"));
 		        Parent registrarseRoot = loader.load();
 		        
 		        panelPrincipal.getChildren().clear();
 		        panelPrincipal.getChildren().setAll(registrarseRoot);
 		        
 		        ((TablaController)loader.getController()).setTabla
 		        		(
 		        				tablaHorario1,tablaHorario2,tablaHorario3,tablaHorario4,tablaHorario5,tablaHorario6,tablaHorario7,tablaHorario7,
 		        				tablaLunes1,tablaLunes2,tablaLunes3,tablaLunes4,tablaLunes5,tablaLunes6,tablaLunes7,tablaLunes8,
 		        				tablaMartes1,tablaMartes2,tablaMartes3,tablaMartes4,tablaMartes5,tablaMartes6,tablaMartes7,tablaMartes8,
 		        				tablaMiercoles1,tablaMiercoles2,tablaMiercoles3,tablaMiercoles4,tablaMiercoles5,tablaMiercoles6,tablaMiercoles7,tablaMiercoles8,
 		        				tablaJueves1,tablaJueves2,tablaJueves3,tablaJueves4,tablaJueves5,tablaJueves6,tablaJueves7,tablaJueves8,
 		        				tablaViernes1,tablaViernes2,tablaViernes3,tablaViernes4,tablaViernes5,tablaViernes6,tablaViernes7,tablaViernes8,
 		        				tablaSabado1,tablaSabado2,tablaSabado3,tablaSabado4,tablaSabado5,tablaSabado6,tablaSabado7,tablaSabado8,
 		        				tablaDomingo1,tablaDomingo2,tablaDomingo3,tablaDomingo4,tablaDomingo5,tablaDomingo6,tablaDomingo7,tablaDomingo8
 		        		);
 		        ((TablaController)loader.getController()).setMonitor();
 				 cargarDatosMonitor();

 		    } catch (IOException e) {
 		        e.printStackTrace();
 		    }
			
    	}
    	
    }

    @FXML
    void EventoClickUsuario(MouseEvent event) {
		SubMenu_Lista.setVisible(false);
		
		
		if(usuario) {
 	        cargarDatosUsuario();

		}else{
			cargarDatosMonitor();
		}
	 	 try {
	 	    
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Usuario.fxml"));
		        Parent registrarseRoot = loader.load();

		        
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);
		if(usuario) {
			 ((UsuarioController)loader.getController()).setUsuario
		        (
		        nombreString, apellidoString, edadString, pesoString, emailString,passString, fotoString, Ciruclo, this
		        
		        );
		}else {
			 ((UsuarioController)loader.getController()).setMonitor
		        (
		        nombreString, apellidoString, edadString, pesoString, emailString,passString, fotoString, Ciruclo, this
		        
		        );
		}
		       

		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	   	 
    }

    
    //---------------------------------eventos de la lsita------------------------------------
    @FXML
    void EventoClickExpandir(MouseEvent event) {
    		System.out.println("gola");
    }

    @FXML
    void EventoClickFront(MouseEvent event) {

    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Front.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void EventoClickGiros(MouseEvent event) {

    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Girp.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void EventoClickHands(MouseEvent event) {

    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Hadnstap.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void EventoClickLever(MouseEvent event) {
    		System.out.println("Soy back");
    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Back.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void EventoClickMuscle(MouseEvent event) {

    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/MuscleUp.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void EventoClickPlancha(MouseEvent event) {

    	try {
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("/views/Plancha.fxml"));
		        Parent registrarseRoot;
				
		        registrarseRoot = loader.load();
			
		        panelPrincipal.getChildren().clear();
		        panelPrincipal.getChildren().setAll(registrarseRoot);  
		        
		        
    	} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		SubMenu_Lista.setVisible(false);
	    AnchorPane.setTopAnchor(anchorPane, 0.0);
	    AnchorPane.setBottomAnchor(anchorPane, 0.0);
	    AnchorPane.setLeftAnchor(anchorPane, 0.0);
	    AnchorPane.setRightAnchor(anchorPane, 0.0);	
        //cargarDatosUsuario();

	    
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
	            
	        
	            //cargamos la imagen
	            byte[] fotoBytes = Base64.getDecoder().decode(fotoString);

	         // Crear un objeto Image a partir del arreglo de bytes
	            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fotoBytes)) {
	            Image image = new Image(inputStream);

	             // Ajustar la imagen al círculo existente
	             Ciruclo.setFill(new ImagePattern(image));
	             label_usuario.setText(nombreString);

	             // Resto del código...
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
	            
	            
	           
	            

	            //CARGAR TABLA
	            tablaHorario1 = usuarioJson.getJSONObject("tabla").getString("horario1");
	            tablaHorario2 = usuarioJson.getJSONObject("tabla").getString("horario2");
	            tablaHorario3 = usuarioJson.getJSONObject("tabla").getString("horario3");
	            tablaHorario4 = usuarioJson.getJSONObject("tabla").getString("horario4");
	            tablaHorario5 = usuarioJson.getJSONObject("tabla").getString("horario5");
	            tablaHorario6 = usuarioJson.getJSONObject("tabla").getString("horario6");	           
	            tablaHorario7 = usuarioJson.getJSONObject("tabla").getString("horario7");
	            tablaHorario8 = usuarioJson.getJSONObject("tabla").getString("horario8");
	            
	            tablaLunes1 = usuarioJson.getJSONObject("tabla").getString("lunes1");
	            tablaLunes2 = usuarioJson.getJSONObject("tabla").getString("lunes2");
	            tablaLunes3 = usuarioJson.getJSONObject("tabla").getString("lunes3");
	            tablaLunes4 = usuarioJson.getJSONObject("tabla").getString("lunes4");
	            tablaLunes5 = usuarioJson.getJSONObject("tabla").getString("lunes5");
	            tablaLunes6 = usuarioJson.getJSONObject("tabla").getString("lunes6");	           
	            tablaLunes7 = usuarioJson.getJSONObject("tabla").getString("lunes7");
	            tablaLunes8 = usuarioJson.getJSONObject("tabla").getString("lunes8");
	            
	            tablaMartes1 = usuarioJson.getJSONObject("tabla").getString("martes1");
	            tablaMartes2 = usuarioJson.getJSONObject("tabla").getString("martes2");
	            tablaMartes3 = usuarioJson.getJSONObject("tabla").getString("martes3");
	            tablaMartes4 = usuarioJson.getJSONObject("tabla").getString("martes4");
	            tablaMartes5 = usuarioJson.getJSONObject("tabla").getString("martes5");
	            tablaMartes6 = usuarioJson.getJSONObject("tabla").getString("martes6");	           
	            tablaMartes7 = usuarioJson.getJSONObject("tabla").getString("martes7");
	            tablaMartes8 = usuarioJson.getJSONObject("tabla").getString("martes8");
	            
	            tablaMiercoles1 = usuarioJson.getJSONObject("tabla").getString("miercoles1");
	            tablaMiercoles2 = usuarioJson.getJSONObject("tabla").getString("miercoles2");
	            tablaMiercoles3 = usuarioJson.getJSONObject("tabla").getString("miercoles3");
	            tablaMiercoles4 = usuarioJson.getJSONObject("tabla").getString("miercoles4");
	            tablaMiercoles5 = usuarioJson.getJSONObject("tabla").getString("miercoles5");
	            tablaMiercoles6 = usuarioJson.getJSONObject("tabla").getString("miercoles6");	           
	            tablaMiercoles7 = usuarioJson.getJSONObject("tabla").getString("miercoles7");
	            tablaMiercoles8 = usuarioJson.getJSONObject("tabla").getString("miercoles8");
	            
	            tablaJueves1 = usuarioJson.getJSONObject("tabla").getString("jueves1");
	            tablaJueves2 = usuarioJson.getJSONObject("tabla").getString("jueves2");
	            tablaJueves3 = usuarioJson.getJSONObject("tabla").getString("jueves3");
	            tablaJueves4 = usuarioJson.getJSONObject("tabla").getString("jueves4");
	            tablaJueves5 = usuarioJson.getJSONObject("tabla").getString("jueves5");
	            tablaJueves6 = usuarioJson.getJSONObject("tabla").getString("jueves6");	           
	            tablaJueves7 = usuarioJson.getJSONObject("tabla").getString("jueves7");
	            tablaJueves8 = usuarioJson.getJSONObject("tabla").getString("jueves8");
	            
	            tablaViernes1 = usuarioJson.getJSONObject("tabla").getString("viernes1");
	            tablaViernes2 = usuarioJson.getJSONObject("tabla").getString("viernes2");
	            tablaViernes3 = usuarioJson.getJSONObject("tabla").getString("viernes3");
	            tablaViernes4 = usuarioJson.getJSONObject("tabla").getString("viernes4");
	            tablaViernes5 = usuarioJson.getJSONObject("tabla").getString("viernes5");
	            tablaViernes6 = usuarioJson.getJSONObject("tabla").getString("viernes6");	           
	            tablaViernes7 = usuarioJson.getJSONObject("tabla").getString("viernes7");
	            tablaViernes8 = usuarioJson.getJSONObject("tabla").getString("viernes8");
	            
	            tablaSabado1 = usuarioJson.getJSONObject("tabla").getString("sabado1");
	            tablaSabado2 = usuarioJson.getJSONObject("tabla").getString("sabado2");
	            tablaSabado3 = usuarioJson.getJSONObject("tabla").getString("sabado3");
	            tablaSabado4 = usuarioJson.getJSONObject("tabla").getString("sabado4");
	            tablaSabado5 = usuarioJson.getJSONObject("tabla").getString("sabado5");
	            tablaSabado6 = usuarioJson.getJSONObject("tabla").getString("sabado6");	           
	            tablaSabado7 = usuarioJson.getJSONObject("tabla").getString("sabado7");
	            tablaSabado8 = usuarioJson.getJSONObject("tabla").getString("sabado8");
	            
	            tablaDomingo1 = usuarioJson.getJSONObject("tabla").getString("domingo1");
	            tablaDomingo2 = usuarioJson.getJSONObject("tabla").getString("domingo2");
	            tablaDomingo3 = usuarioJson.getJSONObject("tabla").getString("domingo3");
	            tablaDomingo4 = usuarioJson.getJSONObject("tabla").getString("domingo4");
	            tablaDomingo5 = usuarioJson.getJSONObject("tabla").getString("domingo5");
	            tablaDomingo6 = usuarioJson.getJSONObject("tabla").getString("domingo6");	           
	            tablaDomingo7 = usuarioJson.getJSONObject("tabla").getString("domingo7");
	            tablaDomingo8 = usuarioJson.getJSONObject("tabla").getString("domingo8");
	            
	            //CARGAR Dieta	            
	            dietaHorario1 = usuarioJson.getJSONObject("dieta").getString("horario1");
	            dietaHorario2 = usuarioJson.getJSONObject("dieta").getString("horario2");
	            dietaHorario3 = usuarioJson.getJSONObject("dieta").getString("horario3");
	            dietaHorario4 = usuarioJson.getJSONObject("dieta").getString("horario4");
	            dietaHorario5 = usuarioJson.getJSONObject("dieta").getString("horario5");
	            dietaHorario6 = usuarioJson.getJSONObject("dieta").getString("horario6");	           
	            dietaHorario7 = usuarioJson.getJSONObject("dieta").getString("horario7");
	            dietaHorario8 = usuarioJson.getJSONObject("dieta").getString("horario8");
	            
	            dietaLunes1 = usuarioJson.getJSONObject("dieta").getString("lunes1");
	            dietaLunes2 = usuarioJson.getJSONObject("dieta").getString("lunes2");
	            dietaLunes3 = usuarioJson.getJSONObject("dieta").getString("lunes3");
	            dietaLunes4 = usuarioJson.getJSONObject("dieta").getString("lunes4");
	            dietaLunes5 = usuarioJson.getJSONObject("dieta").getString("lunes5");
	            dietaLunes6 = usuarioJson.getJSONObject("dieta").getString("lunes6");	           
	            dietaLunes7 = usuarioJson.getJSONObject("dieta").getString("lunes7");
	            dietaLunes8 = usuarioJson.getJSONObject("dieta").getString("lunes8");
	            
	            dietaMartes1 = usuarioJson.getJSONObject("dieta").getString("martes1");
	            dietaMartes2 = usuarioJson.getJSONObject("dieta").getString("martes2");
	            dietaMartes3 = usuarioJson.getJSONObject("dieta").getString("martes3");
	            dietaMartes4 = usuarioJson.getJSONObject("dieta").getString("martes4");
	            dietaMartes5 = usuarioJson.getJSONObject("dieta").getString("martes5");
	            dietaMartes6 = usuarioJson.getJSONObject("dieta").getString("martes6");	           
	            dietaMartes7 = usuarioJson.getJSONObject("dieta").getString("martes7");
	            dietaMartes8 = usuarioJson.getJSONObject("dieta").getString("martes8");
	            
	            dietaMiercoles1 = usuarioJson.getJSONObject("dieta").getString("miercoles1");
	            dietaMiercoles2 = usuarioJson.getJSONObject("dieta").getString("miercoles2");
	            dietaMiercoles3 = usuarioJson.getJSONObject("dieta").getString("miercoles3");
	            dietaMiercoles4 = usuarioJson.getJSONObject("dieta").getString("miercoles4");
	            dietaMiercoles5 = usuarioJson.getJSONObject("dieta").getString("miercoles5");
	            dietaMiercoles6 = usuarioJson.getJSONObject("dieta").getString("miercoles6");	           
	            dietaMiercoles7 = usuarioJson.getJSONObject("dieta").getString("miercoles7");
	            dietaMiercoles8 = usuarioJson.getJSONObject("dieta").getString("miercoles8");
	            
	            dietaJueves1 = usuarioJson.getJSONObject("dieta").getString("jueves1");
	            dietaJueves2 = usuarioJson.getJSONObject("dieta").getString("jueves2");
	            dietaJueves3 = usuarioJson.getJSONObject("dieta").getString("jueves3");
	            dietaJueves4 = usuarioJson.getJSONObject("dieta").getString("jueves4");
	            dietaJueves5 = usuarioJson.getJSONObject("dieta").getString("jueves5");
	            dietaJueves6 = usuarioJson.getJSONObject("dieta").getString("jueves6");	           
	            dietaJueves7 = usuarioJson.getJSONObject("dieta").getString("jueves7");
	            dietaJueves8 = usuarioJson.getJSONObject("dieta").getString("jueves8");
	            
	            dietaViernes1 = usuarioJson.getJSONObject("dieta").getString("viernes1");
	            dietaViernes2 = usuarioJson.getJSONObject("dieta").getString("viernes2");
	            dietaViernes3 = usuarioJson.getJSONObject("dieta").getString("viernes3");
	            dietaViernes4 = usuarioJson.getJSONObject("dieta").getString("viernes4");
	            dietaViernes5 = usuarioJson.getJSONObject("dieta").getString("viernes5");
	            dietaViernes6 = usuarioJson.getJSONObject("dieta").getString("viernes6");	           
	            dietaViernes7 = usuarioJson.getJSONObject("dieta").getString("viernes7");
	            dietaViernes8 = usuarioJson.getJSONObject("dieta").getString("viernes8");
	            
	            dietaSabado1 = usuarioJson.getJSONObject("dieta").getString("sabado1");
	            dietaSabado2 = usuarioJson.getJSONObject("dieta").getString("sabado2");
	            dietaSabado3 = usuarioJson.getJSONObject("dieta").getString("sabado3");
	            dietaSabado4 = usuarioJson.getJSONObject("dieta").getString("sabado4");
	            dietaSabado5 = usuarioJson.getJSONObject("dieta").getString("sabado5");
	            dietaSabado6 = usuarioJson.getJSONObject("dieta").getString("sabado6");	           
	            dietaSabado7 = usuarioJson.getJSONObject("dieta").getString("sabado7");
	            dietaSabado8 = usuarioJson.getJSONObject("dieta").getString("sabado8");
	            
	            dietaDomingo1 = usuarioJson.getJSONObject("dieta").getString("domingo1");
	            dietaDomingo2 = usuarioJson.getJSONObject("dieta").getString("domingo2");
	            dietaDomingo3 = usuarioJson.getJSONObject("dieta").getString("domingo3");
	            dietaDomingo4 = usuarioJson.getJSONObject("dieta").getString("domingo4");
	            dietaDomingo5 = usuarioJson.getJSONObject("dieta").getString("domingo5");
	            dietaDomingo6 = usuarioJson.getJSONObject("dieta").getString("domingo6");	           
	            dietaDomingo7 = usuarioJson.getJSONObject("dieta").getString("domingo7");
	            dietaDomingo8 = usuarioJson.getJSONObject("dieta").getString("domingo8");
	            
	                    
	           
	            System.out.println( tablaHorario1 +" -- "+tablaHorario2+" -- "+ tablaHorario5+" -- "+  tablaHorario8 +" -- "+   emailString +" -- "+ tablaHorario1 +" -- "+ dietaHorario1 );
	            
	            
	         
	            
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
	
	
	
	//datos de la tabla
	private static String tablaHorario1;
	private static String tablaHorario2;
	private static String tablaHorario3;
	private static String tablaHorario4;	
	private static String tablaHorario5;
	private static String tablaHorario6;
	private static String tablaHorario7;
	private static String tablaHorario8;
	
	private static String tablaLunes1;
	private static String tablaLunes2;
	private static String tablaLunes3;
	private static String tablaLunes4;
	private static String tablaLunes5;
	private static String tablaLunes6;
	private static String tablaLunes7;
	private static String tablaLunes8;
	
	private static String tablaMartes1;
	private static String tablaMartes2;
	private static String tablaMartes3;
	private static String tablaMartes4;
	private static String tablaMartes5;
	private static String tablaMartes6;
	private static String tablaMartes7;
	private static String tablaMartes8;
	
	private static String tablaMiercoles1;
	private static String tablaMiercoles2;
	private static String tablaMiercoles3;
	private static String tablaMiercoles4;
	private static String tablaMiercoles5;
	private static String tablaMiercoles6;
	private static String tablaMiercoles7;
	private static String tablaMiercoles8;
	
	private static String tablaJueves1;
	private static String tablaJueves2;
	private static String tablaJueves3;
	private static String tablaJueves4;
	private static String tablaJueves5;
	private static String tablaJueves6;
	private static String tablaJueves7;
	private static String tablaJueves8;
	
	private static String tablaViernes1;
	private static String tablaViernes2;
	private static String tablaViernes3;
	private static String tablaViernes4;
	private static String tablaViernes5;
	private static String tablaViernes6;
	private static String tablaViernes7;
	private static String tablaViernes8;
	
	private static String tablaSabado1;
	private static String tablaSabado2;
	private static String tablaSabado3;
	private static String tablaSabado4;
	private static String tablaSabado5;
	private static String tablaSabado6;
	private static String tablaSabado7;
	private static String tablaSabado8;
	
	private static String tablaDomingo1;
	private static String tablaDomingo2;
	private static String tablaDomingo3;
	private static String tablaDomingo4;
	private static String tablaDomingo5;
	private static String tablaDomingo6;
	private static String tablaDomingo7;
	private static String tablaDomingo8;
	
	//datos de la dieta
	
	private static String dietaHorario1;
	private static String dietaHorario2;
	private static String dietaHorario3;
	private static String dietaHorario4;	
	private static String dietaHorario5;
	private static String dietaHorario6;
	private static String dietaHorario7;
	private static String dietaHorario8;
	
	private static String dietaLunes1;
	private static String dietaLunes2;
	private static String dietaLunes3;
	private static String dietaLunes4;
	private static String dietaLunes5;
	private static String dietaLunes6;
	private static String dietaLunes7;
	private static String dietaLunes8;
	
	private static String dietaMartes1;
	private static String dietaMartes2;
	private static String dietaMartes3;
	private static String dietaMartes4;
	private static String dietaMartes5;
	private static String dietaMartes6;
	private static String dietaMartes7;
	private static String dietaMartes8;
	
	private static String dietaMiercoles1;
	private static String dietaMiercoles2;
	private static String dietaMiercoles3;
	private static String dietaMiercoles4;
	private static String dietaMiercoles5;
	private static String dietaMiercoles6;
	private static String dietaMiercoles7;
	private static String dietaMiercoles8;
	
	private static String dietaJueves1;
	private static String dietaJueves2;
	private static String dietaJueves3;
	private static String dietaJueves4;
	private static String dietaJueves5;
	private static String dietaJueves6;
	private static String dietaJueves7;
	private static String dietaJueves8;
	
	private static String dietaViernes1;
	private static String dietaViernes2;
	private static String dietaViernes3;
	private static String dietaViernes4;
	private static String dietaViernes5;
	private static String dietaViernes6;
	private static String dietaViernes7;
	private static String dietaViernes8;
	
	private static String dietaSabado1;
	private static String dietaSabado2;
	private static String dietaSabado3;
	private static String dietaSabado4;
	private static String dietaSabado5;
	private static String dietaSabado6;
	private static String dietaSabado7;
	private static String dietaSabado8;
	
	private static String dietaDomingo1;
	private static String dietaDomingo2;
	private static String dietaDomingo3;
	private static String dietaDomingo4;
	private static String dietaDomingo5;
	private static String dietaDomingo6;
	private static String dietaDomingo7;
	private static String dietaDomingo8;



	public void SetCirculo(String imagenstring, String nombre) {
		if(usuario) {
			 cargarDatosUsuario();

		}else {
			cargarDatosMonitor();
		}
				
		    System.out.println("Soy el circulo");	
			//cargamos la imagen
			byte[] fotoBytess = Base64.getDecoder().decode(fotoString);
			
			// Crear un objeto Image a partir del arreglo de bytes
			try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fotoBytess)) {
			Image image = new Image(inputStream);
			
			 // Ajustar la imagen al círculo existente
			 Ciruclo.setFill(new ImagePattern(image));
			 label_usuario.setText(nombre);
			 
			 
		 // Resto del código...
		} catch (IOException e) {
		 e.printStackTrace();
		}
			

	}
	

	Parent rootParent;
	Scene scene;
	Stage stage;
	
	boolean usuario=false;
	public void setStage(Parent root, Scene scene, Stage stage) {
		
		this.rootParent = root;
		this.scene = scene;
		this.stage = stage;
		
	}

	public void setStageUsuario(Parent rootParent2, Scene scene2, Stage stage2) {
		// TODO Auto-generated method stub
		this.rootParent = rootParent2;
		this.scene = scene2;
		this.stage = stage2;
		
		usuario=true;
		cargarDatosUsuario();
		System.out.println("-------------setEstageusuario------------");
        System.out.println("foto: "+fotoString);
        System.out.println("NOMBRE: "+nombreString);
        System.out.println("APELLIDO: "+apellidoString);
        System.out.println("EDAD: "+edadString);
        System.out.println("PESO: "+pesoString);
        System.out.println("PASS: "+passString);
        System.out.println("EMAIL: "+emailString);
	}

	public void setStageMonitor(Parent rootParent2, Scene scene2, Stage stage2) {
		this.rootParent = rootParent2;
		this.scene = scene2;
		this.stage = stage2;	
		
		usuario=false;
		cargarDatosMonitor();
		
		    System.out.println("----------------------SeStageMonitor--------------------------------");
	        System.out.println("foto: "+fotoString);
	        System.out.println("NOMBRE: "+nombreString);
	        System.out.println("APELLIDO: "+apellidoString);
	        System.out.println("EDAD: "+edadString);
	        System.out.println("PESO: "+pesoString);
	        System.out.println("PASS: "+passString);
	        System.out.println("EMAIL: "+emailString);
		

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
		             Ciruclo.setFill(new ImagePattern(image));
		             label_usuario.setText(nombreString);

		             // Resto del código...
		         } catch (IOException e) {
		             e.printStackTrace();
		         }
		            
		            
		           
		            

		            //CARGAR TABLA
		            tablaHorario1 = usuarioJson.getJSONObject("tabla").getString("horario1");
		            tablaHorario2 = usuarioJson.getJSONObject("tabla").getString("horario2");
		            tablaHorario3 = usuarioJson.getJSONObject("tabla").getString("horario3");
		            tablaHorario4 = usuarioJson.getJSONObject("tabla").getString("horario4");
		            tablaHorario5 = usuarioJson.getJSONObject("tabla").getString("horario5");
		            tablaHorario6 = usuarioJson.getJSONObject("tabla").getString("horario6");	           
		            tablaHorario7 = usuarioJson.getJSONObject("tabla").getString("horario7");
		            tablaHorario8 = usuarioJson.getJSONObject("tabla").getString("horario8");
		            
		            tablaLunes1 = usuarioJson.getJSONObject("tabla").getString("lunes1");
		            tablaLunes2 = usuarioJson.getJSONObject("tabla").getString("lunes2");
		            tablaLunes3 = usuarioJson.getJSONObject("tabla").getString("lunes3");
		            tablaLunes4 = usuarioJson.getJSONObject("tabla").getString("lunes4");
		            tablaLunes5 = usuarioJson.getJSONObject("tabla").getString("lunes5");
		            tablaLunes6 = usuarioJson.getJSONObject("tabla").getString("lunes6");	           
		            tablaLunes7 = usuarioJson.getJSONObject("tabla").getString("lunes7");
		            tablaLunes8 = usuarioJson.getJSONObject("tabla").getString("lunes8");
		            
		            tablaMartes1 = usuarioJson.getJSONObject("tabla").getString("martes1");
		            tablaMartes2 = usuarioJson.getJSONObject("tabla").getString("martes2");
		            tablaMartes3 = usuarioJson.getJSONObject("tabla").getString("martes3");
		            tablaMartes4 = usuarioJson.getJSONObject("tabla").getString("martes4");
		            tablaMartes5 = usuarioJson.getJSONObject("tabla").getString("martes5");
		            tablaMartes6 = usuarioJson.getJSONObject("tabla").getString("martes6");	           
		            tablaMartes7 = usuarioJson.getJSONObject("tabla").getString("martes7");
		            tablaMartes8 = usuarioJson.getJSONObject("tabla").getString("martes8");
		            
		            tablaMiercoles1 = usuarioJson.getJSONObject("tabla").getString("miercoles1");
		            tablaMiercoles2 = usuarioJson.getJSONObject("tabla").getString("miercoles2");
		            tablaMiercoles3 = usuarioJson.getJSONObject("tabla").getString("miercoles3");
		            tablaMiercoles4 = usuarioJson.getJSONObject("tabla").getString("miercoles4");
		            tablaMiercoles5 = usuarioJson.getJSONObject("tabla").getString("miercoles5");
		            tablaMiercoles6 = usuarioJson.getJSONObject("tabla").getString("miercoles6");	           
		            tablaMiercoles7 = usuarioJson.getJSONObject("tabla").getString("miercoles7");
		            tablaMiercoles8 = usuarioJson.getJSONObject("tabla").getString("miercoles8");
		            
		            tablaJueves1 = usuarioJson.getJSONObject("tabla").getString("jueves1");
		            tablaJueves2 = usuarioJson.getJSONObject("tabla").getString("jueves2");
		            tablaJueves3 = usuarioJson.getJSONObject("tabla").getString("jueves3");
		            tablaJueves4 = usuarioJson.getJSONObject("tabla").getString("jueves4");
		            tablaJueves5 = usuarioJson.getJSONObject("tabla").getString("jueves5");
		            tablaJueves6 = usuarioJson.getJSONObject("tabla").getString("jueves6");	           
		            tablaJueves7 = usuarioJson.getJSONObject("tabla").getString("jueves7");
		            tablaJueves8 = usuarioJson.getJSONObject("tabla").getString("jueves8");
		            
		            tablaViernes1 = usuarioJson.getJSONObject("tabla").getString("viernes1");
		            tablaViernes2 = usuarioJson.getJSONObject("tabla").getString("viernes2");
		            tablaViernes3 = usuarioJson.getJSONObject("tabla").getString("viernes3");
		            tablaViernes4 = usuarioJson.getJSONObject("tabla").getString("viernes4");
		            tablaViernes5 = usuarioJson.getJSONObject("tabla").getString("viernes5");
		            tablaViernes6 = usuarioJson.getJSONObject("tabla").getString("viernes6");	           
		            tablaViernes7 = usuarioJson.getJSONObject("tabla").getString("viernes7");
		            tablaViernes8 = usuarioJson.getJSONObject("tabla").getString("viernes8");
		            
		            tablaSabado1 = usuarioJson.getJSONObject("tabla").getString("sabado1");
		            tablaSabado2 = usuarioJson.getJSONObject("tabla").getString("sabado2");
		            tablaSabado3 = usuarioJson.getJSONObject("tabla").getString("sabado3");
		            tablaSabado4 = usuarioJson.getJSONObject("tabla").getString("sabado4");
		            tablaSabado5 = usuarioJson.getJSONObject("tabla").getString("sabado5");
		            tablaSabado6 = usuarioJson.getJSONObject("tabla").getString("sabado6");	           
		            tablaSabado7 = usuarioJson.getJSONObject("tabla").getString("sabado7");
		            tablaSabado8 = usuarioJson.getJSONObject("tabla").getString("sabado8");
		            
		            tablaDomingo1 = usuarioJson.getJSONObject("tabla").getString("domingo1");
		            tablaDomingo2 = usuarioJson.getJSONObject("tabla").getString("domingo2");
		            tablaDomingo3 = usuarioJson.getJSONObject("tabla").getString("domingo3");
		            tablaDomingo4 = usuarioJson.getJSONObject("tabla").getString("domingo4");
		            tablaDomingo5 = usuarioJson.getJSONObject("tabla").getString("domingo5");
		            tablaDomingo6 = usuarioJson.getJSONObject("tabla").getString("domingo6");	           
		            tablaDomingo7 = usuarioJson.getJSONObject("tabla").getString("domingo7");
		            tablaDomingo8 = usuarioJson.getJSONObject("tabla").getString("domingo8");
		            
		            //CARGAR Dieta	            
		            dietaHorario1 = usuarioJson.getJSONObject("dieta").getString("horario1");
		            dietaHorario2 = usuarioJson.getJSONObject("dieta").getString("horario2");
		            dietaHorario3 = usuarioJson.getJSONObject("dieta").getString("horario3");
		            dietaHorario4 = usuarioJson.getJSONObject("dieta").getString("horario4");
		            dietaHorario5 = usuarioJson.getJSONObject("dieta").getString("horario5");
		            dietaHorario6 = usuarioJson.getJSONObject("dieta").getString("horario6");	           
		            dietaHorario7 = usuarioJson.getJSONObject("dieta").getString("horario7");
		            dietaHorario8 = usuarioJson.getJSONObject("dieta").getString("horario8");
		            
		            dietaLunes1 = usuarioJson.getJSONObject("dieta").getString("lunes1");
		            dietaLunes2 = usuarioJson.getJSONObject("dieta").getString("lunes2");
		            dietaLunes3 = usuarioJson.getJSONObject("dieta").getString("lunes3");
		            dietaLunes4 = usuarioJson.getJSONObject("dieta").getString("lunes4");
		            dietaLunes5 = usuarioJson.getJSONObject("dieta").getString("lunes5");
		            dietaLunes6 = usuarioJson.getJSONObject("dieta").getString("lunes6");	           
		            dietaLunes7 = usuarioJson.getJSONObject("dieta").getString("lunes7");
		            dietaLunes8 = usuarioJson.getJSONObject("dieta").getString("lunes8");
		            
		            dietaMartes1 = usuarioJson.getJSONObject("dieta").getString("martes1");
		            dietaMartes2 = usuarioJson.getJSONObject("dieta").getString("martes2");
		            dietaMartes3 = usuarioJson.getJSONObject("dieta").getString("martes3");
		            dietaMartes4 = usuarioJson.getJSONObject("dieta").getString("martes4");
		            dietaMartes5 = usuarioJson.getJSONObject("dieta").getString("martes5");
		            dietaMartes6 = usuarioJson.getJSONObject("dieta").getString("martes6");	           
		            dietaMartes7 = usuarioJson.getJSONObject("dieta").getString("martes7");
		            dietaMartes8 = usuarioJson.getJSONObject("dieta").getString("martes8");
		            
		            dietaMiercoles1 = usuarioJson.getJSONObject("dieta").getString("miercoles1");
		            dietaMiercoles2 = usuarioJson.getJSONObject("dieta").getString("miercoles2");
		            dietaMiercoles3 = usuarioJson.getJSONObject("dieta").getString("miercoles3");
		            dietaMiercoles4 = usuarioJson.getJSONObject("dieta").getString("miercoles4");
		            dietaMiercoles5 = usuarioJson.getJSONObject("dieta").getString("miercoles5");
		            dietaMiercoles6 = usuarioJson.getJSONObject("dieta").getString("miercoles6");	           
		            dietaMiercoles7 = usuarioJson.getJSONObject("dieta").getString("miercoles7");
		            dietaMiercoles8 = usuarioJson.getJSONObject("dieta").getString("miercoles8");
		            
		            dietaJueves1 = usuarioJson.getJSONObject("dieta").getString("jueves1");
		            dietaJueves2 = usuarioJson.getJSONObject("dieta").getString("jueves2");
		            dietaJueves3 = usuarioJson.getJSONObject("dieta").getString("jueves3");
		            dietaJueves4 = usuarioJson.getJSONObject("dieta").getString("jueves4");
		            dietaJueves5 = usuarioJson.getJSONObject("dieta").getString("jueves5");
		            dietaJueves6 = usuarioJson.getJSONObject("dieta").getString("jueves6");	           
		            dietaJueves7 = usuarioJson.getJSONObject("dieta").getString("jueves7");
		            dietaJueves8 = usuarioJson.getJSONObject("dieta").getString("jueves8");
		            
		            dietaViernes1 = usuarioJson.getJSONObject("dieta").getString("viernes1");
		            dietaViernes2 = usuarioJson.getJSONObject("dieta").getString("viernes2");
		            dietaViernes3 = usuarioJson.getJSONObject("dieta").getString("viernes3");
		            dietaViernes4 = usuarioJson.getJSONObject("dieta").getString("viernes4");
		            dietaViernes5 = usuarioJson.getJSONObject("dieta").getString("viernes5");
		            dietaViernes6 = usuarioJson.getJSONObject("dieta").getString("viernes6");	           
		            dietaViernes7 = usuarioJson.getJSONObject("dieta").getString("viernes7");
		            dietaViernes8 = usuarioJson.getJSONObject("dieta").getString("viernes8");
		            
		            dietaSabado1 = usuarioJson.getJSONObject("dieta").getString("sabado1");
		            dietaSabado2 = usuarioJson.getJSONObject("dieta").getString("sabado2");
		            dietaSabado3 = usuarioJson.getJSONObject("dieta").getString("sabado3");
		            dietaSabado4 = usuarioJson.getJSONObject("dieta").getString("sabado4");
		            dietaSabado5 = usuarioJson.getJSONObject("dieta").getString("sabado5");
		            dietaSabado6 = usuarioJson.getJSONObject("dieta").getString("sabado6");	           
		            dietaSabado7 = usuarioJson.getJSONObject("dieta").getString("sabado7");
		            dietaSabado8 = usuarioJson.getJSONObject("dieta").getString("sabado8");
		            
		            dietaDomingo1 = usuarioJson.getJSONObject("dieta").getString("domingo1");
		            dietaDomingo2 = usuarioJson.getJSONObject("dieta").getString("domingo2");
		            dietaDomingo3 = usuarioJson.getJSONObject("dieta").getString("domingo3");
		            dietaDomingo4 = usuarioJson.getJSONObject("dieta").getString("domingo4");
		            dietaDomingo5 = usuarioJson.getJSONObject("dieta").getString("domingo5");
		            dietaDomingo6 = usuarioJson.getJSONObject("dieta").getString("domingo6");	           
		            dietaDomingo7 = usuarioJson.getJSONObject("dieta").getString("domingo7");
		            dietaDomingo8 = usuarioJson.getJSONObject("dieta").getString("domingo8");
		            
		                    
		           
		            System.out.println( tablaHorario1 +" -- "+tablaHorario2+" -- "+ tablaHorario5+" -- "+  tablaHorario8 +" -- "+   emailString +" -- "+ tablaHorario1 +" -- "+ dietaHorario1 );
		            
		            //-----------------------
		         
		            
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
	    
	   Bloom sombreaDropShadow;

	    @FXML
	    void EventoClickEnteredAjustes(MouseEvent event) {
	   	 sombreaDropShadow =new Bloom();
    	 btn_Ajustes.setEffect(sombreaDropShadow);
	    }

	    @FXML
	    void EventoClickEnteredDieta(MouseEvent event) {
	    	sombreaDropShadow =new Bloom();
	    	
	    	
	    	 btn_dieta.setEffect(sombreaDropShadow);
	    }

	    @FXML
	    void EventoClickEnteredEjercicios(MouseEvent event) {
	    	sombreaDropShadow =new Bloom();
	    	btn_ejercicios.setEffect(sombreaDropShadow);
	    }

	    @FXML
	    void EventoClickEnteredSalir(MouseEvent event) {
	    	sombreaDropShadow =new Bloom();
	    	btn_salir.setEffect(sombreaDropShadow);
	    }

	    @FXML
	    void EventoClickEnteredTabla(MouseEvent event) {
	    	sombreaDropShadow =new Bloom();
	    	btn_tabla.setEffect(sombreaDropShadow);
	    }

	    @FXML
	    void EventoClickEnteredUsuario(MouseEvent event) {
	    	sombreaDropShadow =new Bloom();
	    	btn_usuario.setEffect(sombreaDropShadow);
	    }

	    
	    @FXML
	    void EventoClickExitedUsuario(MouseEvent event) {
	    	btn_usuario.setEffect(null);

	    }
	    
	    @FXML
	    void EventoClickExitedAjusted(MouseEvent event) {
	    	btn_Ajustes.setEffect(null);

	    }

	    @FXML
	    void EventoClickExitedDieta(MouseEvent event) {
	    	btn_dieta.setEffect(null);

	    }

	    @FXML
	    void EventoClickExitedEjercicios(MouseEvent event) {
	    	btn_ejercicios.setEffect(null);

	    }

	    @FXML
	    void EventoClickExitedSalir(MouseEvent event) {
	    	btn_salir.setEffect(null);

	    }

	    @FXML
	    void EventoClickExitedTabla(MouseEvent event) {
	    	btn_tabla.setEffect(null);

	    }
}
