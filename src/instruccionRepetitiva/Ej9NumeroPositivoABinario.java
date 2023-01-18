package instruccionRepetitiva;

import java.util.Scanner;

public class Ej9NumeroPositivoABinario {

	public static void main(String[] args) {
		/* Programa que lea un número entero positivo y lo transforme a su representación
		 * binaria.
		 */
		
		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int numDecimal, numBinario=0, divisor, resto, exponente=0;
		
		//interfaz de entrada
		System.out.println("Dime un número: ");
		numDecimal=teclado.nextInt();
		
		//solucion
		divisor=numDecimal;
		if (numDecimal>=0) {
			do {
				resto=divisor%2;
				if (resto == 1) {
					numBinario=(int) (numBinario + Math.pow(10,exponente));
				} 
				divisor=divisor/2;
				exponente++;
			} while (divisor >=1 );
			System.out.print("El número "+numDecimal+" se expresa en binario como "+numBinario);
		} else {
			System.out.println("Error: este programa no admite conversión a binario de números negativos");
		}

		teclado.close();
		

	}

}
