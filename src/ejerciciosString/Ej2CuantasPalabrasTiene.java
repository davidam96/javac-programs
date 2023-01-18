package ejerciciosString;

import java.util.Scanner;

public class Ej2CuantasPalabrasTiene {

	public static void main(String[] args) {
		/* Programa que reciba una cadena y diga cuantas palabras contiene. (Las
		 * palabras pueden estar separadas por espacios, puntos o comas).
		 * Introduciendo: “Hola a todos.Adios”
		 * Da como salida: 4
		 */

		// preparo teclado
		Scanner teclado=new Scanner(System.in);

		//declaro variables
		String frase, punto=".", espacio=" ", coma=",";
		char letraFrase, letraSiguienteFrase;
		int contador=1; // lo pongo =1 porque si no la primera palabra no la va a contar

		//intefaz de entrada
		System.out.println("Escribe algo: ");
		frase=teclado.nextLine();

		//solución
		for (int i=0, j=i+1; j<=frase.length()-1; i++, j++) {
			letraFrase=frase.charAt(i);
			String l=String.valueOf(letraFrase);
			letraSiguienteFrase=frase.charAt(j);
			String lS=String.valueOf(letraSiguienteFrase);
			if (l.equals(punto)==true && lS.equals(punto)==false && lS.equals(espacio)==false && lS.equals(coma)==false) {
				contador++;
			} else if (l.equals(espacio)==true && lS.equals(punto)==false && lS.equals(espacio)==false && lS.equals(coma)==false) {
				contador++;
			} else if (l.equals(coma)==true && lS.equals(punto)==false && lS.equals(espacio)==false && lS.equals(coma)==false) {
				contador++;
			}
		}

		System.out.println("En la frase que has escrito hay "+contador+" palabras");
		

		teclado.close();


	}

}
