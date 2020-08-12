import java.util.Scanner;

public class MatrizAsterisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese cantidad: ");
		int numero = sc.nextInt();
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print("  *  ");
			}
			
			System.out.println("");
		}
        
		sc.close();
	}

}
