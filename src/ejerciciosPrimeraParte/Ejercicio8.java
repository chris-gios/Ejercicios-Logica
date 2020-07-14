/**
 * Hacer un pseudocódigo que solo nos permita introducir S o N.
 */

package ejerciciosPrimeraParte;

import java.util.Scanner;

public class Ejercicio8 {
	
	/**
	 * Pseudocodigo
	 * Inicio
	 * Haga: var_entrada=""
	 * while:(var_entrada.equals("S") || var_entrada.equals("N")){
	 * 		Mostrar: "ingrese S o N"
	 *		Capture: var_entrada
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		String var_entrada = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un S o N");
		var_entrada = scanner.nextLine();
		
		while(!(var_entrada.equals("S") || var_entrada.equals("N"))) {
			System.out.println("Solo puede introducir S o N");
			var_entrada = scanner.nextLine();
			
		}
	}
}
