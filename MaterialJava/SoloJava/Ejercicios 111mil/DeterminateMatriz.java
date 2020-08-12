import java.util.Scanner;

public class DeterminateMatriz {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int det;
		int deltax;
		int deltay;
		int ti1=2;
		int ti2=4;
		int x;
		int y;
		int ecuacion1;
		int ecuacion2;
		System.out.println("Introduzca # filas: ");
		int fila=sc.nextInt();
		
		System.out.println("Introduzca # columnas: ");
		int columna=sc.nextInt();
				
		int vector[][]=new int[fila][columna];
		
		System.out.println("Arreglo máximo de 2 x 2 ");
		System.out.println("Arreglo de : ["+fila+"] X ["+columna+"]");
		System.out.println("Introduzca 1er número: ");
		vector[0][0]=sc.nextInt();
		System.out.println("Introduzca 2do número: ");
		vector[0][1]=sc.nextInt();
		System.out.println("Introduzca 3er número: ");
		vector[1][0]=sc.nextInt();
		System.out.println("Introduzca 4to número: ");
		vector[1][1]=sc.nextInt();
		sc.close();
		
		System.out.println("Vector [0][0]: ["+vector[0][0]+"]");
		System.out.println("Vector [0][1]: ["+vector[0][1]+"]");
		System.out.println("Vector [1][0]: ["+vector[1][0]+"]");
		System.out.println("Vector [1][1]: ["+vector[1][1]+"]");
		
		det=((vector[0][0]*vector[1][1])-(vector[0][1]*vector[1][0]));
		System.out.println("Determinante: ["+det+"]");
		deltax=((ti1*vector[1][1])-(ti2*vector[0][1]));
		System.out.println("Delta X: ["+deltax+"]");
		deltay=((vector[0][0]*ti2)-(vector[1][0]*ti1));
		System.out.println("Delta Y: ["+deltay+"]");
		x=deltax/det;
		y=deltay/det;
		ecuacion1=(vector[0][0]*x)+(vector[0][1]*y);
		ecuacion2=(vector[1][0]*x)+(vector[1][1]*y);
		System.out.println("Ecuación 1: ["+ecuacion1+"]");
		System.out.println("Ecuación 2: ["+ecuacion2+"]");
	}
}
