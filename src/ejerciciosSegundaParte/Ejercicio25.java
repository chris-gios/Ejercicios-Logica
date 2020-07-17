package ejerciciosSegundaParte;


import java.util.Scanner;

/** Desarrolle un algoritmo que permita leer tres números y ordenarlos de menor a mayor. */
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primerNumero;
        double segundoNumero;
        double tercerNumero;

        System.out.println("Ingrese el primer numero");
        primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        segundoNumero = scanner.nextDouble();
        System.out.println("Ingrese el primer numero");
        tercerNumero = scanner.nextDouble();

        mayorAMenor(primerNumero,segundoNumero,tercerNumero);
    }

    public static void mayorAMenor(double primero, double segundo, double tercero){
        if (primero<segundo && primero<tercero){
            System.out.println(primero);
            if (segundo<tercero){
                System.out.println(segundo+"\n"+tercero);
            } else {
                System.out.println(tercero+"\n"+segundo);
            }

        } else if (segundo<primero && segundo<tercero){
            System.out.println(segundo);
            if (primero<tercero){
                System.out.println(primero+"\n"+tercero);
            } else {
                System.out.println(tercero+"\n"+primero);
            }
        } else {
            System.out.println(tercero);
            if (primero<segundo){
                System.out.println(primero+"\n"+segundo);
            } else {
                System.out.println(segundo+"\n"+primero);
            }
        }
    }
}
