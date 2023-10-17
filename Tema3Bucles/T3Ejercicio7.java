import java.util.Scanner;
public class T3Ejercicio7 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			double a;
			double b;
			int resultado = 0;
			System.out.println("Dime un numero: ");
			a = Double.parseDouble(scanner.nextLine());
			
			System.out.println("Dime su potencia: ");
			b = Double.parseDouble(scanner.nextLine());
			
			b = Math.pow(a, b); 
			System.out.println("Su potencia es: " + b);
	}
}

			