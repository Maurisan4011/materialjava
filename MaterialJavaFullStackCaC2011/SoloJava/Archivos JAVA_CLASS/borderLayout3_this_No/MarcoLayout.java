
package borderLayout3_this_No;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MarcoLayout extends JFrame{ //MARCO U VENTANA

    public MarcoLayout() {
        
        setTitle("Pruebas Acciones");
        setBounds(600, 300, 600, 300); //(x, y, ancho, alto) del MARCO
        //****CAPA O LAMINA Nº1***/
        PanelLayout1 panel1 = new PanelLayout1();
        add(panel1,BorderLayout.NORTH); //AGREGANDO ELEMENTOS DEL PANEL1 AL MARCO "aparcera arriba"
        
        //****CAPA O LAMINA Nº2***/
        PanelLayout2 panel2 = new PanelLayout2();
        add(panel2, BorderLayout.SOUTH); //AGREGANDO ELEMENTOS DEL PANEL2 AL MARCO "aparecera abajo"
    }   
    
}
