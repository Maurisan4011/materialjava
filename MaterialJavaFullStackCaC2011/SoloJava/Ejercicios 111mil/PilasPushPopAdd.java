import java.util.Stack;

public class PilasPushPopAdd {

	public static void main(String[] args) {
		
		/*CLASE STACK DE JAVA_ ctrl + space = print*/
		Stack<Integer> apilar = new Stack<Integer>();
		
		apilar.add(10); //con este puedes agregarle el indice
		apilar.add(20);  //agregando a una lista o a una cola
		apilar.add(30);  //encuanto a pila esto esta mal se debe usar push
		apilar.add(40);
		apilar.add(50);
		
		
		System.out.println("El ultimo objeto es: "+apilar.peek());
		System.out.println("El tamaño de la pila es de "+apilar.size()+" objetos");
		
		System.out.println("Sacando el ultimo objeto de la pila "+apilar.pop());
		System.out.println("Sacando el Ante Penultimo objeto de la pila "+apilar.pop());
		
		System.out.println("El tamaño actual de la pila es de "+apilar.size()+" objetos");
		
	}

}
