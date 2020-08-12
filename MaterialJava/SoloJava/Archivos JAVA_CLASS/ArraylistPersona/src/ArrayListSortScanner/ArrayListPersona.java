
package ArrayListSortScanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPersona {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {  //try-whith "intentar con esto.."
            ArrayList<Persona> al = new ArrayList<>();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Introduzca nombre: ");
                al.add(new Persona(sc.nextLine())); //agregamos el nombre de la persona
            }
            
            for (int i = 0; i < al.size(); i++) {
                Persona get = al.get(i);
                System.out.print(" "+get.getNombre());
            }
            System.out.println(" ");
            
            Collections.sort(al); //ordenar el array no inverso 
            //Collections.sort(al, Collections.reverseOrder()); //ordenar el array inversamente
            
            for (int i = 0; i < al.size(); i++) {
                Persona get = al.get(i);
                System.out.print(" "+get.getNombre());
            }
            
            System.out.println(" ");
        }
    }
    
}
