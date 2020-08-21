/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_DAO;
import ConsultageneralJDBC.Persona;
import java.sql.PreparedStatement;
import Interfaces.DAOPersona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOPersonaImpl extends Conexion implements DAOPersona
{
    
    
    @Override
    public void registrar(Persona per) throws Exception {
        try {// usando herencia
            this.conectar();
            PreparedStatement st= this.coneccion.prepareStatement("insert into persona(idpersona, nombre, apellido) values(?,?,?)");
            st.setInt(1, per.getId());
            st.setString(2,per.getNombre());
            st.setString(3, per.getApellido());
            st.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.coneccion.prepareStatement("update persona set nombre=? , apellido=? where idpersona=?");
            st.setString(1, per.getNombre());
            st.setString(2, per.getApellido());
            st.setInt(3, per.getId());
            st.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
      this.conectar();
      PreparedStatement st = this.coneccion.prepareStatement ("delete from persona where idpersona=?");
      st.setInt(1, per.getId());
      st.executeUpdate ();
      
    }

    @Override
    public ArrayList<Persona> getUserList() throws Exception {
        
         ArrayList<Persona> userList = new ArrayList<>();
        
        
        this.conectar();
        String query = "select * from persona";
        PreparedStatement st = this.coneccion.prepareStatement (query);
        
        try {

            ResultSet rs = st.executeQuery();
            Persona per;
            while (rs.next()) {                
              
               //DOS FORMAS: CON CONSTRUCTOR VACIO Y LLENO
                per = new Persona(); //INSTANCIA DE LA CLASE PERSONA, CONSTRUCTOR VACIO
                //per = new Persona(rs.getInt("idpersona"),rs.getString("nombre"),rs.getString("apellido")); //CONSTRUCTOR LLENO
                per.setId(rs.getInt("idpersona")); //0
                per.setNombre(rs.getString("nombre")); //1
                per.setApellido(rs.getString("apellido")); //2
                  userList.add(per);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
        
    }
  
    
}
