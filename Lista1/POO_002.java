import java.util.Scanner;

public class POO_002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        double numero = entrada.nextDouble();
        entrada.close();

        if (isZero(numero)) {
            System.out.printf("O número %.2f é zero.\n", numero);
        } else {
            System.out.printf("O número %.2f não é zero.\n", numero);
        }
    }

    public static boolean isZero(double num) {
        return num == 0.0;
    }
}
