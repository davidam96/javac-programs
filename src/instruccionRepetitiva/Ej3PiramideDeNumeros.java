package instruccionRepetitiva;

import java.util.Scanner;

public class Ej3PiramideDeNumeros {

	public static void main(String[] args) {
		 /* Programa que solitite un numero n
	       * y luego muestre por pantalla la siguiente figura:
	       * 1
	       * 12
	       * 123..n
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int n;
	       
	       //interfaz de entrada
	       System.out.print("Teclea un número: ");
	       n=teclado.nextInt();
	       
	       teclado.close();
	       
	       //solucion
	       for (int i=1; i<=n ; i++) {
	    	   for (int j=1 ; j<=i  ; j++) {
	       			if (j<i) {
	       				System.out.print(j+ " ");
	       			}
	       			else if (j==i) {
	       				System.out.println(j);
	       			}
	       		}
	       }


	}

}
