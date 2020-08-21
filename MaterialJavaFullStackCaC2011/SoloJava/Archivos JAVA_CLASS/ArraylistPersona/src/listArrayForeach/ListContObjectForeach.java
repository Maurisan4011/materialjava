
package listArrayForeach;

import java.util.ArrayList;

public class ListContObjectForeach {

    public static void main(String[] args) {
        // TODO code application logic here
        
         ArrayList<String> contactos = new ArrayList<>(); //arraylist objetos
        
        contactos.add("Alberto");
        
        contactos.forEach((contacto) -> {
            System.out.println(""+contacto);
        });
        
    }
    
}
