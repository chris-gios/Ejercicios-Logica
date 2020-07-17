package ejerciciosSegundaParte;

import java.awt.*;
import java.util.Scanner;

/** Leer dos valores distintos, determinar cuál de los dos valores es el mayor y escribirlo. */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerValor;
        double segundoValor;

        System.out.println("Ingrese el primer valor");
        primerValor = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor");
        segundoValor = scanner.nextDouble();

        if (primerValor > segundoValor){
            System.out.println(primerValor+" es mayor que "+segundoValor);
        } else if (segundoValor > primerValor){
            System.out.println(segundoValor+" es mayor que "+primerValor);
        } else {
            System.out.println("Ambos valores son iguales");
        }
    }
}
