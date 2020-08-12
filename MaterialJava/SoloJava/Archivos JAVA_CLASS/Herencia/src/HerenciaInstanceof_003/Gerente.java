
package HerenciaInstanceof_003;

public class Gerente extends Persona{
    
    private final String rango;

    public Gerente(String rango, String nombre, String apellido) {
        super(nombre, apellido);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
}
