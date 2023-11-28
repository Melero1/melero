package tema06;

public class Ejercicio09 {
    public Ejercicio09() {
        String s1 = "Hola esta es una frase de prueba";
        System.out.println("Hola mundo");
    }
    public String resultado(String s1) {
        StringBuilder s2 = new StringBuilder();
        s1 = s1.trim().replaceAll("\\s", " ");
        for (int i = 0; i < s1.length(); i++) {
            if (i%2 != 0) {
                s2.append(s1.charAt(i));
            }
        }
        return s1;
    }
}