
package swingeventos1_this_Si;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CapaFiguraEvento extends JPanel implements ActionListener{
    
    JButton botonAzul = new JButton("AZUL"); //clase JButton para instanciar un boton "creamos"
    
    /***SECUENCIA: 1º TENGO UN BOTON QUE VOY A PRESIONAR 
     * *********** 2º ESE BOTON ESTARA EN UNA LAMINA 
     ************* 3º Y ESA LAMINA EN UN MARCO
     ************* NOTA: LA SECUENCIA ES DE AFUERA HACIA ADENTRO***/
    
    public CapaFiguraEvento() { //CONSTRUCTOR DE LA LAMINA
        
        add(botonAzul); //agregamos el boton a la lamina
        
        /**A ESTE BOTON LE AGREGO UNA ESCUCHA. ¿Quien escuchara cuando sea presionado el boton?: 
         * La lamina o capa en esta "this" clase "CapaFiguraEventos que hereda de JPanel"**/
        botonAzul.addActionListener(this);//1º this: referencia al objeto donde nos encontramos esto es "la propia lamina o capa"
                                      //al hacer click en el boton de esta lamina se colocara el fondo en azul
        
        /**TENEMOS UNA FUENTE Y UNA LAMINA O CAPA QUE ESCUCHA**/   
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { //marca que hacer cuando se recibe un evento de tipo raton "Pero toma por igual a todos"
        
      setBackground(Color.BLUE); //realiza lo que esta dentro de la accion colocando fondo azul
        
    }
}
