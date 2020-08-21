
package HerenciaInstanceof_001;



public class TestDatoInstanceof {

    public static void main(String[] args) {
        // TODO code application logic here  
        
        String nom = "hola";
        String no = new String(nom);
        
        Integer entero = new Integer(9);
        
        if (entero instanceof Integer) {
            
            /**Obtengo la verificacion de la clase**/
            System.out.println("entero es una instancia de Integer.."+entero.getClass());
        }
        
        if (no instanceof String) { //coloco nom y no
          
            /**Obtengo la verificacion de la clase**/
            System.out.println("nom y no son instancias de String.."+nom.getClass());
        }
      
        
    }
    
}
