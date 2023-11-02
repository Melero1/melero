import java.util.Scanner;

public class Ejer15Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea pendiente después de la entrada de la opción

            switch (opcion) {
                case 1:
                    opcionPalabraMasLarga(sc);
                    break;
                case 2:
                    opcionPalabraMasCorta(sc);
                    break;
                case 3:
                    opcionNumeroDeVocales(sc);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("================");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
        System.out.print("Introduce opción: ");
    }

    public static void opcionPalabraMasLarga(Scanner sc) {
        System.out.println("Introduce tres palabras:");
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();

        String palabraMasLarga = palabraMasLarga(palabra1, palabra2, palabra3);
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }

    public static String palabraMasLarga(String palabra1, String palabra2, String palabra3) {
        String palabraMasLarga = palabra1;

        if (palabra2.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra2;
        }
        if (palabra3.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra3;
        }

        return palabraMasLarga;
    }

    public static void opcionPalabraMasCorta(Scanner sc) {
        System.out.println("Introduce tres palabras:");
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();

        String palabraMasCorta = palabraMasCorta(palabra1, palabra2, palabra3);
        System.out.println("La palabra más corta es: " + palabraMasCorta);
    }

    public static String palabraMasCorta(String palabra1, String palabra2, String palabra3) {
        String palabraMasCorta = palabra1;

        if (palabra2.length() < palabraMasCorta.length()) {
            palabraMasCorta = palabra2;
        }
        if (palabra3.length() < palabraMasCorta.length()) {
            palabraMasCorta = palabra3;
        }

        return palabraMasCorta;
    }

    public static void opcionNumeroDeVocales(Scanner sc) {
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int numVocales = contarVocales(palabra);
        System.out.println("El número de vocales en la palabra es: " + numVocales);
    }

    public static int contarVocales(String palabra) {
        palabra = palabra.toLowerCase(); // Convertir a minúsculas para contar las vocales sin importar la case
        int count = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                count++;
            }
        }

        return count;
    }
}