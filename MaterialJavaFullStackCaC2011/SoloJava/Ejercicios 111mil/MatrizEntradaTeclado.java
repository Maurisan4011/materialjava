import java.util.Scanner;

public class MatrizEntradaTeclado {

	//arreglo bidimensional
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduzca FILA de 3: ");
		int FILA = sc.nextInt();
		
		System.out.println(" Introduzca COLUMNA de 3: ");
		int COLUMNA = sc.nextInt();
		
		int VECTOR[][] = new int[FILA][COLUMNA]; //arreglo de 3x3 de 3 filas y 3 columnas
	
		System.out.println(" Arreglo maximo de 3 x 3");
		System.out.println(" Arreglo de  ["+FILA+"] x ["+COLUMNA+"]");
		System.out.println(" introduzca primer numero: ");
		VECTOR[0][0]= sc.nextInt();
		System.out.println(" introduzca segundo numero: ");
		VECTOR[0][1]= sc.nextInt();
		System.out.println(" introduzca tercer numero: ");
		VECTOR[0][2]= sc.nextInt();
		System.out.println(" introduzca cuarto numero: ");
		VECTOR[1][0]= sc.nextInt();
		System.out.println(" introduzca quinto numero: ");
		VECTOR[1][1]= sc.nextInt();
		System.out.println(" introduzca sexto numero: ");
		VECTOR[1][2]= sc.nextInt();
		
		sc.close();
		
		System.out.println(" Vector ["+VECTOR[0][0]+"]");
		System.out.println(" Vector ["+VECTOR[0][1]+"]");
		System.out.println(" Vector ["+VECTOR[0][2]+"]");
		System.out.println(" Vector ["+VECTOR[1][0]+"]");
		System.out.println(" Vector ["+VECTOR[1][1]+"]");
		System.out.println(" Vector ["+VECTOR[1][2]+"]");
	
	}

}
