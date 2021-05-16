public class Estagio extends Vaga {
    private int meses;

    public Estagio() {
        super();
    }

    public Estagio(String descricao, double salario, int meses) {
        super(descricao, salario);
    }

    public void setMeses(int meses) {
        if (meses > 0) {
            this.meses = meses;
        }
    }

    public int getMeses() {
        return this.meses;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tempo (em meses): " + this.meses;
    }
}
