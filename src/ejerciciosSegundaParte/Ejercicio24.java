package ejerciciosSegundaParte;

import java.util.Scanner;

/** Desarrolle un algoritmo que permita convertir calificaciones numéricas,
 *  según la siguiente tabla: A = 19 y 20, B =16, 17 y 18, C = 13, 14 y 15,
 *  D = 10, 11 y 12, E = 1 hasta el 9. Se asume que la nota está comprendida
 *  entre 1 y 20. */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Ingrese nota");
        nota = scanner.nextDouble();

        if (nota>=19 && nota<=20){
            System.out.println("Su nota es A");
        } else if (nota>=16 && nota<=18){
            System.out.println("Su nota es B");
        } else if (nota>=13 && nota<=15){
            System.out.println("Su nota es C");
        } else if (nota>=10 && nota<=12){
            System.out.println("Su nota es D");
        } else if (nota>=1 && nota<=9){
            System.out.println("Su nota es E");
        } else {
            System.out.println("La nota ingresada no es valida");
        }
    }
}
