
package listArrayForeach;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDeContactIterator {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList contactos = new ArrayList(); //arraylist objetos
        
        contactos.add("Alberto");
        contactos.add(41);
        
        for (Iterator it = contactos.iterator(); it.hasNext();) {
            Object contacto = it.next(); //super clase object
            System.out.println(" "+contacto);
        }
        
        
    }
    
}
