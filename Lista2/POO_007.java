import java.util.Scanner;

public class POO_007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int numero1 = entrada.nextInt();

        System.out.print("Entre com outro número inteiro: ");
        int numero2 = entrada.nextInt();
        entrada.close();

        System.out.println("O menor número é: " + menorNumero(numero1, numero2));
    }

    public static int menorNumero(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}
