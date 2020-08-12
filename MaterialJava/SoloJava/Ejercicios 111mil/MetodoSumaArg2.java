import java.util.Scanner;

public class MetodoSumaArg2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Operaciones2 calc = new Operaciones2(); //instanciacion de la clase Operaciones
		System.out.println("introduzca primer numero: ");
		int a = sc.nextInt();
		System.out.println("introduzca segundo numero: ");
		int b = sc.nextInt();
        int x;
        x = calc.sumaEnteros(a,b); //retorna el resultado de la suma y la aloja en “x”
        sc.close();
     //lo de arriba seria como escribir: calc.(return c); aunque no se   escribe asi sino que se coloca
     // el nombre del metodo y argumentos que equivaldria : sumaEntero(2,3) = (return c) esta
     // tomando el resultado y guardandolo en la variable (x) 

        System.out.println("la suma es:"+x);

	}

}
