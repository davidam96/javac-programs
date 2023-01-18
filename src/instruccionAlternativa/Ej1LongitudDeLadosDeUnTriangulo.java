package instruccionAlternativa;

import java.util.Scanner;

public class Ej1LongitudDeLadosDeUnTriangulo {

	public static void main(String[] args) {
		/* Dise�ar un algoritmo para leer las longitudes de los lados de un
		 * tri�ngulo (A, B, C) y determinar qu� tipo de tri�ngulo es,
		 * de acuerdo a los siguientes casos:
		 * 
		 * Suponiendo que A es el mayor
         * de los lados y que B y C corresponden a los otros dos lados
         * entonces:
         * 
         * Si A >= B+C no se trata de un tri�ngulo
		 * Si A^2 = B^2 +C^2 es tri�ngulo rect�ngulo
		 * Si A^2 > B^2 +C^2 tri�ngulo obtus�ngulo
		 * Si A 2 < B^2 +C^2 tri�ngulo acut�ngulo
		 */ 
		
		 //declaro variables:
		 final float A,B,C;
		 
		 //preparo el objeto teclado
		 Scanner teclado=new Scanner(System.in);
		 
		 //Establezco la interfaz en consola:
		 System.out.println("Dime tres valores para longitudes y te dir� si forman un tri�ngulo");
		 System.out.print("Dime el valor de la hipotenusa A: ");
		 A=teclado.nextFloat();
		 System.out.print("Dime el valor del cateto B: ");
		 B=teclado.nextFloat();
		 System.out.print("Dime el valor del cateto C: ");
		 C=teclado.nextFloat();
		 
		 teclado.close();
		 
		 //alternativas en datos de entrada
		 if (A >= B+C) {
		 System.out.println("Estos valores no se corresponden a un tri�ngulo");
		 } 
		 else if (Math.pow(A, 2)==Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un tri�ngulo rect�ngulo"); 
		 }
		 else if (Math.pow(A, 2)>Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un tri�ngulo obtuso"); 
		 }
		 else if (Math.pow(A, 2)<Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un tri�ngulo agudo"); 
		 }
	}

}
