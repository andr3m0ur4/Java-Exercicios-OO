import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Scanner entrada = new Scanner(System.in);
        char op = 's';

        System.out.println("Sistema de Vendas de Produtos");

        while (op == 's') {
            System.out.println("O que voce gostaria de comprar?");
            System.out.println("1 - Frios R$ 10,00");
            System.out.println("2 - Paozinho R$ 1,00");
            System.out.println("3 - Doces R$ 5,00");
            int tipo = entrada.nextInt();

            switch (tipo) {
                case 1 -> {
                    System.out.print("Quantos frios voce gostaria de comprar? ");
                    int quantidade = entrada.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        pedido.inserirProduto(new Frios());
                    }
                }
                case 2 -> {
                    System.out.print("Quantos paezinhos voce gostaria de comprar? ");
                    int quantidade = entrada.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        pedido.inserirProduto(new Paozinho());
                    }
                }
                case 3 -> {
                    System.out.print("Quantos doces voce gostaria de comprar? ");
                    int quantidade = entrada.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        pedido.inserirProduto(new Doces());
                    }
                }
                default -> {
                    System.out.println("Codigo invalido!");
                }
            }

            System.out.print("Deseja realizar outra compra? (S/N) ");
            op = entrada.next().toLowerCase().charAt(0);
        }
        entrada.close();

        //System.out.println(pedido.getQuantidade());
        System.out.println("Valor total da compra = R$ " + pedido.calcularValorTotal());
    }
}
