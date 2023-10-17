import java.util.Scanner;
public class T3Ejercicio10 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double numero;
		int suma = 0;
		int contador = 0;
		double media;
	
		do {
			System.out.println("Indica el numero: ");
			numero = Double.parseDouble(scanner.nextLine());
			suma += numero;
			contador++;
		} while (numero != 0);

		media = suma / contador;
		System.out.println("La suma de los numeros introducidos es " + suma);
		scanner.close();
	}
}