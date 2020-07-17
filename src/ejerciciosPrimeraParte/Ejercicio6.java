package ejerciciosPrimeraParte;

/**
 * Imprima todos los números naturales que hay desde la unidad hasta un número que introducimos por teclado
 */
import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Ingrese un numero");
		int limite = scanner.nextInt();
		
		for (int i = 1; i <= limite; i++) {
			System.out.println(i);
			
		}
	}

}
