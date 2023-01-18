package ejerciciosString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej9VersionDelProfesor {

	public static void main(String[] args) {
		// Buscar la palabra usando Tokenizer
		
		Scanner teclado=new Scanner(System.in);
		
		String frase,palabra,trozo;
		StringTokenizer fraseTroceada;
		int contador=0;
		
		System.out.println("Escribe una palabra: ");
		palabra=teclado.nextLine();
		System.out.println("Escribe una frase: ");
		frase=teclado.nextLine();
		
		//trocear la frase
		fraseTroceada= new StringTokenizer(frase,"., :;");
		
		//solución ('tokenizer' busca exitosamente la palabra tanto en mayúscula como en minúscula)
		while (fraseTroceada.hasMoreTokens()) { //mientras queden tokens
			trozo = fraseTroceada.nextToken(); //pido un trozo
			//si el trozo es la palabra que busco, incremento el contador
			if (trozo.contentEquals(palabra)) {
				contador++;
			}
		}
		
		System.out.println("La palabra <<"+palabra+">> aparece "+contador+" veces");
		
		teclado.close();

	}

}
