package Varios;
import java.util.Scanner;

public class Array7Scanner {
	public static final int MAX = 200;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nombre;
		int i=0;
		char opc = 's';
		System.out.println("Ingrese Nombre: ");
		nombre = sc.nextLine();
		while (i<=MAX){
			System.out.println("Desea seguir cargando nombres? (s/n): ");
			opc = sc.next().charAt(0); //Permite ingresar un caracter en este caso (s/n)
			while(opc == 's'){
				System.out.println("Ingrese Nombre: ");
				nombre = sc.nextLine();
				System.out.println("Desea seguir cargando nombres? (s/n): ");
				opc = sc.next().charAt(0);
			}
			System.out.println("Hasta luego!");
			i++;
		}
	}
}
