/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Conexion {
    protected Connection coneccion;
    private final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    
    
    public void conectar()throws Exception {
        try {
            Class.forName(JDBC_DRIVER);
            coneccion= DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root","admin");
            
        } catch (Exception e) {
            throw e;
        }
 
    }
    public void cerrar() throws SQLException {
        if(coneccion != null) {
            if(!coneccion.isClosed()) {
                coneccion.close();
            }
        }
    }
    
}
