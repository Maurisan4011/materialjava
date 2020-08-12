
package transacciondb;
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "admin");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from persona");
            
              System.out.printf("%-20s%-20s%-20s\n","id","nombre","apellido");
              System.out.println("------------------------------------------------------");

            while (rs.next()) { 
                
                //para tipo int(10) se coloca getInt(), en este caso es getString()
                System.out.printf("%-20s%-20s%-20s\n", rs.getInt("idpersona"), rs.getString("nombre"),rs.getString("apellido"));
               // System.out.printf("%-20s%-20s%-20s\n", rs.getInt(1), rs.getString("nombre"), rs.getString("apellido"),rs.getString("dni"));
                System.out.println("-----------------------------------------------");
//                 System.out.println(rs.getString("idpersona"));
//                System.out.println(rs.getString("nombre"));
//                 System.out.println(rs.getString("apellido"));
            }
            
        } catch (Exception e) {
            System.out.println("Error de coneccion "+e.getMessage());
        }
        return con;
    }
    
    
}
