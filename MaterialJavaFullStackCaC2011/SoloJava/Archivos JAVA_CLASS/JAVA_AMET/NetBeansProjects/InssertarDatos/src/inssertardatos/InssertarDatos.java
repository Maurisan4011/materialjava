
package inssertardatos;

import javax.swing.JOptionPane;

public class InssertarDatos {

    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
       if (conexion.obtenerConexion() != null) {
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "no se realizo la conexion");
        }
       
     
    }
    
}
