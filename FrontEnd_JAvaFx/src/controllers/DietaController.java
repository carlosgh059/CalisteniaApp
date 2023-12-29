package controllers;

import java.awt.PageAttributes.MediaType;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;

public class DietaController implements Initializable{

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
	

    @FXML
    private ComboBox<String> ComboTablaPersona;

	   @FXML
	    private Label Domingo1;

	    @FXML
	    private Label Domingo2;

	    @FXML
	    private Label Domingo3;

	    @FXML
	    private Label Domingo4;

	    @FXML
	    private Label Domingo5;

	    @FXML
	    private Label Domingo6;

	    @FXML
	    private Label Domingo7;

	    @FXML
	    private Label Domingo8;

	    @FXML
	    private Label Horario1;

	    @FXML
	    private Label Horario2;

	    @FXML
	    private Label Horario3;

	    @FXML
	    private Label Horario4;

	    @FXML
	    private Label Horario5;

	    @FXML
	    private Label Horario6;

	    @FXML
	    private Label Horario7;

	    @FXML
	    private Label Horario8;

	    @FXML
	    private Label Jueves1;

	    @FXML
	    private Label Jueves2;

	    @FXML
	    private Label Jueves3;

	    @FXML
	    private Label Jueves4;

	    @FXML
	    private Label Jueves5;

	    @FXML
	    private Label Jueves6;

	    @FXML
	    private Label Jueves7;

	    @FXML
	    private Label Jueves8;

	    @FXML
	    private Label Lunes1;

	    @FXML
	    private Label Lunes2;

	    @FXML
	    private Label Lunes3;

	    @FXML
	    private Label Lunes4;

	    @FXML
	    private Label Lunes5;

	    @FXML
	    private Label Lunes6;

	    @FXML
	    private Label Lunes7;

	    @FXML
	    private Label Lunes8;

	    @FXML
	    private Label Martes1;

	    @FXML
	    private Label Martes2;

	    @FXML
	    private Label Martes3;

	    @FXML
	    private Label Martes4;

	    @FXML
	    private Label Martes5;

	    @FXML
	    private Label Martes6;

	    @FXML
	    private Label Martes7;

	    @FXML
	    private Label Martes8;

	    @FXML
	    private Label Miercoles1;

	    @FXML
	    private Label Miercoles2;

	    @FXML
	    private Label Miercoles3;

	    @FXML
	    private Label Miercoles4;

	    @FXML
	    private Label Miercoles5;

	    @FXML
	    private Label Miercoles6;

	    @FXML
	    private Label Miercoles7;

	    @FXML
	    private Label Miercoles8;

	    @FXML
	    private Label Sabado1;

	    @FXML
	    private Label Sabado2;

	    @FXML
	    private Label Sabado3;

	    @FXML
	    private Label Sabado4;

	    @FXML
	    private Label Sabado5;

	    @FXML
	    private Label Sabado6;

	    @FXML
	    private Label Sabado7;

	    @FXML
	    private Label Sabado8;

	    @FXML
	    private Label Viernes1;

	    @FXML
	    private Label Viernes2;

	    @FXML
	    private Label Viernes3;

	    @FXML
	    private Label Viernes4;

	    @FXML
	    private Label Viernes5;

	    @FXML
	    private Label Viernes6;

	    @FXML
	    private Label Viernes7;

	    @FXML
	    private Label Viernes8;

