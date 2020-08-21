
package linkedlist_cfp_nº1;

import java.util.Scanner;

public class Persona {
    
    String nombre;
    String apellido;
    String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void getNombre() {
        System.out.println("Escriba su nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.next();
    }

    public void getApellido() {
        System.out.println("Escriba su apellido: ");
        Scanner sc = new Scanner(System.in);
        apellido = sc.next();
    }

    public void getDni() {
       System.out.println("Escriba su dni: ");
        Scanner sc = new Scanner(System.in);
        dni = sc.next();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
}
