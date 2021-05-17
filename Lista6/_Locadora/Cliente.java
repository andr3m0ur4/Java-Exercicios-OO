public class Cliente {
    private int codigo;
    private String nome;
    private int idade;

    public Cliente() {

    }

    public Cliente(int codigo, String nome, int idade) {
        setCodigo(codigo);
        setNome(nome);
        setIdade(idade);
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade > 16) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + " - Nome: " + this.nome +
            " - Idade: " + this.idade + "\n";
    }
}
