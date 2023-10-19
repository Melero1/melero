import java.util.Scanner;
public class Ejercicio2Hora {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;

        System.out.println("Dime un numero del 0-24 para indicar la hora");
        hora = Integer.parseInt(scanner.nextLine());

        System.out.println("Dime un numero del 0-59 que indicara los minutos");
        minutos = Integer.parseInt(scanner.nextLine());

        System.out.println("Dime un numero del 0-59 que indicara los segundos");
        segundos = Integer.parseInt(scanner.nextLine());

        System.out.printf("%2d:%2d:%2d", hora, minutos, segundos);
    }
}