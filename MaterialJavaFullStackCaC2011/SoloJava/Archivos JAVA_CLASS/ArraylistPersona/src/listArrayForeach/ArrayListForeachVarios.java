
package listArrayForeach;
import java.util.ArrayList;
import java.util.List;

public class ArrayListForeachVarios {

    public static void main(String[] args) {
        // TODO code application logic here
        
    List<String> items = new ArrayList<>();
    
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //expresion lamba: ¿que son? metodo anonimo que no necesita de un identificador
        //para ser invocado "foreach + lambda": (parametros)-> expresion o "metodo a evaluar"
        //Salida : A,B,C,D,E
        items.forEach(item->System.out.println(item));

        //Salida : C
        items.forEach(item->{
                if("C".equals(item)){
                        System.out.println("Soy: "+item);
                }
        });

        //metodo de referencia
        //Salida : A,B,C,D,E
        items.forEach(System.out::println);

        //Flujo y filtro, si coloco "A,B,C,D,E" salen en pantalla otra cosa "NO"
        //Salida : B
        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
            }
    
}
