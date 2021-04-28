public class Arvore extends Planta {
    private boolean frutifera;

    public Arvore(String nome, boolean frutifera) {
        super(nome, "Arvore");
        this.frutifera = frutifera;
    }

    public boolean isFrutifera() {
        return this.frutifera;
    }
}
