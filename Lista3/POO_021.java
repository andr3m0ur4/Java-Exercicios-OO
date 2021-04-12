import java.util.Scanner;

public class POO_021 {
    static int numero = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a quantidade termos: ");
        int quantidade = entrada.nextInt();

        if (validarNumeros(quantidade)) {
            int[] array = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Entre com %d° número: ", i + 1);
                array[i] = entrada.nextInt();
            }

            entrada.close();

            if (validarNumeros(array) && array.length > 0) {
                System.out.println("MDC: " + MDC(array));
            } else if (array.length == 0) {
            } else {
                System.out.println("Erro! Valor inválido.");
            }
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }

    public static int MDC(int[] numeros) {
        boolean validacao;
        int primos = 1;

        do {
            validacao = true;
            
            for (int i = 0; i < numeros.length; i++) {
                if (validacao) {
                    validacao = ehDivisivel(numeros[i]);
                }
    
                numeros[i] = ehDivisivel(numeros[i]) ? numeros[i] / obterPrimo() : numeros[i];
            }
    
            primos *= validacao ? obterPrimo() : 1;
            //System.out.println(Arrays.toString(numeros));
            
            validacao = false;

            for (int i = 0; i < numeros.length; i++) {
                if (!ehDivisivel(numeros[i])) {
                    validacao = true;
                } else {
                    validacao = false;
                    break;
                }
            }

            if (validacao) {
                obterProximoPrimo();
            }

            validacao = true;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] != 1) {
                    validacao = false;
                    break;
                }
            }
        } while (!validacao);

        return primos;
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

    public static boolean validarNumeros(int numero) {
        if (numero < 0) {
            return false;
        }

        return true;
    }

    public static boolean validarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                return false;
            }
        }

        return true;
    }
}
