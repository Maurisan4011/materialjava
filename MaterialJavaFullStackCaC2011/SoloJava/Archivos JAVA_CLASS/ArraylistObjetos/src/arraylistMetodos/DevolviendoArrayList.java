
package arraylistMetodos;

import java.util.ArrayList;

public class DevolviendoArrayList {
    
    private ArrayList<String> datos; //declaramos un arraylist
     
    public DevolviendoArrayList(){
    
    } //constructor
     
    public void setDatos(ArrayList<String> datos){ //coloca los datos provenientes del Arraylist
        this.datos=datos;
    }
 
    public ArrayList<String> getDatos(){ //obtiene o retorna los datos tomados del Arraylist 
        return datos;
    }
    
}
