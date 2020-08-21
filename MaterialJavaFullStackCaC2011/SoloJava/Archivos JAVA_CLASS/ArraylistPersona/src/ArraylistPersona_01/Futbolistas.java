package ArraylistPersona_01;

import java.util.ArrayList;

public class Futbolistas {
    
    public static void main(String args[]){
    
        // Declarando un ArrayList simple.
    ArrayList Futbolistas = new ArrayList<>();
    // Llenando el ArrayList
    Futbolistas.add("Radamel Falcao Garcia");
    Futbolistas.add("James Rodriguez");
    Futbolistas.add("Yackson Martinez");
    Futbolistas.add("Juan Guillermo Cuadrado");
    Futbolistas.add("David Ospina");
    Futbolistas.add("Mario Alberto Yepes");
    Futbolistas.add("Freddy Guarin");
    // Se recorre el array con el fin de obtener todos los valores
        for (int i = 0; i < Futbolistas.size(); i++) {
            System.out.println("En la posicion N°: "+i+" "+Futbolistas.get(i));
        }
    
    }
    
}
