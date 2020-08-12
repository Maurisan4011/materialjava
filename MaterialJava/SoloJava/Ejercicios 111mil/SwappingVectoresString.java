package Swapping;

public class SwappingVectoresString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom1[] = {"geografia"};
		String nom2[] = {"fisica"};
		
		/* num1 = 2;
		 * num2 = 3;
		 * num1 = num1 + num2 // num1=5
		 * num2 = num1 - num2 // num2=2-5 entonces num2= 3 valor absoluto
		 * num1 = num1 - num2 // num1=5-3 entonces num1= 2 */
		
		nom1[0] = nom1[0].concat(nom2[0]); //unifico la frase
		nom2[0] = nom1[0].substring(0,(nom1[0].length()- nom2[0].length()));//corto la frase
		nom1[0] = nom1[0].substring(nom2[0].length()); //paso de nom2 a nom1
		
		System.out.println("primer nombre:"+nom1[0]);
		System.out.println("segundo nombre:"+nom2[0]);
	}

}
