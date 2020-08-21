
package borderLayout3_Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestBorderlayout2 {
    
        JFrame marco ;
        JPanel lamina1 ;
        JPanel lamina2 ;
        JButton boton1 ;
        JButton boton2;
        JButton boton3;
        JButton boton4;
        JButton boton5;

    public TestBorderlayout2() {
        
                marco = new JFrame("Test");
                lamina1 = new JPanel();
                lamina2 = new JPanel();
                boton1 = new JButton("Amarillo");
                boton2 = new JButton("Rojo");
                boton3 = new JButton("Verde");
                boton4 = new JButton("Azul");
                boton5 = new JButton("Cafe");
    }
     
     
    public void marco(){
    
       marco.setBounds(600, 300, 600, 300); //Doy medidas al marco
       
       /***AGREGO BOTONES A LA LAMINA_1****/
       lamina1.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
       lamina1.add(boton1);
       lamina1.add(boton2);

       /***AGREGO BOTONES A LA LAMINA_2***/
       lamina2.setLayout(new BorderLayout());
       lamina2.add(boton3,BorderLayout.WEST); //boton agregado a la lamina
       lamina2.add(boton4,BorderLayout.EAST);
       lamina2.add(boton5,BorderLayout.CENTER);
       
       /***AGREGO LA LAMINA AL MARCO***/
       marco.add(lamina1,BorderLayout.NORTH);
       marco.add(lamina2,BorderLayout.SOUTH); //lamina agregada al marco
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
       
       
    }
        

    public static void main(String[] args) {
        // TODO code application logic here
        TestBorderlayout2 t = new TestBorderlayout2();
        t.marco();
    }
    
}
