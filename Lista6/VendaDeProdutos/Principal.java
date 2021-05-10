import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Scanner entrada = new Scanner(System.in);
        char op = 's';

        
        while (op == 's') {
            System.out.println("Sistema de Vendas de Produtos");
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
                        if (pedido.isCheio()) {
                            System.out.println("O pedido ja possui 100 itens.");
                            break;
                        } else {
                            pedido.inserirProduto(new Frios());
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Quantos paezinhos voce gostaria de comprar? ");
                    int quantidade = entrada.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        if (pedido.isCheio()) {
                            System.out.println("O pedido ja possui 100 itens.");
                            break;
                        } else {
                            pedido.inserirProduto(new Paozinho());
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Quantos doces voce gostaria de comprar? ");
                    int quantidade = entrada.nextInt();

                    for (int i = 0; i < quantidade; i++) {
                        if (pedido.isCheio()) {
                            System.out.println("O pedido ja possui 100 itens.");
                            break;
                        } else {
                            pedido.inserirProduto(new Doces());
                        }
                    }
                }
                default -> {
                    System.out.println("Codigo invalido!");
                }
            }

            System.out.print("Deseja realizar outra compra? (S/N) ");
            op = entrada.next().toLowerCase().charAt(0);
            limparTela();
        }
        entrada.close();

        //System.out.println(pedido.getQuantidade());
        System.out.println("Valor total da compra = R$ " + pedido.calcularValorTotal());
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException erro) {
            erro.printStackTrace();
        } catch (InterruptedException erro2) {
            erro2.printStackTrace();
        }
    }
}
