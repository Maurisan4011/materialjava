import java.util.Scanner;

public class DeterminanScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1;
		int vector[][]=new int[2][2];	
		
		for (int i=0;i<vector.length;i++){
			for(int j=0;j<vector[i].length;j++){
				System.out.print("ingrese un numero entero");
				sc1= new Scanner(System.in);
				vector[i][j]=sc1.nextInt();
			}
			
		}
		
		int det, deltX, deltY, x, y, i1, i2, verif1, verif2;
		i1=2;
		i2=4;
		
		for (int i=0;i<vector.length;i++){
			for(int j=0;j<vector[i].length;j++){
				System.out.print(vector[i][j]+"\t");
				
			}
			System.out.println("");
		}
		
		System.out.println("I1="+i1);
		System.out.println("I2="+i2);
		det= (vector[0][0]*vector[1][1])-(vector[0][1]*vector[1][0]);
		System.out.println("\nDeterminante: "+det);
		
		deltX=(i1*vector[1][1])-(vector[0][1]*i2);
		System.out.println("Delta X: "+deltX);
		
		deltY=(vector[0][0]*i2)-(i1*vector[1][0]);
		System.out.println("Delta Y: "+deltY);
		
		x=deltX/det;
		System.out.println("X= "+x);
		
		y=deltY/det;
		System.out.println("Y= "+y);
		
		verif1=(vector[0][0]*x)+(vector[0][1]*y);
		verif2=(vector[1][0]*x)+(vector[1][1]*y);
		System.out.println("verificacion linea1:"+verif1);

		System.out.println("verificacion linea2:"+verif2);
		
	}
}
