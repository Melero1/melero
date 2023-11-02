public class Ejer8Secuencia {
    public static void main(String[] args) {
        int numero = 12321; 
        boolean esCapicua = esCapicua(numero);
        
        if (esCapicua) {
            System.out.println(numero + " es capicúa.");
        } else {
            System.out.println(numero + " no es capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        String numeroStr = Integer.toString(numero); 
        int longitud = numeroStr.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
