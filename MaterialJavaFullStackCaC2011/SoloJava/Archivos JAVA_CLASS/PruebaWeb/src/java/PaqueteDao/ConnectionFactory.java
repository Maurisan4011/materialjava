/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDao;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author laura.iusifid0706
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost/basecodigo", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
