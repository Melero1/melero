import java.util.Scanner;
public class Ejercicio5Bucle {
    public static void main (String[] args) {
         String numeros = " ";
            for (int i = 1; i<10; i++) {
                numeros += i;         
                System.out.printf("\u001B[" + (29 + i ) + "m %10s \u001B[0m\n", numeros);
            }
    }
}