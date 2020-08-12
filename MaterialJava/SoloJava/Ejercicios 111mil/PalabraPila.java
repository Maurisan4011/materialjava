import java.util.Scanner;
import java.util.Stack;


public class PalabraPila {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Stack <Character> pila = new Stack <Character>();
		
		System.out.print("Introducir Palabra: ");
		String cadena = sc.nextLine();
		
		char letras[] = cadena.toCharArray();
		
		for(int i = 0; i < letras.length; i++){
			
			pila.push(letras[i]);
			System.out.print(letras[i]+" , ");
			
		}
		
		System.out.println("\n----- Salida Pop invertida ------\n");
		
		while(!pila.empty()){
			
			System.out.print(pila.pop()+" , ");
			
		}
			sc.close();
	}

}
