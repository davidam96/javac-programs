package instruccionRepetitiva;

public class Ej10NumerosConSumaDeCifrasAlCuboIgualAlNumero {

	public static void main(String[] args) {
		/* Programa que calcule todos los números de tres cifras tales que 
		 * la suma de los cubos de las cifras es igual al valor del número.
		 * (ej): 153 = 1^3 + 5^3 + 3^3
		 */
		
		//declaro variables
		int  u, d, c, um, dm, cm;
		
		for (int i=0; i<=999999; i++) {
			if (i < 10) {
				if (Math.pow(i, 3) == i) {
					System.out.print(i+" ");
				}
			} else if (i < 100) {
				u=i%10;
				d=i/10;
				if (Math.pow(u, 3) + Math.pow(d, 3) == i) {
					System.out.print(i+" ");
				}
			} else if (i < 1000) {
				u=(i%100)%10;
				d=(i%100)/10;
				c=i/100;
				if (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3) == i) {
					System.out.print(i+" ");
				}
			} else if (i < 10000) {
				u=((i%1000)%100)%10;
				d=((i%1000)%100)/10;
				c=(i%1000)/100;
				um=i/1000;
				if (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3) + Math.pow(um, 3) == i) {
					System.out.print(i+" ");
				}
			} else if (i < 100000) {
				u=(((i%10000)%1000)%100)%10;
				d=(((i%10000)%1000)%100)/10;
				c=((i%10000)%1000)/100;
				um=(i%10000)/1000;
				dm=i/10000;
				if (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3) + Math.pow(um, 3) + Math.pow(dm, 3) == i) {
					System.out.print(i+" ");
				}
			} else if (i < 1000000) {
				u=((((i%100000)%10000)%1000)%100)%10;
				d=((((i%100000)%10000)%1000)%100)/10;
				c=(((i%100000)%10000)%1000)/100;
				um=((i%100000)%10000)/1000;
				dm=(i%100000)/10000;
				cm=i/100000;
				if (Math.pow(u, 3) + Math.pow(d, 3) + Math.pow(c, 3) + Math.pow(um, 3) + Math.pow(dm, 3) + Math.pow(cm, 3) == i) {
					System.out.print(i+" ");
				}
			}
		}

	}

}
