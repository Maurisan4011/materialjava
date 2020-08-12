
package swingeventos1_1_main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class TestSwing implements ActionListener{
    
    JFrame marco ;
    JPanel lamina ;
    JButton boton ;

    public TestSwing() { //CONSTRUCTOR
        
        marco = new JFrame("Test");
        lamina = new JPanel();
        boton = new JButton("Boton");
//        boton.setActionCommand("Boton Presionado"); //sin esto solo deja fondo amarillo
       
    }
    
    public void marco(){ //METODO MARCO PARA COMPONENTES
    
       marco.setBounds(300, 200, 200, 300); 
       lamina.add(boton); //boton agregado a la lamina
       boton.setActionCommand("Boton Presionado"); //sin esto solo deja fondo amarillo
       boton.addActionListener(this); //boton a la escucha "PERO ESTA EL BOTON EN LA LAMINA"
       marco.add(lamina); //lamina agregada al marco
       //marco.add(lamina, BorderLayout.SOUTH); //agrega la lamina al sur
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
       
       
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
      
        System.out.println("El comando es: "+ae.getActionCommand());
         lamina.setBackground(Color.yellow);
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        TestSwing t = new TestSwing();
        t.marco();
    } 
    
}
