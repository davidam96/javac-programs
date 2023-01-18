package instruccionRepetitiva;

import java.util.Scanner;

public class Ej9NumeroPositivoABinario {

	public static void main(String[] args) {
		/* Programa que lea un n�mero entero positivo y lo transforme a su representaci�n
		 * binaria.
		 */
		
		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int numDecimal, numBinario=0, divisor, resto, exponente=0;
		
		//interfaz de entrada
		System.out.println("Dime un n�mero: ");
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
			System.out.print("El n�mero "+numDecimal+" se expresa en binario como "+numBinario);
		} else {
			System.out.println("Error: este programa no admite conversi�n a binario de n�meros negativos");
		}

		teclado.close();
		

	}

}
