import java.util.Scanner;
public class Ejer6Argumentos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);       
        
        String cadena = print('a', 3, 2);
        System.out.println(cadena);
        scanner.close();        
    }

    public static String print (char c, int columns, int rows) {
        String result = "";
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++) {
                result = result + c;
            }
            result += "\n";
        }
        return result;
    }
}