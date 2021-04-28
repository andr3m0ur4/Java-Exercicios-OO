public class Planta {
    protected String nome;
    protected String especie;

    public Planta(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecie() {
        return this.especie;
    }
}
