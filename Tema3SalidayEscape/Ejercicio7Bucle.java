import java.util.Scanner;
public class Ejercicio7Bucle {
    public static void main (String[] args) {
        String numeros = "";
        for (int i = 1; i<=9; i++) {
            numeros += i; 
            System.out.printf("%9s", numeros);
            
            for (int a = i;a>= 1;a--) {   
            System.out.printf("%1s", a);
            }    
            System.out.printf("\n");
        }
        
    }
}