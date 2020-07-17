package ejerciciosPrimeraParte;

import java.util.Scanner;

/**
 * Introducir un número por teclado. Que nos diga si es positivo o negativo.
 */
public class Ejercicio9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero");
		try {
			numero = scanner.nextInt();
			
			if(numero >= 0) {
				System.out.println("Es un numero positivo");
			} else {
				System.out.println("es un numero negativo");
			}
		} catch (Exception e) {
			System.out.println("Error: "+e+" Osea no ingreso un numero pendejo");
		}
		
	}

}
