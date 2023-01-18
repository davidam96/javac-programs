package ejerciciosString;

import java.util.Scanner;

public class Ej4RotacionesDeTexto {

	public static void main(String[] args) {
		/* Programa que rote una cadena tantas veces como se le diga.
		 * Introduciendo: “Lunes”
		 * Rotaciones: 3
		 * Da como salida: “nesLu”
		 * (El nº de rotaciones es la cantidad de letras del final que llevamos al principio)
		 */
		
		//declaro teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		String frase;
		StringBuilder fraseModerna;
		int n;
		char letra;
		
		//interfaz de entrada
		System.out.print("Dime algo: ");
		frase=teclado.nextLine();
		System.out.print("¿Cuántas letras rotamos?: ");
		n=teclado.nextInt();
		
		//solución
		fraseModerna=new StringBuilder(frase);
		for (int i=1; i<=n; i++) {
			//saco la letra del final
			letra=fraseModerna.charAt(frase.length()-1);
			//quito la letra del final
			fraseModerna.deleteCharAt(fraseModerna.length()-1);
			//añado una letra al principio
			fraseModerna.insert(0, letra);
		}
		
		System.out.println(fraseModerna);
		
		teclado.close();
		
		
		

	}

}
