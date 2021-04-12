public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {

    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public void setIdade(int valor) {
        this.idade = valor;
    }

    public void setAltura(double valor) {
        this.altura = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void fazAniversario(boolean verdade) {
        if (verdade) {
            this.idade++;
        }
    }
}