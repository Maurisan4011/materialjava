package ArraylistPersona_01;


import java.util.ArrayList;

public class TestPersona {
    
    public static void main(String args[]){
    

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona(157865,"alberto","perez","  oanda 145","programador","correo@gmail.com"));
        personas.add(new Persona(169832,"dany   ","garcia"," oanda 134","futbolista"," futball@gmail.com"));
        personas.add(new Persona(188898,"pepe   ","sanchez","oanda 156","humorista","  humor@gmail.com"));
        

        System.out.printf("   Dni          nombre   apellido  Direccion   ocupacion  \tEmail\n");
        for (int i = 0; i < personas.size(); i++) {
           
            System.out.println("  "+personas.get(i).getIdentificacion()+"  \t "+personas.get(i).getNombres()
                              +"  "+personas.get(i).getApellidos()+"  "+personas.get(i).getDireccion()
                              +"  "+personas.get(i).getOcupacion()+"  "+personas.get(i).getEmail());
        }
    }
    
}
