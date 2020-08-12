/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionPersona;

import javax.swing.JOptionPane;

/**
 *
 * @author Branko
 */
public class EstudianteAbs extends PersonaAbs{
    public String email;
    public double estatura;
    
    public EstudianteAbs(String email, double estatura, String nombre, int dni){
        super(nombre, dni);
        this.email=email;
        this.estatura=estatura;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" dni: "+dni+" email: "+email+" estatura: "+estatura);
        JOptionPane.showMessageDialog(null, " NOMBRE: "+nombre+"\n EMAIL: "+email+"\n ESTATURA: "+estatura+"\n DNI: "+dni);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public void setDni(int dni) {
        this.dni=dni;
    }
    
    
}
