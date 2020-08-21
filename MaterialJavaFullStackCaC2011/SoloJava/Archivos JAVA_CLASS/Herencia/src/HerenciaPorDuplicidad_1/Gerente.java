
package HerenciaPorDuplicidad_1;

public class Gerente {
    
    private final String nombre; //no acepta la palabra reservada "final" da error si la colocamos sin constructor
    private final int legajo;
    private final String departamento;

    public Gerente(String nombre, int legajo, String departamento) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.departamento = departamento;
    }
    
    public void mostrarGerente(){
    
        System.out.println("el empleado: "+nombre+" tiene el legajo "+legajo+" El departamento es "+departamento);
    }
    
}
