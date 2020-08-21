    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultageneralJDBC;

import Patron_DAO.DAOPersonaImpl;
import Interfaces.DAOPersona;

public class CursoSE {
    public static void main (String[] args){
        /***REGISTRAR***/
        Persona peR = new Persona();
        peR.setNombre("Carla");
        peR.setId(4);
        peR.setApellido("Predin");
        
        try {
            DAOPersona daoR = new DAOPersonaImpl();
            daoR.registrar (peR);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        /***MODIFICAR***/
//        Persona perM = new Persona ();
//        perM.setId(1);
//        perM.setNombre("Luis");
//        perM.setApellido("Alfonso");
//        
//        try { 
//            DAOPersona daoM = new DAOPersonaImpl();
//            daoM.modificar(perM);
//        } catch (Exception e ){
//            System.out.println(e.getMessage());
//        }
//        
        /***ELIMINAR***/
//        Persona perE = new Persona ();
//        perE.setId(1);
//        
//        try {
//            DAOPersona daoE = new DAOPersonaImpl();
//            daoE.eliminar(perE);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        /****LISTAR O MOSTRAR****/
//        try { 
//            DAOPersona daoL = new DAOPersonaImpl();
//            for (Persona p: daoL.listar()){
//                System.out.println(" "+p.getId()+" "+p.getNombre()+" "+p.getApellido() );
//            } 
//        }catch (Exception e ){
//            System.out.println(e.getMessage());
//        }
        
    }
    
}
