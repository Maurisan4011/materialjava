
package atributos_00;

public class TestPerro2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro2 pastor = new Perro2();
        
        pastor.color = "marron";
        pastor.raza = "Pastor";
        pastor.nombre = "firulay";
        pastor.edad = 2;
        
        pastor.mostrarAtributos();
        pastor.ladrar();
        
    }
    
}
