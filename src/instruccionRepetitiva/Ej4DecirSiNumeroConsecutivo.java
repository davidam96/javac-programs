package instruccionRepetitiva;

import java.util.Scanner;

public class Ej4DecirSiNumeroConsecutivo {

	public static void main(String[] args) {
		  /* Programa que lea n�meros hasta que se teclee
	      /* un n�mero negativo y despu�s indique si
	      /* se ha dado el mismo n�mero dos veces consecutivas:
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int numero, numeroSiguiente;
	       boolean consecutivos=false;
	       
	       //solucion
	       System.out.print("Dame n�meros: ");
	       numero=teclado.nextInt();
	       do {
	          System.out.print("Dame n�meros: ");
	          numeroSiguiente=teclado.nextInt();
	          if (numero == numeroSiguiente) {
	          	consecutivos=true;
	          }
	          numero=numeroSiguiente;
	       } while (numero>=0 && numeroSiguiente>=0);
	       
	       teclado.close();
	       
	       if (consecutivos) {
	       	System.out.println("Ha habido dos n�meros consecutivos");
	       } else {
	       	System.out.println("No ha habido n�meros consecutivos");
	       }


	}

}
