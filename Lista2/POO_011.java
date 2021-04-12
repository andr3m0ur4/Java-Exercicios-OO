import java.util.Scanner;

public class POO_011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, menor = 0;
        char resposta;

        do {
            System.out.print("Entre com um número inteiro: ");
            int numero = entrada.nextInt();

            if (contador == 0) {
                menor = numero;
            } else {
                menor = menorNumero(menor, numero);
            }

            contador++;
            System.out.print("Inserir outro [s/n]: ");
            resposta = entrada.next().charAt(0);
        } while (resposta != 'n');

        entrada.close();
        System.out.println("O menor é: " + menor);
    }

    public static int menorNumero(int num1, int num2) {
        return Math.min(num1, num2);
    }
}
