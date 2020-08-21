
package clases_internas_adapter;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/****HAY DOS CLASE: UNA INTERNA "ratonEscuchadorMovimiento" Y OTRA EXTERNA "ControlClickRaton"****/

public class TestInterna {
    
    private final JFrame f;
    private final JTextField tf;

    public TestInterna() {
        
        f = new JFrame("Ejemplo de Clase Anonima");
        tf = new JTextField(30);
    }
    
    /***CLASE INTERNA DE TIPO PRIVATE PARA ARRASTRE DEL RATON****/
    private class ratonEscuchadorMovimiento extends MouseMotionAdapter{
    
         @Override
            public void mouseDragged(MouseEvent e){
            
                String s = "Arrastre del ratón: X= "+e.getX()+" Y= "+e.getY();
                tf.setText(s);
            }
    }
    
    public void marco(){ /****METODO DONDE INVOCO AMBAS ESCUCHAS Y AGREGO COMPONENTES****/
    
        JLabel lamina = new JLabel("Hacer click y arrastrar el ratón");
        
        //agregamos componenetes al marco
        f.add(lamina, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        
        
        /****AGREGAMOS UN LISTENER QUE UTILIZA UNA CLASE INTERNA CLICK DEL RATON****/
        f.addMouseMotionListener(new ratonEscuchadorMovimiento()); //instanciando clase ratonEscuchadorMovimiento interna
        f.addMouseListener(new ControlClickRaton()); //instanciando clase ControlClickRaton externa
        
        //defino el tamaño del marco y lo hago visible
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        TestInterna obj = new TestInterna();
        obj.marco();
    }
    
}
