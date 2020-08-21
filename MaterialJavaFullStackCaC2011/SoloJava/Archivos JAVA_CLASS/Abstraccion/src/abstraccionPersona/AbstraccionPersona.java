/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionPersona;

/**
 *
 * @author Branko
 */
public class AbstraccionPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteAbs es = new EstudianteAbs("david@email.com",1.60,"David",33222111);
        es.mostrar();
        es.setNombre("Juan");
        es.setDni(44555666);
        es.getNombre();
        es.getDni();
        
        es.mostrar();
    }
    
    
}
