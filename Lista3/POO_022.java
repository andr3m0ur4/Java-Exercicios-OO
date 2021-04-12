import java.util.Scanner;

public class POO_022 {
    static int numero = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Entre com outro valor: ");
        int valor2 = entrada.nextInt();
        entrada.close();

        System.out.println("MMC: " + MMC(valor1, valor2));
    }

    public static int MMC(int valor1, int valor2) {
        int numeros[] = { valor1, valor2 };
        int fatoresPrimos = 1;
        boolean validacao;

        do {
            validacao = false;

            for (int i = 0; i < numeros.length; i++) {
                if (ehDivisivel(numeros[i])) {
                    numeros[i] /= obterPrimo();
                    validacao = true;
                }
            }

            if (validacao) {
                fatoresPrimos *= obterPrimo();
            } else {
                obterProximoPrimo();
            }
        } while (restoUm(numeros));

        return fatoresPrimos;
    }

    public static boolean ehDivisivel(int numerador) {
        return numerador % obterPrimo() == 0;
    }

    public static int obterPrimo() {
        if (!ehPrimo(numero)) {
            numero++;
            obterPrimo();
        }

        return numero;
    }

    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int obterProximoPrimo() {
        numero++;
        return obterPrimo();
    }

    public static boolean restoUm(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                return true;
            }
        }

        return false;
    }
}
