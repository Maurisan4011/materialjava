import java.util.Scanner;

public class MatrizDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1;
		int vector[][]=new int[3][3];				//Genero una matriz de 3 X 3.
		int multi=1;								//Inicializo los acumuladores
		int multInversa=1;							//Inicializo los acumuladores
		
		for (int i=0;i<vector.length;i++){			//Lleno la matriz con valores.
			for(int j=0;j<vector[i].length;j++){
				System.out.println("ingrese un numero entero");
				sc1= new Scanner(System.in);
				vector[i][j]=sc1.nextInt();
			}	
		}
		
		for(int i=0;i<vector.length;i++){			//Recorro la matriz en diagonal ([0][0],[1][1],...,[n][n]).
			multi=multi*vector[i][i];				//Acumulo los valores de la multiplicacion.
			
		}
		
		
		for (int i=0;i<vector.length;i++){			//Muestro la matriz ingresada.
			for(int j=0;j<vector[i].length;j++){
				System.out.print(vector[i][j]+"\t");
				
			}
			System.out.println("");
		}
		
		System.out.println("Multiplicacion en diagonal iniciando en "+vector[0][0]+"= "+multi);
		
		//Para recorrer la matriz en la diagonal inversa, uno de los indices debe incrementarse mientras el otro decrece.
		int j=0;									//Inicializo el indice de COLUMNAS en 0.
		for(int i=vector.length-1;i>=0;i--){		//Inicializo el indice de FILAS en la última fila de la matriz (largo -1).
													//RECORDAR La matriz tiene 2 filas, con indice n-1.			
			multInversa=multInversa*vector[i][j];	//Mientras las FILAS decrecen, las COLUMNAS incrementan.
			j++;
			
		}
		
		int fin = vector.length-1;
				
		System.out.println("Multiplicacion en diagonal iniciando en "+vector[fin][0]+"= "+multInversa);
		
	}

}
