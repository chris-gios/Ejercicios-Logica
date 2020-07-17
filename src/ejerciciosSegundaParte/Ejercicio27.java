package ejerciciosSegundaParte;


import java.util.Scanner;

/** Desarrolle un algoritmo para la empresa Constructora Tecnovivir Casas C.A.,
 *  que le permita calcular e imprimir la nómina para su cancelación a un total
 *  de 50 obreros calificados a quienes debe cancelar por horas trabajadas.
 *  La hora trabajada se pautó en S/. 30. */
public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabajadas;

        System.out.println("Ingrese las horas trabajadas del obrero");
        horasTrabajadas = scanner.nextInt();

        System.out.println("----------Pago de Nomina----------" +
                "\nHoras Trabajadas al mes: "+horasTrabajadas+" horas"+
                "\nValor por hora:          30 s/." +
                "\nTotal a Pagar:           "+(30*horasTrabajadas)+"s/." +
                "\n----------------------------------");
    }
}
