
package ArrayListComparable_Id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("carlos","rodriguez",23); //nombre, apellido, id
        Persona p2 = new Persona("roberto","garcia",29);
        Persona p3 = new Persona("daniel","zarate",34);
        
        List<Persona> per = new ArrayList<>();
        per.add(p1); //agregamos personas a nuestra lista
        per.add(p2);
        per.add(p3);
        
        /***ORDENAR EL OBJETO DE TIPO LIST CON METODO SORT DE LA CLASE COLLECTIONS**/
        Collections.sort(per);
        
        per.forEach((persona) -> {
            System.out.println(" "+persona);
        });
    }
    
}
