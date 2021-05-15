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
        aumentarTamanho();
        this.candidatos[this.quantidade] = canditado;
        this.quantidade++;
    }

    public Candidato[] getCandidatos() {
        return this.candidatos;
    }

    public String toString() {
        String candidato = "Descicao: " + this.descricao;
        candidato += "\nSalario: R$ " + this.salario;
        return candidato;
    }

    private void aumentarTamanho() {
        if (this.quantidade == this.candidatos.length) {
            Candidato[] novosCandidatos = new Candidato[this.candidatos.length + 5];

            for (int i = 0; i < this.quantidade; i++) {
                novosCandidatos[i] = this.candidatos[i];
            }

            this.candidatos = novosCandidatos;
        }
    }
}
