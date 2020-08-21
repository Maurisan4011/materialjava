
package Herencias_00;

public class TestMain {

    public static void main(String[] args) {
        // TODO code application logic hre
        Gerente ger = new Gerente("pepe", 1234, "25A");
        ger.mostrar();
        Empleado emp = new Empleado("dani", 3214);
        emp.mostrar();
        
        /***AQUI NO HAY SOBRE ESCRITURA DE METODOS PORQUE CADA CLASE ES INDEPENDIENTE
         PERO EN CADA CLASE HAY DUPLICIDAD DE INFORMACION***/
    }
    
}
