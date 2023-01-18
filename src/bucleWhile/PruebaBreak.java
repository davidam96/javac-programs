package bucleWhile;

import java.util.Scanner;

public class PruebaBreak {

	public static void main(String[] args) {
		/* Programa que pida numeros hasta poner el numero 0
		 * y al finalizar nos muestre la cuenta y la suma de todos ellos.
		 * Lo vamos a programar usando la instrucción BREAK
		 */
		
		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
		
		//variable para guardar los numeros 
		int numero, suma=0, contador=0;
		
		//Bucle e instrucciones 
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			if (numero==0) {
				break;
			}
			contador++; //cuento un numero mas
			suma = suma + numero;
		} while (true);
		
		teclado.close();
		
		System.out.println("Total de numeros tecleados: " + contador);
		System.out.println("Suma total de los numeros: " + suma);
		

	}

}
