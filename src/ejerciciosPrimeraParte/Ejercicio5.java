package ejerciciosPrimeraParte;

/**
 * Imprima los números impares hasta el 100 y que imprima cuantos impares hay.
 */
public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.println(i);
			suma++;
		}
		System.out.println("la cantidad de numeros impares es "+suma);
	}

}
