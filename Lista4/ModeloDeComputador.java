public class ModeloDeComputador {
    private int tipoProcessador;
    private int memoriaRAM;
    private int tamanhoDiscoRigido;
    private int tamanhoMonitor;
    private int placaMae = 800;

    public void setTipoProcessador(int valor) {
        switch (valor) {
            case 1 -> {
                this.tipoProcessador = 700;
            }
            case 2 -> {
                this.tipoProcessador = 830;
            }
            case 3 -> {
                this.tipoProcessador = 910;
            }
            default -> {
                this.tipoProcessador = 0;
            }
        }
    }

    public int getTipoProcessador() {
        return this.tipoProcessador;
    }

    public void setMemoriaRAM(int valor) {
        this.memoriaRAM = valor * 350;
    }

    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setTamanhoDiscoRigido(int valor) {
        switch (valor) {
            case 1 -> {
                this.tamanhoDiscoRigido = 300;
            }
            case 2 -> {
                this.tamanhoDiscoRigido = 420;
            }
            case 3 -> {
                this.tamanhoDiscoRigido = 500;
            }
            default -> {
                this.tamanhoDiscoRigido = 0;
            }
        }
    }

    public int getTamanhoDiscoRigido() {
        return this.tamanhoDiscoRigido;
    }

    public void setTamanhoMonitor(int valor) {
        switch (valor) {
            case 1 -> {
                this.tamanhoMonitor = 320;
            }
            case 2 -> {
                this.tamanhoMonitor = 520;
            }
            default -> {
                this.tamanhoMonitor = 0;
            }
        }
    }

    public int getTamanhoMonitor() {
        return this.tamanhoMonitor;
    }

    public double calcularPreco() {
        return this.placaMae + this.tipoProcessador + this.memoriaRAM
            + this.tamanhoDiscoRigido + this.tamanhoMonitor;
    }
}
