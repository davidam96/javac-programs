package bucleFor;

import java.util.Scanner;

public class Pedir5Numeros {

	public static void main(String[] args) {
		// Programa que pida que tecleemos un numero 5 veces
		
		Scanner teclado=new Scanner(System.in);
		double numero;
		
		//bucle
		for (int i = 1; i<=5; i++) {
			System.out.print("Teclea un número");
			numero=teclado.nextDouble();
		}
		
		teclado.close();	

	}

}
