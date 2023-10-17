import java.util.Scanner;
public class T3Ejercicio5 {
	public static void main(String[] args){
		int numerosPares = 0;
		int numerosImpares = 0;
		int numerosMultiplos5 = 0;
		

		for (int i = 1; i <= 101; i++) {
  			System.out.println(i);
			
			
			if (i % 2 == 0) {
				System.out.print("Impar: ");
				numerosImpares++;
				
			}	
			
			else { 
			System.out.print("Par: ");
			numerosPares++;
			
			}

			if (i % 5 == 0) {
				System.out.print("Multiplo de 5: ");
				numerosMultiplos5++;
				

			}
			
		}
		
		

	 System.out.println("\nResumen:");
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números impares: " + numerosImpares);
        System.out.println("Números múltiplos de 5: " + numerosMultiplos5);
 

}
}