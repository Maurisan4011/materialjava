
package Herencias_04;

public class Empleado {
    
    final int legajo;
    final String nombre;

    public Empleado(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }
    
    public void mostrar(){
    
        System.out.print("El empleado "+nombre+" tiene legajo "+legajo);
    }
    
}
