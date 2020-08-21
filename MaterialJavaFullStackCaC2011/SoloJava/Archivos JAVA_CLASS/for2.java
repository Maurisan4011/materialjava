/*
Ejercicio ejemplo de como utilizar el 'for' en Java
teniendo el contador inicializado en 10.

El siguiente fragmento de codigo mostraria por el CMD (Simbolo de sistema)
el siguiente resultado:

  El número es: 10
  El número es: 9
  El número es: 8
  El número es: 7
  El número es: 6
  El número es: 5
  El número es: 4
  El número es: 3
  El número es: 2
  El número es: 1
  El número es: 0
*/

public class for2{
  public static void main (String args []){
    int contador;
    for (contador=10; contador>=0; contador--){
      System.out.println("El número es: " +contador);
    }
  }
}
