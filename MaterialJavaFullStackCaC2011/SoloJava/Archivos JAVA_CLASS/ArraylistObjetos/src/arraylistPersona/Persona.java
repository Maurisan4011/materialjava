
package arraylistPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {

    private String nombre;

    public Persona() {
        this.nombre= "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Persona> lista = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
      
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println("Persona ["+i+"]: ");
            String nombre = sc.nextLine();
            Persona p = new Persona();
            p.setNombre(nombre);
            lista.add(p);
        }
        
        System.out.println("***********************");
        for (int i = 0; i < lista.size(); i++) {
            Persona get = lista.get(i);
            System.out.println("nombre: "+get.getNombre());
        }
                
     }
    
}
