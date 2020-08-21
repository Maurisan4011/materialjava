
package conexion;

//import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.SQLException;


public class Conectar {
    
    
    Statement stm;

    public Conectar() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            //Connection conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1/conexion?user=root&password=admin");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/conexion","root","admin");
            Statement stm = conectar.createStatement();
            ResultSet rs = stm.executeQuery("select * from idconexion");
            while (rs.next()) {   
                System.out.println(rs.getString("id")); 
                System.out.println(rs.getString("nombre"));
                 
            }
            System.out.println("coneccion exitosa");
            
        } catch (ClassNotFoundException e) {
            
            System.out.println("Error de coneccion "+e.getMessage());
        }
        
    }
    

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Conectar c = new Conectar();
    }
    
}
