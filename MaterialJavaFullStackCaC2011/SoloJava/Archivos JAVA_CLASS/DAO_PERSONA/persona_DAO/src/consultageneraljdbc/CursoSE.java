
package consultageneraljdbc;

import Patron_DAO.DAOpersonaImpl;
import interfaces.DAOpersona;

public class CursoSE {

    public static void main(String[] args) {
       
       /*****REGISTRAR****/ 
//        Persona peR = new Persona();
//        peR.setNombre("pablo");
//        peR.setId(3);
//        peR.setApellido("garcia");
//        
//        try {
//            DAOpersona daoR = new DAOpersonaImpl();
//            daoR.registrar(peR);
//            
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        
        /****MODIFICAR***/
//        Persona perM = new Persona();
//        perM.setId(2);
//        perM.setNombre("luis");
//        perM.setApellido("argento");
//        
//        try {
//            DAOpersona daoM = new DAOpersonaImpl();
//            daoM.modificar(perM);
//            
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        /******ELIMINAR*****/
//        Persona perE = new Persona();
//        perE.setId(3);
//        
//        try {
//            DAOpersona daoE = new DAOpersonaImpl();
//            daoE.eliminar(perE);
//            
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        
        /******LISTAR O MOSTRAR******/
        try {
             DAOpersona daoL = new DAOpersonaImpl();
            for (Persona p : daoL.listar()) {
                System.out.println(" "+p.getId()+" "+p.getNombre()+" "+p.getApellido());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
