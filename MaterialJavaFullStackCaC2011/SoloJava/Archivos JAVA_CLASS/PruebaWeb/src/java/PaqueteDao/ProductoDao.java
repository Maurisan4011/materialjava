/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author laura.iusifid0706
 */
public class ProductoDao{

    private Connection conn;
    public ProductoDao() {
        
        this.conn = (Connection) new ConnectionFactory().getConnection();
    }
    
    //METODO REGISTRAR PRODUCTOS
    public void registro(Productos producto){
    
        String sql = "insert into codigofacil(id,nombre,clave) values(?,?,?)"; //falta codigo
        
        try {
            try (PreparedStatement stm = conn.prepareStatement(sql)) {
                stm.setInt(1, producto.getId());
                stm.setString(2, producto.getNombre());
                stm.setString(3, producto.getClave());
                
                stm.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //METODO LISTAR PRODUCTOS
    public ArrayList<Productos> listar(){
        ArrayList<Productos> product = new ArrayList<>();
        try {
            
            String sql = "select * from codigofacil";
            
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {                
                Productos prod = new Productos();
                prod.setId(rs.getInt("Id"));
                prod.setNombre(rs.getString("Nombre"));
                prod.setClave(rs.getString("Clave"));
                
                product.add(prod);
            }
            
            rs.close();
            stm.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return product;
    }
}
