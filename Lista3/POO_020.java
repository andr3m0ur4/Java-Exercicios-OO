import java.util.Scanner;

public class POO_020 {
    static int numero = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Entre com outro valor: ");
        int valor2 = entrada.nextInt();
        entrada.close();

        System.out.println("MDC: " + MDC(valor1, valor2));
    }

    public static int MDC(int valor1, int valor2) {
        int primos = 1;

        do {
            if (ehDivisivel(valor1) != valor1 && ehDivisivel(valor2) != valor2) {
                primos *= obterPrimo();
            }

            valor1 = ehDivisivel(valor1);
            valor2 = ehDivisivel(valor2);

            if (
                !(ehDivisivel(valor1) != valor1) && !(ehDivisivel(valor2) != valor2) &&
                (valor1 != 1 || valor2 != 1)
            ) {
                obterProximoPrimo();
            }
        } while (valor1 != 1 && valor2 != 1);

        return primos;
    }

    public static int ehDivisivel(int numero) {
        return numero % obterPrimo() == 0 ? numero / obterPrimo() : numero;
    }

    public static int obterPrimo() {
        if (!ehPrimo(numero)) {
            numero++;
            obterPrimo();
        }

        return numero;
    }

    public static int obterProximoPrimo() {
        numero++;
        return obterPrimo();
    }

    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
