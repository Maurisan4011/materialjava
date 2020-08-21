
package get_set_Condicion;


public class EstudianteGetSet {
    
    //private String nombre; //NOTA: Cuando es private no puedo usar "es1.nombre" tengo que usar "es1.getNombre()"
    public String nombre; //Aqui puedo usar "es1.nombre"
    public String apellido;
    private int dni; 

    /***CREANDO CONSTRUCTOR PARA INSTANCIAR O CREAR NUEVOS OBJETO
     * @param nomb*
     * @param apell
     * @param dn*/
    public EstudianteGetSet(String nomb, String apell, int dn) { //inicializamos el constructor con sus atributos
        this.nombre = nomb; //inicializacion de atributo nombre
        this.apellido = apell;
        this.dni = dn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) { 
        
        if(dni > 0 && dni < 96000000){
             this.dni = dni;
        }
       
    }

    
    
    public void mostrar(){
    
        System.out.println("mi nombre es "+nombre+" y mi apellido es "+apellido+" con dni "+dni);
    }
    
}
