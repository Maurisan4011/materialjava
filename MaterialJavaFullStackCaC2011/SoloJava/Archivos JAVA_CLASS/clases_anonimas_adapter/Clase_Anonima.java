
package clases_anonimas_adapter;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent; //Es el evento de: MouseMotionListener por eso lo agrego como clase
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Clase_Anonima {
    
    private final JFrame f;
    private final JTextField tf;

    public Clase_Anonima() { //CONSTRUCTOR
        
        f = new JFrame("Ejemplo de Clase Anonima");
        tf = new JTextField(30);
    }
    
    public void marco(){  //METODO PARA AGREGAR COMPONENTES
    
        JLabel lamina = new JLabel("Hacer click y arrastrar el ratón");
        
        //agregamos componenetes al marco
        f.add(lamina, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        
        //AGREGAMOS UN LISTENER O ESCUCHA QUE UTILIZA UNA CLASE ANONIMA 
        //DE LA INTERFACE MOUSEMOTIONLISTENER Y SU CLASE ADAPTADORA
        f.addMouseMotionListener(new MouseMotionAdapter() {
            
            @Override
            public void mouseDragged(MouseEvent e){ //ARRASTRE DEL RATON
            
                String s = "Arrastre del ratón: X= "+e.getX()+" Y= "+e.getY();
                tf.setText(s);
            }
        });
        
        /****AGREGAMOS EL CLICK DEL BOTON****/
        f.addMouseListener(new ControlClickRaton()); //no se muestra
        
        //defino el tamaño del marco y lo hago visible
        f.setSize(300, 200);
        f.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        Clase_Anonima obj = new Clase_Anonima();
        obj.marco();
    }
    
}
