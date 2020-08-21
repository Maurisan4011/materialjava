
package Herencias_04;

public class Gerente extends Empleado{
    
    private final  String departamento;

    public Gerente(String departamento, int legajo, String nombre) {
        super(legajo, nombre);
        this.departamento = departamento;
    }

    public void gerente(){
    
        super.mostrar();
        System.out.println("\nEl gerente "+nombre+" tiene legajo "+legajo+" el departamento es "+departamento+"\n");
    }
    
}
