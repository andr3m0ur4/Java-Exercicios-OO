public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public Livro() {

    }

    public Livro(
        int codigo, String titulo, String tipo, String genero, double valor,
        String autor, String editora, int edicao
    ) {
        super(codigo, titulo, tipo, genero, valor);
        setAutor(autor);
        setEditora(editora);
        setEdicao(edicao);
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return this.autor;
    }

    public void setEditora(String editora) {
        if (editora != null && !editora.isEmpty()) {
            this.editora = editora;
        }
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEdicao(int edicao) {
        if (edicao > 0) {
            this.edicao = edicao;
        }
    }

    public int getEdicao() {
        return this.edicao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Autor: " + this.autor +
            " - Editora: " + this.editora + " - Edicao: " + this.edicao + "\n";
    }
}
