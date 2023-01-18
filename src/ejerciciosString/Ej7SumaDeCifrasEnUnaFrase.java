package ejerciciosString;

import java.util.Scanner;

public class Ej7SumaDeCifrasEnUnaFrase {

	public static void main(String[] args) {
		/* Programa que sume todas las cifras de los n�meros que aparecen en una
		 * cadena de caracteres.
		 * Introduciendo: �15 de Noviembre de 2012�
		 * Da como salida: 11
		 */

		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		String frase;
		char letra;
		int suma=0;
		
		//interfaz de entrada
		System.out.print("Escribe algo: ");
		frase=teclado.nextLine();
		
		//herramientas nuevas que vamos a usar:
		
			// para comprobar si una letra corresponde a un d�gito
			// Character.isDigit(letra);
		
			// convertir una letra a n�mero
			// Integer.parseInt(String.valueOf(letra))
		
		
		//soluci�n
		for (int i=0; i<=frase.length()-1; i++) {
			letra=frase.charAt(i);
			if (Character.isDigit(letra)) {
				suma = suma + Integer.parseInt(String.valueOf(letra));
			}	
		}
		
		System.out.println("Suma de los n�meros de la frase: "+suma);
		
		teclado.close();
		
		
	}

}
