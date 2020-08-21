
package HerenciaPalabraSuper_2;

public class Empleado { //SUPER CLASE O CLASE PADRE
    
    private final String nombre;
    private final int legajo;

    public Empleado(String nombre, int legajo) { //CONSTRUCTOR
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public void mostrar(){
    
        System.out.println("el empleado: "+nombre+" tiene el legajo "+legajo);
    }
    
}
