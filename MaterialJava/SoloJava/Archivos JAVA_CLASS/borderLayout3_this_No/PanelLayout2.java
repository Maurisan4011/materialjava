
package borderLayout3_this_No;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLayout2 extends JPanel{

    public PanelLayout2() {
        
        setLayout(new BorderLayout()); //HE COLOCADO EN UNA LAMINA BORDERLAYOUT CON "ESTE, OESTE, CENTRO"
        add(new JButton("Verde"),BorderLayout.WEST);
        add(new JButton("Azul"),BorderLayout.EAST);
        add(new JButton("cafe"),BorderLayout.CENTER);
    }
    
    
    
}
