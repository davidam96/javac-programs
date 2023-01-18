package bucleWhile;

import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		/* Pedir una cantidad que quieres llegar a acumular
		 * con una serie armónica 1/n y decir cuántos términos has necesitado
		 * para llegar a esa suma
		 */
		
		//preparo teclado
		Scanner teclado=new Scanner (System.in);
		
		//declaro variables
		long n=1;
		double limite, suma=0;
		
		System.out.println("Teclea el número que quieres alcanzar con la serie 1/n: ");
		limite=teclado.nextDouble();
		
		while (suma < limite && n<1000000000) {
			suma=suma+(double)1/n;
			n++;			
		}
		
		teclado.close();
		
		if (n<=999999999) {
		System.out.println("Has alcanzado el número "+limite+" con "+n+" términos");
		} else if (n==1000000000) {
			System.out.println("NO has alcanzado el número "+limite+"; te has aproximado a él con un factor de "+n+" términos, y has llegado al valor "+suma);
		}

	}

}
