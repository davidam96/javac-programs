package instruccionRepetitiva;

public class Ej11FiguraDeDiamante {

	public static void main(String[] args) {
		/* Programa que visualice en la pantalla la siguiente figura:
		 *
		 *			  *
		 *			* * *
		 *		  * * * * *
		 *		* * * * * * *
		 *		  * * * * *
		 *		    * * *
		 *		      *
		 */
		
		int n=7; /* La unica caracteristica que necesitas de la figura es una caracaterística
				  * que define uno de sus triangulos
				  */
		
		//con un bucle for solo se pueden hacer triangulos verticales (no pueden estar tumbados sobre la hipotenusa)
		for (int i=n; i>=0; i--) {  //triangulo superior derecho, se hace con i decreciente
			for (int j=1; j<=i*2; j++ ) { //este bucle para el espaciado de cada fila de relleno
				System.out.print(" ");
			}
			for (int j=1; j<=n-i*2; j++ ) {  //este bucle para las unidades de relleno por fila
					System.out.print("*");  
					System.out.print(" ");
			}
		System.out.println();
		}
		for (int i=0; i<=n; i++) { //triangulo inferior derecho, se hace con i creciente
			for (int j=1; j<=i*2+1; j++ ) { //este bucle para el espaciado de cada fila de relleno
				System.out.print(" ");
			}
			for (int j=2; j<=n-i*2-1; j++ ) {  //este bucle para las unidades de relleno por fila
					System.out.print(" ");
					System.out.print("*");
			}
		System.out.println();
		}
		
		

	}

}
