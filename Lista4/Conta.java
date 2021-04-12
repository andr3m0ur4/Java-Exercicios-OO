public class Conta {
    double valorTotal;
    int quatidadePessoas;
    boolean taxaGarcom;

    public void setValorTotal(double valor) {
        this.valorTotal = valor;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setQuatidadePessoas(int quantidade) {
        this.quatidadePessoas = quantidade;
    }

    public int getQuatidadePessoas() {
        return this.quatidadePessoas;
    }

    public void setTaxaGarcom(boolean taxaGarcom) {
        this.taxaGarcom = taxaGarcom;
    }

    public boolean getTaxaGarcom() {
        return this.taxaGarcom;
    }

    public double valorDivididoParaCadaPessoa() {
        if (taxaGarcom) {
            return (this.valorTotal + this.valorTotal * (10.0 / 100.0)) / this.quatidadePessoas;
        } else {
            return this.valorTotal / this.quatidadePessoas;
        }
    }
}
