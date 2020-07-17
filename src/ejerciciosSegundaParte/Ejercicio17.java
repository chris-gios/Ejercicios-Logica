package ejerciciosSegundaParte;

import java.math.BigInteger;
import java.util.Scanner;

/** Calcular el factorial de un número. */
public class Ejercicio17 {

    /** Opcion 1: Se pueden usar valores mas grandes que usando int o double */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger valor;

        System.out.println("Ingrese el Factorial que desea calcular");
        valor = scanner.nextBigInteger();

        System.out.println(factorial(valor));


    }

    public static BigInteger factorial(BigInteger valor) {
        if ((valor == BigInteger.ZERO) || (valor == BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return valor.multiply(factorial(valor.subtract(BigInteger.ONE)));
        }
    }

    /** Opcion 2: para factorial de numeros muy grandes retorna "infinity" */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int valor;
//        int resultado;
//
//        System.out.println("Ingrese el Factorial que desea calcular");
//        valor = scanner.nextInt();
//
//        System.out.println(factorial(valor));
//
//
//    }
//
//    public static int factorial(int valor) {
//        if ((valor == 0) || (valor == 1)) {
//            return  1;
//        } else {
//            return valor * factorial(valor-1);
//        }
//    }


}
