import java.util.Scanner;

public class MetodoPromedio {
	
	
	
	public static void ingreso(int VECTOR[]){
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < VECTOR.length; i++) {
			
		    System.out.println("ingrese dato ["+i+"] :");
			VECTOR[i] = sc.nextInt();
			
		}
		
		sc.close();
	}
	
	public static double promedio(int VECTOR[]){
		
		int suma = 0;
		double promedio = 0;
		
		for (int i = 0; i < VECTOR.length; i++) {
			
			suma = suma + VECTOR[i];
		}
		
		promedio = (double)suma/VECTOR.length;
		
		return promedio;
	}

	
	public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);
		    
		    System.out.println("Ingrese el largo del vector: ");
	        int n = scn.nextInt();
	        int VECTOR[] = new int[n];
	        
	        /*MetodoPromedio M = new MetodoPromedio();//usando instanciacion
	        M.ingreso(VECTOR);
	        double pro =M.promedio(VECTOR);
	        System.out.println("El promedio es: "+pro);*/
	        
	        //usando metodos
	        ingreso(VECTOR);
	        double pro = promedio(VECTOR);
	        System.out.println("El promedio es: "+pro);
	        
	        scn.close();

	}

}
