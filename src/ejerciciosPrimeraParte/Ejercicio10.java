/**
 * Introducir un número por teclado. Que nos diga si es par o impar.
 */

package ejerciciosPrimeraParte;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		try {
			System.out.println("Ingrese un numero");
			numero = scanner.nextInt();
			
			if(numero%2 == 0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
		} catch (Exception e) {
			System.out.println("Error: "+e+"osea que no ingreso un numero :c");
		}
	}

}
