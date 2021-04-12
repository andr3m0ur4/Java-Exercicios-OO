import java.util.Arrays;
import java.util.Scanner;

public class POO_019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Entre com outro valor: ");
        int valor2 = entrada.nextInt();
        entrada.close();

        System.out.println(">> " + Arrays.toString(gerarPrimos(valor1, valor2)));
    }

    public static int[] gerarPrimos(int valor1, int valor2) {
        if (Math.max(valor1, valor2) == valor1) {
            int auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        
        int[] primos = new int[qtdPrimos(valor1, valor2)];

        for (int i = 0; i < primos.length; i++) {
            for (int j = valor1; j <= valor2; j++) {
                if (ehPrimo(j)) {
                    primos[i] = j;
                    valor1 = ++j;
                    break;
                }
            }
        }

        return primos;
    }

    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int qtdPrimos(int valor1, int valor2) {
        int contador = 0;

        for (int i = valor1; i <= valor2; i++) {
            if (ehPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }
}
