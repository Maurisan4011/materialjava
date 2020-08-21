/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDao;

import ConsultaGeneral.Tienda;
import java.sql.PreparedStatement;
import Interface.DAOtienda;
/**
 *
 * @author alumno
 */
public class DAOpersonaImplm extends Conexion implements DAOtienda
{
    
    
    
    public void registrar(Tienda per) throws Exception {
        try {// usando herencia
            this.conectarme();
            PreparedStatement st= this.coneccion.prepareStatement("INSERT INTO cosas (id,producto,precio)values(?,?,?)");
            st.setInt(1,per.getId());
            st.setString(2,per.getProducto());
            st.setString(3,per.getPrecio());
            st.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();//cerrando la conexion
        }
    }{
   
    
        
        
        
}}
