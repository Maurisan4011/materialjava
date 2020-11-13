package Clase27;

public class Perro {
	
	private String raza;
	
	private String color;
	
	private Double estatura;
	
	private Integer edad;
	

	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", estatura=" + estatura + ", edad=" + edad + "]";
	}

	public Perro(String raza, String color, Double estatura, Integer edad) {
		super();
		this.raza = raza;
		this.color = color;
		this.estatura = estatura;
		this.edad = edad;
	}

	public Perro() {
				
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
	
	
	public static String ladrar() {
		return " guau guau guau!!";
					
	}
	
	public static String comer() {
		return " ñam ñam ñam !!";
					
	}

}
