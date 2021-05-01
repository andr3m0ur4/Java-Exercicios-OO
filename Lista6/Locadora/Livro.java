public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public Livro(
        int codigo, String titulo, String tipo, String genero, double valor,
        String autor, String editora, int edicao
    ) {
        super(codigo, titulo, tipo, genero, valor);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public int getEdicao() {
        return this.edicao;
    }
}
