
package linkedlist_cfp_nº1;

import java.util.LinkedList;
import java.util.List;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Persona> listaprueba = new LinkedList<>();
        
        for (int i = 0; i < 3; i++) {
            
            Persona per = new Persona(" "," "," ");
            System.out.println("Instanciamos la persona nº "+(i+1)+"");
            per.getNombre();
            per.getApellido();
            per.getDni();
            listaprueba.add(per);
        }
        
        for (int i = 0; i < listaprueba.size(); i++) {
            Persona get = listaprueba.get(i);
            System.out.println(" "+get);
            
        }
    }
    
}
