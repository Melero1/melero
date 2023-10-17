import java.util.Scanner;
import java.util.Random;

public class T3Ejercicio13 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
            int cara = 0; 
            int cruz = 0;
            int resultado;
            double totalCara;
            double totalCruz;
            int lanzamiento = 1000000;

            System.out.println("Vamos a soltar una moneda al aire 1000000 veces y ver cuantas veces a salido cara y cuantas cruz");
            //Genera un numero 0 o 1 usando random.nextInt(2)
            for (int i = 0; i < lanzamiento; i++) {
                resultado = random.nextInt(2);

                if (resultado == 0){
                    cara++;
                } else {
                    cruz++;
                }
            }
            totalCara = (double) cara / lanzamiento * 100;
            totalCruz = (double) cruz / lanzamiento * 100;

            System.out.println("El total de caras es: " + totalCara);
            System.out.println("El total de cruces es: " + totalCruz);
            
    }

}