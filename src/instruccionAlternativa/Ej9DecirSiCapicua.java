package instruccionAlternativa;

import java.util.Scanner;

public class Ej9DecirSiCapicua {

	public static void main(String[] args) {
		 /* Pedir un número entre 0 y 9.999 
	      * mostrarlo con las cifras al revés.
	      */

	     //Declaro variables
	     int numero,capicua,aux,cifra1,cifra2,cifra3,cifra4;
	     
	     //preparo el objeto teclado
	     Scanner teclado=new Scanner(System.in);
	     
	     //establezco interfaz
	     System.out.print("Introduce un número: ");
	     numero=teclado.nextInt();
	     
	     teclado.close();

	     //configuro la solución
	     
	     if (numero>=0 && numero<=9) {
	         System.out.println("El número "+numero+" es capicúa");
	     }
	     else if (numero>=10 && numero<=99) {
	     	cifra1=numero/10;
	     	cifra2=numero%10;
	     	capicua=cifra2*10+cifra1;
	     	if (numero==capicua) {
	     	    System.out.println("El número "+numero+" es capicúa");
	     	}
	     	else {
	     		System.out.println("El número "+numero+" no es capicúa");
	     	}
	     }
	     else if (numero>=100 && numero<=999) {
	     	cifra1=numero/100;
	     	aux=numero%100;
	     	cifra2=aux/10;
	     	cifra3=aux%10;
	     	capicua=cifra3*100+cifra2*10+cifra1;
	     	if (numero==capicua) {
	     	    System.out.print("El número "+numero+" es capicúa");
	     	}
	     	else {
	     		System.out.print("El número "+numero+" no es capicúa");
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
	     	    System.out.print("El número "+numero+" es capicúa");
	     	}
	     	else {
	     		System.out.print("El número "+numero+" no es capicúa");
	     	}
	     }
	     else {
	     	System.out.print("Error: el número introducido no es válido");
	     }
	     

	}

}
