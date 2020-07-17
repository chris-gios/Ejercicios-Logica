package ejerciciosSegundaParte;

import java.util.Scanner;

/** Contar las veces que aparece una determinada letra en una frase que introduciremos
 *  por teclado.
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        String[] separador;
        String buscador;
        int contador = 0;

        System.out.println("Ingrese la frase a analizar");
        frase = scanner.nextLine();
        System.out.println("Ingrese la letra que desea buscar en la frase");
        buscador = scanner.nextLine();
        separador = frase.split("");

        for (int i = 0; i<separador.length; i++){
            if(buscador.equals(separador[i])){
                contador++;
            }
        }
        System.out.println("La letra "+buscador+" solo aparece "+contador+" veces");

    }
}
