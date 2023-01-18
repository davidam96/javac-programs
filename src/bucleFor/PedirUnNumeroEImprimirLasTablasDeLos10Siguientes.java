package bucleFor;

import java.util.Scanner;

public class PedirUnNumeroEImprimirLasTablasDeLos10Siguientes {

	public static void main(String[] args) {
		// Programa que imprima la tabla del número que pongamos en consola
		
		Scanner teclado=new Scanner(System.in);
		int numero;
		
		System.out.println("Teclea un número: ");
		numero=teclado.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Tabla del " +numero+ ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(numero+"x"+j+" = "+ numero*j);
			}
			numero++;
		}
		
		teclado.close();
		

	}

}
