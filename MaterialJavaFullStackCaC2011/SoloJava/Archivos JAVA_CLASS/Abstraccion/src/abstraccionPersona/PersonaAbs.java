/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionPersona;

/**
 *
 * @author Branko
 */
public abstract class PersonaAbs {
    public String nombre;
    public int dni;
    
    public PersonaAbs(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    abstract public void mostrar();
    abstract public String getNombre();
    abstract public void setNombre(String nombre);
    abstract public int getDni();
    abstract public void setDni(int dni);
    
}
