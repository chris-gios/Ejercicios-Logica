package ejerciciosSegundaParte;


import java.util.Scanner;

/** Introducir dos números por teclado y mediante un menú,
 *  calcule su suma, su resta, su multiplicación o su división. */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1;
        double valor2;
        int operacion;

        System.out.println("Ingrese valor 1");
        valor1 = scanner.nextDouble();
        System.out.println("Ingrese valor 2");
        valor2 = scanner.nextDouble();

        System.out.println("Elija la operacion deseada \n" +
                "1-Suma \n" +
                "2-Resta \n" +
                "3-Multiplicacion \n" +
                "4-Division \n");
        operacion = scanner.nextInt();

        switch (operacion){
            case 1:
                System.out.println("La suma es "+(valor1+valor2));
                break;
            case 2:
                System.out.println("La resta es "+(valor1-valor2));
                break;
            case 3:
                System.out.println("La multiplicacion es "+(valor1*valor2));
                break;
            case 4:
                if (valor2 != 0){
                    System.out.println("La division es "+(valor1/valor2));
                } else {
                    System.out.println("El valor 2 debe ser diferente de 0");
                }
                break;
            default:
                System.out.println("Error: El valor ingresado no esta en las opciones");
        }
    }
}
