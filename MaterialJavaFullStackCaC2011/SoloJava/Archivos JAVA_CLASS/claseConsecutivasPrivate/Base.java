
package claseConsecutivasPrivate;

public class Base { //CLASE PADRE 
    
    int roll;
    String nombre;

    public Base(int roll, String nombre) { //declaramos clase Base "private Base(){}" y no podra Derivada acceder a sus miembros
        this.roll = roll;
        this.nombre = nombre;
    }
    
    public void mostrar(){
    
        System.out.println("Roll nº: "+roll);
        System.out.println("nombre: "+nombre);
    }
 
} //FIN CLASE BASE

class Derivada extends Base{ //al colocar modificador private sale error
                                      //modificador private no es permitido aqui
                                   //si es public dice: Debe ser declarado en un archivo llamado derivada

    int marca;

    public Derivada(int marca, int roll, String nombre) {
        super(roll, nombre);
        this.marca = marca;
    } 
    
    public void mostrador(){
    
        mostrar();
        System.out.println("marca: "+marca);
    }
}//FIN CLASE DERIVADA

class privada{ //CLASE DE EJECUCION

    public static void main(String[] args){
    
        Derivada der = new Derivada(1, 21, "pepe");
        der.mostrador();
    }
} //FIN CLASE PRIVADA
