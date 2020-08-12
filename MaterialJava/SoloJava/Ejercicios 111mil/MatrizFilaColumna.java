import java.util.Scanner;

public class MatrizFilaColumna {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nº de filas: ");
		int FILA = sc.nextInt();
		System.out.println("Introduzca nº de columnas: ");
		int COLUMNA = sc.nextInt();
		
		int num[][] = new int[FILA][COLUMNA];
		
		System.out.println("Introduzca valores de matriz ["+FILA+"] x ["+COLUMNA+"] :");
		
		for(int FILA_i = 0; FILA_i < num.length;FILA_i++){
			for(int COLUMNA_j = 0; COLUMNA_j < num.length; COLUMNA_j++){
				
				num[FILA_i][COLUMNA_j] = sc.nextInt();
				
				System.out.println("valor ["+FILA_i+"]["+COLUMNA_j+"] es:"+num[FILA_i][COLUMNA_j]);
			}
		}
		
		System.out.println("\nSu salida es:\n");
		
		for(int FILA_i = 0; FILA_i < num.length;FILA_i++){
			for(int COLUMNA_j = 0; COLUMNA_j < num.length; COLUMNA_j++){
			
				System.out.print("["+FILA_i+"]["+COLUMNA_j+"] = "+num[FILA_i][COLUMNA_j]+"  ");		
			}
			
			System.out.println("");
		}
		
		sc.close();

	}

}
