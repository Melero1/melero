import java.util.Scanner;
public class Ejer4Mayor {
public static void main (String[]args ){
    Scanner scanner = new Scanner (System.in);
    double num1, num2, num3, num4;
    System.out.println("Dime el primer numero: ");
    num1 = Double.parseDouble(scanner.nextLine());
    System.out.println("Dime el segundo numero: ");
    num2 = Double.parseDouble(scanner.nextLine());
    System.out.println("Dime el tercer numero: ");
    num3 = Double.parseDouble(scanner.nextLine());
    System.out.println("Dime el quarto numero: ");
    num4 = Double.parseDouble(scanner.nextLine());
    
    System.out.printf("El mayor es %.2f\n", max(num1, num2, num3, num4));
    scanner.close();
    }
    public static double max(double number1, double number2, double number3, double number4) {
   
    if (number1 >= number2)
        return number1;
    else    
        return number2;

}

}    
}
