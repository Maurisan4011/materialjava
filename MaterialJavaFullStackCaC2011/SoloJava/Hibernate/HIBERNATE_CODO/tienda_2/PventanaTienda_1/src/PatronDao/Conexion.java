/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDao;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author alumno
 */
public class Conexion {
        
        protected Connection coneccion;
        private final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
        
        public void conectarme()throws Exception{
            
            try {
                Class.forName(JDBC_DRIVER);
                coneccion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","il1998");
            } catch (Exception e) {
                throw e;
            }
            
     }
        
        public void cerrar()throws SQLException{
            if(coneccion!= null){
                if(coneccion.isClosed()){
                   coneccion.close();
                }
            }
        }
    
}
