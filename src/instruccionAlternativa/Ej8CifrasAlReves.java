package instruccionAlternativa;

import java.util.Scanner;

public class Ej8CifrasAlReves {

	public static void main(String[] args) {
		/* Pedir un n?mero entre 0 y 9.999 
	     * mostrarlo con las cifras al rev?s.
	     */

	     //Declaro variables
	     int numero,aux,cifra1,cifra2,cifra3,cifra4;
	     
	     //preparo el objeto teclado
	     Scanner teclado=new Scanner(System.in);
	     
	     //establezco interfaz
	     System.out.print("Introduce un n?mero: ");
	     numero=teclado.nextInt();
	     
	     teclado.close();

	     //configuro la soluci?n
	     
	     if (numero>=0 && numero<=9) {
	         System.out.print("El n?mero al rev?s es: "+numero);
	     }
	     else if (numero>=10 && numero<=99) {
	     	cifra1=numero/10;    //me baso en que la funcion de Java de divisi?n entre Int's da valores enteros
	     	cifra2=numero%10;    //" " " " "" " "" " " " " " " " " " de resto entre Int's da valores enteros
	     	numero=cifra2*10+cifra1; 
	     	System.out.print("El n?mero al rev?s es: "+numero);
	     }
	     else if (numero>=100 && numero<=999) {
	     	cifra1=numero/100;
	     	aux=numero%100;   //establezco un n?mero auxiliar que carge el resto entero del n?mero de 3 cifras (el resto va a ser de 2 cifras al ser valor entero)
	     	cifra2=aux/10;    //adem?s el auxiliar act?a de variable pivotante, de reducci?n del n?mero original en 1 cifra cada vez
	     	cifra3=aux%10;
	     	numero=cifra3*100+cifra2*10+cifra1;
	     	System.out.print("El n?mero al rev?s es: "+numero);
	     }
	     else if (numero>=1000 && numero<=9999) {
	     	cifra1=numero/1000; 
	     	aux=numero%1000; 
	     	cifra2=aux/100; 
	     	aux=aux%100;
	     	cifra3=aux/10;
	     	cifra4=aux%10;
	     	numero=cifra4*1000+cifra3*100+cifra2*10+cifra1;
	     	System.out.print("El n?mero al rev?s es: "+numero);
	     }
	     else {
	     	System.out.print("Error: el n?mero introducido no es v?lido");
	     }

	     /* La soluci?n del profe:
	      * 
	      * if (numero<10) {
	      * System.out.println("Del rev?s: "+num);
	      * }
	      * else if (num<100) {
	      * u=num%10;
	      * d=num/10;
	      * System.out.println("Del rev?s "+ u + d);
	      * }
	      * else if(num<1000) {
	      * u=num%10;
	      * d=(num%100)/10;
	      * c=num/100;
	      * System.out.println("Del rev?s: "+ u + d + c);
	      * }
	      * else if(num<10000) {
	      * u=num%10;
	      * d=(num%100)/10;
	      * c=(num%1000)/100;
	      * um=num/1000;
	      * System.out.println("Del rev?s: "+ u + d + c + um);
	      * }
	      * 
	      */
	     

	}

}
