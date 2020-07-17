package ejerciciosSegundaParte;

import java.math.BigInteger;
import java.util.Scanner;

/** Hacer un programa que nos permita introducir un número por teclado y sobre él
 *  se realicen las siguientes operaciones: comprobar si es primo, hallar su
 *  factorial o imprimir su tabla de multiplicar. */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int opcion;

        do {
            System.out.println("Ingrese un numero mayor o igual a 0");
            numero = scanner.nextInt();
        } while (numero<0);

        System.out.println("Seleccione la operacion deseada \n" +
                "1-Comprobar si es primo \n" +
                "2-Hallar su factorial \n" +
                "3-Imprimir su tabla de multiplicar");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                esPrimo(numero);
                break;
            case 2:
                System.out.println(factorial(numero));
                break;
            case 3:
                imprimeTabla(numero);
                break;
            default:
                System.out.println("Error: Debe elegir alguna de las opciones mostradas");
        }
    }
    public static void esPrimo(int numero){
        boolean primo = true;

        for (int i = 2; i*i<numero ; i++) {
            if (numero%i == 0){
                primo = false;
            }
        }

        if (numero == 1){
            System.out.println("El numero "+numero+" no es primo");
        } else if (primo == true){
            System.out.println("El numero "+numero+" es primo");
        } else {
            System.out.println("El numero "+numero+" no es primo");
        }
    }

    public static BigInteger factorial(int numero){
        BigInteger valor = BigInteger.valueOf(numero);
        BigInteger resultado;
        if (valor==BigInteger.ONE || valor==BigInteger.ZERO){
            resultado = BigInteger.ONE;
        } else {
            resultado = valor.multiply(factorial(valor.intValue()-1));
        }
        return resultado;
    }

    public static void imprimeTabla(int numero){
        for (int i = 0; i<=12 ; i++) {
            System.out.println(i+"x"+numero+" = "+i*numero);
        }
    }
}

