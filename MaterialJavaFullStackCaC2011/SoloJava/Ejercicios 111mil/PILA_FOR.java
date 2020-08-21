import java.util.Scanner;
import java.util.Stack;

public class PILA_FOR {
	
	Scanner sc = new Scanner(System.in);
	
	Stack <Integer> apilar = new Stack <Integer>();
	
	public void poner_sacar(){
		System.out.println("introduzca largo vector: ");
		int num = sc.nextInt();
		System.out.println("\n----- Introduciendo Push ------\n");
	
		for(int i = 0; i <= num; i++){
		
			int entrada = apilar.push(i);
			System.out.println("Introduciendo # "+entrada);
		
		}
		
		System.out.println("\n----- Salida Pop ------\n");
		
    	for(int i = 0; i <= num; i++){
		
    		System.out.println("Sacando # "+apilar.pop());
		
    	}
	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PILA_FOR por =new PILA_FOR();
		por.poner_sacar();
	

	}

}
