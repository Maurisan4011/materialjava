
package atributos_00;

public class Perro1 { //sustantivo puede ser animado o inanimado "cosa o perro"
                     //categoria animado o inanimados, concretos: silla, arbol. abstractos: amor, justicia..
                      //categoria individual o colectivo "individual: obeja" y "colectivo o grupo: rebaño"
    
    String color = "marron"; //atributos "adjetivos o caracteristicas" que lo describe 
                             //adjetivos calificativo "lindo, feo, grande, negro, alto"
    String raza = "pitbull";
    int edad = 3;
    
    public void mostrarAtributos(){ //metodos o verbo 
    
        System.out.println("Mi perro es de raza "+raza+" de color "+color+" y con edad "+edad+" años");
    }
    
    public void ladrar(){  //metodo o verbo
    
        System.out.println(" Y ladra guau guau !!!!");
    }

    
}
