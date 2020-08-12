
package swingeventos1_this_Si;

import javax.swing.JFrame;

public class MarcoBoton extends JFrame{
    
    public MarcoBoton() {
        
        setTitle("Evento en Botones");
        setBounds(700, 300, 500, 300);
        CapaFiguraEvento capa1 = new CapaFiguraEvento();
        add(capa1);
    }
    
}
