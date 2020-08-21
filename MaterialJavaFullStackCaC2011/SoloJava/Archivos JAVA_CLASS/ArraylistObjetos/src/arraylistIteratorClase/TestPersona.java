
package arraylistIteratorClase;

import java.util.ArrayList;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> ListaTrabajadores = new ArrayList<>();

		ListaTrabajadores.add(new Persona("pepe", 34, 30000)); //indice [0]constructor new EmpleadoList()
		ListaTrabajadores.add(new Persona("sambuceti", 43, 10000));//indice [1]quita sambuceti y coloca pablo
		ListaTrabajadores.add(new Persona("samy", 44, 10000));
		ListaTrabajadores.add(new Persona("sam", 40, 9000)); //indice [2]constructor new EmpleadoList()
		
		Persona  ListaTrab[] = new Persona[ListaTrabajadores.size()];

		ListaTrabajadores.toArray(ListaTrab);//copiamos lo que tenemos 
		                                     //dentro de listaTrabajadores dentro del
		                                     //ListaTrab que acabamos de hacer
		for (int i = 0; i < ListaTrab.length; i++) {
			
			System.out.println(""+ListaTrab[i].TomarDatos());
		}
    }
    
}
