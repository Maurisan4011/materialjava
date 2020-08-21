/*
Realizar un programa usando 'for' que permita acumular un resultado SUMANDO,
para despues imprimirlo por pantalla.

El resultado final del codigo es:

Contador [0]
Contador [1]
Contador [2]
Contador [3]
Contador [4]
Contador [5]
La acumulacion total es: 15

*/

public class Suma1{
  public static void main (String args[]){
    int contador;
    int acumulador = 0;
    for (contador = 0; contador <= 5; contador++){
      System.out.println("Contador ["+contador+"]");
      acumulador = acumulador + contador;
    }
    System.out.println("La acumulacion total es: " +acumulador);
  }
}
