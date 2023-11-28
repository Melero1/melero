package tema06;

import java.util.Scanner;
public class Ejercicio11 {
    public Ejercicio11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();

        System.out.println("Ingrese su primer apellido");
        String subName = scanner.nextLine();

        System.out.println("Ingrese su segundo apellido");
        String subNameTwo = scanner.nextLine();

        System.out.println("Su nombre completo es: " + name + " " + subName + " " + subNameTwo);

        //Llamo los metodos
        String resultComplete = complete(name, subName, subNameTwo);
        String resultPrimers = primers(name, subName, subNameTwo);
        String resultUltimo = ultimo(name, subName, subNameTwo);
        int resultOccurrence = Integer.parseInt(String.valueOf(occurrence(name, subName, subNameTwo)));
        String resultInvert = invert(name, subName, subNameTwo);

        //Imprime el resultado de los metodos
        System.out.println(resultPrimers);
        System.out.println(resultUltimo);
        System.out.println(resultOccurrence);
        System.out.println(resultInvert);

        scanner.close();
    }

//metodo para imprimir en minuscula, mayuscula y su longitud
    private static String complete(String name, String subName, String subNameTwo) {
        var s1 = name + subName + subNameTwo;
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        return s1;
    }
//metodo para imprimir los primeros 5 caracteres del s1 ERROR
    private static String primers(String name, String subName, String subNameTwo) {
        String s1 = name + subName + subNameTwo;
        if (s1.length() >= 5) {
            return s1.substring(0, 5);
        } else {
            System.out.println("El nombre no tiene 5 o más caracteres: " + s1);
        }
        return s1;

    }
//metodo para imprimir los 2 ultimos caracter del string s1 ERROR
    public static String ultimo(String name, String subName, String subNameTwo) {
        String s1 = name + subName + subNameTwo;
        if (s1.length() >= 2) {
            return s1.substring(s1.length() - 2);
        }
        return s1;
    }
//metodo para el numero de ocurrencias NOT FOUND
    public static int occurrence(String name, String subName, String subNameTwo) {
        String s1 = name + subName + subNameTwo;
        int contador = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == contador) {
                contador++;
            }
        }
    return contador;
    }
//metodo para la cadena invertida
    public static String invert(String name, String subName, String subNameTwo) {
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = name + subName + subNameTwo;

        // Recorrer la cadena desde el final hasta el principio
        for (int i = s1.length() - 1; i >= 0; i--) {
            // Agregar cada carácter al StringBuilder
            stringBuilder.append(s1.charAt(i));
        }

        // Convertir el StringBuilder a String
        return stringBuilder.toString();
    }

}