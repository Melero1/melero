public class Ejer7Factorial {
    public static void main(String[] args) {
        int numero = 5; 
        long factorial = calcularFactorial(numero);
        System.out.println(numero + "! = " + factorial);
    }

    public static long calcularFactorial(int numero) {
        
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }  
}
