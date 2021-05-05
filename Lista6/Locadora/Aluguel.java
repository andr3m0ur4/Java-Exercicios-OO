public class Aluguel {
    private Midia[] midias;
    private Cliente cliente;
    private int quantidade;

    public Aluguel(Cliente cliente) {
        this.cliente = cliente;
        this.midias = new Midia[10];
    }
    
    public void alugarMidia(Midia midia) {
        this.midias[quantidade] = midia;
        this.quantidade++;
    }

    public String mostrarMidiasAlugadas() {
        String mensagem = "";

        for (int i = 0; i < this.quantidade; i++) {
            mensagem += "Cod: " + midias[i].getCodigo();
            mensagem += "\nTitulo: " + midias[i].getTitulo();
            mensagem += "\nTipo: " + midias[i].getTipo();
            mensagem += " | Genero: " + midias[i].getGenero();
            mensagem += " | Valor: R$ " + midias[i].getValor();
            
            if (midias[i] instanceof Filme) {
                mensagem += "\nClassificacao: " + ((Filme) midias[i]).getClassificacao();
                mensagem += " | Duracao: " + ((Filme) midias[i]).getDuracao() + " minutos";
            }
            if (midias[i] instanceof Livro) {
                mensagem += "\nAutor: " + ((Livro) midias[i]).getAutor();
                mensagem += " | Editora: " + ((Livro) midias[i]).getEditora();
                mensagem += " | Edicao: " + ((Livro) midias[i]).getEdicao() + " edicao";
            }
            if (midias[i] instanceof Jogo) {
                mensagem += "\nConsole: " + ((Jogo) midias[i]).getConsole();
            }
            mensagem += "\n\n";
        }
        
        return mensagem;
    }

    public double exibirValorTotal() {
        double total = 0;
        for (int i = 0; i < this.quantidade; i++) {
            total += midias[i].getValor();
        }
        return total;
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }
}
