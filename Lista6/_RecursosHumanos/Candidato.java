public class Candidato {
    private String nome;
    private int idade;

    public Candidato(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 12) {
            this.idade = idade;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Idade: " + this.idade;
    }
}
