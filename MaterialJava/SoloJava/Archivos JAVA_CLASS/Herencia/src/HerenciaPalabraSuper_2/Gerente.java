
package HerenciaPalabraSuper_2;

public class Gerente extends Empleado{ //gerente hereda los atributos y metodos de empleado
    
    private final String departamento;

    public Gerente(String departamento, String nombre, int legajo) { //CONSTRUCTOR
        super(nombre, legajo); // de la misma manera que "this" apunta al objeto actual 
                                //tenemos otra palabra reservada "super" que apunta a la clase 
                                //por la cual se deriva "super clase" o clase padre
                                //con esto "invoco metodos constructores" de la super clase
        this.departamento = departamento; //"this" apunta al objeto
    }
    
    @Override
    public void mostrar(){ //sobre escritura de metodo
    
        super.mostrar(); //llamando al metodo de la clase padre o super clase
        System.out.println("el Depto es "+departamento);
    }
    
}
