public class Midia {
    private int codigo;
    private String titulo;
    private String tipo;
    private String genero;
    private double valor;

    public Midia() {

    }

    public Midia(int codigo, String titulo, String tipo, String genero, double valor) {
        setCodigo(codigo);
        setTitulo(titulo);
        setTipo(tipo);
        setGenero(genero);
        setValor(valor);
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setGenero(String genero) {
        if (genero != null && !genero.isEmpty()) {
            this.genero = genero;
        }
    }

    public String getGenero() {
        return this.genero;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public double getValor() {
        return this.valor;
    }

    public String toString() {
        return "Codigo: " + this.codigo + " - Titulo: " + this.titulo +
            " - Tipo: " + this.tipo + " - Genero: " + this.genero +
            " - Valor: R$ " + this.valor;
    }
}
