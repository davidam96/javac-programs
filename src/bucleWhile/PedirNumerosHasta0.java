package bucleWhile;

import java.util.Scanner;

public class PedirNumerosHasta0 {

	public static void main(String[] args) {
		/* Programa que pida numeros hasta que 
		 * tecleemos el numero 0
		 */
		
		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
		
		//variable para guardar los numeros 
		int numero;
		
		//Bucle e instrucciones 
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
		} while (numero != 0);
		
		teclado.close();
		System.out.println("Ya hemos terminado.");
		

	}

}
