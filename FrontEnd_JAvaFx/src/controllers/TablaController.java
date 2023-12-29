package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class TablaController implements Initializable {

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
//----------------------------------------------------------
	
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
	    private AnchorPane PaneAñadirSWitch;

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
	    private AnchorPane anchorPane;

	    @FXML
	    private Button btnActualizar;	
	
//-----------------------------------------------
    
    private boolean editMode = false;
    

    @FXML
    void EventoClickActualizar(MouseEvent event) {
    	
    	if(!monitorBoolean) {
    	  	System.out.println("He presionado el boton actualizar como usuario");
        	actualizarTabla();
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
		   
		   
		   if(monitorBoolean) {
				
			   cargarNombresUsuario();
			   System.out.println("-------LISTA--------");
			 for (String string : listaEmailUsuario) {
		    	System.out.println(string);
			 }
			   
			//   elegirPersonaCombo();
			} 
		   
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
	public void setTabla
	(
String tablaHorarios1, String tablaHorarios2,String tablaHorarios3, String tablaHorarios4,String tablaHorarios5, String tablaHorarios6,String tablaHorarios7, String tablaHorarios8,
String luness1, String luness2,String luness3, String luness4,String luness5, String luness6,String luness7, String luness8,
String martess1, String martess2,String martess3, String martess4,String martess5, String martess6,String martess7, String martess8,
String miercoless1, String miercoless2,String miercoless3, String miercoless4,String miercoless5, String miercoless6,String miercoless7, String miercoless8,
String juevess1, String juevess2,String juevess3, String juevess4,String juevess5, String juevess6,String juevess7, String juevess8,
String vierness1, String vierness2,String vierness3, String vierness4,String vierness5, String vierness6,String vierness7, String vierness8,
String sabados1, String sabados2,String sabados3, String sabados4,String sabados5, String sabados6,String sabados7, String sabados8,
String domingos1, String domingos2,String domingos3, String domingos4,String domingos5, String domingos6,String domingos7, String domingos8

) {
		tablaHorario1 = tablaHorarios1;
		tablaHorario2 = tablaHorarios2;
		tablaHorario3 = tablaHorarios3;
		tablaHorario4 = tablaHorarios4;
		tablaHorario5 = tablaHorarios5;
		tablaHorario6 = tablaHorarios6;
		tablaHorario7 = tablaHorarios7;
		tablaHorario8 = tablaHorarios8;
		
		tablaLunes1 = luness1;
		tablaLunes2 = luness2;
		tablaLunes3 = luness3;
		tablaLunes4 = luness4;
		tablaLunes5 = luness5;
		tablaLunes6 = luness6;
		tablaLunes7 = luness7;
		tablaLunes8 = luness8;
		
		tablaMartes1 = martess1;
		tablaMartes2 = martess2;
		tablaMartes3 = martess3;
		tablaMartes4 = martess4;
		tablaMartes5 = martess5;
		tablaMartes6 = martess6;
		tablaMartes7 = martess7;
		tablaMartes8 = martess8;
		
		tablaMiercoles1 = miercoless1;
		tablaMiercoles2 = miercoless2;
		tablaMiercoles3 = miercoless3;
		tablaMiercoles4 = miercoless4;
		tablaMiercoles5 = miercoless5;
		tablaMiercoles6 = miercoless6;
		tablaMiercoles7 = miercoless7;
		tablaMiercoles8 = miercoless8;
		
		tablaJueves1 = juevess1;
		tablaJueves2 = juevess2;
		tablaJueves3 = juevess3;
		tablaJueves4 = juevess4;
		tablaJueves5 = juevess5;
		tablaJueves6 = juevess6;
		tablaJueves7 = juevess7;
		tablaJueves8 = juevess8;
		
		tablaViernes1 = vierness1;
		tablaViernes2 = vierness2;
		tablaViernes3 = vierness3;
		tablaViernes4 = vierness4;
		tablaViernes5 = vierness5;
		tablaViernes6 = vierness6;
		tablaViernes7 = vierness7;
		tablaViernes8 = vierness8;
		
		tablaSabado1 = sabados1;
		tablaSabado2 = sabados2;
		tablaSabado3 = sabados3;
		tablaSabado4 = sabados4;
		tablaSabado5 = sabados5;
		tablaSabado6 = sabados6;
		tablaSabado7 = sabados7;
		tablaSabado8 = sabados8;
		
		tablaDomingo1 = domingos1;
		tablaDomingo2 = domingos2;
		tablaDomingo3 = domingos3;
		tablaDomingo4 = domingos4;
		tablaDomingo5 = domingos5;
		tablaDomingo6 = domingos6;
		tablaDomingo7 = domingos7;
		tablaDomingo8 = domingos8;
		
		Horario1.setText(tablaHorario1);
		Horario2.setText(tablaHorario2);
		Horario3.setText(tablaHorario3);
		Horario4.setText(tablaHorario4);
		Horario5.setText(tablaHorario5);
		Horario6.setText(tablaHorario6);
		Horario7.setText(tablaHorario7);
		Horario8.setText(tablaHorario8);
		
		Lunes1.setText(tablaLunes1);
		Lunes2.setText(tablaLunes2);
		Lunes3.setText(tablaLunes3);
		Lunes4.setText(tablaLunes4);
		Lunes5.setText(tablaLunes5);
		Lunes6.setText(tablaLunes6);
		Lunes7.setText(tablaLunes7);
		Lunes8.setText(tablaLunes8);

		Martes1.setText(tablaMartes1);
		Martes2.setText(tablaMartes2);
		Martes3.setText(tablaMartes3);
		Martes4.setText(tablaMartes4);
		Martes5.setText(tablaMartes5);
		Martes6.setText(tablaMartes6);
		Martes7.setText(tablaMartes7);
		Martes8.setText(tablaMartes8);

		Miercoles1.setText(tablaMiercoles1);
		Miercoles2.setText(tablaMiercoles2);
		Miercoles3.setText(tablaMiercoles3);
		Miercoles4.setText(tablaMiercoles4);
		Miercoles5.setText(tablaMiercoles5);
		Miercoles6.setText(tablaMiercoles6);
		Miercoles7.setText(tablaMiercoles7);
		Miercoles8.setText(tablaMiercoles8);

		Jueves1.setText(tablaJueves1);
		Jueves2.setText(tablaJueves2);
		Jueves3.setText(tablaJueves3);
		Jueves4.setText(tablaJueves4);
		Jueves5.setText(tablaJueves5);
		Jueves6.setText(tablaJueves6);
		Jueves7.setText(tablaJueves7);
		Jueves8.setText(tablaJueves8);

		Viernes1.setText(tablaViernes1);
		Viernes2.setText(tablaViernes2);
		Viernes3.setText(tablaViernes3);
		Viernes4.setText(tablaViernes4);
		Viernes5.setText(tablaViernes5);
		Viernes6.setText(tablaViernes6);
		Viernes7.setText(tablaViernes7);
		Viernes8.setText(tablaViernes8);

		Sabado1.setText(tablaSabado1);
		Sabado2.setText(tablaSabado2);
		Sabado3.setText(tablaSabado3);
		Sabado4.setText(tablaSabado4);
		Sabado5.setText(tablaSabado5);
		Sabado6.setText(tablaSabado6);
		Sabado7.setText(tablaSabado7);
		Sabado8.setText(tablaSabado8);

		Domingo1.setText(tablaDomingo1);
		Domingo2.setText(tablaDomingo2);
		Domingo3.setText(tablaDomingo3);
		Domingo4.setText(tablaDomingo4);
		Domingo5.setText(tablaDomingo5);
		Domingo6.setText(tablaDomingo6);
		Domingo7.setText(tablaDomingo7);
		Domingo8.setText(tablaDomingo8);

		
		
	}

	

    private void actualizarTabla() {
    	
    	
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
      
  	System.out.println(tablaHorarios3);
  	
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
    	        URL url = new URL("https://localhost:7264/api/Usuario/ActualizarTabla");

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
    		            "  },\n" +
    		            "  \"dieta\": {\n" +
    		            "    \"idDieta\": 0,\n" +
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
	                informationDialogs.setContentText("No se ha podido actualizar correctamente.");
	                informationDialogs.showAndWait();
    	        }
    	        
    	        connection.disconnect();
    	        
    	 } catch (IOException e) {
    	        e.printStackTrace();
       }
    	
	}
    
    
    //-------------------------------------Evento Clik de los botones-------------------------------------
    
    

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



	public void setUsuario() {

		ComboTablaPersona.setDisable(true);
		ComboTablaPersona.setVisible(false);
		monitorBoolean= false;
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
		    		
		    
		    		
		    		Horario1.setText(tablaHorario1);
		    		Horario2.setText(tablaHorario2);
		    		Horario3.setText(tablaHorario3);
		    		Horario4.setText(tablaHorario4);
		    		Horario5.setText(tablaHorario5);
		    		Horario6.setText(tablaHorario6);
		    		Horario7.setText(tablaHorario7);
		    		Horario8.setText(tablaHorario8);
		    		
		    		Lunes1.setText(tablaLunes1);
		    		Lunes2.setText(tablaLunes2);
		    		Lunes3.setText(tablaLunes3);
		    		Lunes4.setText(tablaLunes4);
		    		Lunes5.setText(tablaLunes5);
		    		Lunes6.setText(tablaLunes6);
		    		Lunes7.setText(tablaLunes7);
		    		Lunes8.setText(tablaLunes8);

		    		Martes1.setText(tablaMartes1);
		    		Martes2.setText(tablaMartes2);
		    		Martes3.setText(tablaMartes3);
		    		Martes4.setText(tablaMartes4);
		    		Martes5.setText(tablaMartes5);
		    		Martes6.setText(tablaMartes6);
		    		Martes7.setText(tablaMartes7);
		    		Martes8.setText(tablaMartes8);

		    		Miercoles1.setText(tablaMiercoles1);
		    		Miercoles2.setText(tablaMiercoles2);
		    		Miercoles3.setText(tablaMiercoles3);
		    		Miercoles4.setText(tablaMiercoles4);
		    		Miercoles5.setText(tablaMiercoles5);
		    		Miercoles6.setText(tablaMiercoles6);
		    		Miercoles7.setText(tablaMiercoles7);
		    		Miercoles8.setText(tablaMiercoles8);

		    		Jueves1.setText(tablaJueves1);
		    		Jueves2.setText(tablaJueves2);
		    		Jueves3.setText(tablaJueves3);
		    		Jueves4.setText(tablaJueves4);
		    		Jueves5.setText(tablaJueves5);
		    		Jueves6.setText(tablaJueves6);
		    		Jueves7.setText(tablaJueves7);
		    		Jueves8.setText(tablaJueves8);

		    		Viernes1.setText(tablaViernes1);
		    		Viernes2.setText(tablaViernes2);
		    		Viernes3.setText(tablaViernes3);
		    		Viernes4.setText(tablaViernes4);
		    		Viernes5.setText(tablaViernes5);
		    		Viernes6.setText(tablaViernes6);
		    		Viernes7.setText(tablaViernes7);
		    		Viernes8.setText(tablaViernes8);

		    		Sabado1.setText(tablaSabado1);
		    		Sabado2.setText(tablaSabado2);
		    		Sabado3.setText(tablaSabado3);
		    		Sabado4.setText(tablaSabado4);
		    		Sabado5.setText(tablaSabado5);
		    		Sabado6.setText(tablaSabado6);
		    		Sabado7.setText(tablaSabado7);
		    		Sabado8.setText(tablaSabado8);

		    		Domingo1.setText(tablaDomingo1);
		    		Domingo2.setText(tablaDomingo2);
		    		Domingo3.setText(tablaDomingo3);
		    		Domingo4.setText(tablaDomingo4);
		    		Domingo5.setText(tablaDomingo5);
		    		Domingo6.setText(tablaDomingo6);
		    		Domingo7.setText(tablaDomingo7);
		    		Domingo8.setText(tablaDomingo8);
		          		            
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
    //------------------------------------------------------------------------------------------------------
	
	   
	   private void actualizarDietaMonitor() {
		    System.out.println("He presionado el boton tabla actualizar como monitor");
		    System.out.println(selectedEmail);
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
	      
	  	System.out.println(tablaHorarios3);
	  	
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
	    	        URL url = new URL("https://localhost:7264/api/Usuario/TablaCambiarUsuario/" + selectedEmail);

	    	        // Crear el objeto JSON con los datos a enviar
	    	        String jsonInput = "{\n" +
	    	                "  \"idUsuario\": 0,\n" +
	    	                "  \"nombre\": \"string\",\n" +
	    	                "  \"apellidos\": \"string\",\n" +
	    	                "  \"peso\": \"string\",\n" +
	    	                "  \"edad\": \"string\",\n" +
	    	                "  \"foto\": \"string\",\n" +
	    	                "  \"email\":  \"string\",\n" +
	    	                "  \"password\": \"string\",\n" +
	    	                "  \"tabla\": {\n" +
	    	    	        "    \"idTabla\": 0,\n" +
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
	    		            "  },\n" +
	    		            "  \"dieta\": {\n" +
	    		            "    \"idDieta\": 0,\n" +
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
		                informationDialogs.setContentText("No se ha podido actualizar correctamente.");
		                informationDialogs.showAndWait();
	    	        }
	    	        
	    	        connection.disconnect();
	    	        
	    	 } catch (IOException e) {
	    	        e.printStackTrace();
	       }
		          
		    //-------------------------------------
	}
		        
		        
}
