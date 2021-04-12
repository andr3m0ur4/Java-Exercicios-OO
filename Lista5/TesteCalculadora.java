import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite um número: ");
        calc.setNumero1(entrada.nextInt());
        System.out.print("Digite outro número: ");
        calc.setNumero2(entrada.nextInt());

        int operacao = 0;

        while (operacao != 7) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Alterar primeiro número");
            System.out.println("6 - Alterar segundo número");
            System.out.println("7 - Sair");
            operacao = entrada.nextInt();

            switch (operacao) {
                case 1 -> {
                    System.out.println("Soma -> " + calc.somar());
                }

                case 2 -> {
                    System.out.println("Subtração -> " + calc.subtrair());
                }

                case 3 -> {
                    System.out.println("Multiplicação -> " + calc.multiplicar());
                }

                case 4 -> {
                    System.out.println("Divisão -> " + calc.dividir());
                }

                case 5 -> {
                    System.out.print("Digite um número: ");
                    calc.setNumero1(entrada.nextInt());
                }

                case 6 -> {
                    System.out.print("Digite um número: ");
                    calc.setNumero2(entrada.nextInt());
                }

                case 7 -> {}

                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }
        entrada.close();
    }
}
