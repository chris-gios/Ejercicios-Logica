package ejerciciosSegundaParte;


import java.util.Scanner;

/** Registrar 20 números en un arreglo de una dimensión y muestre posteriormente los elementos
 *  que ocupan posiciones impares. */
public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        for (int i = 0; i<numeros.length ; i++) {
            System.out.println("Ingrese el numero "+i);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i<numeros.length ; i++) {
            if (i%2!=0){
                System.out.println("Posicion: "+i+" Valor: "+numeros[i]);
            }
        }
    }
}
