package OrdenamientoBurbuja;

import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;

public class main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ListaOrdenada;
		
		System.out.println("Ingrese una lista de numeros separados por ,");
		String list = scanner.nextLine();
		
		ListaOrdenada = metodoBurbuja(stringToList(list));
		
		imprimirLista(ListaOrdenada);
		
	}
	
	public static int[] stringToList(String list) {
		String[] separador = list.replaceAll("[^0-9,]", "").replaceAll("[,]+", ",").replaceAll("^[,]", "").split(",");
		int[] listInt = new int[separador.length];
		
		for (int k=0; k<separador.length; k++) {
			listInt[k] = Integer.parseInt(separador[k]);
		}
		
		return listInt;
	}
	
	public static int[] metodoBurbuja(int[] list) {
		int completado = 0;
		
		while(completado == 0) {
			int huboCambio = 0;
			
			for(int n=0; n<list.length-1; n++) {
				if(list[n] > list[n+1]) {
					int mayor = list[n];
					list[n] = list[n+1];
					list[n+1] = mayor;
					
					huboCambio = 1;
				}
			}
			
			if(huboCambio == 0) {//si no hubo ningun cambio en toda una ronda es porque esta completo y entra aqui
				completado = 1;
			}
		}
		return list;
	}
	
	public static void imprimirLista(int[] list) {
		for (int i : list) {
			System.out.print(i+", ");
		}
	}
	
	

}
