/*
Ejercicio:

Desarrollar un codigo que sume los valores que se ingresen hasta que se ingrese
un -1 o supere el limite establecido por el programador
*/
import java.util.Scanner;

public class sumaconcentinela {
    public static void main (String args[]){
      Scanner sc= new Scanner (System.in);
      int numero=0;
      int suma=0;
      int i =0;
      System.out.println("Ingrese un numero (-1 para salir): ");
      numero =sc.nextInt();
      while (numero != -1 && i <= limite){ // limite = cantidad de numeros que se desea ingresar. (limite puede ser cambiado por el programador)
        suma = suma + numero;
        i = i+1;
        //para que no genere un loop infinito hay que agregar las siguientes lineas de codigo (linea 16 y 17 de codigo)
        //dado que estaria sumando de forma continua.
        System.out.println("Ingrese un numero (-1 para salir): ");
        numero =sc.nextInt();
        i = i+1;
      }
      System.out.println("El resultador de la suma es: " +suma);
    }
}
