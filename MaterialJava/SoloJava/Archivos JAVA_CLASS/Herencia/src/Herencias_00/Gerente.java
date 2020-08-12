
package Herencias_00;

public class Gerente {
    
    private final String nombre;
    private final int legajo;
    private final String departamento;

    public Gerente(String nombre, int legajo, String departamento) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.departamento = departamento;
    }
    
    
    public void mostrar(){
    
        System.out.println("El empleado "+nombre+" tiene legajo "+legajo+" el departamento es "+departamento);
    }
    
}
