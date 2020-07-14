/**
 * Imprima los números del 1 al 100. Que calcule la suma de todos los números pares por un lado, 
 * y por otro, la de todos los impares.
 */

package ejerciciosPrimeraParte;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		int par=0;
		int impar=0;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if(i%2==0) {
				par += i;
			} else {
				impar += i;
			}
		}
		System.out.println("La suma de los partes es "+par);
		System.out.println("La suma de los impartes es "+impar);
	}

}
