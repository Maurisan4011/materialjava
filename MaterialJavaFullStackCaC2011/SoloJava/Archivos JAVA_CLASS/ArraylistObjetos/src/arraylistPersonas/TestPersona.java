
package arraylistPersonas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Persona> lista = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
      
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Persona ["+i+"]: ");
            String nombre = sc.nextLine();
            Persona p = new Persona(nombre);
            lista.add(p);
        }
        
        System.out.println("***********************");
        for (int i = 0; i < lista.size(); i++) {
            Persona per = lista.get(i);
            System.out.println("nombre: "+per.getNombre());
        }
 
    }
    
}
