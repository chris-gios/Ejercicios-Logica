/**
 * Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de números, tal que el segundo sea 
 * mayor o igual que el primero.
 */

package ejerciciosPrimeraParte;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int valorInicial;
        int valorFinal;
        int contador = 0;
        int sumaTotal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor inicial");
        valorInicial = scanner.nextInt();

        System.out.println("Ingrese el valor final (mayor o igual al inicial)");
        valorFinal = scanner.nextInt();

        if (valorInicial <= valorInicial){
            for (int i=valorInicial; i<=valorFinal;i++) {
                if (i%2 == 0){
                    contador++;
                    sumaTotal += i;
                    System.out.println("Multiplo actual: "+i);
                    System.out.println("Contador total actual: "+contador);
                    System.out.println("Suma total actual: "+sumaTotal+"\n");
                }
            }
        } else {
            System.out.println("Error: El valor final debe ser mayor o igual que el inicial");
        }
    }
}
