import java.util.Scanner;
import java.util.Random;

public class T3Ejercicio14 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
           int uno = 0;
            int dos = 0;
            int tres = 0;
            int cuatro = 0;
            int cinco = 0;
            int seis = 0;
            int resultado;
            double totalUno;
            double totalDos;
            double totalTres;
            double totalCuatro;
            double totalCinco;
            double totalSeis;
            int lanzamiento = 1000000;

            System.out.println("Vamos a soltar un dado al aire 1000000 veces y ver cuantas veces sale cada numero del dado");
            //Genera un numero 0 o 1 usando random.nextInt(2)
            for (int i = 0; i < lanzamiento; i++) {
                resultado = random.nextInt(6) + 1;

                switch (resultado) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
                }
            }
            totalUno = (double) uno / lanzamiento * 100;
            totalDos = (double) dos / lanzamiento * 100;
            totalTres = (double) tres / lanzamiento * 100;
            totalCuatro = (double) cuatro / lanzamiento * 100;
            totalCinco = (double) cinco / lanzamiento * 100;
            totalSeis = (double) seis / lanzamiento * 100;

            System.out.println("El total de unos es: " + totalUno);
            System.out.println("El total de doses es: " + totalDos);
            System.out.println("El total de treses es: " + totalTres);
            System.out.println("El total de cuatros es: " + totalCuatro);
            System.out.println("El total de cincos es: " + totalCinco);
            System.out.println("El total de seis es: " + totalSeis);
            
    }

}