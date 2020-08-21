
package arraylistPersonitas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Persona> lista = new ArrayList<>();
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
      
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Persona ["+i+"]: ");
            String nombre = sc1.nextLine();
            System.out.println("Dni ["+i+"]: ");
            int dni = sc2.nextInt();
            Persona p = new Persona(nombre,dni);
            lista.add(p);
        }
        
        System.out.println("***********************");
        for (int i = 0; i < lista.size(); i++) {
           Persona per = lista.get(i);
            System.out.println("nombre: "+per.getNombre()+" y con Dni: "+per.getDni());
        }
    }
    
}
