
public class MetodoSumaParameter {

	public static void main(String[] args) {
	
		
		int A = obtener_A();
		int B = obtener_B();
		
		int x = calcularResultado(A,B);
		System.out.println("El resultado en entero es: "+x);
		
		/*** multiplicacion con el resultado anterior ***/
		
		int z = 5;
		int k = x * z; //multiplicacion por 5
		System.out.println("la multiplicacion entera es: "+k); 
	

	}
	
	private static int calcularResultado(int a, int b){
		
		int resultado = a + b;
		
		return resultado;
	}
	
	private static int obtener_A(){
		
		return 2;
	}
	
    private static int obtener_B(){
		
		return 3;
	}

}
