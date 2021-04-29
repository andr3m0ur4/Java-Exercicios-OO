public class Contrato extends Vaga {
    private boolean temporario;

    public Contrato(String descricao, double salario, boolean temporario) {
        super(descricao, salario);
        this.temporario = temporario;
    }

    public boolean isTemporario() {
        return this.temporario;
    }
}
