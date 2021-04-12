import java.util.Scanner;

public class POO_006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.print("Entre com outro número inteiro: ");
        int numero2 = entrada.nextInt();
        entrada.close();

        System.out.println("O maior número é: " + maiorNumero(numero1, numero2));
    }

    public static int maiorNumero(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}