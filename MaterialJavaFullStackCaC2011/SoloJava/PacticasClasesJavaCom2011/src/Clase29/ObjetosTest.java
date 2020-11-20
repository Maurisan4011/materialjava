package Clase29;

public class ObjetosTest {

	String saludo;

	public static void main(String[] args) {

		// Instancia o copia de la misma clase para usar sus varibles
		ObjetosTest saludo1 = new ObjetosTest();

		// Saludo
		saludo1.saludo = "Hola Buenas tardes Querides alumnes";
		System.out.println("HOY SE CODEA FUERTE \n".concat(saludo1.saludo));

		// Instancia o copia de la misma clase u objeto Persona para usar sus varibles
		Persona persona1 = new Persona("Mauricio", "Sanchez");
		Persona persona2 = new Persona("David", "Gonzales");
		Persona persona3 = new Persona("Natalia ", "Fernandez");

		// Imprimo todos los valores que contienen los Objetos:
		// Persona Perro Gato  de cada instancia o copia del objeto contodos sus atributos
		System.out.println("****************************");
		System.out.println("****************************");
		System.out.println("Cliente 1 : " + persona1.toString());

		System.out.println("\n****************************");
		System.out.println("****************************");
		System.out.println(
				"Cliente 2 : " + persona2.toString());

		System.out.println("\n****************************");
		System.out.println("****************************");
		System.out.println("Cliente 3 : " + persona3.toString());
	}

}
