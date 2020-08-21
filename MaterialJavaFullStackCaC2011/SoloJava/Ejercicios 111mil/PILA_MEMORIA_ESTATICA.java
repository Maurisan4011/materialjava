import java.util.Scanner;

/***PILA IMPLEMENTADA EN MEMORIA ESTATICA***/

public class PILA_MEMORIA_ESTATICA {
	
    //CREAMOS UN VECTOR SIN TAMAÑO SE LO PEDIREMOS AL USUARIO
	int VECTOR_PILA[];
	int CIMA;
	
	//CONSTRUCTOR
	
	public PILA_MEMORIA_ESTATICA(int medida){
		
		VECTOR_PILA = new int[medida]; //coloca medida-1 y cima en cero
		CIMA = -1; //por el vector comienza de cero medida-1
	}
	
	//METODO PUSH O EMPUJAR UN DATO
	
	public void PUSH_EMPUJAR(int dato){
		
		CIMA++; //coloca el dato en posicion cero
		VECTOR_PILA[CIMA] = dato; //empuja un dato en la cima posicion cero 
		
	}
	
	//METODO POP O SACAR UN DATO
	public int POP_SACAR(){
		
		int SACO = VECTOR_PILA[CIMA];//vector pila saca el valor que esta encima
		CIMA--; //como sacamos decrementa la cima
		return SACO; //dato sacado de la pila llamado saco
	}
	
	//METODO SI LA PILA ESTA VACIA DE TIPO BOOLEANO
	
	public boolean ISEMPTY_VACIA(){ // Cuando la Cima esta en -1 esta vacia
		
		if (CIMA == -1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//METODO SI LA PILA ESTA LLENA DE TIPO BOOLEANO
	public boolean ISFULL_LLENO(){ // Cuando el largo del vector es igual a la cima
		
		if (VECTOR_PILA.length == CIMA) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//METODO PARA SABER EL ULTIMO ELEMENTO O DE LA CIMA
	
	public int TOP_CIMA(){
		return VECTOR_PILA[CIMA];
	}
	
	//METODO PARA SABER EL TAMAÑO DE LA PILA
	public int SIZE_PILA_TAMNIO(){
		
		return VECTOR_PILA.length;
	}

	/***--- METODO MAIN O PRINCIPAL ---***/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int elemento, medida;
		
		
		try{
			
			System.out.println("introduzca tamaño de la PILA: ");
			medida = sc.nextInt();
			
			PILA_MEMORIA_ESTATICA apilar = new PILA_MEMORIA_ESTATICA(medida);
			
			do{
				System.out.printf("Opcion 1: EMPUJAR_PUSH\nOpcion 2: SACAR_POP\nOpcion 3: ¿PILA VACIA?\n"
						+ "Opcion 4: ¿PILA LLENA?\nOpcion 5: ELEMENTO ENCIMA CIMA\nOpcion 6: TAMAÑO PILA\nOpcion 7: SALIR");
				System.out.println("");
				System.out.println("Opcion a escoger: ");
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("Ingrese el elemento a empujar: ");
					elemento = sc.nextInt();
					
					if (!(apilar.ISFULL_LLENO())) { //si no esta llena la pila
						
						apilar.PUSH_EMPUJAR(elemento);
						
					}else{
						
						System.out.println("La Pila esta llena..");
					}
					break;
				case 2:
					
					if (!(apilar.ISEMPTY_VACIA())) { //si no esta vacia la pila
						
						System.out.println("El elemento obtenido es: "+apilar.POP_SACAR());
						
					}else{
						
						System.out.println("Pila Vacia...");
					}
					
					break;
				case 3:
					
					if (apilar.ISEMPTY_VACIA()) { //si la pila esta vacia
						
						System.out.println("La Pila esta vacia...");
						
					}else{
						
						System.out.println("La Pila No esta vacia...");
					}
					
					break;
				case 4:
					
					if (apilar.ISFULL_LLENO()) { //si la pila esta vacia
						
						System.out.println("La Pila esta llena...");
						
					}else{
						
						System.out.println("La Pila No esta llena y contiene espacio aun...");
					}
					
					break;
				case 5:
					
					if (!apilar.ISEMPTY_VACIA()) { //si la pila no esta vacia
						
						System.out.println("El elemento en la cima es..."+apilar.TOP_CIMA());
						
					}else{  //si esta vacia
						
						System.out.println("La Pila esta vacia no puedo sacar nada de la cima...");
					}
					
					break;
				case 6:
					
					System.out.println("El tamaño de la Pila es..."+apilar.SIZE_PILA_TAMNIO());
					
					break;
				case 7:
					
					break;

				default:
					System.out.println("Opcion incorrecta...");
					break;
				}
				
			}while(opcion!=7);
			
			sc.close();
			
		}catch(NumberFormatException n){
			
			System.out.println("Error.."+n.getMessage());
			
		}

	}

}
