public class Aluguel {
    private Cliente cliente;
    private Midia[] midias;
    private int quantidadeMidias;
    private double total;
    private double totalPago;

    public Aluguel() {
        this.midias = new Midia[100];
    }

    public Aluguel(Cliente cliente) {
        setCliente(cliente);
        this.midias = new Midia[100];
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void alugarMidia(Midia midia) {
        if (midia != null) {
            midias[quantidadeMidias] = midia;
            setTotal(midia.getValor());
            quantidadeMidias++;
        }
    }

    public Midia devolverMidia(int codigo) {
        Midia midia = null;

        for (int i = 0; i < this.quantidadeMidias; i++) {
            if (this.midias[i].getCodigo() == codigo) {
                midia = this.midias[i];

                for (int j = i; j < this.quantidadeMidias - 1; j++) {
                    this.midias[j] = this.midias[j + 1];
                }

                this.midias[quantidadeMidias] = null;
                this.quantidadeMidias--;
                break;
            }
        }

        return midia;
    }

    public Midia[] getMidia() {
        return this.midias;
    }

    public void setTotal(double valor) {
        if (valor >= 0) {
            this.total += valor;
        }
    }

    public double getTotal() {
        return this.total;
    }

    public void pagarAluguel(Midia midia) {
        this.totalPago += midia.getValor();
    }

    public double getTotalPago() {
        return this.totalPago;
    }
}
