/**PARA OBTENER = GET , Y ASIGNAR = SET**/
package get_set_Condicion;


public class Get_Set {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstudianteGetSet es1 = new EstudianteGetSet("pepe","argento",98778654);
        EstudianteGetSet es2 = new EstudianteGetSet("dany","garcia",96546533);
         es1.mostrar();
        es1.setDni(99765345); //si el valor "set" este es superior a "96000000" no lo coloca 
                              //y coloca el valor del constructor si es menor si lo coloca
        //llamando a los get y set
        //es1.mostrar();
        es2.mostrar();
        
        System.out.println("Dni: "+es1.getDni());
        System.out.println("Actual atributo nombre 1: "+es1.nombre); //se usa unicamente con atributo publico
        System.out.println("Actual atributo nombre 1 con Get: "+es1.getNombre()); //se usa con private y public
        //cambio pepe por julian
        es1.setNombre("julian");
        System.out.println("Nuevo atributo nombre 1: "+es1.nombre); //se usa unicamente con atributo publico
        System.out.println("Nuevo atributo nombre 1 con Get: "+es1.getNombre());//se usa con private y public
        
    }
    
}
