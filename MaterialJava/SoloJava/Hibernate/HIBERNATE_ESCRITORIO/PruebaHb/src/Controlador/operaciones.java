/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tablaejemplo;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Gallardo
 */
public class operaciones {
    
    public void altaUsuarios(Tablaejemplo user){
        
     SessionFactory  Misesion = NewHibernateUtil.getSessionFactory();
     Session session; 
     session = Misesion.openSession();
     Transaction tx= session.beginTransaction();
     session.save(user);
     tx.commit();
     session.close();
     JOptionPane.showMessageDialog(null, "El dato fue grabado correctamente");
        
        
    }
    
    public void bajaUsuarios(Tablaejemplo user){
        
     SessionFactory  Misesion = NewHibernateUtil.getSessionFactory();
     Session session; 
     session = Misesion.openSession();
     Transaction tx= session.beginTransaction();
     session.delete(user);
     tx.commit();
     session.close();
     JOptionPane.showMessageDialog(null, "El dato fue eliminado correctamente");
        
        
    }
}
