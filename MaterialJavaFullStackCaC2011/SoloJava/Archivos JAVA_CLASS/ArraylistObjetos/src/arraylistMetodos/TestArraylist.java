
package arraylistMetodos;

import java.util.ArrayList;

public class TestArraylist {

    public static void main(String[] args) {
        // TODO code application logic here
        
        DevolviendoArrayList metodo = new DevolviendoArrayList();
         
        ArrayList<String> array1 = new ArrayList(); //instanciando un arraylist
         
        array1.add("Hola");
        array1.add("Adios");
        array1.add("Qué tal");
         
        metodo.setDatos(array1); //coloca los datos de array1 en el metodo "DevolviendoArraylist"
        
        for(int i=0;i<array1.size();i++){
            System.out.println(metodo.getDatos().get(i));
        }
        
        System.out.println("*******************");
        //verifica si el array contiene una palabra
        if(metodo.getDatos().contains("Hola")){
            System.out.println("Contiene Hola");
        }else{
            System.out.println("No contiene Hola");
        }
    }
    
}
