public class Candidato {
    protected String nome;
    protected int idade;

    public Candidato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String toString() {
        return "Nome: " + this.nome + " - Idade: " + this.idade;
    }
}
