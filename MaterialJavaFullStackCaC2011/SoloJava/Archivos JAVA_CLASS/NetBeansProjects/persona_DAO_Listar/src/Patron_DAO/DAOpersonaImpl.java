
package Patron_DAO;

import consultageneraljdbc.Persona;
import interfaces.DAOpersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;


public class DAOpersonaImpl extends Conexion implements DAOpersona{
    
    public static Statement sentencia;
    public static ResultSet resultado;
    public static ResultSetMetaData resultadometa;

    @Override
    public void registrar(Persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.coneccion.prepareStatement("insert into persona(idpersona,nombre,apellido)values(?,?,?)");
            st.setInt(1, per.getId());
            st.setString(2, per.getNombre());
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
            PreparedStatement st = this.coneccion.prepareStatement("update persona set nombre=? , apellido=?  where idpersona=?");
            
            st.setString(1, per.getNombre());
            st.setString(2, per.getApellido());
            st.setInt(3, per.getId());
            st.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }finally{
        
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
       
        this.conectar();
        PreparedStatement st = this.coneccion.prepareStatement("delete from persona where idpersona=?");
        st.setInt(1, per.getId());
        st.executeUpdate();
        
    }

    @Override
    public ArrayList<Persona> listar() throws Exception { //Persona[]
        ArrayList<Persona> lista = null;//Persona[]
        String sql = "select * from persona";
        try {
            this.conectar();
            PreparedStatement st = this.coneccion.prepareStatement(sql);
            
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            //resultadometa = rs.getMetaData();
            
            
            while (rs.next()) {    
                
                //Object[] filas = new Object[resultadometa.getColumnCount()];//Persona[]
                Persona p = new Persona();
                //for (int i = 0; i < resultadometa.getColumnCount(); i++) {
                    p.setId(rs.getInt("idpersona"));//= rs.getObject(i+1); //obtiene los datos de la tabla y los mete en las filas
                    p.setNombre(rs.getString("nombre"));
                    p.setApellido(rs.getString("apellido"));
                //}
                lista.add(p);
            }
            
            rs.close();
            st.close();
            
            System.out.println("Correcto");
            
        } catch (Exception e) {
            throw e;
        }finally{
        
            this.cerrar();
        }
        return lista;
        
    }
    
}
