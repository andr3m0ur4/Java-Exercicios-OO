public class CandidatoVaga {
    private Candidato candidato;
    private Vaga vaga;
    private boolean contratado;

    public CandidatoVaga(Candidato candidato, Vaga vaga) {
        setCandidato(candidato);
        setVaga(vaga);
        setContratado(false);
    }

    public void setCandidato(Candidato candidato) {
        if (candidato != null) {
            this.candidato = candidato;
        }
    }

    public void setVaga(Vaga vaga) {
        if (vaga != null) {
            this.vaga = vaga;
        }
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public Vaga getVaga() {
        return this.vaga;
    }

    public boolean isContratado() {
        return this.contratado;
    }

    @Override
    public String toString() {
        return (contratado ? "[Contratado]\n\t" : "[Em Aberto]\n\t") + 
            "[Candidato] " + this.candidato + "\n\t" +
            "[Vaga] " + this.vaga;
    }
}
