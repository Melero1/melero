package tema06;
import java.util.Scanner;

public class Ejercicio01 {
    public Ejercicio01() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("Ingresa una frase");
        str = scanner.nextLine();

        char[] newFrase = str.toCharArray();
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(output);


        scanner.close();
    }
}
