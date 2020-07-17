package ejerciciosSegundaParte;


import java.util.Scanner;

/** Mostrar independientemente la suma de los pares y los impares de los números entre 1 y 1000. */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorIngresado;

        System.out.println("Ingrese un valor entero entre 1 y 1000");
        valorIngresado = scanner.nextInt();

        if (valorIngresado>=1 && valorIngresado<=1000){
            sumaParesYInpares(valorIngresado);
        } else {
            System.out.println("Error: El valor ingresado debe ser un entero entre 1 y 1000");
        }
    }

    public static void sumaParesYInpares(int valorIngresado){
        int numerosPares = 0;
        int numerosInpares = 0;

        for (int i = 0; i<=valorIngresado ; i++) {
            if (i%2 == 0){
                numerosPares += i;
            } else {
                numerosInpares += i;
            }
        }
        System.out.println("Suma Pares = "+numerosPares);
        System.out.println("Sumas Impares = "+numerosInpares);
    }
}
