import java.util.Scanner;
import java.util.Random;

public class T3Ejercicio12 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int intentosMaximos;
		int adivinarNumero;
		int numeroIntentos = 0;
		int numeroUsuario;
		boolean Adivinado = false;

		System.out.println("Dime un numero maximo de intentos: ");
		intentosMaximos = scanner.nextInt();
		adivinarNumero = random.nextInt(100) + 1;
		System.out.println("Adivina el numero del 1 al 100");

		while (numeroIntentos < intentosMaximos) {
			System.out.print("Intento " + (numeroIntentos + 1) + ": ");
			numeroUsuario = scanner.nextInt();

			if	(numeroUsuario < 1 || numeroUsuario > 100) {
				System.out.println("Adivina el numero del 1 al 100");
				continue;
			}

			if (numeroUsuario == adivinarNumero) {
				Adivinado = true;
				break;
			}
			else if (numeroUsuario < adivinarNumero) {
				System.out.println("El numero es mayor");
			}
			else {
				System.out.println("El numero es menor");
			}
			numeroIntentos++;
		}
		if (Adivinado) {
			System.out.println("Felicidades adivinaste el numero: " + adivinarNumero + " en " + (numeroIntentos + 1) + " intentos");
		}
		else {
			System.out.println("Terminastes tus intentos, el numero era " + adivinarNumero);
		}
	
		scanner.close();
					
	}
}
