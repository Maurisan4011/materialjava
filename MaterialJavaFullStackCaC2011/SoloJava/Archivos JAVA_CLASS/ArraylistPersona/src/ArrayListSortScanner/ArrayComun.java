
package ArrayListSortScanner;

import java.util.Arrays;


public class ArrayComun {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Array de String
        String nombres[] = {"Pepe", "Juan", "Alex", "Julian", "Francisco", "Luis"};
		
        //Ordena el array
        Arrays.sort(nombres);
 
        //Mostramos el array ya ordenado
        for (String vector : nombres) {
            System.out.print(vector + ", ");
        }
    }
    
}
