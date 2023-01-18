package bucleWhile;

import java.util.Scanner;

public class PedirNumerosHasta0ConWhile {

	public static void main(String[] args) {
		/* Programa que pida numeros hasta que 
		 * tecleemos el numero 0
		 */
		
		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
		
		//variable para guardar los numeros 
		int numero;
		
		//poner las instrucciones antes del bucle se le llama lectura anticipada
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		//Bucle e instrucciones 
		while ( numero != 0 ) { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
		}
		
		teclado.close();
		System.out.println("Ya hemos terminado.");
		

	}

}