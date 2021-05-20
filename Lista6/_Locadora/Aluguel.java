public class Aluguel {
    private Cliente cliente;
    private Midia midia;
    private boolean pago;

    public Aluguel() {
        
    }

    public Aluguel(Cliente cliente, Midia midia) {
        setCliente(cliente);
        setMidia(midia);
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
            this.midia = midia;
        }
    }

    public Midia getMidia() {
        return this.midia;
    }

    public void pagarMidia() {
        this.pago = true;
    }

    public boolean isPago() {
        return this.pago;
    }

    /* public void alugarMidia(Midia midia) {
        if (midia != null) {
            midias[quantidadeMidias] = midia;
            setTotal(midia.getValor());
            quantidadeMidias++;
        }
    } */

    /* public Midia devolverMidia(int codigo) {
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
    } */

    
}
