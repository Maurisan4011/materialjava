
package HerenciaInstanceof_003;

public class Persona {  //CLASE PADRE
    
    /***ESTA CLASE NO TIENE DEFINIDO EL RANGO NI LA CATEGORIA**/
    protected String nombre, apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
      
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
