
package HerenciaInstanceof_002;

public class TestAlumno {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno al = new Alumno();
        
        if (al instanceof Persona) { //"al" es la instancia de la clase Alumno al heredar los atributos de Persona
            
            System.out.println("Es una instancia de la Clase Alumno..");
        }
    }
    
}
