import java.util.Scanner;

public class MetodoVoidScanner2 {

	static int a = 0;
	static int b = 0;
	static int c = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void sumaEnteros(){
        
		System.out.println("ingrese primer numero:");
		a = sc.nextInt();
		System.out.println("ingrese segundo numero:");
	    b = sc.nextInt();
		c = a + b;
		sc.close();
		System.out.println("la suma es:"+c);

	   }
	
	public static void main(String[] args) {
		
		
		sumaEnteros();
	}
	
}
