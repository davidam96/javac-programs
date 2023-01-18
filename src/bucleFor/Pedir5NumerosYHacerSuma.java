package bucleFor;

import java.util.Scanner;

public class Pedir5NumerosYHacerSuma {

	public static void main(String[] args) {
		/* Programa que pida que tecleemos un numero 5 veces
		 * y nos muestre la suma de los 5
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int numero,suma;
		suma=0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma=numero + suma;  // suma+=numero;
		}
		
		teclado.close();
		
		System.out.println("La suma de los 5 números es: " + suma);
		
	}

}
