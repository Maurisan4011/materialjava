
package listArrayForeach;
import java.util.ArrayList;
import java.util.List;

public class ListForeach {

    public static void main(String[] args) {
        // Bucle for normal para realizar un bucle en una lista.
        
        List<String> items = new ArrayList<>();
            items.add("A");
            items.add("B");
            items.add("C");
            items.add("D");
            items.add("E");

        for(String item : items){
                System.out.println(item);
        }
    }
    
}
