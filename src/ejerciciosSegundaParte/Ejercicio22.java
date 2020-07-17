package ejerciciosSegundaParte;

import java.util.Scanner;

/** Permitir leer tres valores y almacenarlos en las variables A, B y C respectivamente.
 *  El algoritmo debe imprimir cual es el mayor y cuál es el menor. Recuerde constatar que
 *  los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje
 *  de alerta en caso de que se detecte la introducción de valores iguales. */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A;
        double B;
        double C;


        System.out.println("Ingrese los valores A, B, C que no sean repetidos");
        System.out.println("Ingrese el valor A");
        A = scanner.nextDouble();
        System.out.println("Ingrese el valor B");
        B = scanner.nextDouble();
        System.out.println("Ingrese el valor C");
        C = scanner.nextDouble();

        if (A==B || A==C || B==C){
            System.out.println("Error: los valores A, B, C deben ser diferentes");
        } else {
            calcularMayorMenor(A,B,C);
        }
    }

    public static void calcularMayorMenor(double A, double B, double C){
        double mayor = 0;
        double menor = 0;

        if (A>B && A>C){
            mayor = A;
            menor = B > C ? C : B;
        } else if (B>A && B>C){
            mayor = B;
            menor = A > C ? C :A;
        } else {
            mayor = C;
            menor = A > B ? B: A;
        }

        System.out.println("El mayor es "+mayor+" y el menor es "+menor);
    }
}
