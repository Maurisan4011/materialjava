/*
Ejercicio:

Realizar codigo en Java que permita realizar el algoritmo de factorial de un numero. 
*/
import java.util.Scanner;

public class factorial {
    public static void main (String args[]){
      Scanner sc= new Scanner (System.in);
      int numero=0;
      int contador=0;
      int acumulador=1;
      System.out.println("Ingrese un numero: ");
      numero =sc.nextInt();
      while (numero>contador){
        contador = contador +1;
        acumulador = acumulador * contador;
        /*
        notar que acumulador va a ir tomando valores a medida que se vaya realizando
        el algoritmo booleano del while.
        Ej con factorial 5!:
              **Tip: numeros entre [n] son el resultado del acumulador**
        [1] x 1 = 1
        [1] x 2 = 2
        [2] x 3 = 6
        [6] x 4 = 24
        [24] x 5 = 120

        */
        System.out.println("acumulador * ["+contador+"] =" +acumulador);
      }
      System.out.println("El resultador del factororial es: " +acumulador);
    }
}
