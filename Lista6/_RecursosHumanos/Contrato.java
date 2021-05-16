public class Contrato extends Vaga {
    private boolean temporario;

    public Contrato() {
        super();
    }

    public Contrato(String descricao, double salario, boolean temporario) {
        super(descricao, salario);
        setTemporario(temporario);
    }

    public void setTemporario(boolean temporario) {
        this.temporario = temporario;
    }

    public boolean isTemporario() {
        return this.temporario;
    }

    @Override
    public String toString() {
        return super.toString() + " - Vaga: " + (temporario ? "temporária" : "indeterminada");
    }
}