    @FXML
    private AnchorPane PaneAñadirSWitch;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button botonActualizar;

    
    @FXML
    void EventoclickActualizar(MouseEvent event) {
    	if(!monitorBoolean) {
        	actualizarDieta();

    	}else {
    		actualizarDietaMonitor();
    	}
    	
    }
    








	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		   AnchorPane.setTopAnchor(anchorPane, 0.0);
		   AnchorPane.setBottomAnchor(anchorPane, 0.0);
		   AnchorPane.setLeftAnchor(anchorPane, 0.0);
		   AnchorPane.setRightAnchor(anchorPane, 0.0);
		
	}
	
	
    String selectedEmail;
	private void elegirPersonaCombo() {
	    ComboTablaPersona.setOnAction(event -> {
        selectedEmail = ComboTablaPersona.getSelectionModel().getSelectedItem();
        
           if (selectedEmail != null) {
                System.out.println(selectedEmail);
              
                dameDietaUsuario();   
            }
        });
	    
	
	}


	
	public void setDieta(
			String dietaHorarios1, String dietaHorarios2,String dietaHorarios3, String dietaHorarios4,String dietaHorarios5, String dietaHorarios6,String dietaHorarios7, String dietaHorarios8,
			String luness1, String luness2,String luness3, String luness4,String luness5, String luness6,String luness7, String luness8,
			String martess1, String martess2,String martess3, String martess4,String martess5, String martess6,String martess7, String martess8,
			String miercoless1, String miercoless2,String miercoless3, String miercoless4,String miercoless5, String miercoless6,String miercoless7, String miercoless8,
			String juevess1, String juevess2,String juevess3, String juevess4,String juevess5, String juevess6,String juevess7, String juevess8,
			String vierness1, String vierness2,String vierness3, String vierness4,String vierness5, String vierness6,String vierness7, String vierness8,
			String sabados1, String sabados2,String sabados3, String sabados4,String sabados5, String sabados6,String sabados7, String sabados8,
			String domingos1, String domingos2,String domingos3, String domingos4,String domingos5, String domingos6,String domingos7, String domingos8
			) {
		// TODO Auto-generated method stub
		dietaHorario1 = dietaHorarios1;
		dietaHorario2 = dietaHorarios2;
		dietaHorario3 = dietaHorarios3;
		dietaHorario4 = dietaHorarios4;
		dietaHorario5 = dietaHorarios5;
		dietaHorario6 = dietaHorarios6;
		dietaHorario7 = dietaHorarios7;
		dietaHorario8 = dietaHorarios8;

		
		dietaLunes1 = luness1;
		dietaLunes2 = luness2;
		dietaLunes3 = luness3;
		dietaLunes4 = luness4;
		dietaLunes5 = luness5;
		dietaLunes6 = luness6;
		dietaLunes7 = luness7;
		dietaLunes8 = luness8;
		
		dietaMartes1 = martess1;
		dietaMartes2 = martess2;
		dietaMartes3 = martess3;
		dietaMartes4 = martess4;
		dietaMartes5 = martess5;
		dietaMartes6 = martess6;
		dietaMartes7 = martess7;
		dietaMartes8 = martess8;
		
		dietaMiercoles1 = miercoless1;
		dietaMiercoles2 = miercoless2;
		dietaMiercoles3 = miercoless3;
		dietaMiercoles4 = miercoless4;
		dietaMiercoles5 = miercoless5;
		dietaMiercoles6 = miercoless6;
		dietaMiercoles7 = miercoless7;
		dietaMiercoles8 = miercoless8;
		
		dietaJueves1 = juevess1;
		dietaJueves2 = juevess2;
		dietaJueves3 = juevess3;
		dietaJueves4 = juevess4;
		dietaJueves5 = juevess5;
		dietaJueves6 = juevess6;
		dietaJueves7 = juevess7;
		dietaJueves8 = juevess8;
		
		dietaViernes1 = vierness1;
		dietaViernes2 = vierness2;
		dietaViernes3 = vierness3;
		dietaViernes4 = vierness4;
		dietaViernes5 = vierness5;
		dietaViernes6 = vierness6;
		dietaViernes7 = vierness7;
		dietaViernes8 = vierness8;
		
		dietaSabado1 = sabados1;
		dietaSabado2 = sabados2;
		dietaSabado3 = sabados3;
		dietaSabado4 = sabados4;
		dietaSabado5 = sabados5;
		dietaSabado6 = sabados6;
		dietaSabado7 = sabados7;
		dietaSabado8 = sabados8;
		
		dietaDomingo1 = domingos1;
		dietaDomingo2 = domingos2;
		dietaDomingo3 = domingos3;
		dietaDomingo4 = domingos4;
		dietaDomingo5 = domingos5;
		dietaDomingo6 = domingos6;
		dietaDomingo7 = domingos7;
		dietaDomingo8 = domingos8;
				
		
		Horario1.setText(dietaHorario1);
		Horario2.setText(dietaHorario2);
		Horario3.setText(dietaHorario3);
		Horario4.setText(dietaHorario4);
		Horario5.setText(dietaHorario5);
		Horario6.setText(dietaHorario6);
		Horario7.setText(dietaHorario7);
		Horario8.setText(dietaHorario8);
		
		Lunes1.setText(dietaLunes1);
		Lunes2.setText(dietaLunes2);
		Lunes3.setText(dietaLunes3);
		Lunes4.setText(dietaLunes4);
		Lunes5.setText(dietaLunes5);
		Lunes6.setText(dietaLunes6);
		Lunes7.setText(dietaLunes7);
		Lunes8.setText(dietaLunes8);

		Martes1.setText(dietaMartes1);
		Martes2.setText(dietaMartes2);
		Martes3.setText(dietaMartes3);
		Martes4.setText(dietaMartes4);
		Martes5.setText(dietaMartes5);
		Martes6.setText(dietaMartes6);
		Martes7.setText(dietaMartes7);
		Martes8.setText(dietaMartes8);


		Miercoles1.setText(dietaMiercoles1);
		Miercoles2.setText(dietaMiercoles2);
		Miercoles3.setText(dietaMiercoles3);
		Miercoles4.setText(dietaMiercoles4);
		Miercoles5.setText(dietaMiercoles5);
		Miercoles6.setText(dietaMiercoles6);
		Miercoles7.setText(dietaMiercoles7);
		Miercoles8.setText(dietaMiercoles8);


		Jueves1.setText(dietaJueves1);
		Jueves2.setText(dietaJueves2);
		Jueves3.setText(dietaJueves3);
		Jueves4.setText(dietaJueves4);
		Jueves5.setText(dietaJueves5);
		Jueves6.setText(dietaJueves6);
		Jueves7.setText(dietaJueves7);
		Jueves8.setText(dietaJueves8);


		Viernes1.setText(dietaViernes1);
		Viernes2.setText(dietaViernes2);
		Viernes3.setText(dietaViernes3);
		Viernes4.setText(dietaViernes4);
		Viernes5.setText(dietaViernes5);
		Viernes6.setText(dietaViernes6);
		Viernes7.setText(dietaViernes7);
		Viernes8.setText(dietaViernes8);


		Sabado1.setText(dietaSabado1);
		Sabado2.setText(dietaSabado2);
		Sabado3.setText(dietaSabado3);
		Sabado4.setText(dietaSabado4);
		Sabado5.setText(dietaSabado5);
		Sabado6.setText(dietaSabado6);
		Sabado7.setText(dietaSabado7);
		Sabado8.setText(dietaSabado8);


		Domingo1.setText(dietaDomingo1);
		Domingo2.setText(dietaDomingo2);
		Domingo3.setText(dietaDomingo3);
		Domingo4.setText(dietaDomingo4);
		Domingo5.setText(dietaDomingo5);
		Domingo6.setText(dietaDomingo6);
		Domingo7.setText(dietaDomingo7);
		Domingo8.setText(dietaDomingo8);
		
	}

	public void setUsuario() {

		ComboTablaPersona.setDisable(true);
		ComboTablaPersona.setVisible(false);
		monitorBoolean=false;
	}
	

	Boolean monitorBoolean= false;
	public void setMonitor() {
		ComboTablaPersona.setDisable(false);
		ComboTablaPersona.setVisible(true);	
		cargarNombresUsuario();
		monitorBoolean=true;
		
		 cargarNombresUsuario();
		   System.out.println("-------LISTA--------");
		   for (String string : listaEmailUsuario) {
			System.out.println(string);
		   }
		   
		   elegirPersonaCombo();
		   ComboTablaPersona.setValue("yo");
	}
	
	
	  private List<String> listaEmailUsuario;

	    public void cargarNombresUsuario() {
	        try {
	            // Construir la URL de los datos del monitor
	            URL url = new URL("https://localhost:7264/api/Usuario/DAmeEmailUsuariosXMonitor");

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

	                // Parsear la respuesta JSON y obtener los emails
	                JSONArray jsonArray = new JSONArray(response.toString());
	                listaEmailUsuario = new ArrayList<>();
	                listaEmailUsuario.clear();
	                ComboTablaPersona.getItems().clear();
	                
	                for (int i = 0; i < jsonArray.length(); i++) {
	                    String email = jsonArray.getString(i);
	                    listaEmailUsuario.add(email);
	                }
	                listaEmailUsuario.add("yo");
	                ComboTablaPersona.getItems().addAll(listaEmailUsuario);

	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	  
	    private void actualizarDieta() {
	    	
	    	
	    	String tablaHorarios1; String tablaHorarios2; String tablaHorarios3; String tablaHorarios4; String tablaHorarios5; String tablaHorarios6; String tablaHorarios7; String tablaHorarios8;
	    	String luness1; String luness2;String luness3; String luness4;String luness5; String luness6;String luness7; String luness8;
	    	String martess1; String martess2;String martess3; String martess4;String martess5; String martess6;String martess7; String martess8;
	    	String miercoless1; String miercoless2;String miercoless3; String miercoless4;String miercoless5; String miercoless6;String miercoless7; String miercoless8;
	    	String juevess1; String juevess2;String juevess3; String juevess4;String juevess5; String juevess6;String juevess7; String juevess8;
	    	String vierness1; String vierness2;String vierness3; String vierness4;String vierness5; String vierness6;String vierness7; String vierness8;
	    	String sabados1; String sabados2;String sabados3; String sabados4;String sabados5; String sabados6; String sabados7; String sabados8;
	    	String domingos1; String domingos2;String domingos3; String domingos4;String domingos5; String domingos6; String domingos7; String domingos8;
		
	    	tablaHorarios1 =	Horario1.getText();
	    	tablaHorarios2 =	Horario2.getText();
	    	tablaHorarios3 =	Horario3.getText();
	    	tablaHorarios4 =	Horario4.getText();
	    	tablaHorarios5 =	Horario5.getText();
	    	tablaHorarios6 =	Horario6.getText();
	    	tablaHorarios7 =	Horario7.getText();
	    	tablaHorarios8 =	Horario8.getText();
	    	
	    
	    	
	      luness1 =	Lunes1.getText();
	      luness2 =	Lunes2.getText();
	      luness3 =	Lunes3.getText();
	      luness4 =	Lunes4.getText();
	      luness5 =	Lunes5.getText();
	      luness6 =	Lunes6.getText();
	      luness7 =	Lunes7.getText();
	      luness8 =	Lunes8.getText();
	      
	  	
	      martess1 =	Martes1.getText();
	      martess2 =	Martes2.getText();
	      martess3 =	Martes3.getText();
	      martess4 =	Martes4.getText();
	      martess5 =	Martes5.getText();
	      martess6 =	Martes6.getText();
	      martess7 =    Martes7.getText();
	      martess8 =	Martes8.getText();

	      miercoless1 =	Miercoles1.getText();
	      miercoless2 =		Miercoles2.getText();
	      miercoless3 =		Miercoles3.getText();
	      miercoless4 =		Miercoles4.getText();
	      miercoless5 =		Miercoles5.getText();
	      miercoless6 =		Miercoles6.getText();
	      miercoless7 =		Miercoles7.getText();
	      miercoless8 =		Miercoles8.getText();

	      juevess1 =		Jueves1.getText();
	      juevess2 =		Jueves2.getText();
	      juevess3 =		Jueves3.getText();
	      juevess4 =		Jueves4.getText();
	      juevess5 =		Jueves5.getText();
	      juevess6 =		Jueves6.getText();
	      juevess7 =		Jueves7.getText();
	      juevess8 =		Jueves8.getText();

	      vierness1 =		Viernes1.getText();
	      vierness2 =		Viernes2.getText();
	      vierness3 =		Viernes3.getText();
		  vierness4 =		Viernes4.getText();
		  vierness5 =		Viernes5.getText();
		  vierness6 =		Viernes6.getText();
		  vierness7 =		Viernes7.getText();
		  vierness8 =		Viernes8.getText();

		  sabados1 =		Sabado1.getText();
		  sabados2 =	Sabado2.getText();
		  sabados3 =	Sabado3.getText();
		  sabados4 =	Sabado4.getText();
		  sabados5 =	Sabado5.getText();
		  sabados6 =	Sabado6.getText();
		  sabados7 =	Sabado7.getText();
		  sabados8 =	Sabado8.getText();

			domingos1 = Domingo1.getText();
			domingos2 =	Domingo2.getText();
			domingos3 =	Domingo3.getText();
			domingos4 =	Domingo4.getText();
			domingos5 =	Domingo5.getText();
			domingos6 =	Domingo6.getText();
			domingos7 =	Domingo7.getText();
			domingos8 =	Domingo8.getText();
	    	
	    	
	    	 try {
	    		 	// Construir la URL de la solicitud PUT
	    	        URL url = new URL("https://localhost:7264/api/Usuario/ActualizarDieta");

	    	        // Crear el objeto JSON con los datos a enviar
	    	        String jsonInput = "{\n" +
	    	                "  \"idUsuario\": 0,\n" +
	        	            "  \"tienemonitor\": false,\n" +
	    	                "  \"nombre\": \"string\",\n" +
	    	                "  \"apellidos\": \"string\",\n" +
	    	                "  \"peso\": \"string\",\n" +
	    	                "  \"edad\": \"string\",\n" +
	    	                "  \"foto\": \"string\",\n" +
	    	                "  \"email\":  \"string\",\n" +
	    	                "  \"password\": \"string\",\n" +
	    	                "  \"tabla\": {\n" +
	    	    	        "    \"idTabla\": 0,\n" +
	    	    	        "    \"horario1\": \"string\",\n" +
	    	    	        "    \"horario2\": \"string\",\n" +
	    	    	        "    \"horario3\": \"string\",\n" +
	    	    	        "    \"horario4\": \"string\",\n" +
	    	    	        "    \"horario5\": \"string\",\n" +
	    	    	        "    \"horario6\": \"string\",\n" +
	    	    	        "    \"horario7\": \"string\",\n" +
	    	    	        "    \"horario8\": \"string\",\n" +
	    	    	        "    \"lunes1\": \"string\",\n" +
	    	    	        "    \"lunes2\": \"string\",\n" +
	    	    	        "    \"lunes3\": \"string\",\n" +
	    	    	        "    \"lunes4\": \"string\",\n" +
	    	    	        "    \"lunes5\": \"string\",\n" +
	    	    	        "    \"lunes6\": \"string\",\n" +
	    	    	        "    \"lunes7\": \"string\",\n" +
	    	    	        "    \"lunes8\": \"string\",\n" +
	    	    	        "    \"martes1\": \"string\",\n" +
	    	    	        "    \"martes2\": \"string\",\n" +
	    	    	        "    \"martes3\": \"string\",\n" +
	    	    	        "    \"martes4\": \"string\",\n" +
	    	    	        "    \"martes5\": \"string\",\n" +
	    	    	        "    \"martes6\": \"string\",\n" +
	    	    	        "    \"martes7\": \"string\",\n" +
	    	    	        "    \"martes8\": \"string\",\n" +
	    	    	        "    \"miercoles1\": \"string\",\n" +
	    	    	        "    \"miercoles2\": \"string\",\n" +
	    	    	        "    \"miercoles3\": \"string\",\n" +
	    	    	        "    \"miercoles4\": \"string\",\n" +
	    	    	        "    \"miercoles5\": \"string\",\n" +
	    	    	        "    \"miercoles6\": \"string\",\n" +
	    	    	        "    \"miercoles7\": \"string\",\n" +
	    	    	        "    \"miercoles8\": \"string\",\n" +
	    	    	        "    \"jueves1\": \"string\",\n" +
	    	    	        "    \"jueves2\": \"string\",\n" +
	    	    	        "    \"jueves3\": \"string\",\n" +
	    	    	        "    \"jueves4\": \"string\",\n" +
	    	    	        "    \"jueves5\": \"string\",\n" +
	    	    	        "    \"jueves6\": \"string\",\n" +
	    	    	        "    \"jueves7\": \"string\",\n" +
	    	    	        "    \"jueves8\": \"string\",\n" +
	    	    	        "    \"viernes1\": \"string\",\n" +
	    	    	        "    \"viernes2\": \"string\",\n" +
	    	    	        "    \"viernes3\": \"string\",\n" +
	    	    	        "    \"viernes4\": \"string\",\n" +
	    	    	        "    \"viernes5\": \"string\",\n" +
	    	    	        "    \"viernes6\": \"string\",\n" +
	    	    	        "    \"viernes7\": \"string\",\n" +
	    	    	        "    \"viernes8\": \"string\",\n" +    	
	    	    	        "    \"sabado1\": \"string\",\n" +
	    	    	        "    \"sabado2\": \"string\",\n" +
	    	    	        "    \"sabado3\": \"string\",\n" +
	    	    	        "    \"sabado4\": \"string\",\n" +
	    	    	        "    \"sabado5\": \"string\",\n" +
	    	    	        "    \"sabado6\": \"string\",\n" +
	    	    	        "    \"sabado7\": \"string\",\n" +
	    	    	        "    \"sabado8\": \"string\",\n" +   
	    	    	        "    \"domingo1\": \"string\",\n" +
	    	    	        "    \"domingo2\": \"string\",\n" +
	    	    	        "    \"domingo3\": \"string\",\n" +
	    	    	        "    \"domingo4\": \"string\",\n" +
	    	    	        "    \"domingo5\": \"string\",\n" +
	    	    	        "    \"domingo6\": \"string\",\n" +
	    	    	        "    \"domingo7\": \"string\",\n" +
	    	    	        "    \"domingo8\": \"string\"\n" +
	    		            "  },\n" +
	    		            "  \"dieta\": {\n" +
	    		            "    \"idDieta\": 0,\n" +
	    		            "    \"horario1\": \"" + tablaHorarios1 + "\",\n" +
	    	                "    \"horario2\": \"" + tablaHorarios2 + "\",\n" +
	    	                "    \"horario3\": \"" + tablaHorarios3 + "\",\n" +
	    	                "    \"horario4\": \"" + tablaHorarios4 + "\",\n" +
	    	                "    \"horario5\": \"" + tablaHorarios5 + "\",\n" +
	    	                "    \"horario6\": \"" + tablaHorarios6 + "\",\n" +
	    	                "    \"horario7\": \"" + tablaHorarios7 + "\",\n" +
	    	                "    \"horario8\": \"" + tablaHorarios8 + "\",\n" +
	    	                "    \"lunes1\": \"" + luness1 + "\",\n" +
	    	                "    \"lunes2\": \"" + luness2 + "\",\n" +
	    	                "    \"lunes3\": \"" + luness3 + "\",\n" +
	    	                "    \"lunes4\": \"" + luness4 + "\",\n" +
	    	                "    \"lunes5\": \"" + luness5 + "\",\n" +
	    	                "    \"lunes6\": \"" + luness6 + "\",\n" +
	    	                "    \"lunes7\": \"" + luness7 + "\",\n" +
	    	                "    \"lunes8\": \"" + luness8 + "\",\n" +
	    	                "    \"martes1\": \"" + martess1 + "\",\n" +
	    	                "    \"martes2\": \"" + martess2 + "\",\n" +
	    	                "    \"martes3\": \"" + martess3 + "\",\n" +
	    	                "    \"martes4\": \"" + martess4 + "\",\n" +
	    	                "    \"martes5\": \"" + martess5 + "\",\n" +
	    	                "    \"martes6\": \"" + martess6 + "\",\n" +
	    	                "    \"martes7\": \"" + martess7 + "\",\n" +
	    	                "    \"martes8\": \"" + martess8 + "\",\n" +
	    	                "    \"miercoles1\": \"" + miercoless1 + "\",\n" +
	    	                "    \"miercoles2\": \"" + miercoless2 + "\",\n" +
	    	                "    \"miercoles3\": \"" + miercoless3 + "\",\n" +
	    	                "    \"miercoles4\": \"" + miercoless4 + "\",\n" +
	    	                "    \"miercoles5\": \"" + miercoless5 + "\",\n" +
	    	                "    \"miercoles6\": \"" + miercoless6 + "\",\n" +
	    	                "    \"miercoles7\": \"" + miercoless7 + "\",\n" +
	    	                "    \"miercoles8\": \"" + miercoless8 + "\",\n" +
	    	                "    \"jueves1\": \"" + juevess1 + "\",\n" +
	    	                "    \"jueves2\": \"" + juevess2 + "\",\n" +
	    	                "    \"jueves3\": \"" + juevess3 + "\",\n" +
	    	                "    \"jueves4\": \"" + juevess4 + "\",\n" +
	    	                "    \"jueves5\": \"" + juevess5 + "\",\n" +
	    	                "    \"jueves6\": \"" + juevess6 + "\",\n" +
	    	                "    \"jueves7\": \"" + juevess7 + "\",\n" +
	    	                "    \"jueves8\": \"" + juevess8 + "\",\n" +
	    	                "    \"viernes1\": \"" + vierness1 + "\",\n" +
	    	                "    \"viernes2\": \"" + vierness2 + "\",\n" +
	    	                "    \"viernes3\": \"" + vierness3 + "\",\n" +
	    	                "    \"viernes4\": \"" + vierness4 + "\",\n" +
	    	                "    \"viernes5\": \"" + vierness5 + "\",\n" +
	    	                "    \"viernes6\": \"" + vierness6 + "\",\n" +
	    	                "    \"viernes7\": \"" + vierness7 + "\",\n" +
	    	                "    \"viernes8\": \"" + vierness8 + "\",\n" +
	    	                "    \"sabado1\": \"" + sabados1 + "\",\n" +
	    	                "    \"sabado2\": \"" + sabados2 + "\",\n" +
	    	                "    \"sabado3\": \"" + sabados3 + "\",\n" +
	    	                "    \"sabado4\": \"" + sabados4 + "\",\n" +
	    	                "    \"sabado5\": \"" + sabados5 + "\",\n" +
	    	                "    \"sabado6\": \"" + sabados6 + "\",\n" +
	    	                "    \"sabado7\": \"" + sabados7 + "\",\n" +
	    	                "    \"sabado8\": \"" + sabados8 + "\",\n" +
	    	                "    \"domingo1\": \"" + domingos1 + "\",\n" +
	    	                "    \"domingo2\": \"" + domingos2 + "\",\n" +
	    	                "    \"domingo3\": \"" + domingos3 + "\",\n" +
	    	                "    \"domingo4\": \"" + domingos4 + "\",\n" +
	    	                "    \"domingo5\": \"" + domingos5 + "\",\n" +
	    	                "    \"domingo6\": \"" + domingos6 + "\",\n" +
	    	                "    \"domingo7\": \"" + domingos7 + "\",\n" +
	    	                "    \"domingo8\": \"" + domingos8 + "\"\n"+
	    		            "  }\n" +
	    		            "}";
	    	    	

	    	      
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
		                informationDialogs.setContentText("No se ha podido crear correctamente.");
		                informationDialogs.showAndWait();
	    	        }
	    	        

	    	        connection.disconnect();
	    	        
	    	 } catch (IOException e) {
	    	        e.printStackTrace();
	       }
	    	
		}
	    
	    
	    
	    
	    public void dameDietaUsuario() {
	    	
	    	
	    	   try {
			        // Construir la URL de la solicitud GET
			        URL url = new URL("https://localhost:7264/api/Usuario/DameusuarioXEmail/"+selectedEmail);
			        
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
			         
			    		
			    		Horario1.setText(dietaHorario1);
			    		Horario2.setText(dietaHorario2);
			    		Horario3.setText(dietaHorario3);
			    		Horario4.setText(dietaHorario4);
			    		Horario5.setText(dietaHorario5);
			    		Horario6.setText(dietaHorario6);
			    		Horario7.setText(dietaHorario7);
			    		Horario8.setText(dietaHorario8);
			    		
			    		Lunes1.setText(dietaLunes1);
			    		Lunes2.setText(dietaLunes2);
			    		Lunes3.setText(dietaLunes3);
			    		Lunes4.setText(dietaLunes4);
			    		Lunes5.setText(dietaLunes5);
			    		Lunes6.setText(dietaLunes6);
			    		Lunes7.setText(dietaLunes7);
			    		Lunes8.setText(dietaLunes8);

			    		Martes1.setText(dietaMartes1);
			    		Martes2.setText(dietaMartes2);
			    		Martes3.setText(dietaMartes3);
			    		Martes4.setText(dietaMartes4);
			    		Martes5.setText(dietaMartes5);
			    		Martes6.setText(dietaMartes6);
			    		Martes7.setText(dietaMartes7);
			    		Martes8.setText(dietaMartes8);


			    		Miercoles1.setText(dietaMiercoles1);
			    		Miercoles2.setText(dietaMiercoles2);
			    		Miercoles3.setText(dietaMiercoles3);
			    		Miercoles4.setText(dietaMiercoles4);
			    		Miercoles5.setText(dietaMiercoles5);
			    		Miercoles6.setText(dietaMiercoles6);
			    		Miercoles7.setText(dietaMiercoles7);
			    		Miercoles8.setText(dietaMiercoles8);


			    		Jueves1.setText(dietaJueves1);
			    		Jueves2.setText(dietaJueves2);
			    		Jueves3.setText(dietaJueves3);
			    		Jueves4.setText(dietaJueves4);
			    		Jueves5.setText(dietaJueves5);
			    		Jueves6.setText(dietaJueves6);
			    		Jueves7.setText(dietaJueves7);
			    		Jueves8.setText(dietaJueves8);


			    		Viernes1.setText(dietaViernes1);
			    		Viernes2.setText(dietaViernes2);
			    		Viernes3.setText(dietaViernes3);
			    		Viernes4.setText(dietaViernes4);
			    		Viernes5.setText(dietaViernes5);
			    		Viernes6.setText(dietaViernes6);
			    		Viernes7.setText(dietaViernes7);
			    		Viernes8.setText(dietaViernes8);


			    		Sabado1.setText(dietaSabado1);
			    		Sabado2.setText(dietaSabado2);
			    		Sabado3.setText(dietaSabado3);
			    		Sabado4.setText(dietaSabado4);
			    		Sabado5.setText(dietaSabado5);
			    		Sabado6.setText(dietaSabado6);
			    		Sabado7.setText(dietaSabado7);
			    		Sabado8.setText(dietaSabado8);


			    		Domingo1.setText(dietaDomingo1);
			    		Domingo2.setText(dietaDomingo2);
			    		Domingo3.setText(dietaDomingo3);
			    		Domingo4.setText(dietaDomingo4);
			    		Domingo5.setText(dietaDomingo5);
			    		Domingo6.setText(dietaDomingo6);
			    		Domingo7.setText(dietaDomingo7);
			    		Domingo8.setText(dietaDomingo8);
			          		            
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
	    

	    @FXML
	    void EventoClickHorario1(MouseEvent event) {
	    	
	    	   if (event.getClickCount() == 2) {
	               TextInputDialog dialog = new TextInputDialog(Horario1.getText());
	               dialog.setTitle("Modificar horario");
	               dialog.setHeaderText(null);
	               dialog.setContentText("Introduce el nuevo horario:");

	               Optional<String> result = dialog.showAndWait();
	               result.ifPresent(text -> Horario1.setText(text));
	           }
	    }

	    @FXML
	    void EventoClickHorario2(MouseEvent event) {

	  	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario2.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario2.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickHorario3(MouseEvent event) {

	  	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario3.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario3.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickHorario4(MouseEvent event) {

	  	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario4.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario4.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickHorario5(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario5.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario5.setText(text));
	 	  }
	    }

	    @FXML
	    void EventoClickHorario6(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario6.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario6.setText(text));
	 	  }
	    }

	    @FXML
	    void EventoClickHorario7(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario7.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario7.setText(text));
	 	  }
	    }

	    @FXML
	    void EventoClickHorario8(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Horario8.getText());
	           dialog.setTitle("Modificar horario");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Introduce el nuevo horario:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Horario8.setText(text));
	 	  }
	    }
	    
	    
	    
	    
	    

	    @FXML
	    void EventoClickLunes1(MouseEvent event) {

	    	   if (event.getClickCount() == 2) {
	               TextInputDialog dialog = new TextInputDialog(Lunes1.getText());
	               dialog.setTitle("Modificar Entrenamiento");
	               dialog.setHeaderText(null);
	               dialog.setContentText("Modificar Entrenamiento Lunes:");

	               Optional<String> result = dialog.showAndWait();
	               result.ifPresent(text -> Lunes1.setText(text));
	           }
	    	
	    }

	    @FXML
	    void EventoClickLunes2(MouseEvent event) {

	    	   if (event.getClickCount() == 2) {
	               TextInputDialog dialog = new TextInputDialog(Lunes2.getText());
	               dialog.setTitle("Modificar Entrenamiento Lunes");
	               dialog.setHeaderText(null);
	               dialog.setContentText("Modificar Entrenamiento Lunes:");

	               Optional<String> result = dialog.showAndWait();
	               result.ifPresent(text -> Lunes2.setText(text));
	           }
	    }

	    @FXML
	    void EventoClickLunes3(MouseEvent event) {

	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes3.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes3.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickLunes4(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes4.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes4.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickLunes5(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes5.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes5.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickLunes6(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes6.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes6.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickLunes7(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes7.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes7.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickLunes8(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Lunes8.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Lunes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Lunes8.setText(text));
	       }
	    }


	    
	    
	    @FXML
	    void EventoClickMartes1(MouseEvent event) {
	 	   if (event.getClickCount() == 2) {
	           TextInputDialog dialog = new TextInputDialog(Martes1.getText());
	           dialog.setTitle("Modificar Entrenamiento");
	           dialog.setHeaderText(null);
	           dialog.setContentText("Modificar Entrenamiento Martes:");

	           Optional<String> result = dialog.showAndWait();
	           result.ifPresent(text -> Martes1.setText(text));
	       }
	    }

	    @FXML
	    void EventoClickMartes2(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes2.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes2.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes3(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes3.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes3.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes4(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes4.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes4.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes5(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes5.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes5.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes6(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes6.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes6.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes7(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes7.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes7.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMartes8(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Martes8.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Martes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Martes8.setText(text));
	         }
	    }
	    
	    
	    
	    @FXML
	    void EventoClickMiercoles1(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Miercoles1.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Miercoles:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Miercoles1.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickMiercoles2(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles2.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles2.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles3(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles3.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles3.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles4(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles4.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles4.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles5(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles5.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles5.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles6(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles6.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles6.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles7(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles7.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles7.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickMiercoles8(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Miercoles8.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Miercoles:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Miercoles8.setText(text));
	     }
	    }
	    
	    
	    
	    @FXML
	    void EventoClickJueves1(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves1.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves1.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves2(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves2.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves2.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves3(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves3.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves3.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves4(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves4.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves4.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves5(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves5.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves5.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves6(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves6.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves6.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves7(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves7.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves7.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickJueves8(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Jueves8.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Jueves:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Jueves8.setText(text));
	         }
	    }
	    
	    
	    
	    

	    @FXML
	    void EventoClickViernes1(MouseEvent event) {
	     	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes1.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes1.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes2(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes2.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes2.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes3(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes3.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes3.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes4(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes4.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes4.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes5(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes5.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes5.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes6(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes6.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes6.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes7(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes7.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes7.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickViernes8(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Viernes8.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Viernes:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Viernes8.setText(text));
	         }
	    }
	    
	    
	    
	    
	    @FXML
	    void EventoClickSabado1(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado1.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado1.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado2(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado2.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado2.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado3(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado3.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado3.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado4(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado4.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado4.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado5(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado5.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado5.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado6(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado6.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado6.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado7(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado7.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado7.setText(text));
	         }
	    }

	    @FXML
	    void EventoClickSabado8(MouseEvent event) {
	      	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Sabado8.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Sabado:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Sabado8.setText(text));
	         }
	    }
	    
	    @FXML
	    void EventoClickDomingo1(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo1.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo1.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo2(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo2.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo2.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo3(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo3.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo3.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo4(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo4.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo4.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo5(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo5.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo5.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo6(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo6.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo6.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo7(MouseEvent event) {
	   	 if (event.getClickCount() == 2) {
	         TextInputDialog dialog = new TextInputDialog(Domingo7.getText());
	         dialog.setTitle("Modificar Entrenamiento");
	         dialog.setHeaderText(null);
	         dialog.setContentText("Modificar Entrenamiento Domingo:");

	         Optional<String> result = dialog.showAndWait();
	         result.ifPresent(text -> Domingo7.setText(text));
	     }
	    }

	    @FXML
	    void EventoClickDomingo8(MouseEvent event) {
	    	 if (event.getClickCount() == 2) {
	             TextInputDialog dialog = new TextInputDialog(Domingo8.getText());
	             dialog.setTitle("Modificar Entrenamiento");
	             dialog.setHeaderText(null);
	             dialog.setContentText("Modificar Entrenamiento Domingo:");

	             Optional<String> result = dialog.showAndWait();
	             result.ifPresent(text -> Domingo8.setText(text));
	         }
	    }

		private void actualizarDietaMonitor() {
			System.out.println("Holaaaaaaaaaaaaa");	
			
			
			//---------------------------------------------
			
			String tablaHorarios1; String tablaHorarios2; String tablaHorarios3; String tablaHorarios4; String tablaHorarios5; String tablaHorarios6; String tablaHorarios7; String tablaHorarios8;
	    	String luness1; String luness2;String luness3; String luness4;String luness5; String luness6;String luness7; String luness8;
	    	String martess1; String martess2;String martess3; String martess4;String martess5; String martess6;String martess7; String martess8;
	    	String miercoless1; String miercoless2;String miercoless3; String miercoless4;String miercoless5; String miercoless6;String miercoless7; String miercoless8;
	    	String juevess1; String juevess2;String juevess3; String juevess4;String juevess5; String juevess6;String juevess7; String juevess8;
	    	String vierness1; String vierness2;String vierness3; String vierness4;String vierness5; String vierness6;String vierness7; String vierness8;
	    	String sabados1; String sabados2;String sabados3; String sabados4;String sabados5; String sabados6; String sabados7; String sabados8;
	    	String domingos1; String domingos2;String domingos3; String domingos4;String domingos5; String domingos6; String domingos7; String domingos8;
		
	    	tablaHorarios1 =	Horario1.getText();
	    	tablaHorarios2 =	Horario2.getText();
	    	tablaHorarios3 =	Horario3.getText();
	    	tablaHorarios4 =	Horario4.getText();
	    	tablaHorarios5 =	Horario5.getText();
	    	tablaHorarios6 =	Horario6.getText();
	    	tablaHorarios7 =	Horario7.getText();
	    	tablaHorarios8 =	Horario8.getText();
	    	
	    
	    	
	      luness1 =	Lunes1.getText();
	      luness2 =	Lunes2.getText();
	      luness3 =	Lunes3.getText();
	      luness4 =	Lunes4.getText();
	      luness5 =	Lunes5.getText();
	      luness6 =	Lunes6.getText();
	      luness7 =	Lunes7.getText();
	      luness8 =	Lunes8.getText();
	      
	  	
	      martess1 =	Martes1.getText();
	      martess2 =	Martes2.getText();
	      martess3 =	Martes3.getText();
	      martess4 =	Martes4.getText();
	      martess5 =	Martes5.getText();
	      martess6 =	Martes6.getText();
	      martess7 =    Martes7.getText();
	      martess8 =	Martes8.getText();

	      miercoless1 =	Miercoles1.getText();
	      miercoless2 =		Miercoles2.getText();
	      miercoless3 =		Miercoles3.getText();
	      miercoless4 =		Miercoles4.getText();
	      miercoless5 =		Miercoles5.getText();
	      miercoless6 =		Miercoles6.getText();
	      miercoless7 =		Miercoles7.getText();
	      miercoless8 =		Miercoles8.getText();

	      juevess1 =		Jueves1.getText();
	      juevess2 =		Jueves2.getText();
	      juevess3 =		Jueves3.getText();
	      juevess4 =		Jueves4.getText();
	      juevess5 =		Jueves5.getText();
	      juevess6 =		Jueves6.getText();
	      juevess7 =		Jueves7.getText();
	      juevess8 =		Jueves8.getText();

	      vierness1 =		Viernes1.getText();
	      vierness2 =		Viernes2.getText();
	      vierness3 =		Viernes3.getText();
		  vierness4 =		Viernes4.getText();
		  vierness5 =		Viernes5.getText();
		  vierness6 =		Viernes6.getText();
		  vierness7 =		Viernes7.getText();
		  vierness8 =		Viernes8.getText();

		  sabados1 =		Sabado1.getText();
		  sabados2 =	Sabado2.getText();
		  sabados3 =	Sabado3.getText();
		  sabados4 =	Sabado4.getText();
		  sabados5 =	Sabado5.getText();
		  sabados6 =	Sabado6.getText();
		  sabados7 =	Sabado7.getText();
		  sabados8 =	Sabado8.getText();

			domingos1 = Domingo1.getText();
			domingos2 =	Domingo2.getText();
			domingos3 =	Domingo3.getText();
			domingos4 =	Domingo4.getText();
			domingos5 =	Domingo5.getText();
			domingos6 =	Domingo6.getText();
			domingos7 =	Domingo7.getText();
			domingos8 =	Domingo8.getText();
	    	
	    	
	    	 try {
	    		 	// Construir la URL de la solicitud PUT
	    	        URL url = new URL("https://localhost:7264/api/Usuario/DietaCambiarUsuario/" + selectedEmail);

	    	        // Crear el objeto JSON con los datos a enviar
	    	        String jsonInput = "{\n" +
	    	                "  \"idUsuario\": 0,\n" +
	        	            "  \"tienemonitor\": false,\n" +
	    	                "  \"nombre\": \"string\",\n" +
	    	                "  \"apellidos\": \"string\",\n" +
	    	                "  \"peso\": \"string\",\n" +
	    	                "  \"edad\": \"string\",\n" +
	    	                "  \"foto\": \"string\",\n" +
	    	                "  \"email\":  \"string\",\n" +
	    	                "  \"password\": \"string\",\n" +
	    	                "  \"tabla\": {\n" +
	    	    	        "    \"idTabla\": 0,\n" +
	    	    	        "    \"horario1\": \"string\",\n" +
	    	    	        "    \"horario2\": \"string\",\n" +
	    	    	        "    \"horario3\": \"string\",\n" +
	    	    	        "    \"horario4\": \"string\",\n" +
	    	    	        "    \"horario5\": \"string\",\n" +
	    	    	        "    \"horario6\": \"string\",\n" +
	    	    	        "    \"horario7\": \"string\",\n" +
	    	    	        "    \"horario8\": \"string\",\n" +
	    	    	        "    \"lunes1\": \"string\",\n" +
	    	    	        "    \"lunes2\": \"string\",\n" +
	    	    	        "    \"lunes3\": \"string\",\n" +
	    	    	        "    \"lunes4\": \"string\",\n" +
	    	    	        "    \"lunes5\": \"string\",\n" +
	    	    	        "    \"lunes6\": \"string\",\n" +
	    	    	        "    \"lunes7\": \"string\",\n" +
	    	    	        "    \"lunes8\": \"string\",\n" +
	    	    	        "    \"martes1\": \"string\",\n" +
	    	    	        "    \"martes2\": \"string\",\n" +
	    	    	        "    \"martes3\": \"string\",\n" +
	    	    	        "    \"martes4\": \"string\",\n" +
	    	    	        "    \"martes5\": \"string\",\n" +
	    	    	        "    \"martes6\": \"string\",\n" +
	    	    	        "    \"martes7\": \"string\",\n" +
	    	    	        "    \"martes8\": \"string\",\n" +
	    	    	        "    \"miercoles1\": \"string\",\n" +
	    	    	        "    \"miercoles2\": \"string\",\n" +
	    	    	        "    \"miercoles3\": \"string\",\n" +
	    	    	        "    \"miercoles4\": \"string\",\n" +
	    	    	        "    \"miercoles5\": \"string\",\n" +
	    	    	        "    \"miercoles6\": \"string\",\n" +
	    	    	        "    \"miercoles7\": \"string\",\n" +
	    	    	        "    \"miercoles8\": \"string\",\n" +
	    	    	        "    \"jueves1\": \"string\",\n" +
	    	    	        "    \"jueves2\": \"string\",\n" +
	    	    	        "    \"jueves3\": \"string\",\n" +
	    	    	        "    \"jueves4\": \"string\",\n" +
	    	    	        "    \"jueves5\": \"string\",\n" +
	    	    	        "    \"jueves6\": \"string\",\n" +
	    	    	        "    \"jueves7\": \"string\",\n" +
	    	    	        "    \"jueves8\": \"string\",\n" +
	    	    	        "    \"viernes1\": \"string\",\n" +
	    	    	        "    \"viernes2\": \"string\",\n" +
	    	    	        "    \"viernes3\": \"string\",\n" +
	    	    	        "    \"viernes4\": \"string\",\n" +
	    	    	        "    \"viernes5\": \"string\",\n" +
	    	    	        "    \"viernes6\": \"string\",\n" +
	    	    	        "    \"viernes7\": \"string\",\n" +
	    	    	        "    \"viernes8\": \"string\",\n" +    	
	    	    	        "    \"sabado1\": \"string\",\n" +
	    	    	        "    \"sabado2\": \"string\",\n" +
	    	    	        "    \"sabado3\": \"string\",\n" +
	    	    	        "    \"sabado4\": \"string\",\n" +
	    	    	        "    \"sabado5\": \"string\",\n" +
	    	    	        "    \"sabado6\": \"string\",\n" +
	    	    	        "    \"sabado7\": \"string\",\n" +
	    	    	        "    \"sabado8\": \"string\",\n" +   
	    	    	        "    \"domingo1\": \"string\",\n" +
	    	    	        "    \"domingo2\": \"string\",\n" +
	    	    	        "    \"domingo3\": \"string\",\n" +
	    	    	        "    \"domingo4\": \"string\",\n" +
	    	    	        "    \"domingo5\": \"string\",\n" +
	    	    	        "    \"domingo6\": \"string\",\n" +
	    	    	        "    \"domingo7\": \"string\",\n" +
	    	    	        "    \"domingo8\": \"string\"\n" +
	    		            "  },\n" +
	    		            "  \"dieta\": {\n" +
	    		            "    \"idDieta\": 0,\n" +
	    		            "    \"horario1\": \"" + tablaHorarios1 + "\",\n" +
	    	                "    \"horario2\": \"" + tablaHorarios2 + "\",\n" +
	    	                "    \"horario3\": \"" + tablaHorarios3 + "\",\n" +
	    	                "    \"horario4\": \"" + tablaHorarios4 + "\",\n" +
	    	                "    \"horario5\": \"" + tablaHorarios5 + "\",\n" +
	    	                "    \"horario6\": \"" + tablaHorarios6 + "\",\n" +
	    	                "    \"horario7\": \"" + tablaHorarios7 + "\",\n" +
	    	                "    \"horario8\": \"" + tablaHorarios8 + "\",\n" +
	    	                "    \"lunes1\": \"" + luness1 + "\",\n" +
	    	                "    \"lunes2\": \"" + luness2 + "\",\n" +
	    	                "    \"lunes3\": \"" + luness3 + "\",\n" +
	    	                "    \"lunes4\": \"" + luness4 + "\",\n" +
	    	                "    \"lunes5\": \"" + luness5 + "\",\n" +
	    	                "    \"lunes6\": \"" + luness6 + "\",\n" +
	    	                "    \"lunes7\": \"" + luness7 + "\",\n" +
	    	                "    \"lunes8\": \"" + luness8 + "\",\n" +
	    	                "    \"martes1\": \"" + martess1 + "\",\n" +
	    	                "    \"martes2\": \"" + martess2 + "\",\n" +
	    	                "    \"martes3\": \"" + martess3 + "\",\n" +
	    	                "    \"martes4\": \"" + martess4 + "\",\n" +
	    	                "    \"martes5\": \"" + martess5 + "\",\n" +
	    	                "    \"martes6\": \"" + martess6 + "\",\n" +
	    	                "    \"martes7\": \"" + martess7 + "\",\n" +
	    	                "    \"martes8\": \"" + martess8 + "\",\n" +
	    	                "    \"miercoles1\": \"" + miercoless1 + "\",\n" +
	    	                "    \"miercoles2\": \"" + miercoless2 + "\",\n" +
	    	                "    \"miercoles3\": \"" + miercoless3 + "\",\n" +
	    	                "    \"miercoles4\": \"" + miercoless4 + "\",\n" +
	    	                "    \"miercoles5\": \"" + miercoless5 + "\",\n" +
	    	                "    \"miercoles6\": \"" + miercoless6 + "\",\n" +
	    	                "    \"miercoles7\": \"" + miercoless7 + "\",\n" +
	    	                "    \"miercoles8\": \"" + miercoless8 + "\",\n" +
	    	                "    \"jueves1\": \"" + juevess1 + "\",\n" +
	    	                "    \"jueves2\": \"" + juevess2 + "\",\n" +
	    	                "    \"jueves3\": \"" + juevess3 + "\",\n" +
	    	                "    \"jueves4\": \"" + juevess4 + "\",\n" +
	    	                "    \"jueves5\": \"" + juevess5 + "\",\n" +
	    	                "    \"jueves6\": \"" + juevess6 + "\",\n" +
	    	                "    \"jueves7\": \"" + juevess7 + "\",\n" +
	    	                "    \"jueves8\": \"" + juevess8 + "\",\n" +
	    	                "    \"viernes1\": \"" + vierness1 + "\",\n" +
	    	                "    \"viernes2\": \"" + vierness2 + "\",\n" +
	    	                "    \"viernes3\": \"" + vierness3 + "\",\n" +
	    	                "    \"viernes4\": \"" + vierness4 + "\",\n" +
	    	                "    \"viernes5\": \"" + vierness5 + "\",\n" +
	    	                "    \"viernes6\": \"" + vierness6 + "\",\n" +
	    	                "    \"viernes7\": \"" + vierness7 + "\",\n" +
	    	                "    \"viernes8\": \"" + vierness8 + "\",\n" +
	    	                "    \"sabado1\": \"" + sabados1 + "\",\n" +
	    	                "    \"sabado2\": \"" + sabados2 + "\",\n" +
	    	                "    \"sabado3\": \"" + sabados3 + "\",\n" +
	    	                "    \"sabado4\": \"" + sabados4 + "\",\n" +
	    	                "    \"sabado5\": \"" + sabados5 + "\",\n" +
	    	                "    \"sabado6\": \"" + sabados6 + "\",\n" +
	    	                "    \"sabado7\": \"" + sabados7 + "\",\n" +
	    	                "    \"sabado8\": \"" + sabados8 + "\",\n" +
	    	                "    \"domingo1\": \"" + domingos1 + "\",\n" +
	    	                "    \"domingo2\": \"" + domingos2 + "\",\n" +
	    	                "    \"domingo3\": \"" + domingos3 + "\",\n" +
	    	                "    \"domingo4\": \"" + domingos4 + "\",\n" +
	    	                "    \"domingo5\": \"" + domingos5 + "\",\n" +
	    	                "    \"domingo6\": \"" + domingos6 + "\",\n" +
	    	                "    \"domingo7\": \"" + domingos7 + "\",\n" +
	    	                "    \"domingo8\": \"" + domingos8 + "\"\n"+
	    	                "    },\n" +
	    	    	        "  \"listaDeUsuarios\": []\n" +
	    	    	        "}";

	    	      
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
		                informationDialogs.setContentText("No se ha podido crear correctamente.");
		                informationDialogs.showAndWait();
	    	        }
	    	        

	    	        connection.disconnect();
	    	        
	    	 } catch (IOException e) {
	    	        e.printStackTrace();
	       }
	    	
			
			
			//----------------------------
	    	
	}

}
