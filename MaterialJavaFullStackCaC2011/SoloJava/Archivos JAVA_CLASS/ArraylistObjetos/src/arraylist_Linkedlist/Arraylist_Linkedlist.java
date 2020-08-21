
package arraylist_Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist_Linkedlist {
    
    public static void main(String[] args){
    
        ArrayList<Integer> arraylist = new ArrayList<>(); //arraylist get es mejor que linkedlist
        LinkedList<Integer> linkedlist = new LinkedList<>(); //linkedlist en add y remove es mejor que arraylist
        
        /****************************************/
        
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
          
            arraylist.add(i);
        }
        
        long fin = System.currentTimeMillis();
        
        long duracion = fin - inicio;
        
        System.out.println("ArrayList add: "+duracion);
        
        /********************************/
        
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            
            linkedlist.add(i);
        }
         fin = System.currentTimeMillis();
        
         duracion = fin - inicio;
         System.out.println("LinkedList add: "+duracion);
         
         /***************************************/
         /****************************************/
        
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
          
            arraylist.get(i);
        }
        
        fin = System.currentTimeMillis();
        
        duracion = fin - inicio;
        
        System.out.println("ArrayList get: "+duracion);
        
        /********************************/
        
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            
            linkedlist.get(i);
        }
         fin = System.currentTimeMillis();
        
         duracion = fin - inicio;
         System.out.println("LinkedList get: "+duracion);
         
         /***************************************/
         /***************************************/
         inicio = System.currentTimeMillis();
        
        for (int i = 10000; i > 0; i--) {
          
            arraylist.add(i);
        }
        
        fin = System.currentTimeMillis();
        
        duracion = fin - inicio;
        
        System.out.println("ArrayList remove: "+duracion);
         
         /*************************************/
         
         inicio = System.currentTimeMillis();
        
        for (int i = 10000; i > 0; i--) {
            
            linkedlist.add(i);
        }
         fin = System.currentTimeMillis();
        
         duracion = fin - inicio;
         System.out.println("LinkedList remove: "+duracion);
         
    }
    
}
