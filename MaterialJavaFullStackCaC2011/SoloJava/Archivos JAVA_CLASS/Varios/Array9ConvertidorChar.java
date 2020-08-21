package Varios;

public class Array9ConvertidorChar {

	public static void main(String[] args) {
		String nombre = "pepe";
		char arrayChar[]= nombre.toCharArray();
		for (int i=0; i<arrayChar.length; i++){
			System.out.println("El caracter ["+i+"] es: " +arrayChar[i]);
		}
		System.out.println("\n El numero de caracter es: " +arrayChar.length);
	}
}
