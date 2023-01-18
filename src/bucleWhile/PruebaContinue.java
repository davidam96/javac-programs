package bucleWhile;

import java.util.Scanner;

public class PruebaContinue {

	public static void main(String[] args) {
		/* Programa que pida numeros hasta poner el numero 0 
		 * y solo sume los positivos, de los negativos pasamos.
		 * Lo vamos a programar usando la instruccion CONTINUE
		 */

		//linea para usar teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int numero, suma=0;
		
		do {
			System.out.println("Teclea un numero: ");
			numero=teclado.nextInt();
			if (numero<=0) {
				continue;
			}
			suma=suma + numero;
		} while (numero!=0);
		
		teclado.close();
		
		System.out.println("Suma total de los numeros: " + suma);
		
	}

}
