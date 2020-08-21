/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaventana;

import Patron_DAO.Conexion;
import java.util.Scanner;
import Patron_DAO.DAOproductoimpl;
import interfaces.DAOproductos;

/**
 *
 * @author alumno
 */
public class TiendaCMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String producto;
        String precio;
        
        Scanner sc = new Scanner(System.in);
        
        Productos pro = new Productos();
        
        System.out.println("Ingrese un producto");
        producto=sc.nextLine();
        pro.setProducto(producto);
        
        System.out.println("Ingrese precio del producto");
        precio=sc.nextLine();
        
        pro.setPrecio(precio);
        
         try {
            DAOproductos daoR = new DAOproductoimpl(); //DAoproductos es padre de DAOproductoimpl, por estar implements
            daoR.Ingresar(pro);
            
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
