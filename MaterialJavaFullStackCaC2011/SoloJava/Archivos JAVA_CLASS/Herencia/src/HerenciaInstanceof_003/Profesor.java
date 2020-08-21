
package HerenciaInstanceof_003;

public class Profesor extends Persona{
    
    private String categoria;

    public Profesor(String categoria, String nombre, String apellido) {
        super(nombre, apellido);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    
    
}
