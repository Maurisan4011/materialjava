/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_DAO;

import interfaces.DAOproductos;
import java.sql.PreparedStatement;
import tiendacmd.Productos;
/**
 *
 * @author alumno
 */
public class DAOproductoimpl extends Conexion implements DAOproductos {


    @Override
    public void Ingresar(Productos pro) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.coneccion.prepareStatement("insert into productos(id,producto,precio)values(?,?,?)");
            st.setInt(1, pro.getId());
            st.setString(2, pro.getProducto());
            st.setString(3, pro.getPrecio());
            st.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {

            this.cerrar();
        }

    }

}
