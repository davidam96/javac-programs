package instruccionRepetitiva;

import java.util.Scanner;

public class Ej12PiramideDeNumeros {

	public static void main(String[] args) {
		/* Programa que solitite un numero n y luego muestre por pantalla la siguiente figura:
		 *                     1
		 *                   1 2 1
		 *                    ...
		 *             1 2 ... n ... 2 1  
		 */

		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int n;
		
		//interfaz de entrada
		System.out.println("Introduce un número: ");
		n=teclado.nextInt();
		
		//solucion
		for (int i=n; i>=0; i--) {  //triangulo superior derecho, se hace con i decreciente
			for (int j=1; j<=i*2; j++ ) { //este bucle para el espaciado de cada fila de relleno
				System.out.print(" ");
			}
				for (int j=1; j<=n-i; j++ ) {  //este bucle para las unidades de relleno por fila
					System.out.print(j);  
					System.out.print(" ");
				}
				for (int j=n-i-1; j>0; j-- ) {  //este bucle para las unidades de relleno por fila
					System.out.print(j);  
					System.out.print(" ");
				}
		System.out.println();
		}
		
		teclado.close();
		
	}

}
