
package ArrayListSortScanner;

public class Persona implements Comparable<Persona>{ //implementamos la interface comparable

    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    @Override
    public int compareTo(Persona t) {
       int compara = this.nombre.compareTo(t.nombre);
        if (compara < 0) {
            return -1; // este numero es pequeño
        }
        if (compara > 0) {
            return 1; // este numero es grande
        }
        return 0;
    }
    
}
