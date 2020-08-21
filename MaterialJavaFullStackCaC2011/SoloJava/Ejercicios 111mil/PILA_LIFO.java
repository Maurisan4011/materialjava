import java.util.Scanner;
import java.util.Stack;

public class PILA_LIFO {
	Scanner sc = new Scanner(System.in);
	
	public void poner_sacar(){
		
		Stack <Integer> apilar = new Stack <Integer>();
		int DATO1,DATO2,DATO3;
		
		System.out.println("Ingrese dato 1: ");
		DATO1 = sc.nextInt();
		int PILA1 = apilar.push(DATO1);
		
		System.out.println("Ingrese dato 2: ");
		DATO2 = sc.nextInt();
		int PILA2 = apilar.push(DATO2);
		
		System.out.println("Ingrese dato 3: ");
		DATO3 = sc.nextInt();
		int PILA3 = apilar.push(DATO3);
		
		System.out.println(" Dato 1 = "+PILA1);
		System.out.println(" Dato 2 = "+PILA2);
		System.out.println(" Dato 3 = "+PILA3);
	
		System.out.println(" Sacamos ="+apilar.pop());
		System.out.println("El ultimo objeto es: "+apilar.peek());
		System.out.println("El tamaño actual de la pila es de "+apilar.size()+" objetos");
		System.out.println("¿ La Pila esta vacia ?"+apilar.isEmpty());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PILA_LIFO p = new PILA_LIFO();
		p.poner_sacar();
	
		
		

	}

}
