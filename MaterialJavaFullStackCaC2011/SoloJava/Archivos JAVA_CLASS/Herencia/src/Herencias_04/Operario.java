
package Herencias_04;

public class Operario extends Empleado{
    
    private final int horasDeTrabajo;

    public Operario(int horasDeTrabajo, int legajo, String nombre) {
        super(legajo, nombre);
        this.horasDeTrabajo = horasDeTrabajo;
    }
   
    @Override
    public void mostrar(){ //sobre escritura de metodo
        
        super.mostrar(); //metodo de la super clase o clase padre
        System.out.println(" y tiene "+horasDeTrabajo+" horas de trabajo");
        //System.out.println("El operario "+nombre+" tiene legajo "+legajo+" y tiene "+horasDeTrabajo+" horas de trabajo");
    }
    
}
