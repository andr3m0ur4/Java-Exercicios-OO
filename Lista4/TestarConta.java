import java.util.Scanner;

class TestarConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.print("Digite o valor total: R$ ");
        conta.setValorTotal(entrada.nextDouble());

        System.out.print("Digite a quantidade de pessoas: ");
        conta.setQuatidadePessoas(entrada.nextInt());

        System.out.print("Vai ser pago os 10% do garçom? S/N ");
        char op = entrada.next().toUpperCase().charAt(0);
        entrada.close();

        conta.setTaxaGarcom(op == 'S' ? true : false);

        System.out.println("Valor a ser pago pelos amigos: R$ " + conta.valorDivididoParaCadaPessoa());
    }
}
