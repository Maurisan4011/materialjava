/*
  Introducir entero:
  System.out.println("Introduzca un numero entero");
  n =sc.nextInt(); // solo permite colocar enteros
-----------------------------
  Introducir double:
  System.out.println("Introduzca un double");
  n = sc.nextDouble();
-----------------------------
  Introducir Float:
System.out.println("Introduzca un float");
  n = sc.nextFloat():
*/

import java.util.Scanner;
public class Scanner {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    String nombre;
    double radio;
    float radio1;
    int n;

    System.out.println("Introduzca su nombre:" );
    nombre = sc.nextLine();
    System.out.println("Hola" +nombre);

    System.out.println("Introduzca el radio de la circunferencia:" );
    radio = sc.nextDouble();
    System.out.println("El radio de la circunferencia es:" );

    System.out.println("Introduzca un float: ");
    radio1=sc.nextFloat();
    System.out.println("El float es:" +radio1);



  }
}
