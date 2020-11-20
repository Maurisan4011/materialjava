package Clase29;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;

	private String apellido;

	private List<Perro> perro;

	private List<Gato> gato;

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
		this.perro = new ArrayList<Perro>();
		this.gato = new ArrayList<Gato>();

		// Instancia o copia de la misma clase u objeto para usar sus varibles
		Perro perro1 = new Perro("boxer", "cafe", 1.8, 2);
		Perro perro2 = new Perro("dalmata", "blanco", 10.2, 3);
		Perro perro3 = new Perro("chihuahua", "negro", 1.3, 5);
		this.perro.add(perro1);
		this.perro.add(perro2);
		this.perro.add(perro3);

		// Instancia o copia de la misma clase u objeto para usar sus varibles
		Gato gato1 = new Gato("persa", 1);
		Gato gato2 = new Gato("siames", 2);
		this.gato.add(gato1);
		Gato.llorar();
		this.gato.add(gato2);
	}

	@Override
	public String toString() {
		return "Los datos de la Persona son: nombre= " + nombre + ", apellido= " + apellido + "\n Tus Mascotas son: "
				+ "\n ****** " + perro + "\n ****** " + gato;
	}
}
