public class ConversaoDeUnidadesDeArea {
    private int metro;
    private int pe;
    private int milha;
    private int acre;

    public void setMetroQuadrado(int valor) {
        this.metro = valor;
    }

    public int getMetroQuadrado() {
        return this.metro;
    }

    public void setPeQuadrado(int valor) {
        this.pe = valor;
    }

    public int getPeQuadrado() {
        return this.pe;
    }

    public void setMilhaQuadrado(int valor) {
        this.milha = valor;
    }

    public int getMilhaQuadrada() {
        return this.milha;
    }

    public void setAcreQuadrado(int valor) {
        this.acre = valor;
    }

    public int getAcreQuadrado() {
        return this.acre;
    }

    public double metrosParaPes() {
        return this.metro * 10.76;
    }

    public int pesParaCentimetros() {
        return this.pe * 929;
    }

    public int milhasParaAcres() {
        return this.milha * 640;
    }

    public double acresParaPes() {
        return this.acre * 43.560;
    }
}
