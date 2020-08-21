
package ArrayListSortScanner;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortCollection {

    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> mensajes = Arrays.asList(new String[] { "Tercero", "Segundo","Primero"});
        
        Collections.sort(mensajes, new Comparator <String>(){ //list trabaja con collection no Array.sort
             @Override
             public int compare(String t, String t1) {  //compara string1 con string2
                 return t.compareTo(t1);
             }
            
            });
	mensajes.forEach(System.out::println);
    }
    
}
