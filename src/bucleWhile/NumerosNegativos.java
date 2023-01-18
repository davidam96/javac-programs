package bucleWhile;

import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		/* Programa que pida numeros hasta que pongamos el 0
		 * y al final diga si hemos escrito algún numero negativo
		 */
		
		//linea para usar el teclado
		Scanner teclado = new Scanner(System.in);
				
		//variable para guardar los numeros 
		int numero;

		
		//solución del profesor
		boolean hanSalidoNumerosNegativos=false; //a esto se le llama variable bandera (flag variable)
		
		//Bucle e instrucciones 
		do { //pongo un do-while porque como minimo quiero pedir un numero una vez
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
            if (numero < 0) {
            	hanSalidoNumerosNegativos=true; //subo la bandera
            }
		} while (numero != 0);
		
		teclado.close();
		
		//decir sis e ha tecleado algún numero negativo
		if (hanSalidoNumerosNegativos == true) { //la parte del == true se puede quitar y el programa entiende que el if es para cuando la variable es verdadera y el else para cuando la variable es falsa
			System.out.println("Has tecleado algún numero negativo");
		}
		else {
			System.out.println("No tecleaste numeros negativos");
		}

		
	}

}
