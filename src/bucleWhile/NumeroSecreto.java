package bucleWhile;

import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		/* Juego del número secreto:
		 * Tenemos que pedir numeros hasta que acierte un número secreto
		 * del 1 al 20 que tenemos almacenado en una variable.
		 */

		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
						
		//variables 
		int numero; //en esta variable voy a guardar el numero que tecleen
		int secreto=(int)(Math.random()*10); //variable donde guardo el numero que hay que adivinar
		
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
		} while (numero != secreto);
		
		teclado.close();
		
		System.out.println("ENHORABUENA!! HAS ACERTADO!!");

		
		
	}

}
