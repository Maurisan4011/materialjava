package Swapping;

public class SwappingIntercambios {

	public static void main(String[] args) {
		
		/**Declaracion de variables**/
		int num1 = 10;
		int num2 = 20;
		int temp;
		
		System.out.printf("Sin ningun Intercambio num1: %d y num2: %d\n",num1,num2);
		
		/**Intercambio o Swapping**/
		temp = num1;   //ahora temp = 10
		num1 = num2;   //ahora num1 = 20
		num2 = temp;   //ahora num2 = 10
		
		System.out.printf("Con Intercambio Actual num1: %d y num2: %d",num1,num2);

	}

}
