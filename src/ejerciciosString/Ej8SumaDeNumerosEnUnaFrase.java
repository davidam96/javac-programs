package ejerciciosString;

import java.util.Scanner;

public class Ej8SumaDeNumerosEnUnaFrase {

	public static void main(String[] args) {
		/* Programa que sume  los números completos  que aparezcan en una
		 * cadena de caracteres.
		 */

		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		String frase;
		int acumulador=0, j=1;
		char letra, letraSiguiente;
		
		// para comprobar si una letra corresponde a un dígito
			// Character.isDigit(letra);
				
		// convertir una letra a número
			// Integer.parseInt(String.valueOf(letra))
		
		//interfaz de entrada
		System.out.print("Escribe algo: ");
		frase=teclado.nextLine();
		
		//solución
		for (int i=frase.length()-1; i>=1; i--) {
			letra=frase.charAt(i);
			letraSiguiente=frase.charAt(i-1);
			if (Character.isDigit(letra) && Character.isDigit(letraSiguiente)) {
				acumulador=acumulador + Integer.parseInt(String.valueOf(letra))*j;
				j=j*10;
			} else if (Character.isDigit(letra)) {
				acumulador=acumulador + Integer.parseInt(String.valueOf(letra))*j;
			} else if (Character.isDigit(letra) == false) {
			j=1;
			}
		}
		
		System.out.println("Suma de los números enteros dentro de tu frase: "+acumulador);
		
		teclado.close();
		
	}

}
