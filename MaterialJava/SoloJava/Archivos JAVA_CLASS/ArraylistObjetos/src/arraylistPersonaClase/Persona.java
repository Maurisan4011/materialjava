
package arraylistPersonaClase;

public class Persona {
    
    private final String nombre;
    private final int edad;
    private final double salario;

    public Persona(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
	
	
	
	public String TomarDatos(){
		
		return "Nombre: "+nombre+" edad: "+edad+" salario: "+salario;
	}
    
}
