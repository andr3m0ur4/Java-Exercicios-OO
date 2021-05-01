public class Midia {
    protected int codigo;
    protected String titulo;
    protected String tipo;
    protected String genero;
    protected double valor;

    public Midia(int codigo, String titulo, String tipo, String genero, double valor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getGenero() {
        return this.genero;
    }

    public double getValor() {
        return this.valor;
    }
}
