import java.util.Scanner;
import java.util.Stack;

public class PilasPopPushWhile1 {

	public static void main(String[] args) {
	
		   System.out.println("\nBienvenido a PILAS en java!!\n");//Sysout presiono ctrl+space
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Introducir largo del array: ");
			int num = sc.nextInt();
			
			Stack <Integer> numeros = new Stack <Integer>();
			
			System.out.println("\n----- Introduciendo Push ------\n");
			
			for(int i = 0; i <= num; i++){
				
				System.out.println("Introduciendo # "+numeros.push(i));
				
			}
			
			System.out.println("\n----- Salida Pop ------\n");
			
	       while(!numeros.empty()){
	    	   
	    	   System.out.println("Sacando el #"+numeros.pop());
	       }
	       
	           System.out.println("\nLa Pila esta vacia...");
	           
	           sc.close();
	}

}
