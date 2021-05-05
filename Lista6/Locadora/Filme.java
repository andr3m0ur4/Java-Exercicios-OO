public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public Filme() {
        super();
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
