import java.util.Scanner;

public class POO_023 {
    static int numero = 2;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a quantidade termos: ");
        int quantidade = entrada.nextInt();

        if (validarNumero(quantidade)) {
            int[] array = new int[quantidade];
            boolean validacao = true;

            if (array.length == 0 || array.length > 1) {
                for (int i = 0; i < quantidade; i++) {
                    System.out.printf("Entre com %d° número: ", i + 1);
                    array[i] = entrada.nextInt();

                    if (!validarNumero(array[i])) {
                        validacao = false;
                        break;
                    }
                }

                entrada.close();

                if (validacao && array.length > 1) {
                    System.out.println("MMC: " + MMC(array));
                } else if (array.length == 0) {
                } else {
                    System.out.println("Erro! Valor inválido.");
                }
            } else {
                System.out.println("Erro! Valor inválido.");
            }
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }

    public static boolean validarNumero(int numero) {
        return numero >= 0;
    }

    public static int MMC(int[] numeros) {
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
