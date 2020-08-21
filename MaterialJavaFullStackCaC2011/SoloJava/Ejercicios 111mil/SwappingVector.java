package Swapping;

public class SwappingVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int AUX;
		
		int VECTOR[] = new int[2]; //Array de dos posiciones [0][1]
		VECTOR[0]=10;
		VECTOR[1]=20;
		
		System.out.printf("Sin ningun Intercambio num1: %d y num2: %d\n",VECTOR[0],VECTOR[1]);
		
		/**SWAPPING O INTERCAMBIO**/
		AUX = VECTOR[0];
		VECTOR[0] = VECTOR[1];
		VECTOR[1] = AUX;
		
		System.out.printf("Con Intercambio Actual num1: %d y num2: %d",VECTOR[0],VECTOR[1]);

	}

}
