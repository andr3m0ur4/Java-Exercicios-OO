public class Estagio extends Vaga {
    private int tempoEmMeses;

    public Estagio(String descricao, double salario, int tempo) {
        super(descricao, salario);
        this.tempoEmMeses = tempo;
    }

    public int getTempoEmMeses() {
        return this.tempoEmMeses;
    }
}
