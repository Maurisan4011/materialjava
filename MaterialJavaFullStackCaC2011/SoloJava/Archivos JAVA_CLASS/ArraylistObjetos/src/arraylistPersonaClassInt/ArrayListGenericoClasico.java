
package arraylistPersonaClassInt;

import java.util.ArrayList;

public class ArrayListGenericoClasico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<EmpleadoListadoClasico> ListaTrabajadores = new ArrayList<>();
		
		
		ListaTrabajadores.add(new EmpleadoListadoClasico("pepe", 34, 30000)); //indice [0]constructor new EmpleadoList()
		ListaTrabajadores.add(new EmpleadoListadoClasico("sambuceti", 43, 10000));//indice [1]quita sambuceti y coloca pablo
		ListaTrabajadores.add(new EmpleadoListadoClasico("samy", 44, 10000));
		ListaTrabajadores.add(new EmpleadoListadoClasico("sam", 40, 9000)); //indice [2]constructor new EmpleadoList()
		
		EmpleadoListadoClasico  ListaTrab[] = new EmpleadoListadoClasico[ListaTrabajadores.size()];

		ListaTrabajadores.toArray(ListaTrab);//copiamos lo que tenemos 
		                                     //dentro de listaTrabajadores dentro del
		                                     //ListaTrab que acabamos de hacer
		for (int i = 0; i < ListaTrab.length; i++) {
			
			System.out.println(""+ListaTrab[i].TomarDatos());
		}
    }
    
}

class EmpleadoListadoClasico{
	
	private final String nombre;
	private final int edad;
	private final double salario;
	
	public EmpleadoListadoClasico(String nombre, int edad, double salario){
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String TomarDatos(){
		
		return "Nombre: "+nombre+" edad: "+edad+" salario: "+salario;
	}
}


