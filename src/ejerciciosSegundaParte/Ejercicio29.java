package ejerciciosSegundaParte;

import java.util.Scanner;

/** Calcular el Promedio Anual del Sueldo de N Trabajadores. Este Promedio debe ser
 *  calculado considerando que al año tiene 12 Sueldos, 1 Escolaridad y 2 Aguinaldos.
 *  El Sueldo Base es de S/. 800 si es técnico, S/. 1000 si es egresado de
 *  universidad, S/. 1200 si es titulado y S/. 1500 si tiene maestría. Además la
 *  escolaridad es de S/. 300, los Aguinaldos son de S/. 500. Además se sabe que al
 *  Trabajador se le descuenta el 10% por Seguro de Pensión, el 5% de Seguro Social
 *  y el 12% por aporte a la Caja de Ahorro. Es conveniente saber que si el número de
 *  trabajadores que ganan más de S/.1000 es menor del 30% del total de trabajadores,
 *  se debe considerar darle a aquel trabajador un Bono Adicional del 15% de su Sueldo
 *  Promedio. Mostrar los nuevos Sueldos Promedio para los trabajadores con Bono adicional. */
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTrabajadores;
        int numeroTecnicos;
        int numeroUniversitarios;
        int numeroTitulados;
        int numeroMaestria;
        int TECNICO = 800;
        int UNIVERSITARIO = 1000;
        int TITULADO = 1200;
        int MAESTRIA = 1500;
        double salarioTotalTecnicos = 0;
        double salarioTotalUniversitarios = 0;
        double salarioTotalTitulados = 0;
        double salarioTotalMaestria = 0;

        System.out.println("Promedio Anual Trabajadores \n" +
                "Ingrese la cantidad de trabajadores a evaluar");
        numeroTrabajadores = scanner.nextInt();
        System.out.println("Ingrese el numero de trabajadores tecnicos");
        numeroTecnicos = scanner.nextInt();
        System.out.println("Ingrese el numero de trabajadores universitarios");
        numeroUniversitarios = scanner.nextInt();
        System.out.println("Ingrese el numero de trabajadores titulados");
        numeroTitulados = scanner.nextInt();
        System.out.println("Ingrese el numero de trabajadores maestria");
        numeroMaestria = scanner.nextInt();

        if (numeroTrabajadores == (numeroTecnicos+numeroUniversitarios+numeroTitulados+numeroMaestria)){
            salarioTotalTecnicos = promedioAnual(numeroTecnicos,TECNICO,false);
            salarioTotalUniversitarios = promedioAnual(numeroTecnicos,UNIVERSITARIO,false);
            salarioTotalTitulados = promedioAnual(numeroTecnicos,TITULADO,
                    (double)numeroTitulados/numeroTrabajadores<0.3*numeroTrabajadores?
                    true:false);
            salarioTotalMaestria = promedioAnual(numeroTecnicos,MAESTRIA,
                    (double)numeroMaestria/numeroTrabajadores<0.3*numeroTrabajadores?
                            true:false);
        } else {
            System.out.println("Error: EL numero de trabajadores total debe conincidir con los" +
                    " trabajadores por puesto");
        }

        System.out.println("Promedio Anual\n" +
                "Pago total "+numeroTecnicos+" tecnicos\n" +
                "Total Pago: $"+salarioTotalTecnicos+"\n" +
                "Equivale a "+(double)numeroTecnicos/numeroTrabajadores*100+"% del total de trabajadores\n" +
                "Pago total "+numeroUniversitarios+" tecnicos\n" +
                "Total Pago: $"+salarioTotalUniversitarios+"\n" +
                "Equivale a "+((double)numeroUniversitarios/numeroTrabajadores)*100+"% del total de trabajadores\n" +
                "Pago total "+numeroTitulados+" tecnicos\n" +
                "Total Pago: $"+salarioTotalTitulados+"\n" +
                "Equivale a "+((double)numeroTitulados/numeroTrabajadores)*100+"% del total de trabajadores\n" +
                "Pago total "+numeroMaestria+" tecnicos\n" +
                "Total Pago: $"+salarioTotalMaestria+"\n" +
                "Equivale a "+((double)numeroMaestria/numeroTrabajadores)*100+"% del total de trabajadores\n");

    }

    public static double promedioAnual(int numeroTrabajadores, int puesto, boolean recibeBono){
        int escolaridad = 300;
        int aguinaldo = 500;
        double pension = 0.1;
        double seguroSocial = 0.05;
        double cajaAhorro = 0.12;
        double sueldoTrabajadores;
        double totalDescuentos;
        double pagoFinalTrabajadores;
        int meses = 12;
        double bono = recibeBono ? 1.15 : 1;
        if (recibeBono){
            System.out.println("BONO");
        }

        sueldoTrabajadores = (numeroTrabajadores * (puesto + escolaridad + aguinaldo));
        totalDescuentos = sueldoTrabajadores * pension * seguroSocial * cajaAhorro;
        return pagoFinalTrabajadores = (sueldoTrabajadores - totalDescuentos) * meses * bono;
    }
}
