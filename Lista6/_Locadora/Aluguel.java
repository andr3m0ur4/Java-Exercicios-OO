public class Aluguel {
    private Cliente cliente;
    private Midia[] midias;
    private int quantidadeMidias;
    private double total;

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

    public void setMidia(Midia midia) {
        if (midia != null) {
            midias[quantidadeMidias] = midia;
            quantidadeMidias++;
        }
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
}
