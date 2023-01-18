package instruccionAlternativa;

import java.util.Scanner;

public class Ej2CorregirHora {

	public static void main(String[] args) {
		/* Realizar un programa que dada una medida de tiempo
		 * expresada en horas, minutos y segundos con valores
		 * arbitrarios, elabore un programa que transforme dicha medida
	 	 * en una expresión correcta.
	 	 *
	 	 * Introduciendo: 3 Horas 118 Minutos 195 Segundos
	 	 * Da como salida: 5 Horas 1 Minuto 15 Segundos
	 	 */


		//declaro variables
		int horas,minutos,segundos,divSegs,divMins;

		//preparo el objeto teclado
		Scanner teclado=new Scanner(System.in);

		//configuro interfaz en consola
		System.out.println("Introduce el tiempo que quieres corregir");
		System.out.print("Introduce las horas: ");
		horas=teclado.nextInt();
		System.out.print("Introduce los minutos: ");
		minutos=teclado.nextInt();
		System.out.print("Introduce los segundos: ");
		segundos=teclado.nextInt();
		System.out.println("Tu tiempo sin corregir es: " + horas + "h "+ minutos + "min " + segundos + "seg ");
		
		teclado.close();

		//realizo operaciones
		if (minutos>59 || segundos>59) {
			divSegs=segundos/60;
			segundos=segundos-60*divSegs;
			minutos=minutos+divSegs;
			divMins=minutos/60;
			minutos=minutos-60*divMins;
			horas=horas+divMins;
			System.out.println("Tu tiempo corregido es: " + horas + "h "+ minutos + "min " + segundos + "seg ");
		}
		else {
			divSegs=segundos/60;
			segundos=segundos-60*divSegs;
			minutos=minutos+divSegs;
			divMins=minutos/60;
			minutos=minutos-60*divMins;
			horas=horas+divMins;
			System.out.println("Tu tiempo corregido es: " + horas + "h "+ minutos + "min " + segundos + "seg ");
		}

	}

}
