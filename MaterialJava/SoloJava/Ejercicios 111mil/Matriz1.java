import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nº de filas: ");
		int f = sc.nextInt();
		System.out.println("Introduzca nº de columnas: ");
		int c = sc.nextInt();
		
		int num[][] = new int[f][c];
		
		System.out.println("Introduzca valores de matriz ["+f+"] x ["+c+"] :");
		
		for(int i = 0; i < num.length;i++){
			for(int j = 0; j < num.length; j++){
				
				num[i][j] = sc.nextInt();
				
				System.out.println("valor ["+i+"]["+j+"] es:"+num[i][j]);
			}
		}
		
		System.out.println("\nSu salida es:\n");
		
		for(int i = 0; i < num.length;i++){
			for(int j = 0; j < num.length; j++){
			
				System.out.print("["+i+"]["+j+"] = "+num[i][j]+"  ");		
			}
			
			System.out.println("");
		}
		
		sc.close();
		
	}

}
