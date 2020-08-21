package Varios;

//Hacer la suma de todos los numeros de un arreglo.

public class Array4Suma {

	public static void main(String[] args) {
		

		int a[]={1,2,3,4,5,6,7,8,9,10};
		int acumulador=0;
		int i=0;
		
		for (i=0; i<a.length; i++){
			acumulador+=a[i]; // acumulador = acumulador + a[i];
			
		}
			System.out.println("La sumatoria de los numeros es= "+acumulador);
		
		
		
		
	}

}
