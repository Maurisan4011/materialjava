import java.util.Scanner;
import java.util.Stack;

public class PILA_OUT_IN {

	Scanner sc = new Scanner(System.in);
	Stack <Integer> apilar = new Stack <Integer>();
    public void poner(){
		
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
    }

     public void sacar(){
	
    	 System.out.println(" Sacamos ="+apilar.pop());
 		System.out.println("El ultimo objeto es: "+apilar.peek());
 		System.out.println("El tamaño actual de la pila es de "+apilar.size()+" objetos");
 		System.out.println("¿ La Pila esta vacia ?"+apilar.isEmpty());
	
     }
	
	public static void main(String[] args) {
		
		PILA_OUT_IN p = new PILA_OUT_IN();
		p.poner();
		p.sacar();
	

	}

}
