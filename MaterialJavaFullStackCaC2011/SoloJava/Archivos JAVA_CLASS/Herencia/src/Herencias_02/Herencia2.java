
package Herencias_02;

public class Herencia2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nieta n = new Nieta();
        n.apellido = "Gonzales";
        System.out.println(" Soy la nieta y heredo el apellido de mi abuelo:  "+n.apellido);
        n.mostrar();
        
        Hija2 h = new Hija2();
        h.apellido = "Gonzales";
        System.out.println("\nSoy su hija y heredo el apellido de mi padre: "+h.apellido);
        h.mostrar();
        
        Padre2 p = new Padre2();
        p.apellido = "Gonzales";
        System.out.println("\n yo soy su padre: "+p.apellido);
        p.mostrar();
        
        
        
    }
    
}
