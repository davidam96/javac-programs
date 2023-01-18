package bucleFor;

import java.util.Scanner;

public class PedirUnNumeroEImprimirSuTabla {

	public static void main(String[] args) {
		// Programa que imprima la tabla del número que pongamos en consola
		
		Scanner teclado=new Scanner(System.in);
		int numero;
		
		System.out.print("Teclea un número: ");
		numero=teclado.nextInt();
		
		for (int i = 0; i <=10; i++) {
			System.out.println(numero+"x"+i+" = "+ numero*i);
		}
		
		teclado.close();
		

	}

}