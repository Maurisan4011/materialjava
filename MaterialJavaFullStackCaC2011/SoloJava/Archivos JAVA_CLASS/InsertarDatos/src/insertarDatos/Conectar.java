/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertarDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Invitado
 */
public class Conectar {
    public Connection conexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/usuarios","root", "admin");
                      
            //JOptionPane.showMessageDialog (null,"Conexión exitosa.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error de conexión a base de datos.\n"+e.getMessage());
        }
        return con;
    }
}
