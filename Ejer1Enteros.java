java import.util.Scanner;
public class Ejer1Enteros {
public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 7;
        
        int suma = sumarDosEnteros(numero1, numero2);
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
    
    public static int sumarDosEnteros(int num1, int num2) {
        int suma = num1 + num2;
        return suma;

    }
}