
package atributos_03;


public class Modificadores2 {
    
    String nombre = "daniel"; //aqui son variables de la clase modificadores
    int dni = 95784356;
    double altura = 1.78;
    public int edad = 23;
    //private final String apellido; //quito final y puedo colocar el set
    private String apellido ;
        

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
   
    
    
    
}
