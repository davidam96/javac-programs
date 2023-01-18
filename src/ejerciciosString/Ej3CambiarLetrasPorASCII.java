package ejerciciosString;

import java.util.Scanner;

public class Ej3CambiarLetrasPorASCII {

	public static void main(String[] args) {
		/* Programa que codifique una cadena cambiando cada letra por la siguiente 
		 * en el código ASCII.
		 * Introduciendo: “Lunes”
		 * Da como salida: “Mvoft”
		 */

		// preparo teclado
		Scanner teclado=new Scanner(System.in);

		//declaro variables
		String frase;
		char letraFrase, letraCifrada;
		int codigoLetraASCII, cifradoASCII;

		//intefaz de entrada
		System.out.println("Escribe una frase: ");
		frase=teclado.nextLine();

		//solución
		System.out.print("Frase codificada: ");
		for (int i=0; i<=frase.length()-1; i++) {
			letraFrase=frase.charAt(i);
			codigoLetraASCII= (int) letraFrase;
			cifradoASCII=codigoLetraASCII+1;
			letraCifrada= (char) cifradoASCII;
			System.out.print(letraCifrada);
		}

		teclado.close();


	}

}
