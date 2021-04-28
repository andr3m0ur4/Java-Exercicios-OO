public class Flor extends Planta {
    private String cor;

    public Flor(String nome, String cor) {
        super(nome, "Flor");
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
}
