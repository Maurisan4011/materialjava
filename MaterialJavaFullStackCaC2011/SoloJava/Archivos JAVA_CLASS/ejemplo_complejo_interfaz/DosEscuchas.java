
package ejemplo_complejo_interfaz;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DosEscuchas implements MouseMotionListener, MouseListener{

    public static void main(String[] args) {
        // TODO code application logic here
        DosEscuchas dos = new DosEscuchas();
        dos.marco();
    }

    private final JFrame f;
    private final JTextField tf;

    public DosEscuchas() {
        
        f = new JFrame("Ejemplo de dos receptores");
        tf = new JTextField(30);
    }
    
    public void marco(){
    
        JLabel lamina = new JLabel("Hacer click y arrastrar el raton");
        
        /***AGREGAR COMPONENTES AL MARCO***/
        f.add(lamina, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        /***AGREGAR ESTE OBJETO COMO LISTENER****/
        f.addMouseMotionListener(this); //"this" hace referencia a esta clase
        f.addMouseListener(this); //"this" hace referencia a esta clase
        /***DEFINIR EL TAMAÑO DEL MARCO Y HACERLO VISIBLE***/
        f.setSize(300, 200);
        f.setVisible(true);
    }
    
    /***ESTOS SON LOS EVENTOS DE MOUSEMOTIONLISTEN
     * @param me
     **** @param meE*****/
    
   
    @Override
    public void mouseDragged(MouseEvent me) {
        
        String s = "Arrastre del ratón: X= "+me.getX()+" Y= "+me.getY();
                tf.setText(s);
    }
    
      @Override
    public void mouseEntered(MouseEvent me) {
         String s = "El raton ha entrado";
        tf.setText(s);
    }
    
    @Override
    public void mouseExited(MouseEvent me) {
      
        String s = "El raton ha salido";
        tf.setText(s);
    }

    /***METODO DE MOUSEMOTIONLISTENER NO UTILIZAD
     * @param me
     * @param meO***/
    
    @Override
    public void mouseMoved(MouseEvent me) {}
    
    /*****METODOS DE MOUSELISTENER NO UTILIZADO
     * @param me
     * @param meS****/

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}
    
}
