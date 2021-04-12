import java.util.Scanner;

public class POO_026 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a quantidade termos: ");
        int quantidade = entrada.nextInt();

        if (quantidade > 0) {
            int[] array = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Entre com %d° número: ", i + 1);
                array[i] = entrada.nextInt();
            }

            entrada.close();
            exibirNumerosPerfeitos(array);
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }

    public static void exibirNumerosPerfeitos(int[] numeros) {
        System.out.print(">> ");

        for (int i = 0; i < numeros.length; i++) {
            if (ehNumeroPerfeito(numeros[i])) {
                System.out.printf("%d ", numeros[i]);
            }
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
