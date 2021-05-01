public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public Filme(
        int codigo, String titulo, String tipo, String genero, double valor,
        String classificacao, int duracao
    ) {
        super(codigo, titulo, tipo, genero, valor);
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public int getDuracao() {
        return this.duracao;
    }
}
