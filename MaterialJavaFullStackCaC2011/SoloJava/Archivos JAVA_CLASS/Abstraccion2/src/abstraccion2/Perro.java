
package abstraccion2;


public class Perro extends Animal{

    public Perro(){
        super(); //hereda los atributos del constructor Animal
        setNombre("perro");
    }
    
    
    
    @Override
    public void moverse(){
    
        System.out.println("el perro se esta moviendo...");
    }
}
