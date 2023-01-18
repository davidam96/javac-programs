package instruccionRepetitiva;

import java.util.Scanner;

public class Ej8FactoresPrimos {

	public static void main(String[] args) {
		  /* Programa que descomponga un número 
	      /* en sus factores primos.
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int numero, resto, nuevoNumero;
	       
	       //interfaz de entrada
	       System.out.print("Teclea un número: ");
	       numero=teclado.nextInt();
	       
	       //solucion
	       System.out.print("Factores: ");
	       nuevoNumero=numero;
	       do {
	       	for (int i=2; i<=nuevoNumero ; i++) {
	       		resto=nuevoNumero%i;
	       		if (resto == 0) {
	       			System.out.print(i+" ");
	       			nuevoNumero=nuevoNumero/i;
	       			continue;
	       		}
	       	}
	       } while (nuevoNumero != 1);
	     
	       teclado.close();


	}

}
