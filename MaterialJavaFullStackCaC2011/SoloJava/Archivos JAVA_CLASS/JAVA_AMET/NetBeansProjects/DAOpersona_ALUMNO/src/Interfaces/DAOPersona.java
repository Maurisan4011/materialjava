/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ConsultageneralJDBC.Persona;
import java.util.ArrayList;
    
    import java.util.List;
/**
 *
 * @author alumno
 */
public interface DAOPersona 
{
   public void registrar(Persona per)throws Exception;
   public void modificar(Persona per)throws Exception;
   public void eliminar(Persona per)throws Exception;
   public ArrayList<Persona> getUserList()throws Exception;
    
    
    
}
