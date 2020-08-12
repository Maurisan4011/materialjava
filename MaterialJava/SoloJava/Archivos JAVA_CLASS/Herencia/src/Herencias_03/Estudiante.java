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
public class Estudiante extends Persona{  //SUB CLASE "HIJA"
    
    public String email;
    public double estatura;

    public Estudiante(String email, double estatura, String nombre, int dni) {
        super(nombre, dni); //se usa super para heredar los atributos de la clase padre
        this.email = email;
        this.estatura = estatura;
    }
    
    @Override
    public void mostrar(){ //sobre escritura de metodos
    
        System.out.println(" nombre "+nombre+" dni "+dni+" email "+email+" estatura "+estatura);
        JOptionPane.showMessageDialog(null,"\n nombre: "+nombre+"\n dni: "+dni+"\n email: "+email+"\n estatura: "+estatura);
    }
    
}
