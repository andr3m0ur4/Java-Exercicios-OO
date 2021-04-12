import java.util.Scanner;

public class POO_001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double numero = entrada.nextDouble();
        entrada.close();

        if (isPositivo(numero)) {
            System.out.printf("O número %.2f é positivo.\n", numero);
        } else {
            System.out.printf("O número %.2f é negativo.\n", numero);
        }
    }

    public static boolean isPositivo(double num) {
        return num >= 0.0;
    }
}