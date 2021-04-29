public class Desempregado extends Candidato {
    private int mesesSemTrabalhar;

    public Desempregado(String nome, int idade, int tempo) {
        super(nome, idade);
        this.mesesSemTrabalhar = tempo;
    }

    public int getMesesSemTrabalhar() {
        return this.mesesSemTrabalhar;
    }
}
