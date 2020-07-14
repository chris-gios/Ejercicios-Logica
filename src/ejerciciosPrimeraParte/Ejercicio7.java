/**
 * Introducir tantas frases como queramos y contarlas.
 */

package ejerciciosPrimeraParte;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String pausa = "";
		int contador = 0;
		
		while( !pausa.equals("1") ) {
			System.out.println("Ingrese una frase");
			contador++;
			
			System.out.println("Frases ingresadas: "+contador+"\n Ingrese 1 para detenerse");
			pausa = scanner.nextLine();
			System.out.println(pausa);
		}
		System.out.println("Terminado");
	}

}
