
package abstraccion2;


public class Ejecucion {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Animal p = new Perro(); //polimorfismo
        p.comer();
        p.moverse();
        
        Perro pe = new Perro();
        pe.comer();
        pe.moverse();
        
        Animal an = new Ave(); //polimorfismo
        an.comer();
        an.moverse();
        
        Ave a =new Ave("ave");
        a.comer();
        a.moverse();
    }
    
}
