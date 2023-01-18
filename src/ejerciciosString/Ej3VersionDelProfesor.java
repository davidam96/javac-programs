package ejerciciosString;

import java.util.Scanner;

public class Ej3VersionDelProfesor {

	public static void main(String[] args) {
		 //Programa que blabla a código ASCII
		
		char letra='a';
		
		letra++; //se puede hacer esto
		//letra = letra + 1; // da error
		letra = (char) (letra + 1); //pero esto sí que se puede hacer
		
		System.out.println(letra);
		
		System.out.println("----------------------------------------");
		// ------------------------------------------------------------
		
		Scanner teclado=new Scanner(System.in);
		
		String frase;
		StringBuilder fraseModerna;
		
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		
		//convertir frase antigua en moderna
		fraseModerna = new StringBuilder(frase);
		
		for (int i=0; i<=fraseModerna.length()-1; i++) {
			letra=fraseModerna.charAt(i);
			fraseModerna.setCharAt(i, letra++); // con este método se puede sustituir el valor de una letra en la posición i
		}

	}

}
