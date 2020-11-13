package ObjetosDos;

public class ObjetosExample1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		persona1.setNombre("Mauricio");
		persona2.setNombre("Lorena");
		
		System.out.println("perna:" + persona1.getNombre());
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
	}

}
