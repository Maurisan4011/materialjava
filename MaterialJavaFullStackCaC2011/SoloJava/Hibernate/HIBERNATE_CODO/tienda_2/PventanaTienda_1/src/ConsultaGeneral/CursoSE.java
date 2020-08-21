/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultaGeneral;

import Interface.DAOtienda;
import PatronDao.DAOpersonaImplm;

/**
 *
 * @author alumno
 */
public class CursoSE {
    public static void main (String [] args){
            Tienda tie= new Tienda();
            
            tie.setId(2);
            tie.setPrecio("22,5");
            tie.setProducto("Alfajor");
        
        try {
           DAOtienda DAot= new DAOpersonaImplm();
           DAot.registrar(tie);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
    }
}
