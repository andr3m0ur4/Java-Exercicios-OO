import java.util.Scanner;

public class POO_024 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero > 0) {
            if (ehNumeroPerfeito(numero)) {
                System.out.printf("O número %d é perfeito\n", numero);
            } else {
                System.out.printf("O número %d não é perfeito\n", numero);
            }
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
