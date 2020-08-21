
package HerenciaInstanceof_003;

public class Herencia {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p[] = new Persona[2];
        
        Persona ger = new Gerente("A","Alberto","apellido"); //rango A
        Persona pro = new Profesor("catedratico","pepe","sanchez"); //categoria catedratico
        
        p[0] = ger;
        p[1] = pro;
        
        for (Persona p1 : p) {  //"p" es la variable del Array
            System.out.println("nombre: " + p1.getNombre()); //atributo comun para "gerente y profesor" definido en persona
            if (p1 instanceof Profesor) {
                System.out.println("categoria: " + ((Profesor) p1).getCategoria());
            }
            if (p1 instanceof Gerente) {
                System.out.println("rango: " + ((Gerente) p1).getRango());
            }
        }
//        for (int i = 0; i < p.length; i++) {
//            
//            System.out.println("nombre: "+p[i].getNombre()); //atributo comun para "gerente y profesor" definido en persona
//            
//            if (p[i] instanceof Profesor) {
//                
//                System.out.println("categoria: "+((Profesor)p[i]).getCategoria());
//            }
//            if (p[i] instanceof Gerente) {
//                
//                System.out.println("rango: "+((Gerente)p[i]).getRango());
//            }
//        }
    }
    
}
