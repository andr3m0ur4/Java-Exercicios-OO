public class Jogo extends Midia {
    private String console;

    public Jogo() {

    }

    public Jogo(
        int codigo, String titulo, String tipo, String genero, double valor,
        String console
    ) {
        super(codigo, titulo, tipo, genero, valor);
        setConsole(console);
    }

    public void setConsole(String console) {
        if (console != null && !console.isEmpty()) {
            this.console = console;
        }
    }

    public String getConsole() {
        return this.console;
    }

    @Override
    public String toString() {
        return super.toString() + " - Console: " + this.console + "\n";
    }
}
