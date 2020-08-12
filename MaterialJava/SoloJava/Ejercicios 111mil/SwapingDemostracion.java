package Swapping;

public class SwapingDemostracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.printf("Sin ningun Intercambio: %d y %d\n",num1,num2);
		Intercambio(num1,num2);
	}
	
	public static void Intercambio(int num1, int num2){
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("Con Intercambio Actual: %d y %d",num1,num2);
		
	}

}
