import java.util.Scanner;
public class PruebaVector {

	private Scanner teclado;
    private int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos sueldos cargará:");
        int cant;
        cant=teclado.nextInt();
        sueldos=new int[cant];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese sueldo ["+f+"]:");
            sueldos[f]=teclado.nextInt();
        }	
    }
    
    
    public void imprimir() {
    	System.out.println("\nsalida de sueldo: ");
        for(int f=0;f<sueldos.length;f++) {
            
            System.out.println("El sueldo ["+f+"] = "+sueldos[f]);
        }
    }
	
	public static void main(String[] args) {
		
		PruebaVector pv=new PruebaVector();
        pv.cargar();
        pv.imprimir();

	}

}
