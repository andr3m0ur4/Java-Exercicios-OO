public class Carnivora extends Planta {
    private boolean venenosa;

    public Carnivora(String nome, boolean venenosa) {
        super(nome, "Carnivora");
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return this.venenosa;
    }
}
