package tema06;
import java.util.Random;
public class Ejercicio26 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] datos = new int[4][8];

        for (int i = 0; i < datos.length; i++ ) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = rnd.nextInt(9);
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
