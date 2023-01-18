package ejerciciosString;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ej10JuegoDelAhorcado {

	public static void main(String[] args) {
		/* Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
		 * pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
		 * acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
		 * perdido.
		 */
		
		// ...
		// (NO FUNCIONA)
		// ...
		
		//preparo teclado
		Scanner teclado=new Scanner(System.in);
		
		//declaro variables
		String frase, fraseMinus, secreta;
		StringBuilder acertada=new StringBuilder();
		int numGuiones, fallos=0;
		char letra;
		
		//interfaz de entrada
		System.out.println("Escribe una frase: ");
		frase=teclado.nextLine();
		
		/*herramientas nuevas a usar:
		 * 
		 * para crear un texto en forma de contrase�a:
		 * JPasswordField contrase�a=new JPasswordField();   
		 *      
		 * para crear una mini ventana de interfaz gr�fica en la que escribir la contrase�a:
		 * JOptionPane.showConfirmDialog(null, contrase�a, "Palabra secreta", JOptionPane.CLOSED_OPTION);         
		 */
		
		//asignar la palabra secreta
		JPasswordField contrase�a=new JPasswordField();
		JOptionPane.showConfirmDialog(null, contrase�a, "Palabra secreta", JOptionPane.CLOSED_OPTION);
		secreta=contrase�a.getPassword().toString();
		
		//soluci�n
		numGuiones=frase.length();
		fraseMinus=frase.toLowerCase();
		
		while (fallos<=8 && !secreta.equals(acertada.toString()) ) {
			for (int j=1; j<=numGuiones; j++) {
				System.out.println("-");
			}
		System.out.println("Teclea una letra: ");
		letra=teclado.nextLine().charAt(0); //cogemos un string en forma de letra
		letra=Character.toUpperCase(letra);
		
		
		}	
	}

}
