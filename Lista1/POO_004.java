import java.util.Scanner;

public class POO_004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("a: ");
        double a = entrada.nextDouble();

        System.out.print("b: ");
        double b = entrada.nextDouble();

        System.out.print("c: ");
        double c = entrada.nextDouble();

        entrada.close();

        System.out.printf("Delta é %.0f\n", delta(a, b, c));
    }

    public static double delta(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}
