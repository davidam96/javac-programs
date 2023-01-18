package instruccionRepetitiva;

import java.util.Scanner;

public class Ej5SucesionDeFibonacci {

	public static void main(String[] args) {
		 /* Programa que escriba los n primeros numeros de la sucesion
	      /* de Fibonacci. El primer numero de la serie es 0, el segundo es 1 
	      /* y cada uno de los siguientes es la suma de los dos anteriores a el.
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int n, numero=0, numeroSiguiente=1, sumaDeLos2Anteriores;
	       
	       //solucion
	       System.out.print("Dime cuántos números de la sucesión de Fibonacci quieres ver: ");
	       n=teclado.nextInt();
	       if (n==0) {
	       	System.out.print(" ");
	       }
	       else if (n==1) {
	       	System.out.print("0");
	       }       
	       else if (n==2) {
	       	System.out.print("0 1");
	       }
	       else if (n>2) {
	       	System.out.print("0 1 ");
	       	for (int i=1; i<=n; i++) {
	          	sumaDeLos2Anteriores=numero + numeroSiguiente;
	          	System.out.print(sumaDeLos2Anteriores+" ");
	          	numero=numeroSiguiente;
	          	numeroSiguiente=sumaDeLos2Anteriores;
	       	}
	       }
	       else {
	       	System.out.print("Error: Una secuencia no se sucede en números negativos, sólo en números naturales");
	       }
	       
	       teclado.close();


	}

}
