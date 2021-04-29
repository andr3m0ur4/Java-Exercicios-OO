public class Empregado extends Candidato {
    private String nomeEmpresa;

    public Empregado(String nome, int idade, String empresa) {
        super(nome, idade);
        this.nomeEmpresa = empresa;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }
}
