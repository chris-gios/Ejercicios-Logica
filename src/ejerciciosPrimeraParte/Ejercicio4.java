/**
 * Imprima la suma de los 100 primeros números.
 */

package ejerciciosPrimeraParte;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 1; i <= 100; i++) {
			suma += i;
		}
		
		System.out.println(suma);
	}
}
