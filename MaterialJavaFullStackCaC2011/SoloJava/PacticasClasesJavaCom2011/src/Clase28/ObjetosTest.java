package Clase28;

public class ObjetosTest {

	String saludo;

	public static void main(String[] args) {

		// Instancia o copia de la misma clase para usar sus varibles
		ObjetosTest saludo1 = new ObjetosTest();
		
		// Saludo
		saludo1.saludo = "Hola Buenas tardes Querides alumnes";
		System.out.println("linea 14 ".concat(saludo1.saludo));

		// Instancia o copia de la misma clase u objeto Persona para usar sus varibles
		Persona persona1 = new Persona("Mauricio", "Sanchez");
		Persona persona2 = new Persona("Davis ", "Gonzales");
		Persona persona3 = new Persona("Natalia ", "Fernandez");

		// Instancia o copia de la misma clase u objeto  para usar sus varibles
		Perro perro1 = new Perro("boxer", "cafe", 1.8, 2);
		Perro perro2 = new Perro("dalmata", "blanco", 10.2, 3);
		Perro perro3 = new Perro("chihuahua", "negro", 1.3, 5);

		// Imprimo todos los valores que contienen los Objetos:
		//Persona Perro de cada instancia o copia del objeto declarado en el main 
		
		System.out.println("****************************");
		System.out.println("Cliente 1 : " + persona1.toString() +"\n"
				+ " los datos de tu mascota son: \n" + perro1.toString()
				+ " Y ladra Mucho " + Perro.ladrar());
		
		System.out.println("****************************");
		System.out.println("Cliente 2 : " + persona2.toString() +"\n"
				+ "Los datos de tu mascota son: \n" + perro2.toString()
				+ " Y come mucho " + Perro.comer());
		
		System.out.println("****************************");		
		System.out.println("Cliente 3 : " + persona3.toString() +"\n"
				+ "los datos de tu mascota son: \n" + perro3.toString()
				+ " Y ladra Mucho  " + Perro.ladrar());

	}

}
