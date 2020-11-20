package Clase29;

public class Perro {

	private String raza;

	private String color;

	private Double estatura;

	private Integer edad;

	// constructor vacio
	public Perro() {

	}

	// Constructor que recibe como parametros  raza,  color,  estatura edad
	public Perro(String raza, String color, Double estatura, Integer edad) {
	
		this.raza = raza;
		this.color = color;
		this.estatura = estatura;
		this.edad = edad;
	}

	// Getters & Setters de variables declaradas
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	// Metodo que imprime todos los valores que contienen las variables:
	//raza color estatura edad
	@Override
	public String toString() {
		return " \n Los datos de tu Perros son : raza= " + raza + " color= " + color + ", estatura= " + estatura + ", edad= "
				+ edad +"años";
	}

	// Metodo que devuelve un String 
	public static String ladrar() {
		return " guau guau guau!!";

	}
	// Metodo que devuelve un String 
	public static String comer() {
		return " ñam ñam ñam !!";

	}
	


}
