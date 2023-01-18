package bucleWhile;

import java.util.Scanner;

public class ContarYSumarNumeros {

	public static void main(String[] args) {
		/*
		 * Programa que pida números hasta poner el numero 0
		 * y al finalizar nos muestre la cuenta y la suma de todos ellos
		 */

		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
				
		//variable para guardar los numeros 
		int numero,suma=0,cuenta=0;
				
		//Bucle e instrucciones 
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			suma+=numero; //acumulo el número en la variable suma
			cuenta++; //cuenta un número mas a las vueltas del bucle que lleve
		} while (numero != 0);
				
		teclado.close();
		
		System.out.println("La suma de todos los números es: " + suma);
		System.out.println("Has tecleado " + cuenta + " números");
				
		
	}

}
