package ejerciciosSegundaParte;


import java.util.Scanner;

/** Desarrolle un algoritmo que permita determinar a partir de un número de días,
 *  ingresado por pantalla, ¿Cuántos años, meses, semanas y días; constituyen el
 *  número de días proporcionado utilizando la estructura Mientras. */
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasIngresados;
        int años = 0;
        int meses = 0;
        int semanas = 0;
        int dias = 0;

        System.out.println("Ingrese el numero de dias");
        diasIngresados = scanner.nextInt();

        while (diasIngresados>365){
            años ++;
            diasIngresados -= 365;
        }
        while (diasIngresados>30){
            meses ++;
            diasIngresados -= 30;
        }
        while (diasIngresados>7){
            semanas ++;
            diasIngresados -= 7;
        }
        dias = diasIngresados;

        System.out.println("Los dias ingresados son equivalentes a:\n" +
                años+" años\n" +
                meses+" meses\n" +
                semanas+" semanas\n" +
                dias+" dias");

    }
}
