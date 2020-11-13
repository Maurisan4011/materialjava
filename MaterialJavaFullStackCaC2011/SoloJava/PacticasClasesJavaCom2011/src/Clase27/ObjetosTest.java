package Clase27;

public class ObjetosTest {

	String saludo; 
	
	public static void main(String[] args) {
		
		//Instancia o copia de la misma clase para usar sus varibles
		ObjetosTest saludo1 = new ObjetosTest();
		//Saludo
		saludo1.saludo = "Hola Buenas tardes Querides alumnes";
		System.out.println("linea 14 ".concat(saludo1.saludo));
		
		 Perro perro1 = new Perro();
		 Perro perro2 = new Perro();
		 
		 perro1.setRaza("boxer");
		 perro2.setRaza("chihuahua");
		 
		 Perro perro3 = new Perro("Dalmate", "blanco", 1.20 , 2);	 
		 
		 Persona persona = new Persona("Fiorella", "Usunoff");
		 
		
		 
		 System.out.println("perro 1: "+ perro1.getRaza()+ " y ladra mucho!!  ".concat(Perro.ladrar()));
		 System.out.println("perro 2: "+ perro2.getRaza()+ " y come mucho!!  ".concat(Perro.comer()));
//		 System.out.println("perro 3 "+ " color: " + perro3.getColor()+" raza:"+ perro3.getRaza());
		 System.out.println("El dueño del perro 3 es" + persona .toString());
		 System.out.println("perro 3 "  + perro3.toString()+"y ladra muchoo  "+ 
		 Perro.ladrar().concat(Perro.comer()));
		 
		
	}

}
