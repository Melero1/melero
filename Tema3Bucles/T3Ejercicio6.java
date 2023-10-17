import java.util.Scanner;
public class T3Ejercicio6 {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);		
		int num;
		int resultado;
		System.out.println("Ingresa un numero para mostrar la tabla de multiplicar (1-10): ");
		num = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			resultado = num * i;
		System.out.println("La tabla de multiplicar de" + num + " es: " + resultado);
		}
	}
}