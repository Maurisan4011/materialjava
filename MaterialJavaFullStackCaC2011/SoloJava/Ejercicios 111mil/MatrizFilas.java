import java.util.Scanner;

public class MatrizFilas {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("introduzca porcentaje % a sacar: ");
				double porcent = sc.nextDouble();
				
				int a[][]  = new int[3][3]; //matriz de 3x3
				
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						
						System.out.println("introduzca valor ["+i+"]["+j+"] es:");
						a[i][j]=sc.nextInt();
						
						System.out.println("valor ["+i+"]["+j+"] es:"+a[i][j]);
					}
				}
				
				/*for (int i = 0; i < a.length; i++) {	
					for (int j = 0; j < a.length; j++) {
						
						System.out.print("["+i+"]["+j+"] = "+a[i][j]+"  ");
					}
					
					System.out.println("");
				}
				
				System.out.println("");
				System.out.println("El calculo de la columna 1 es : ");*/
				int suma = 0;
				
				for (int i = 0; i < 3; i++) {	
					
					/**Columna en 1 y recorre filas de 0 a valor**/
						suma = suma +a[i][2]; //[Fila][Columna]; [0][1]; [1][1]; [2][1] ....						  
						System.out.print("["+i+"]["+2+"] = "+a[i][2]+"  ");
					}
					
					System.out.println("");
				    System.out.println("La suma Total es: "+suma);
				    System.out.println("El valor del "+(double)suma*porcent/suma+"% porciento es : "+(double)suma*porcent/100);
				    sc.close();
			}

		}



