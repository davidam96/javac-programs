package instruccionRepetitiva;

import java.util.Scanner;

public class Ej1SumaDeLosLeidos {

	public static void main(String[] args) {
		/* Programa que lea números hasta que se den cinco ceros
		 * y escriba después la suma de los números leídos.
		 */
		
		//declaro teclado
		Scanner teclado=new Scanner(System.in);
		
		//variables
		int numero,suma=0,ceros=0;
		
		//solucion
		System.out.println("Dame numeros: ");
		do {
		numero=teclado.nextInt();
			if (numero != 0) {
				suma+=numero;
			}
			else if (numero == 0) {
				ceros++;
			}
		} while (ceros < 5);
		
		
		teclado.close();
		
		System.out.println();
		System.out.println("Suma: "+suma);
		
	
	}

}
