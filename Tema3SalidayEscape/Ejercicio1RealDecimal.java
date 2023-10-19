import java.util.Scanner;
public class Ejercicio1RealDecimal {
    public static void main (String[] args){
        double numeroReal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero real: ");
        numeroReal = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", numeroReal);

        scanner.close();
    }
}