/*
 * HERENCIA: HEREDA LOS ATRIBUTOS Y METODOS DE UNA CLASE (PUEDO HEREDAR EL APELLIDO DE ALGUIEN)
 * La Super Clase es la Clase Padre. y la clase Padre le hereda o da sus atributos y metodos a otras clases 
 * que viene a ser sub clases "clase hija" y las que heredan de las sub clases "hijas" son sub clases "nietas"
 * PADRE - HIJA - NIETA orden de jerarquia  " PERSONA:padre(superclase) - (Hombre: clase hija[subclase],
 * Mujer:clase hija[subclase]) 
 * - Hombre:Estudiante[nieta1], trabajador[nieta2], etc
 * Mujer:Estudiante, Trabajador"
 */
package Herencias_01;


public class Herencia {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hija h = new Hija();
        h.nombre = "pepe";
        System.out.println(" soy su hija y heredo el nombre de padre: "+h.nombre);
        h.soyPadre();
    }
    
}
