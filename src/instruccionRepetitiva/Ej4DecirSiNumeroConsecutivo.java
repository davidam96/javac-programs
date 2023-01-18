package instruccionRepetitiva;

import java.util.Scanner;

public class Ej4DecirSiNumeroConsecutivo {

	public static void main(String[] args) {
		  /* Programa que lea números hasta que se teclee
	      /* un número negativo y después indique si
	      /* se ha dado el mismo número dos veces consecutivas:
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int numero, numeroSiguiente;
	       boolean consecutivos=false;
	       
	       //solucion
	       System.out.print("Dame números: ");
	       numero=teclado.nextInt();
	       do {
	          System.out.print("Dame números: ");
	          numeroSiguiente=teclado.nextInt();
	          if (numero == numeroSiguiente) {
	          	consecutivos=true;
	          }
	          numero=numeroSiguiente;
	       } while (numero>=0 && numeroSiguiente>=0);
	       
	       teclado.close();
	       
	       if (consecutivos) {
	       	System.out.println("Ha habido dos números consecutivos");
	       } else {
	       	System.out.println("No ha habido números consecutivos");
	       }


	}

}
