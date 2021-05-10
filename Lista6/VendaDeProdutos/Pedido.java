public class Pedido {
    private Produto[] produtos;
    private int quantidade = 0;

    public Pedido() {
        this.produtos = new Produto[100];
    }

    public void inserirProduto(Produto produto) {
        if (produto != null) {
            this.produtos[quantidade] = produto;
            quantidade++;
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public boolean isCheio() {
        return this.quantidade == 100;
    }

    public double calcularValorTotal() {
        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            total += produtos[i].getPreco();
        }

        return total;
    }
}
