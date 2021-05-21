public class Voador extends Animal {
    private String corPena;

    public Voador() {

    }

    public Voador(String nome, String especie, String corPena) {
        super(nome, especie);
        setCorPena(corPena);
    }

    public void setCorPena(String corPena) {
        if (corPena != null && !corPena.isEmpty()) {
            this.corPena = corPena;
        }
    }

    public String getCorPena() {
        return this.corPena;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cor da Pena: " + this.corPena + "\n";
    }
}
