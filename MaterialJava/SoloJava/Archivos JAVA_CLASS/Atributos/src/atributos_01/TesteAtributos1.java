
package atributos_01;

public class TesteAtributos1 {
    
    public static int edad = 25; //puede acceder la instancia de la clase
    static String nombre = "daniel"; //al ser public y static no dara error "quita public static" ves colocandolo
    //String nombre = "daniel";//aqui no son variables del metodo main "dara error"

    public static void main(String[] args) { //METODO MAIN
       
    // String nombre = "daniel"; //aqui son variables del metodo main de tipo static "no dara error"
    // int dni = 95784356;
    // double altura = 1.78;
    
    /***ATRIBUTOS STATIC DE ESTA CLASE TESTEATRIBUTOS "VER ARRIBA"***/        
    System.out.println("nombre "+nombre+" edad "+edad);
    
    /****CREANDO UNA INSTANCIA U OBJETO***/
    Atributos1 mod = new Atributos1(); //INSTANCIA
        
    System.out.println("El nombre  "+mod.nombre+" y edad "+ mod.edad+" tiene altura "+mod.altura+" y dni "+mod.dni);
                                          
    //System.out.println("Apellido: "+mod.apellido); //sale con error porque es "private"

        /****SALIDAS ATRIBUTOS DE TIPO STATIC DE LA CLASE ATRIBUTOS****/
        System.out.println("precio variable referencia: "+mod.precio); //con variable referencia de clase sale advertencia
        System.out.println("precio nombre clase: "+Atributos1.precio); //cambio con referencia de clase 
       
        /***CUANDO EL METODO ES STATIC SOLO SE PUEDE EJECUTAR EN CLASES ANIDADAS NO SON INSTANCIABLES***/
        Atributos1.mostrar(); //no es instanciable con la variable de referencia "se usa nombre de clase"
        mod.saludo(); //instanciable con la variable de referencia no es static
        
    }
    
}
