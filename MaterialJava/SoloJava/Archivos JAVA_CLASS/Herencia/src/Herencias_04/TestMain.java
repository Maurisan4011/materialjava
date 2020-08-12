
package Herencias_04;

public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger = new Gerente("23a", 1234, "pepe");
        ger.gerente();
       
        Empleado emp = new Operario(12, 1245, "paco");
        emp.mostrar();
        
        
    }
    
}
