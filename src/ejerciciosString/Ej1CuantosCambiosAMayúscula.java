package ejerciciosString;

import java.util.Scanner;

public class Ej1CuantosCambiosAMayúscula {

	public static void main(String[] args) {
		/* Programa que pase un String a mayúsculas y diga cuantas letras han
		 * cambiado.
		 * Introduciendo: “Hola a Todos”
		 * Da como salida: “HOLA A TODOS” 8 cambios
		 */

		// preparo teclado
		Scanner teclado=new Scanner(System.in);

		//declaro variables
		String frase, fraseMayus;
		char letraFrase, letraFraseMayus;
		int contador=0;

		//intefaz de entrada
		System.out.print("Escribe algo: ");
		frase=teclado.nextLine();

		//solución
		fraseMayus=frase.toUpperCase();
		
		for (int i=0; i<=frase.length()-1; i++) {
			letraFrase=frase.charAt(i);
			letraFraseMayus=fraseMayus.charAt(i);
			String l=String.valueOf(letraFrase); //convierto el tipo primitivo 'char letraFrase' a tipo clase 'String l' para luego poder hacer un 'equals()' en el if de adelante (si lo hubiera dejado en tipo 'char', tendría que haber puesto '==' en el if)
			String lMayus=String.valueOf(letraFraseMayus); //convierto el tipo primitivo 'char letraFraseMayus' a tipo clase 'String lMayus' para luego poder hacer un 'equals()' en el if de adelante
			if (l.equals(lMayus) == true) { //si la letra de la frase original es igual a la letra de la frase en mayúsculas...
				contador++;
		}
	}

	System.out.println("Frase en mayúsculas: "+fraseMayus + "; " + contador + " cambios");

	teclado.close();


	}

}
