package bucleWhile;

import java.util.Scanner;

public class DecirSiPrimo {

	public static void main(String[] args) {
		/* Programa que te pida un número y te diga si 
		 * es o no primo.
		 */

		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int numero, divisor, resto;

		
		System.out.println("Teclea un número");
		numero=teclado.nextInt();
		divisor=numero;
		
		//solucion
		do {
			divisor--;
			resto=numero%divisor;
		} while( resto != 0 && divisor > 2 ); 
		
		
		if (resto == 0) {
			System.out.println("No es primo");
		}
		else if (divisor == 2 ) {
			System.out.println("Es primo");
		}
		
		teclado.close();
		
		
	}

}
