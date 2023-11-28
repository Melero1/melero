package tema06;
import java.util.Scanner;
public class Ejercicio12 {
    public Ejercicio12() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String cadena = scanner.nextLine();

        String resultSustituir = sustituir(cadena);
        String resultUnic = unic(cadena);

        System.out.println(resultSustituir);
        System.out.println(resultUnic);
        scanner.close();
    }
    public static String sustituir(String cadena) {
        cadena = cadena.replaceAll("es","no por");
    return cadena;
    }
     public static String unic(String cadena) {
         cadena = cadena.replaceAll("\\d+", "*");
         return cadena;
     }

}
