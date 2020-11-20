package Clase29;

public class Gato {
	
	private String raza;
	
	private Integer edad;

	// constructor vacio
	public Gato() {
		
	}

	@Override
	public String toString() {
		return "\n Los datos de tu gatos son :  raza= " + raza + ", edad= " + edad + "años";
	}
	
	// Constructor que recibe como parametros  raza,  edad
	public Gato(String raza, Integer edad) {
	
		this.raza = raza;
		this.edad = edad;
	}
	// Getters & Setters o metodos  de variables declaradas
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	// Metodo que devuelve un String 
	public static String llorar() {
		return " miau miau";

	}

}
