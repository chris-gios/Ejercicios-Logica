package ejerciciosPrimeraParte;

import java.util.Scanner;

/**
 * Imprima el mayor y el menor de una serie de cinco números que vamos introduciendo por teclado.
 */
public class Ejercicio12 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador = 5;
		int mayor, menor;
		int numeroIngresado;
		System.out.println("Ingrese 5 numeros");
		numeroIngresado = scanner.nextInt();
		mayor = numeroIngresado;
		menor = numeroIngresado;
		
		while(contador != 1) {
			contador--;
			System.out.println("Ingrese "+contador+" numeros mas");
			numeroIngresado = scanner.nextInt();
			
			if(numeroIngresado > mayor) {
				mayor = numeroIngresado;
			}
			
			if(numeroIngresado < menor) {
				menor = numeroIngresado;
			}
		}
		
		System.out.println("El numero mayor es "+mayor);
		System.out.println("El numerno menor es "+menor);
		
	}

}
