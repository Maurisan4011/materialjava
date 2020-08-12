import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//El enunciado no especifica si son enteros, pero por lógica, las tablas de multiplicar se confeccionan en base a enteros.
		int num1,num2,limite,resultado; 
		num2=1;
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(input);
		
		System.out.println("Mostrar la tabla de multiplicar de un numero hasta que llegue a otro numero ingresado por teclado");
		System.out.println("\n- Ingrese el numero del cual quiere conocer la tabla y presione ENTER:");
		
		num1=Integer.parseInt(buffer.readLine());
		
		System.out.println("\n- Ingrese el numero hasta el cual quiere multiplicar el primero y presione ENTER:");
		limite=Integer.parseInt(buffer.readLine());
		
		while(num2<=limite){
			resultado=num1*num2;
			System.out.println(num1+" x "+num2+" = "+resultado);
			num2++;
		}
		
		

	}

}
