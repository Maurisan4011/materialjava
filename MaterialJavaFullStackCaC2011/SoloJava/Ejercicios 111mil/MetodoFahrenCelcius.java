import java.util.Scanner;

public class MetodoFahrenCelcius {
	
	 public static class TempConverter { //clase agregada 
		 
		 public static void fahrenheitToCelsius() {
		 double fTemp, cTemp;
		 Scanner input = new Scanner(System.in);
		 System.out.print("Introduzca una temperatura en Fahrenheit: ");
		 fTemp = input.nextDouble();
		 input.close();
		 cTemp = (double)5/(double)9*(fTemp - 32);
		 System.out.println("La temperatura en Celsius es:  " + cTemp);
		 }
		 public static void celsiusToFahrenheit() {
		 double cTemp, fTemp;
		 Scanner input = new Scanner(System.in);
		 System.out.print("Introduzca una temperatura en Celsius: ");
		 cTemp = input.nextDouble();
		 input.close();
		 fTemp = (double)9/(double)5*cTemp + 32;
		 System.out.println("La temperatura en Fahrenheit es: "+ fTemp);
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		 Scanner input = new Scanner(System.in);

		 /* Prompt user for type of conversion */
		 System.out.println("1.  conversion de Fahrenheit a Celsius.");
		 System.out.println("2.  conversion de Celsius a Fahrenheit.");
		 System.out.print("Escoja su Opcion: ");
		 choice = input.nextInt();
		 if (choice == 1) {
		 fahrenheitToCelsius();
		 } else {
		 celsiusToFahrenheit();
		 }
		 input.close();
	  }
	}

}
