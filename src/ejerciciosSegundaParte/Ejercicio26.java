package ejerciciosSegundaParte;

import java.util.Scanner;

/** Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil,
 *  expresada en kilómetros por hora, proporcione la velocidad en metros por segundo. */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double velocidad;

        System.out.println("Ingrese la velocidad del auto en Km/h");
        velocidad = scanner.nextDouble();
        System.out.println("La velocidad del auto es "+velocidad*(Math.pow(10,3)/(60*60))+"m/s");
    }
}
