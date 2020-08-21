import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Ejercicio5Array {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int numMes;
		String nombreMes[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		String mensaje="\nERROR-- El numero ingresado debe ser un ENTERO entre 1 y 12.";
		
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(input);
		
		System.out.println("Ingrese un número de mes y el programa devolverá el nombre:");
		numMes=Integer.parseInt(buffer.readLine());
		
		if (numMes < 13 && numMes > 0){
			numMes=numMes-1;
			System.out.println("\n- El mes ingresado es: "+nombreMes[numMes]);
			
		}else{
			System.out.println(mensaje);
		}
		
		
		
	}

}
