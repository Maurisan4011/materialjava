package pruebaConexion;



import java.sql.*;
import javax.swing.JOptionPane;




public class Conexion {
    
   public Connection obtenerConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/usuarios","root", "admin");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from persona;");
            
            while (rs.next()){
                System.out.print(rs.getString("idPersona")+"\t");
                System.out.print(rs.getString("nombre")+"\t");
                System.out.print(rs.getString("apellido")+"\n");
            }
            
            //JOptionPane.showMessageDialog (null,"Conexión exitosa.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error de conexión a base de datos.\n"+e.getMessage());
        }
        return con;
    }
    
}
