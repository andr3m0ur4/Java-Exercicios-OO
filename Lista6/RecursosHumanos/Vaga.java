public class Vaga {
    protected String descricao;
    protected double salario;
    protected Candidato[] candidatos;
    private int quantidade;

    public Vaga(String descricao, double salario) {
        this.descricao = descricao;
        this.salario = salario;
        this.candidatos = new Candidato[10];
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void cadastrarCandidato(Candidato canditado) {
        this.candidatos[this.quantidade] = canditado;
        this.quantidade++;
    }

    public Candidato[] getCandidatos() {
        return this.candidatos;
    }
}
