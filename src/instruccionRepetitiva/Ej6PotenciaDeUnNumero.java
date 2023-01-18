package instruccionRepetitiva;

import java.util.Scanner;

public class Ej6PotenciaDeUnNumero {

	public static void main(String[] args) {
		  /* Realizar un programa que calcule la potencia de un numero a^n. 
	      /* La potencia se har� por medio de multiplicaciones, 
	      /* est� prohibido usar Math.pow(). 
	       *  - si n es mayor que cero se har� una potencia normal.
	       *  - si n es menor que cero se har� 1/a^n.
	       *  - y si n=0 la soluci�n ser� 1.
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int n;
	       double numero,acumulador=(double)1;
	       
	       //solucion
	       System.out.print("Teclea un n�mero: ");
	       numero=teclado.nextInt();
	       System.out.print("Teclea la potencia a la que lo quieres elevar: ");
	       n=teclado.nextInt();
	       if (n==0) {
	       	System.out.print("El resultado es: 1");
	       }
	       else if (n>0) {
	       	for (int i=1; i<=n; i++) {
	       		acumulador=acumulador*numero;
	       	}
	       System.out.println("El resultado es: "+acumulador);
	       }       
	       else if (n<0) {
	       	n=Math.abs(n);
	       	for (int i=1; i<=n; i++) {
	       		acumulador=acumulador*numero;
	       	}
	       acumulador= (double)1/acumulador;
	       System.out.println("El resultado es: "+acumulador);
	       }
	       
	       teclado.close();


	}

}
