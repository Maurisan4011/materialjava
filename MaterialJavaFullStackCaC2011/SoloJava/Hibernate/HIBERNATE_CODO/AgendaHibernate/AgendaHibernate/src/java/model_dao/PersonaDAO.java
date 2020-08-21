/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_dao;

import java.util.List;
import model_pojos.Persona;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author alumno
 */
public class PersonaDAO {
    
    //Metodo insertar 
    public void Insertar(Persona p) {
        SessionFactory sf= null;
        Session session = null;
        Transaction tx = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(p);
            tx.commit();
            session.close();
        }catch(Exception ex){
                tx.rollback();
                ex.printStackTrace();
                throw new RuntimeException("No se puede insertar la persona");
                }
        
    }
    //metodo de rescatar tuplas de una tabla en base a la consulta hql = Metodo LEER
    public List<Persona> leer(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        
        //String sql = "select *from Persona";
        //Criteria criteria = session.createCriteria(Persona.class,sql);
        //List<Persona> lista = criteria.list();
        
        Query query = session.createQuery("from Persona");
        List<Persona> lista = query.list();
        return lista;
        
    }
    //Metodo buscar, segun la id
    public Persona buscar ( int idPersona){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Persona p = (Persona) session.get(Persona.class,idPersona);
        return p;
    }
    //Metodo para eliminar tupla
    public void Eliminar(int idPersona){
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            Persona pbuscado = (Persona) session.get(Persona.class,idPersona);
            session.delete(pbuscado);
            tx.commit();
            session.close();
        }catch(Exception ex){
            tx.rollback();
            ex.printStackTrace();
            throw new RuntimeException("Noe se puede borrar la persona.");
        }
    }
    //motodo actualizar
    public void actualizar(Persona p){
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            Persona pbuscado = (Persona) session.get(Persona.class,p.getIdPersona());
            pbuscado.setCuil(p.getCuil());
            pbuscado.setNombre(p.getNombre());
            pbuscado.setFijo(p.getFijo());
            pbuscado.setCelular(p.getCelular());
            pbuscado.setEmail(p.getEmail());
            session.update(pbuscado);
            tx.commit();
            session.close();
           
        }catch(Exception ex){
            tx.rollback();
            ex.printStackTrace();
            throw new RuntimeException("No se puede actualizar los datos de la persona");
        }
    }
    
}
