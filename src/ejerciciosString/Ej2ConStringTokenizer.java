package ejerciciosString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej2ConStringTokenizer {

	public static void main(String[] args) {
		// Contar palabras usando tokenizer
		
		Scanner teclado=new Scanner(System.in);
		
		String frase;
		int contadorDePalabras=0;
		
		System.out.print("Escribe una frase: ");
		frase=teclado.nextLine();
		
		//voy a usar la herramienta StringTokenizer para trocear una frase
		StringTokenizer fraseTroceada;
		
		//pido que trocee la frase
		fraseTroceada=new StringTokenizer(frase , "., "); // va troceando el 'String Frase' cada vez que encuentra: {".", " ", ","}
		
		//pregunto a fraseTroceada cuántos trozos han salido
		contadorDePalabras=fraseTroceada.countTokens();
		
		System.out.println("Palabras: "+contadorDePalabras);
		
	}

}
