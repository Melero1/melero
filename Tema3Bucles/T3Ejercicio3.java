import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
public class T3Ejercicio3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		System.out.println("Indica el primer operador: ");
		num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Indica el segundo operador: ");
		num2 = Integer.parseInt(scanner.nextLine());	
		int suma = 0;
		for (int i = 1; i <= num1; i++) {
		suma = suma + num2;
		}
		System.out.println(num1 + " x " + num2 + " = " + suma);	


	}

}