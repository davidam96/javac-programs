package bucleWhile;

import java.util.Scanner;

public class NumeroSecretoConAyudaV2 {

	public static void main(String[] args) {
		
		/* Juego del número secreto:
		* Tenemos que pedir numeros hasta que acierte un número secreto
		* del 1 al 20 que tenemos almacenado en una variable.
		*/

		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
								
		//variables 
		int numero, intentos=0; 
		int secreto=(int)(Math.random()*100); //variable donde guardo el numero que hay que adivinar
		
		//soluciones
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			intentos++;
			if (numero < secreto) {
				System.out.println("Es mayor");
			}
			else if (numero > secreto) {
				System.out.println("Es menor");
			}
		} while (numero != secreto && intentos<7);
				
		teclado.close();
		
		if (numero == secreto) {
		System.out.println("ENHORABUENA!! HAS ACERTADO!!");
		}
		else {
		System.out.println("Has agotado todos tus intentos");
		}
	

	}

}