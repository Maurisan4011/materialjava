import java.util.Scanner;

public class MetodoVoidScanner {
	  
	  public static void sumaEnteros(){
           
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese primer numero:");
		int a = sc.nextInt();
		System.out.println("ingrese segundo numero:");
		int b = sc.nextInt();
		int c = a + b;
		sc.close();
		System.out.println("la suma es:"+c);

	   }
	
	public static void main(String[] args) {

		sumaEnteros();
		
	}

}
