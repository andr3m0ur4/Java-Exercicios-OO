import java.util.Arrays;
import java.util.Scanner;

public class POO_018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] primos = primos();

        for (int i = 0; i < primos.length; i++) {
            System.out.printf("%d ", primos[i]);
        }

        System.out.print("\n\nEntre com um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        System.out.println("É primo? " + ehPrimo(numero));
    }

    public static int[] primos() {
        int[] primos = new int[168];
        int numero = 2;

        for (int i = 0; i < primos.length; i++) {
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    numero++;
                    j = 2;
                    continue;
                }
            }
            primos[i] = numero++;
        }

        return primos;
    }

    public static boolean ehPrimo(int numero) {
        return Arrays.binarySearch(primos(), numero) >= 0;
    }
}
