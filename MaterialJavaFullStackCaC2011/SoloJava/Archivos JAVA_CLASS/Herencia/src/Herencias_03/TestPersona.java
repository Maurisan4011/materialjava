/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias_03;

import javax.swing.JOptionPane;

/**
 *
 * @author laura.iusifid0706
 */
public class TestPersona {
    
    public static void main(String args[]){
        
        String nombre;
        int dni;
        String email;
        double estatura;
        
       
       
        nombre = JOptionPane.showInputDialog(null,"Ingrese nombre: ","solicitando datos",2); //hay que colocar solicitando dato
        dni = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese dni: ","solicitando datos",2));
        email = JOptionPane.showInputDialog(null,"Ingrese su email: ","solicitando datos",2);
        estatura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su estatura: ","solicitando datos",2));
        
        Estudiante es1 = new Estudiante(email,estatura,nombre,dni);
        es1.mostrar();
        
        JOptionPane.showMessageDialog(null, "y donde esta JAVIER!!!");
        
        Estudiante es2 = new Estudiante("javier@mail.com",1.78,"javier",97543256);
        es2.mostrar();
    
    }
    
}
