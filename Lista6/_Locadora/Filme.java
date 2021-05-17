public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public Filme() {

    }

    public Filme(
        int codigo, String titulo, String tipo, String genero, double valor,
        String classificacao, int duracao
    ) {
        super(codigo, titulo, tipo, genero, valor);
        setClassificacao(classificacao);
        setDuracao(duracao);
    }

    public void setClassificacao(String classificacao) {
        if (classificacao != null && !classificacao.isEmpty()) {
            this.classificacao = classificacao;
        }
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        }
    }

    public int getDuracao() {
        return this.duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Classificacao: " + this.classificacao +
            " - Duracao: " + this.duracao + " minutos\n";
    }
}
