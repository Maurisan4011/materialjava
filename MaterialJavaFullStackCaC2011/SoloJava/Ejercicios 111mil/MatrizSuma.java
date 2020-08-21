import java.util.Scanner;

public class MatrizSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][]  = new int[2][2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.println("introduzca valor ["+i+"]["+j+"] es:");
				a[i][j]=sc.nextInt();
				
				System.out.println("valor ["+i+"]["+j+"] es:"+a[i][j]);
			}
		}
		
		int suma = 0;
		
		for (int i = 0; i < a.length; i++) {	
			for (int j = 0; j < a.length; j++) {
				
					
				suma = suma +a[i][j]; //[0][0]; [1][0]; [2][0]
									  //[0][1]; [1][1]; [2][1]
									  //[0][2]; [1][2]; [2][2]
				
				System.out.print("["+i+"]["+j+"] = "+a[i][j]+"  ");
			}
			
			System.out.println("");
		}
		
		System.out.println(suma);
		sc.close();
	}

}
