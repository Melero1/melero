public class Ejer2Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radio;
        double area;
        double longitud;
        System.out.println("Dime el radio: ");
        radio = Double.parseDouble(scanner.nextDouble());
        area = area(radio);
        longitud = longitud(radio);

        System.out.printf("Eñ area de una circunferencia de radio %.2f es %.2f " + "y la longitud es %.2f\n", radio, area, longitud);

        scanner.close();
}





    public static double area(double radio) {
        return Math.PI * radio * radio;
    }

    public static double area(double radio) {
        return 2 *  Math.PI * radio;
    }


}

