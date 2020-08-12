/*
 *ATRIBUTOS: SON LOS PERTENECIENTES A LA MISMA CLASE, 
 *TIENEN MODIFICADORES DE TIPO PUBLICO, PRIVADO, DEFAULT ETC
 */
package atributos_02;


public class ModificadoresAtributos {

    String nombre = "daniel"; //aqui son variables de la clase modificadores
    int dni = 95784356;
    double altura = 1.78;
    public int edad = 23;
    private final String apellido = "argento"; //atributo con modificador private
    
    
    public static void main(String[] args) {
    
    /****CREANDO UNA INSTANCIA U OBJETO "INSTANCIAR: ES CREAR" ***/
    ModificadoresAtributos mod = new ModificadoresAtributos();
        
    System.out.println("El nombre  "+mod.nombre+" y edad "+mod.edad+" tiene altura "+mod.altura+" y dni "+mod.dni);
                
                            
    System.out.println("Con apellido  "+mod.apellido); //accedo por estar dentro de la clase
        
    }
    
}
