
package LambdaArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaArrayListas {
    
    public void ordenar(){
    
         List<String> items = new ArrayList<>();
    
            items.add("D");
            items.add("C");
            items.add("E");
            items.add("A");
            items.add("B");
            
            /***FORMA ANTIGUA LAMBDA***/
            Collections.sort(items, new Comparator <String>(){
             @Override
             public int compare(String t, String t1) {
                 return t.compareTo(t1);
             }
            
            });
            
//            /***FORMA SEMIACTUAL LAMBDA**/
//            Collections.sort(items,(String t, String t1) -> t.compareTo(t1));
            
//            /***FORMA ACTUAL LAMBDA**/
//            Collections.sort(items, String::compareTo);//lo de arriba equivale a esto
//            items.forEach((item) -> { //equivale a lo de abajo foreach + lambda
//            System.out.println(" "+item);
//            });
            for (String item : items) {
            
                System.out.println(" "+item);
            }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        LambdaArrayListas lb = new LambdaArrayListas();
        lb.ordenar();
    }
    
}
