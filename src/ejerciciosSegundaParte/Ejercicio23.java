package ejerciciosSegundaParte;

import java.util.Scanner;

/** Determinar la hipotenusa de un triángulo rectángulo conocidas las longitudes
 *  de sus dos catetos. Desarrolle el algoritmo correspondiente. */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double catetoOpuesto;
        double catetoAdyacente;

        System.out.println("Ingrese el cateto opuesto");
        catetoOpuesto = scanner.nextDouble();
        System.out.println("Ingrese el cateto Adyacente");
        catetoAdyacente = scanner.nextDouble();

        System.out.println("La hipotenusa es "
                +(Math.sqrt(
                        Math.pow(catetoOpuesto,2)+
                        Math.pow(catetoAdyacente,2)
        )));
    }
}
