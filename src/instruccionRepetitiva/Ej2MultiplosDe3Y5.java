package instruccionRepetitiva;

import java.util.Scanner;

public class Ej2MultiplosDe3Y5 {

	public static void main(String[] args) {
		/*  Programa que lea 5 n�meros y diga cu�ntos son m�ltiplos de 3,
		 *  cu�ntos m�ltiplos de 5 y cu�ntos no est�n incluidos 
		 *  en ninguno de los grupos anteriores.
		 */

		//declaro teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		int numero,multiplosDe3=0,multiplosDe5=0,noMultiplos=0,contador=0;
		
		//solucion
		System.out.println("Dame numeros: ");
		do {
		numero=teclado.nextInt();
			if (numero%3 == 0) {
				multiplosDe3++;
			}
			if (numero%5 == 0) {
				multiplosDe5++;
			}
			else if(numero%3 != 0 && numero%5 != 0) {
				noMultiplos++;
			}
		contador++;
		} while (contador <= 5);
		
		teclado.close();
		
		System.out.println(multiplosDe3+" multiplos de 3");
		System.out.println(multiplosDe5+" multiplos de 5");
		System.out.println(noMultiplos+" no son multiplos de ninguno");
		
	}

}
