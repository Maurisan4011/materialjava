package EjerciciosObjetos;

public class EjerciciosObjetosTest {
	

		String nombre ;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjerciciosObjetosTest persona5 = new EjerciciosObjetosTest();
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
        String saludoPersona1;
        
        persona5.nombre ="Hola  desde instancia interna";
        
        System.out.println(persona5.nombre);
        
        
        Perro perroPersona1 = new Perro("branca", "boxer", "cafe", 2);
	    
		
		persona1.setNombre("Juan Marcelo");
		saludoPersona1 = Persona.saludar(persona1.getNombre());
		
		
//		persona2.setNombre(Persona.saludar() + ": Lorena");
//	
		
		
	
		System.out.println(saludoPersona1);
		System.out.println("Tenes un "+ perroPersona1.toString() +
				" años y ladra muchoo :( ".concat(Perro.ladrar()));
		
//		System.out.println(persona1.getNombre());
//		System.out.println(persona2.getNombre());
	}

}
