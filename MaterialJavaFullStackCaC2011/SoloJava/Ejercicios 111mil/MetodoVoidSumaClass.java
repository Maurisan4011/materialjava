
public class MetodoVoidSumaClass {

	public static void main(String[] args) {

        MetodoVoidSumaClass sum = new MetodoVoidSumaClass(); //buscar clase MetodoVoidSuma
		
		sum.suma();
		sum.promedio();
	}
	
	public void suma(){
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println("La suma metodo en la misma clase es: "+c);
	}

	public void promedio(){
		
		int x = 6;
		int y = 5;
		int z = 13;
		int promedio = (x+y+z)/3;
		
		System.out.println("promedio: "+promedio);
		
	}
	
}
