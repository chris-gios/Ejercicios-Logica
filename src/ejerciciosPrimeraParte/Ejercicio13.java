package ejerciciosPrimeraParte;

import java.util.Scanner;

/**
 * Introducir dos números por teclado. Imprimir los números naturales que hay entre ambos números empezando por
 * el más pequeño, contar cuantos hay y cuántos de ellos son pares. Calcular la suma de los impares.
 */
public class Ejercicio13 {
	
	public static void main(String[] args) {
		int numero1, numero2;
		int contador = 0;
		int pares = 0;
		int impares = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un primer numero");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese un segundo numero");
		numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			
			for (int i = numero2; i <= numero1; i++) {
				System.out.println(i);
				
				if(i%2 == 0) {
					pares++;
				} else {
					impares += i;
				}
				contador++;
			}
			
		} else if (numero2 > numero1) {
			for (int i = numero1; i <= numero2; i++) {
				System.out.println(i);
				
				if(i%2 == 0) {
					pares++;
				} else {
					impares += i;
				}
				contador++;
			}
		} else {
			System.out.println("los numeros son iguales");
		}
		System.out.println("los numeros entre los valores ingresados son "+contador);
		System.out.println("los numeros pares son "+pares);
		System.out.println("la suma de los impares es "+impares);
		
	}

}
