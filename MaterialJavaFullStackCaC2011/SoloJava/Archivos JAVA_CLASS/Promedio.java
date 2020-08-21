/*Crear programa que calcule el promedio de 10 notas*/

import java.util.Scanner;

public class Promedio {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int total = 0;
    int nota = 0;
    int promedio;
    int i=0; //es el contador
    while (i<10){
      System.out.println("Ingrese la nota["+i+"]:");
      nota = sc.nextInt(); //ingreso de valores enteros
      total = total + nota;
      i++;
    }
    promedio = total /10;
    System.out.println("El promedio del alumno es:" +promedio);
  }
}
