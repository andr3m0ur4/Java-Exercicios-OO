public class Jogo extends Midia {
    private String console;

    public Jogo(
        int codigo, String titulo, String tipo, String genero, double valor,
        String console
    ) {
        super(codigo, titulo, tipo, genero, valor);
        this.console = console;
    }

    public String getConsole() {
        return this.console;
    }
}
