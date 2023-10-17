import java.util.Scanner;
public class T3Ejercicio11 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double numero;
		int suma = 0;
		int contador = 0;
		int media;
	
		do {
			System.out.println("Indica el numero: ");
			numero = Double.parseDouble(scanner.nextLine());
			if (numero >= 0) {
			suma += numero;
			contador++;
			}
		} while (numero >= 0);
		
		//Si contador es 0 media es igual a 0
		//sino media es igual a suma / contador
		//if (contador == 0)
		//	media = 0;
		//else
		//	media = suma / contador;
		//Es lo mismo			

		media = contador == 0 ? 0 : suma / contador;
		System.out.println("La media de los numeros introducidos es: " + media);
		scanner.close();
	}
}