package instruccionRepetitiva;

import java.util.Scanner;

public class Ej7MayorDeTodos {

	public static void main(String[] args) {
		  /* Realizar un programa que lea varios números por teclado
	      /* hasta que se introduzca un cero, y entonces diga 
	      /* cuál es el mayor de los números introducidos 
	      /* y cuantas veces se repite ese número.
	       */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int numero, numeroSiguiente,mayorDeTodos=0,seRepite=1;
	       
	       //solucion
	       System.out.print("Dame números: ");
	       numero=teclado.nextInt();
	       do {
	          System.out.print("Dame números: ");
	          numeroSiguiente=teclado.nextInt();
	          if (numero > numeroSiguiente) {
	              mayorDeTodos=numero;
	          }
	          else if (numero < numeroSiguiente) {
	          	mayorDeTodos=numeroSiguiente;
	          	numero=numeroSiguiente;
	          }
	          else if (mayorDeTodos == numero || mayorDeTodos == numeroSiguiente) {
	          	seRepite++;
	          }
	       } while (numero!=0 && numeroSiguiente!=0);
	       
	       teclado.close();
	       
	           System.out.println("El mayor es el "+mayorDeTodos);
	           System.out.println("Se repite "+seRepite+" veces");


	}

}
