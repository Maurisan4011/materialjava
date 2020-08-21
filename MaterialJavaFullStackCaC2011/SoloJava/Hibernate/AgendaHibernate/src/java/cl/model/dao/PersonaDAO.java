/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import d.model.pojos.Persona;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Branko
 */
public class PersonaDAO {
    public void insertar(Persona p){
    SessionFactory sf = null;
    Session sesion = null;
    Transaction tx =null;
    
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(p);
            tx.commit();
            sesion.close();            
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("No se puede insertar la persona");
        }
    }
    
    public List<Persona> leer(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
//        String sql = "select * from Persona";
//        Criteria criteria = sesion.createCriteria(Persona.class, sql);
        Query query = sesion.createQuery("from Persona");
        List<Persona> lista = query.list();
        return lista;
        
    }
    
    public Persona buscar(int id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Persona p = (Persona) sesion.get(Persona.class, id);
        return p;
    }
    
    public void eliminar(int id){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx=null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            Persona pbuscado = (Persona) sesion.get(Persona.class, id);
            sesion.delete(pbuscado);
            tx.commit();
            sesion.close();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("No se puede borrar la persona");
        }
    }
    
    public void actualizar(Persona p){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            Persona pbuscado = (Persona) sesion.get(Persona.class, p.getId());
            pbuscado.setRut(p.getRut());
            pbuscado.setNombre(p.getNombre());
            pbuscado.setFijo(p.getFijo());
            pbuscado.setCelular(p.getCelular());
            pbuscado.setEmail(p.getEmail());
            sesion.update(pbuscado);
            tx.commit();
            sesion.close();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
            throw new RuntimeException("No se puede modificar la persona");
        }
    }
}
