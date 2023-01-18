package instruccionAlternativa;

import java.util.Scanner;

public class Ej9DecirSiCapicua {

	public static void main(String[] args) {
		 /* Pedir un n�mero entre 0 y 9.999 
	      * mostrarlo con las cifras al rev�s.
	      */

	     //Declaro variables
	     int numero,capicua,aux,cifra1,cifra2,cifra3,cifra4;
	     
	     //preparo el objeto teclado
	     Scanner teclado=new Scanner(System.in);
	     
	     //establezco interfaz
	     System.out.print("Introduce un n�mero: ");
	     numero=teclado.nextInt();
	     
	     teclado.close();

	     //configuro la soluci�n
	     
	     if (numero>=0 && numero<=9) {
	         System.out.println("El n�mero "+numero+" es capic�a");
	     }
	     else if (numero>=10 && numero<=99) {
	     	cifra1=numero/10;
	     	cifra2=numero%10;
	     	capicua=cifra2*10+cifra1;
	     	if (numero==capicua) {
	     	    System.out.println("El n�mero "+numero+" es capic�a");
	     	}
	     	else {
	     		System.out.println("El n�mero "+numero+" no es capic�a");
	     	}
	     }
	     else if (numero>=100 && numero<=999) {
	     	cifra1=numero/100;
	     	aux=numero%100;
	     	cifra2=aux/10;
	     	cifra3=aux%10;
	     	capicua=cifra3*100+cifra2*10+cifra1;
	     	if (numero==capicua) {
	     	    System.out.print("El n�mero "+numero+" es capic�a");
	     	}
	     	else {
	     		System.out.print("El n�mero "+numero+" no es capic�a");
	     	}
	     }
	     else if (numero>=1000 && numero<=9999) {
	     	cifra1=numero/1000;
	     	aux=numero%1000;
	     	cifra2=aux/100;
	     	aux=aux%100;
	     	cifra3=aux/10;
	     	cifra4=aux%10;
	     	capicua=cifra4*1000+cifra3*100+cifra2*10+cifra1;
	     	if (numero==capicua) {
	     	    System.out.print("El n�mero "+numero+" es capic�a");
	     	}
	     	else {
	     		System.out.print("El n�mero "+numero+" no es capic�a");
	     	}
	     }
	     else {
	     	System.out.print("Error: el n�mero introducido no es v�lido");
	     }
	     

	}

}
