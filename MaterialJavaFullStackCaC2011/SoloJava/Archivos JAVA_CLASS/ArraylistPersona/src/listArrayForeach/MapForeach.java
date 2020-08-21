
package listArrayForeach;
import java.util.Map;
import java.util.HashMap;


public class MapForeach {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, Integer> items = new HashMap<>();
            items.put("A", 10);
            items.put("B", 20);
            items.put("C", 30);
            items.put("D", 40);
            items.put("E", 50);
            items.put("F", 60);

        items.forEach((k,v)->System.out.println("Item : " + k + " Cont : " + v));

        System.out.println(" ");
        
        items.forEach((k,v)->{
                System.out.println("Item : " + k + " Cont : " + v);
                if("E".equals(k)){
                        System.out.println("Hola E: "+v);
                }
        });
    }
    
}
