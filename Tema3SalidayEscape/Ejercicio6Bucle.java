import java.util.Scanner;
public class Ejercicio6Bucle {
    public static void main (String[] args) {
        String numeros = "";
        
        for (int i = 1; i<10; i++) {
            numeros += i; 
            
            System.out.printf("%20s%s\n", numeros, numeros);
            
            
        }
       
    }
}