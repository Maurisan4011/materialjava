package MetodosVarios;

public class SumaRetorno {
	
	public int sumaEnteros(int a, int b){

          int c = a + b;
          
         return c; //retorna el resultado de la suma o respuesta
    }
	
	
	public void resta(int a, int b){
		
		int c = a - b;

	   System.out.println("la resta es: "+c);
	}
	
	public void suma(){
		
		int a = 2;
		int b = 3;
		int c;
		
		c = a + b;
		
		System.out.println("la suma es: "+c);
	}
	
	public void promedio(double a, double b, double c){
		
		double d = (double)(a+b+c)/3;
		
		System.out.println("El promedio es: "+d);
	}
	
	public double promedio1(double a, double b, double c){
		
		double d = (double)(a+b+c)/3;
		return d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumaRetorno sum = new SumaRetorno();
		double y = sum.promedio1(8, 6, 9);
		System.out.println("El promedio es: "+y);
		
		sum.promedio(5, 8, 21);
		
		System.out.println(sum.sumaEnteros(5, 4));
		
		int x = sum.sumaEnteros(5, 4);
		System.out.println(" la suma es: "+x);
		
		sum.resta(x, 8);

	}

}
