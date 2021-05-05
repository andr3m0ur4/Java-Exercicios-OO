public class Aluguel {
    private Midia[] midias;
    private Cliente cliente;
    private int quantidade;

    public Aluguel(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void alugarMidia(Midia midia, Cliente cliente) {
        this.midias[quantidade] = midia;
        this.quantidade++;

    }
}
