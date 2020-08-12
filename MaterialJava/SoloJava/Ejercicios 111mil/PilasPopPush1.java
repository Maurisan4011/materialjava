import java.util.Stack;

public class PilasPopPush1 {

	public static void main(String[] args) {
		
		/*CLASE STACK DE JAVA_ ctrl + space = print*/
		Stack<Integer> apilar = new Stack<Integer>();
		
		System.out.println("¿La Pila esta vacia? :"+apilar.isEmpty()+" (si es true = verdadero , false = falso)");
		
		apilar.push(10); 
		apilar.push(20);  
		apilar.push(30);  
		apilar.push(40);
		apilar.push(50);
		
		
		System.out.println("El ultimo objeto es: "+apilar.peek());
		System.out.println("El tamaño de la pila es de "+apilar.size()+" objetos");
		
		System.out.println("Sacando el ultimo objeto de la pila "+apilar.pop());
		System.out.println("Sacando el Ante Penultimo objeto de la pila "+apilar.pop());
		
		System.out.println("El tamaño actual de la pila es de "+apilar.size()+" objetos");
		System.out.println("¿ La Pila esta vacia ?"+apilar.isEmpty());

	}

}
