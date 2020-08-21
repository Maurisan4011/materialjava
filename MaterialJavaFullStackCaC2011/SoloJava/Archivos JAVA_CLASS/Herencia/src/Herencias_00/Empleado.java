
package Herencias_00;

public class Empleado {
    
    private final String nombre;
    private final int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public void mostrar(){
    
        System.out.println("El empleado "+nombre+" tiene legajo "+legajo);
    }
    
}
