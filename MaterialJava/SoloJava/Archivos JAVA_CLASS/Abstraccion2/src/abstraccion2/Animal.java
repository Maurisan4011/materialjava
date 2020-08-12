
package abstraccion2;


public abstract class Animal {  //clase padre abstracta
    
    private String nombre;

    public Animal() {
        
    }
    public Animal(String nombre) { //constructor con parametro
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer(){
    
        System.out.println("El "+nombre+" esta comiendo..");
    }
    
    /**METODO ABSTRACTO**/
    public abstract void moverse(); //el ave vuela, el perro camina en cuatro patas
}
