import java.util.Scanner;

public class Misterio{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int x=0;
    int y=1;
    int total =0;
    System.out.println("Ingrese un valor entero.");
    x = sc.nextInt(); // ingreso del valor c
    while (x <=10){
      y = x * x;

      System.out.println("El resultado de la multiplicacion es: " +y);

      total = total + y;

      ++x;
    }
    System.out.printf("El total es: %d ", total);
  }
}
