package bucleWhile;

import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		/* Pedir una cantidad que quieres llegar a acumular
		 * con una serie arm�nica 1/n y decir cu�ntos t�rminos has necesitado
		 * para llegar a esa suma
		 */
		
		//preparo teclado
		Scanner teclado=new Scanner (System.in);
		
		//declaro variables
		long n=1;
		double limite, suma=0;
		
		System.out.println("Teclea el n�mero que quieres alcanzar con la serie 1/n: ");
		limite=teclado.nextDouble();
		
		while (suma < limite && n<1000000000) {
			suma=suma+(double)1/n;
			n++;			
		}
		
		teclado.close();
		
		if (n<=999999999) {
		System.out.println("Has alcanzado el n�mero "+limite+" con "+n+" t�rminos");
		} else if (n==1000000000) {
			System.out.println("NO has alcanzado el n�mero "+limite+"; te has aproximado a �l con un factor de "+n+" t�rminos, y has llegado al valor "+suma);
		}

	}

}
