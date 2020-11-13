package EjerciciosObjetos;

public class Perro {

	private String nombre;
	
	private String raza;
	
	private String color;
	
	private Integer edad;
	
	
	public Perro(String nombre, String raza, String color, Integer edad) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Perro nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + "";
	}


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


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public static String ladrar() {
		
		return "gua gua gua!!";
	}
	
}
