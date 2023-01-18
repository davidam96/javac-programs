package bucleFor;

public class Prueba {

	public static void main(String[] args) {
		/*
		 * Prueba del bucle for:
		 * 
		 *    for (inicio; condición final; incremento) {
		 *    	Instrucciones;
		 * 	  }
		 */
		
		//bucle para escribir Hola 5 veces
		for (int i=1; i<=5 ; i++ ) {
			System.out.println("Hola");
		}
		
		//imprimir en pantalla por que vuelta voy
		for (int i=1; i<=5 ; i++ ) {
			System.out.println("Vuelta: " + i);
		}
		
		//imprimir en pantalla por que vuelta voy, pero contando al revés
		for (int i=5; i>=1; i--) {
			System.out.println("Vuelta: " + i);
		}
		
		//contar las vueltas de dos en dos
		for (int i=1; i<=15; i=i+2) {  //i=i+2 también lo puedes poner como i+=2
			System.out.println("Vuelta: " + i);
		}
		
		//repetir contando de 0.5 en 0.5
		for (double i=1; i<=5; i+=0.5) {
			System.out.println("Vuelta: " + i);
		}
		
		
		
	}

}
