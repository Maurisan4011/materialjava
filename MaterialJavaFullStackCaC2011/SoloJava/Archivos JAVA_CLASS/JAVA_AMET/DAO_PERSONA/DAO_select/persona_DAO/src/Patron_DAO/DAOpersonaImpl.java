
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
    public ArrayList<Object[]> listar() throws Exception {
        ArrayList<Object[]> datos = null;
        String sql = "select * from persona";
        try {
            this.conectar();
            PreparedStatement st = this.coneccion.prepareStatement(sql);
            
            datos = new ArrayList<Object[]>();
            ResultSet rs = st.executeQuery();
            resultadometa = rs.getMetaData();
            System.out.println("Correcto");
            
            while (rs.next()) {    
                
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for (int i = 0; i < resultadometa.getColumnCount(); i++) {
                    filas[i]=rs.getObject(i+1);
                }
                datos.add(filas);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        }finally{
        
            this.cerrar();
        }
        return datos;
        
    }
    
}
