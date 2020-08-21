
package atributos_00;

public class Perro2 { //sustantivo puede ser animado o inanimado "cosa o perro"
                     //categoria animado o inanimados, concretos: silla, arbol. abstractos: amor, justicia..
                      //categoria individual o colectivo "individual: obeja" y "colectivo o grupo: rebaño"
    
    public String color; //atributos "adjetivos o caracteristicas" que lo describe 
                             //adjetivos calificativo "lindo, feo, grande, negro, alto"
    public String raza;
    public int edad;
    public String nombre;
    
    public void mostrarAtributos(){ //metodos o verbo 
    
        System.out.println("Mi perro es de raza "+raza+" es de nombre "+nombre+" de color "+color+" y con edad "+edad+" años");
    }
    
    public void ladrar(){  //metodo o verbo
    
        System.out.println(" Y ladra guau guau !!!!");
    }
    
}
