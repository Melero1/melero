import java.util.Scanner;
public class Ejer5Argumentos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);       

        String cadena = print('a', 3);
        System.out.println(cadena);
        scanner.close();
    }

    public static void print(char c, int times) {
        String result = "";
        for (int i = 1; i <= times; i++)
            result = result + c;
    }
}