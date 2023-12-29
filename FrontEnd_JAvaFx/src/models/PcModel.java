package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Carlos
 *
 */
public class PcModel {
	 

private static int numActual = 0;
	
	private IntegerProperty id;
	private StringProperty  tipo;

	private StringProperty	nombre;
	private StringProperty	marca;
	private StringProperty	modelo;
	//private StringProperty	nombre; FECHA COMPRA
	
	private StringProperty	ram;
	private StringProperty	procesador;
	private StringProperty	lugarInstalacion;
//	private StringProperty	nombre;      FECHA INSTALACION
	private StringProperty  comentario;
	private StringProperty  nSerie;

	
	
	public PcModel () {
		
		this.id = new SimpleIntegerProperty(numActual++);
		this.tipo = new SimpleStringProperty("PC");
		
		this.nombre = new SimpleStringProperty("");
		this.marca = new SimpleStringProperty("");
		this.modelo = new SimpleStringProperty("");
		//AQUI LA FECHA COMPRA
		this.ram = new SimpleStringProperty("");
		this.procesador = new SimpleStringProperty("");
		this.lugarInstalacion = new SimpleStringProperty("");
		//AQUI LA FECHA INSTALACION
		this.comentario = new SimpleStringProperty("");
		this.nSerie = new SimpleStringProperty("");
		
	}
	
	public PcModel (String nombre) {
		
		this.id = new SimpleIntegerProperty(numActual++);
		this.tipo = new SimpleStringProperty("PC");
		
		this.nombre = new SimpleStringProperty(nombre);
		this.marca = new SimpleStringProperty("");
		this.modelo = new SimpleStringProperty("");
		//AQUI LA FECHA COMPRA
		this.ram = new SimpleStringProperty("");
		this.procesador = new SimpleStringProperty("");
		this.lugarInstalacion = new SimpleStringProperty("");
		//AQUI LA FECHA INSTALACION
		this.comentario = new SimpleStringProperty("");
		this.nSerie = new SimpleStringProperty("");
		
	}

	public PcModel (String nombre, String marca, String modelo, String ram,String procesador, String lugar, String comentario, String nserie) {
		
		this.id = new SimpleIntegerProperty(numActual++);
		this.tipo = new SimpleStringProperty("PC");
		
		
		//this.nombre = new SimpleStringProperty(nombre);
		//this.comentario = new SimpleStringProperty(comentario);
		this.nombre = new SimpleStringProperty(nombre);
		this.marca = new SimpleStringProperty(marca);
		this.modelo = new SimpleStringProperty(modelo);
		//AQUI LA FECHA COMPRA
		this.ram = new SimpleStringProperty(ram);
		this.procesador = new SimpleStringProperty(procesador);
		this.lugarInstalacion = new SimpleStringProperty(lugar);
		//AQUI LA FECHA INSTALACION
		this.comentario = new SimpleStringProperty(comentario);
		this.nSerie = new SimpleStringProperty(nserie);
		
		
	}
	//metodos estaticos
	
	public IntegerProperty idProperty () {
		return id;
	}
	
	public int getid () {
		return id.get();
	}
	
	public StringProperty tipoProperty () {
		return tipo;
	}
	
	public String gettipo () {
		return tipo.get();
	}
	
	//metodos dinamicos
	
	public StringProperty nombreProperty () {
		return nombre;
	}
	
	public String getNombre () {
		return nombre.get();
	}
	
	public void setNombre (String nombre) {
		this.nombre.set(nombre);
	}
	
	
	//-----
	public StringProperty marcaProperty () {
		return marca;
	}
	
	public String getMarca () {
		return marca.get();
	}
	
	public void setMarca (String marca) {
		this.marca.set(marca);
	}
	
	//--------
	public StringProperty modeloProperty () {
		return modelo;
	}
	
	public String getModelo () {
		return modelo.get();
	}
	
	public void setModelo (String modelo) {
		this.modelo.set(modelo);
	}
	
	
	//-----------
	public StringProperty ramProperty () {
		return ram;
	}
	
	public String getRam () {
		return ram.get();
	}
	
	public void setram (String ram) {
		this.ram.set(ram);
	}
	
	//---------
	public StringProperty procesadorProperty () {
		return procesador;
	}
	
	public String getProcesador () {
		return procesador.get();
	}
	
	public void setprocesador (String procesador) {
		this.procesador.set(procesador);
	}
	
	//----------
	public StringProperty lugarProperty () {
		return lugarInstalacion;
	}
	
	public String getLugar () {
		return lugarInstalacion.get();
	}
	
	public void setlugar (String lugar) {
		this.lugarInstalacion.set(lugar);
	}
	
	
	//-----------
	public StringProperty comentarioProperty () {
		return comentario;
	}
	
	
	public String getComentario () {
		return comentario.get();
	}
	
	
	public void setComentario (String comentario) {
		this.comentario.set(comentario);
	}
	
	
	
	//----------
	public StringProperty nSerieProperty () {
		return nSerie;
	}
	
	public String getNSerie () {
		return nSerie.get();
	}
	
	public void setNSerie (String nSerie) {
		this.nSerie.set(nSerie);
	}
	
	
	
	
	//-----
	public boolean isEmpty () {
		return this.nombre.get().isEmpty();
	}	
	
}
