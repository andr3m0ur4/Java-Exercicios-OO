public class Aquatico extends Animal {
    private boolean respiraForaDaAgua;

    public Aquatico() {

    }

    public Aquatico(String nome, String especie, boolean respiraForaDaAgua) {
        super(nome, especie);
        setRespiraForaDaAgua(respiraForaDaAgua);
    }

    public void setRespiraForaDaAgua(boolean respiraForaDaAgua) {
        this.respiraForaDaAgua = respiraForaDaAgua;
    }

    public boolean isRepiraForaDaAgua() {
        return this.respiraForaDaAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "Pode respirar fora da água? " + (respiraForaDaAgua ? "Sim\n" : "Não\n");
    }
}