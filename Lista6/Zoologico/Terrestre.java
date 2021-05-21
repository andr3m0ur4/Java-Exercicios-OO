public class Terrestre extends Animal {
    private int quantidadePatas;

    public Terrestre() {

    }

    public Terrestre(String nome, String especie, int quantidadePatas) {
        super(nome, especie);
        setQuantidadePatas(quantidadePatas);
    }

    public void setQuantidadePatas(int quantidadePatas) {
        if (quantidadePatas > 0) {
            this.quantidadePatas = quantidadePatas;
        }
    }

    public int getQuantidadePatas() {
        return this.quantidadePatas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Quantidade de Patas: " + this.quantidadePatas + "\n";
    }
}
