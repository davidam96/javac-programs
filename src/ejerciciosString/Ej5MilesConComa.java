package ejerciciosString;

import java.util.Scanner;

public class Ej5MilesConComa {

	public static void main(String[] args) {
		/* Programa que lea un numero double, lo convierta a una cadena y le añada las
		 * comas separadoras de los miles.
		 * Introduciendo: 2388432.34
		 * Da como salida: “2,388,432.34”
		 */
		
		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		double numero;
		
		//interfaz de entrada
		System.out.println("Teclea un número: ");
		numero=teclado.nextDouble();
		
		//solucion
		String n=String.valueOf(numero); //convierto el número a tipo String
		StringBuilder sB = new StringBuilder(n); //convierto el tipo String a StringBuilder
		if (numero<10000000) {
			sB.deleteCharAt(sB.indexOf("."));
			for (int i=sB.length()-1-3; i>=1; i=i-3) {
				sB.insert(i, ",");
			}
			sB.deleteCharAt(sB.length()-1);
		} else if (numero >=10000000) {
			sB.deleteCharAt(sB.indexOf("."));
			sB.delete(sB.indexOf("E"), sB.length()-1);
			for (int i=sB.length()-1-3; i>=1; i=i-3) {
				sB.insert(i, ",");
			}
			sB.deleteCharAt(sB.length()-1);
		}
		
		System.out.println(sB);
		
		teclado.close();
		
	}

}
