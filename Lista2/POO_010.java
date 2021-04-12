import java.util.Scanner;

public class POO_010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.print("Entre com outro número inteiro: ");
        int numero2 = entrada.nextInt();

        System.out.print("Entre com mais um número inteiro: ");
        int numero3 = entrada.nextInt();
        entrada.close();

        System.out.println("O maior número é: " + maiorNumero(numero1, numero2, numero3));
    }

    public static int maiorNumero(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int maiorNumero(int num1, int num2, int num3) {
        return maiorNumero(num1, maiorNumero(num2, num3));
    }
}
