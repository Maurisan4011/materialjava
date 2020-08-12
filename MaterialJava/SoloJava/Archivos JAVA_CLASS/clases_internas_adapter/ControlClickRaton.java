
package clases_internas_adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ControlClickRaton extends MouseAdapter{
    
    //SI NO COLOCO LA SOBRE ESCRITURA NO FUNCIONA EL METODO "@Override"
     
    @Override
    public void mouseClicked(MouseEvent e){
    
        System.out.println("Clase Interna dio Click al boton del raton");
    }
    
}
