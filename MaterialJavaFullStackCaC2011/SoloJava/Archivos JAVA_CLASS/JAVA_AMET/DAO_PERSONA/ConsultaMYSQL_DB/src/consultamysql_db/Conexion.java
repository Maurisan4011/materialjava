
package consultamysql_db;
import java.sql.*;

public class Conexion {

    public Conexion() {
        
    }
    
    public Connection obtenerConexion(){
    
        Connection con = null;
        try {
            /***instanciar driver de mi BD***/
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /***realizar la conexion a la BD***/
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "root", "admin");
            
        } catch (Exception e) {
            System.out.println("Error de coneccion "+e.getMessage());
        }
        return con;
    }
    
}
