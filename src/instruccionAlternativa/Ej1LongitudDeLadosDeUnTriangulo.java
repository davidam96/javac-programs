package instruccionAlternativa;

import java.util.Scanner;

public class Ej1LongitudDeLadosDeUnTriangulo {

	public static void main(String[] args) {
		/* Diseñar un algoritmo para leer las longitudes de los lados de un
		 * triángulo (A, B, C) y determinar qué tipo de triángulo es,
		 * de acuerdo a los siguientes casos:
		 * 
		 * Suponiendo que A es el mayor
         * de los lados y que B y C corresponden a los otros dos lados
         * entonces:
         * 
         * Si A >= B+C no se trata de un triángulo
		 * Si A^2 = B^2 +C^2 es triángulo rectángulo
		 * Si A^2 > B^2 +C^2 triángulo obtusángulo
		 * Si A 2 < B^2 +C^2 triángulo acutángulo
		 */ 
		
		 //declaro variables:
		 final float A,B,C;
		 
		 //preparo el objeto teclado
		 Scanner teclado=new Scanner(System.in);
		 
		 //Establezco la interfaz en consola:
		 System.out.println("Dime tres valores para longitudes y te diré si forman un triángulo");
		 System.out.print("Dime el valor de la hipotenusa A: ");
		 A=teclado.nextFloat();
		 System.out.print("Dime el valor del cateto B: ");
		 B=teclado.nextFloat();
		 System.out.print("Dime el valor del cateto C: ");
		 C=teclado.nextFloat();
		 
		 teclado.close();
		 
		 //alternativas en datos de entrada
		 if (A >= B+C) {
		 System.out.println("Estos valores no se corresponden a un triángulo");
		 } 
		 else if (Math.pow(A, 2)==Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un triángulo rectángulo"); 
		 }
		 else if (Math.pow(A, 2)>Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un triángulo obtuso"); 
		 }
		 else if (Math.pow(A, 2)<Math.pow(B, 2)+Math.pow(C, 2)) {
		 System.out.println("Es un triángulo agudo"); 
		 }
	}

}
