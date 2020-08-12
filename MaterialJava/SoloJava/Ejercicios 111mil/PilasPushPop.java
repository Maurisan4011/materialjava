import java.util.Stack;
public class PilasPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a PILAS en java!!");//Sysout presiono ctrl+space
		
		Stack <Integer> numeros = new Stack <Integer>();
		
		System.out.println("Introduciendo # "+numeros.push(1));
		System.out.println("Introduciendo # "+numeros.push(2));
		
		System.out.println("Sacando # "+numeros.pop());
		System.out.println("Sacando # "+numeros.pop());
		

	}

}
