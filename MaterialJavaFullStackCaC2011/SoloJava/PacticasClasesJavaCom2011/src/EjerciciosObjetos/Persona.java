package EjerciciosObjetos;

public class Persona {

	// Declaro variable

	private String nombre;

	private Integer dni;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	
	
	public static String saludar(String nombre) {

		return  ("Holaaaaa :" .concat(nombre));

	}
    
	
}
