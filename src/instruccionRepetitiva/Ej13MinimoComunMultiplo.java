package instruccionRepetitiva;

import java.util.Scanner;

public class Ej13MinimoComunMultiplo {

	public static void main(String[] args) {
		/* Programa que obtenga el minimo comun multiplo(mcm) de dos numeros.
		 * Ejemplo: descomponemos los numeros en sus factores: 10 (2 * 5) y 18 (2 * 9)
		 * entonces el mcm es (2 * 5 * 9).
		 */

	       //preparo el objeto teclado
	       Scanner teclado=new Scanner(System.in);

	       //declaro variables
	       int numero1, numero2, resto1, restoaux1, restoaux2, resto2, restoPrimo, j, aux1, aux2, contador1=0, contador2=0, acum1=1, acum2=1;
	       long acumTotal=1;
	       boolean primo=true;
	       
	       //interfaz de entrada
	       System.out.print("Teclea un número: ");
	       numero1=teclado.nextInt();
	       System.out.print("Teclea otro número: ");
	       numero2=teclado.nextInt();
	       
	       //solucion
	       aux1=numero1; // auxiliar con el valor del numero1 que nos va a servir para optimizar el bucle, al reducir el 'numero1' original cada vez que encontremos divisores válidos
	       aux2=numero2; // auxiliar con el valor del numero2 que nos va a servir para optimizar el bucle, al reducir el 'numero2' original cada vez que encontremos divisores válidos
	       for (int i=2; i<=aux1 || i<=aux2 ; i++) { // bucle for para encontrar el m.c.m, donde 'i' es el divisor para ambos números en cada vuelta, y que se repite hasta que 'i' alcance el mayor valor de ambos auxiliares.
	    	   resto1=numero1%i; // con este 'resto1' se comprueba si 'i' es divisor del 'número1' o no  
	    	   resto2=numero2%i; // con este 'resto2' se comprueba si 'i' es divisor del 'número2' o no 
	    	   primo=true; //la condición de primo siempre se vuelve a asumir verdadera en cada nuevo bucle hasta que se demuestre lo contrario
	    	   j=i-1; // 'j' es el contador que vamos a usar para el bucle while que comprueba si 'i' es primo
	    	   do { // comprobamos si i es primo, para decidir si lo metemos en el acumulador o no, en caso de que sea divisor de los números del m.c.m. (para que no haya repetición de divisores)
	    		   restoPrimo=i%j; // comprobamos si el resto de 'i/j' es 0 o distinto de 0
	    		   j--; // reducimos el contador en 1
	    		   if (restoPrimo == 0 && i>2) { // si 'restoPrimo' es 0, ... 
	    			 primo=false;         // ... colocamos una bandera de "falso" en el booleano 'primo' para indicar que 'i' no es primo
	    		   }
	    	   } while (j>=2 && restoPrimo != 0); // la condición se para cuando j=2 y por tanto el contador llegue a su fin, o bien cuando el resto de i/j sea 0 y por tanto se haya comprobado que i no es primo  
	    	   if (resto1 == 0 && primo == true) { // (para 'i' común a los dos números): Si 'i' es un divisor del primer número (resto1=0) y además es divisor primo (primo=true), se procede a guardarlo en un primer acumulador (acum1)
	    		   restoaux1=resto1; // preparamos un 'resto auxiliar' para el bucle de a continuación
	    		   while (restoaux1 == 0 && aux1 > 1) { // bucle while que comprueba si 'i' es divisor del 'numero1' múltiples veces o solo una; Si .
	       			   contador1++; // 'i' es divisor del 'numero1' al menos una vez
	       			   aux1=aux1/i; // se reduce el 'numero1' original, dividiéndolo por 'i'
	       			   restoaux1=aux1%i; // se comprueba si el nuevo número dividido 'aux1' es de nuevo divisible por 'i'
	       		   }
	       		   acum1=(int) Math.pow(i, contador1); // al final del bucle while se guarda en el 'acum1' el divisor 'i' elevado a la potencia de las veces que se repite
	       	   }
	       	   if (resto2 == 0 && primo == true) { // (para 'i' común a los dos números): Si 'i' es un divisor del segundo número (resto2=0) y además es divisor primo (primo=true), se procede a guardarlo en un segundo acumulador (acum2)
	       		   restoaux2=resto2; // preparamos un 'resto auxiliar' para el bucle while de a continuación, que comprueba si 'i' es divisor del 'numero2' múltiples veces
	       		   while (restoaux2 == 0 && aux2 > 1) { // bucle while que comprueba si 'i' es divisor del 'numero2' múltiples veces o solo una.
	       			   contador2++; // 'i' es divisor del 'numero2' al menos una vez
	       			   aux2=aux2/i; // se reduce el 'numero2' original, dividiéndolo por 'i'
	       			   restoaux2=aux2%i; // se comprueba si el nuevo número dividido 'aux2' es de nuevo divisible por 'i'
	       		   }
	       		   acum2=(int) Math.pow(i, contador2); // al final del bucle while se guarda en el 'acum2' el divisor 'i' elevado a la potencia de las veces que se repite
	       	   } 
	       	   if (resto1 == 0 && resto2 == 0 && primo == true) { // si ambos números tienen un divisor 'i' común, se comprueba en cuál de los dos números 'i' se repite más veces (= cuál acumulador es mayor: = cuál i está elevado a la mayor potencia(mayor contador))
	       		   if (acum1 > acum2) { 
	       		    acumTotal=acumTotal*acum1; // se guarda sólo el mayor de ambos acumuladores en el acumulador final 
	       			} else if (acum1 < acum2) {
	       				acumTotal=acumTotal*acum2; // se guarda sólo el mayor de ambos acumuladores en el acumulador final
	       				}
	       	   } else if (resto1 == 0 && resto2 != 0 && primo == true) { // si solo el 'numero1' es divisible por 'i', ...
	       		   acumTotal=acumTotal*acum1;                            // ...se guarda solo el 'acum1' en el acumulador final
	       	   } else if (resto2 == 0 && resto1 != 0 && primo == true) { // si solo el 'numero2' es divisible por 'i', ...
	       		   acumTotal=acumTotal*acum2;                            // ...se guarda solo el 'acum2' en el acumulador final
	       	   }
	       	   contador1=0; // al final del bucle se vuelven a poner ambos contadores a 0 para que en siguientes iteraciones no haya problemas
	       	   contador2=0; // al final del bucle se vuelven a poner ambos contadores a 0 para que en siguientes iteraciones no haya problemas
	       }
	       
	       System.out.println("El m.c.m es el: "+acumTotal);
	       
	       
	       teclado.close();
		
	}

}
