import java.util.Scanner;

public class POO_025 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        exibirNumerosPerfeitos(numero);
    }

    public static void exibirNumerosPerfeitos(int numero) {
        if (numero > 0) {
            System.out.print(">> ");

            for (int i = 1; i <= numero; i++) {
                if (ehNumeroPerfeito(i)) {
                    System.out.printf("%d ", i);
                }
            }

            System.out.println();
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }

    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return numero == somaDivisores;
    }
}
