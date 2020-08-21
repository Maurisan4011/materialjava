

package arraylistobjetos;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    
    private final List<Obj> lista = new ArrayList<>();

    public void add(Obj o){
        lista.add(o);
    }

    public void show(){
        lista.forEach((o) -> {
            System.out.println(o.getS());
        });
    }
    
}
