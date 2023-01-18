package ejerciciosString;

import java.util.Scanner;

public class Ej6Palindromo {

	public static void main(String[] args) {
		/* Programa que descubra si una palabra es o no pal�ndroma, es decir se lee
		 * igual del derecho que del rev�s.
		 * Introduciendo: �oso�
		 * Da como salida: true
		 */

		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro varibales
		String frase;
		StringBuilder fraseModerna;
		
		//interfaz de entrada
		System.out.print("Escribe una palabra: ");
		frase=teclado.nextLine();
		
		//convertir la frase a StringBuilder para poder usar un comando que la da la vuelta
		fraseModerna=new StringBuilder(frase);
		
		//dar la vuelta a la frase
		fraseModerna=fraseModerna.reverse();
		
		//comparo las dos frases
		if (frase.equals(fraseModerna.toString() )) {
			System.out.println("Es pal�ndroma");
		} else {
			System.out.println("No es pal�ndorma");
		}
		
		teclado.close();
	
		
	}

}
