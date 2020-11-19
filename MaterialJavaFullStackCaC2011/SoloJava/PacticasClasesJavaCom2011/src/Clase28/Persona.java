package Clase28;

public class Persona {

	private String nombre;

	private String apellido;

	// constructor vacio
	public Persona() {

	}

	// Getters & Setters de variables declaradas
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Constructor que recibe como parametros nombre y aperrilo
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Metodo que imprime todos los valores que contienen las variables
	@Override
	public String toString() {
		return " Los datos de la Persona son: [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
