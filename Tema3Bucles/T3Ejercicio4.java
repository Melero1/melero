import java.util.Scanner;
public class T3Ejercicio4 {
	public static void main(String[] args){
		int impares = 0;
		
		for (int i =1; i <= 100; i++) {
  			if( i% 2 !=0){
				impares = impares + 1;
				System.out.println(i);
			}
		}
		System.out.println("Hay un total de numeros impares " + impares);

	}
}