abstract public class Animal {
    private String nome;
    private String especie;

    public Animal() {

    }

    public Animal(String nome, String especie) {
        setNome(nome);
        setEspecie(especie);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.isEmpty()) {
            this.especie = especie;
        }
    }

    public String getEspecie() {
        return this.especie;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Espécie: " + this.especie;
    }
}
