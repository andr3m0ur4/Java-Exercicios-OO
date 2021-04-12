import java.util.Scanner;

public class POO_005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("a: ");
        double a = entrada.nextDouble();

        System.out.print("b: ");
        double b = entrada.nextDouble();

        System.out.print("c: ");
        double c = entrada.nextDouble();

        entrada.close();

        if (!isZero(a)) {
            double delta = delta(a, b, c);

            if (isPositivo(delta)) {
                for (double raiz : bhaskara(a, b, delta)) {
                    System.out.println("Raiz: " + raiz);
                }
            } else {
                System.out.println("Não existe solução real");
            }
        } else {
            System.out.println("Raiz não existe");
        }
    }

    public static double delta(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static boolean isZero(double num) {
        return num == 0.0;
    }

    public static boolean isPositivo(double num) {
        return num >= 0.0;
    }

    public static double[] bhaskara(double a, double b, double delta) {
        double[] raiz;

        if (isZero(delta)) {
            raiz = new double[1];
            raiz[0] = -b / 2.0 * a;
        } else {
            raiz = new double[2];
            raiz[0] = (-b + Math.sqrt(delta)) / 2.0 * a;
            raiz[1] = (-b - Math.sqrt(delta)) / 2.0 * a;
        }

        return raiz;
    }
}
