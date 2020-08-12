
package clases_anonimas_adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ControlClickRaton extends MouseAdapter{ //LOS ADAPTADORES DE EVENTO SE HEREDAN
    
    //SI NO COLOCO LA SOBRE ESCRITURA NO FUNCIONA EL METODO "@Override"
     
    @Override
    public void mouseClicked(MouseEvent e){
    
        System.out.println("Clase Anonima dio Click al boton del raton");
    }
    
}
