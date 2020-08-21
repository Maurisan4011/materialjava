
package atributos_01;

/***ATRIBUTOS: ES UNA ESPECIFICACION QUE DEFINE UNA PROPIEDAD O CUALIDADES DE UN OBJETO "COLOR, ALTURA, NOMBRE ETC"
    VARIABLES: SON ESPACIOS RESERVADOS EN MEMORIA QUE COMO SU NOMBRE INDICA, PUEDEN CAMBIAR DE CONTENIDO
    A LO LARGO DE LA EJECUCION DE UN PROGRAMA**/

public class Atributos1 {
    
    String nombre = "daniel"; //aqui son variables de la clase modificadores
    int dni = 95784356;
    double altura = 1.78;
    public int edad = 23;
    
    //final: hace que el atributo se convierte en una constante
    private final String apellido = "argento"; 
    
    //static: es de modo compartido "variable que puede acceder cualquier instancia de la clase"
    public static int precio = 12000; 
    
    public static void mostrar(){
    
        System.out.println("Hola java..");
    }
    
    public void saludo(){
    
        System.out.println("Saludos a todos..");
    }
    
}
