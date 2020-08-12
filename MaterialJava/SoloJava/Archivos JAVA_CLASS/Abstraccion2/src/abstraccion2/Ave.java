
package abstraccion2;

/**
 *
 * @author laura.iusifid0706
 */
public class Ave extends Animal{

    public Ave() { //contructor por defecto
        
        super("ave");
    }

    public Ave(String nombre) {
        super(nombre);
    }
    
    @Override
    public void moverse(){
    
        System.out.println("el ave esta volando..");
    
    }
    
}
