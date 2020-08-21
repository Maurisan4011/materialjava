import java.util.Scanner;

public class MatrizPorcentaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas,columnas,total,parcial;
		total=0;
		
		double porcentaje;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Dada una matriz, calcular el porcentaje de los valores de cada columna.\nIngrese el numero de FILAS de la matriz:");
		filas= sc1.nextInt();
		System.out.println("Ingrese el numero de COLUMNAS de la matriz:");
		columnas= sc1.nextInt();
		
				
		int matriz[][]= new int[filas][columnas];
		int parciales[]= new int[columnas];
		
		for (int i=0;i<filas;i++){				//Llenamos la matriz.
			for (int j=0;j<columnas;j++){
				
				System.out.println("Ingrese el valor para ["+i+"]["+j+"]:");
				matriz[i][j]=sc1.nextInt();
			}
			
		}
		
		System.out.println("\n[RESULTADO]:");
		for(int i=0;i<filas;i++){				//Mostramos la matriz
			for(int j=0;j<columnas;j++){
				System.out.print("["+i+"]["+j+"]= "+matriz[i][j]+"\t");
			}
			System.out.println("");
		}
		
		for(int i=0;i<columnas;i++){			//Para cada COLUMNA sumamos el valor de cada FILA en ella.
			parcial=0;							//Borramos el acumulador de valores PARCIALES de cada columna.
			for(int j=0;j<filas;j++){
				parcial=parcial+matriz[j][i];	//Recorremos las FILAS de la COLUMNA actual.
			}
			parciales[i]=parcial;				//Guardamos la suma de esa columna en un array de parciales para luego operar con ellos.
			
		}
		
		System.out.println("");
		
		for(int i=0;i<parciales.length;i++){	//Recorremos el array PARCIALES para mostrar los resultados y conseguir el TOTAL de todos los valores.
			System.out.println("La suma de los valores de la columna ["+i+"] es: "+parciales[i]);
			total=total+parciales[i];
		}
		
		System.out.println("\nLa suma de TODOS los valores es: "+total+"\n");
		
		for(int i=0;i<parciales.length;i++){	//Calculamos el porcentaje de cada COLUMNA y lo mostramos.
			porcentaje=0;
			porcentaje=(double)parciales[i]*100/(double)total;
			System.out.printf("El porcentaje de la columna [%d] es: %.2f%%\n",i,porcentaje);
		}
		
		sc1.close();	
	}
}
