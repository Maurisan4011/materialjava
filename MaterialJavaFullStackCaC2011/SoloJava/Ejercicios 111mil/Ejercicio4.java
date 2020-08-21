import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio4
{
	public static void main(String[] args) throws IOException
	{
		double compra, resultado,descuento;
		int pago;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);
		
		System.out.println("Ingrese un monto a pagar. Si paga al contado obtendrá un 10%");
		compra = Double.parseDouble(buffer.readLine());

		System.out.println("\n ELija un medio de pago, ingresando 1;2;3 ó 4:\n1- Contado.\n2- Tarjeta de credito.\n3- Tarjeta de debito.\n4- Cheque. ");
		pago = Integer.parseInt(buffer.readLine());
		if(pago==1){
			resultado = compra * 0.9;
			descuento =compra-resultado;
		System.out.printf("\n- Se le ha aplicado un 10%% de descuento por abonar al contado.\n- El precio final es: $%.2f. \n- Se han descontado $%.2f.", resultado,descuento);
		}else{
			resultado = compra;
			System.out.printf("\n- No se le ha aplicado ningun descuento por NO abonar al contado. El precio final es: $%.2f", resultado);
	
		}
	}
}
