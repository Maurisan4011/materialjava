import java.util.Scanner;

public class MetodoVoidScanner3 {

	public int a = 0;
	public int b = 0;
	public int c = 0;
	Scanner sc = new Scanner(System.in);
	
	public int sumaEnteros(){  //si coloco void me sale error por el tipo de retorno      
		
		System.out.println("ingrese primer numero:");
		a = sc.nextInt();
		System.out.println("ingrese segundo numero:");
	    b = sc.nextInt();
		c = a + b;
		sc.close();
		
	    return c;

	 }
	
	public static void main(String[] args) {
	
		//int x = sumaEnteros();//asi sale error colocarla static
		
		MetodoVoidScanner3 sum = new MetodoVoidScanner3();
		int suma = sum.sumaEnteros();
		
		System.out.println("La suma es: "+suma);

	}

}
