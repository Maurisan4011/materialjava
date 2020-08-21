
package arraylistobjetos;

public class ArraylistObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        
        o1.setS("dato 1º");
        o2.setS("dato 2º");

        lista.add(o1);
        lista.add(o2);

        lista.show();
        
    }
    
}
