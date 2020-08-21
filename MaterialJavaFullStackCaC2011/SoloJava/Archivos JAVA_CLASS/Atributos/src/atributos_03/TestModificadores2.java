
package atributos_03;

public class TestModificadores2 {
    
    public static void main(String[] args) {
    
 
    /****CREANDO UNA INSTANCIA U OBJETO***/
        Modificadores2 mod = new Modificadores2();
        
        mod.setEdad(34);
        mod.setApellido("argento");
        
        System.out.println("El nombre  "+mod.nombre+" y edad "+mod.edad+" tiene altura "+mod.altura+" y dni "+mod.dni);
        
        System.out.println("apellido: "+mod.getApellido()+" edad "+mod.getEdad()); //apellido es de tipo private no se puede acceder con "mod.nombre"
                                                            //se accede con "mod.getApellido()"
        
    }
    
}
