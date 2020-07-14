package pruebas;

public class prueba1 {

    public static void main(String[] args) {
        int d = 3;
        int[] a = {1,2,3,4,5};
        int[] resultado;

        resultado = rotacion(a,d);
        for (int i:resultado) {
            System.out.print(i+" ");
        }




    }

    public static int[] rotacion(int[] datos, int ciclos){
        int[] entrada = datos;
        int[] rotate = new int[datos.length];

        for (int i=0; i<ciclos;i++) {
            for (int j=0; j<datos.length; j++){
                if(j == 0){
                    rotate[datos.length-1] = entrada[0];
                }else {
                    rotate[j-1] = entrada[j];
                }
            }
            entrada = rotate;
        }
        return rotate;
    }
}