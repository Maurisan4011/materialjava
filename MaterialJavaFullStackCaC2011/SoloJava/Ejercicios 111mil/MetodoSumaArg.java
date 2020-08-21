/*Uso de metodos: pasaje de parametros por valor, los argumentos se invocan con su nombre,
 *  y pasando la lista de argumentos entre parentesis. El conjunto se usa como 
 *  si fuera una variable del tipo devuelto por el metodo*/
public class MetodoSumaArg {

	public static void main(String[] args) {
		
		Operaciones calc = new Operaciones(); //instanciacion de la clase Operaciones
        int x;
        x = calc.sumaEnteros(2,3); //retorna el resultado de la suma y la aloja en “x”

     //lo de arriba seria como escribir: calc.(return c); aunque no se   escribe asi sino que se coloca
     // el nombre del metodo y argumentos que equivaldria : sumaEntero(2,3) = (return c) esta
     // tomando el resultado y guardandolo en la variable (x) 

        System.out.println("la suma es:"+x);
	}

}
