package Swapping;

public class SwappingConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom1 = "java";
		String nom2 = "prog";
		
		nom1 = nom1.concat(nom2); //unifico la frase
		System.out.println("primer nombre:"+nom1);
		nom2 = nom1.substring(0,(nom1.length()- nom2.length()));//corto la frase
		System.out.println("segundo nombre:"+nom2);
		nom1 = nom1.substring(nom2.length()); //paso de nom2 a nom1
		System.out.println("");
		System.out.println("primer nombre:"+nom1);
		System.out.println("segundo nombre:"+nom2);

	}

}
