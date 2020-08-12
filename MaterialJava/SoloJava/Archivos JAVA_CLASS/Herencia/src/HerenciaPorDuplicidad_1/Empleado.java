
package HerenciaPorDuplicidad_1;

public class Empleado {
    
    private final String nombre;
    private final int legajo;

    public Empleado(String nombre, int legajo) { //CONSTRUCTOR
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public void mostrarEmpleado(){
    
        System.out.println("el empleado: "+nombre+" tiene el legajo "+legajo);
    }
}
