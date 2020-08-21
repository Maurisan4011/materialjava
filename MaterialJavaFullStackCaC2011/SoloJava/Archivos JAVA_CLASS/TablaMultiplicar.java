public class TablaMultiplicar{
  public static void main (String args[]){
    int contador=1;
    int acumulador=0;
    int numero = 3;
    System.out.println("Tabla de multiplicar de 3:");
    while (acumulador <= 10){
      acumulador = contador * numero;
      contador++; // contador = contador + 1;
      System.out.println("3x["+contador+"]= " +acumulador);
      //contador++;
    }
  }
}

/*
con el contador comentado antes del System.out.println("3x["+contador+"]= " +acumulador); da como resultado:

Tabla de multiplicar de 3:
3x[1]= 3
3x[2]= 6
3x[3]= 9
3x[4]= 12

con el contador comentado depsues del System.out.println("3x["+contador+"]= " +acumulador); da como resultado:

Tabla de multiplicar de 3:
3x[2]= 3 <---ACA HAY UN ERROR! PERO ES PORQUE DESPUES DE REALIZAR LA MULTIPLICACIÓN SE AUMENTA EL CONTADOR
3x[3]= 6
3x[4]= 9
3x[5]= 12
*/
