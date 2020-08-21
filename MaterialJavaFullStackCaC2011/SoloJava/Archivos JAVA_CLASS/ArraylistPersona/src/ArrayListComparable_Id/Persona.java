
package ArrayListComparable_Id;

public class Persona implements Comparable<Persona>{

    private String nombre, apellido;
    private Integer id;

    public Persona(String nombre, String apellido, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + '}'+"\n";
    }
    
    
    
    @Override
    public int compareTo(Persona t) {
        return nombre.compareTo(t.getNombre()); //lo hara con respecto al "nombre" podemos hacerlo con "id"
    }
    
}
