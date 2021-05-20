import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);
    static Midia[] midias = new Midia[100];
    static int quantidadeMidias;
    static Cliente[] clientes = new Cliente[100];
    static int quantidadeClientes;
    static Aluguel[] alugueis = new Aluguel[100 * 100];
    static int quantidadeAluguel;

    public static void main(String[] args) {
        cadastrarFilmes();
        cadastrarLivros();
        cadastrarJogos();
        cadastrarClientes();

        
        //exibirClientes();
        //System.out.print(buscarCliente(5));
        //exibirJogos();

        /* for (Aluguel aluguel : alugueis) {
            if (aluguel != null) {
                System.out.println(aluguel.getCliente());
                System.out.println(aluguel.getMidia());
            }
            System.out.println("=========================");
        } */
    }

    static void exibirMenu() {
        int op = 0;

        while (op != 9) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Alugar Midia");
            System.out.println("2 - Devolver Midia");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Verificar Debito do Cliente");
            System.out.println("5 - Cadastrar Cliente");
            System.out.println("6 - Cadastrar Midia");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            op = entrada.nextInt();

            switch (op) {
                case 1 -> {
                    alugarMidia();
                }
            }
        }
    }

    static void alugarMidia() {
        System.out.println("Escolha um cliente:");
        exibirClientes();
        System.out.print(">>> ");
        Cliente cliente = buscarCliente(entrada.nextInt());
        
        if (cliente == null) {
            throw new IllegalArgumentException("Código inválido!");
        }

        System.out.println("Qual mídia voce gostaria de alugar?");
        System.out.println("1 - Filme");
        System.out.println("2 - Livro");
        System.out.println("3 - Jogo");
        System.out.print(">>> ");
        Midia midia = null;

        switch (entrada.nextInt()) {
            case 1 -> {
                midia = alugarFilme();
            }
            case 2 -> {
                System.out.println("Escolha um livro:");
                exibirLivros();
                System.out.print(">>> ");
            }
            case 3 -> {
                System.out.println("Escolha um jogo:");
                exibirJogos();
                System.out.print(">>> ");
            }
            default -> {
                throw new IllegalArgumentException("Código inválido!");
            }
        }

        alugueis[quantidadeAluguel] = new Aluguel(cliente, midia);

        System.out.print("Deseja realizar o pagamento agora? [S/N] ");
        if (entrada.next().toUpperCase().charAt(0) == 'S') {
            alugueis[quantidadeAluguel].pagarMidia();
        }

        quantidadeAluguel++;
    }

    static Filme alugarFilme() {
        System.out.println("Escolha um filme:");
        exibirFilmes();
        System.out.print(">>> ");
        Filme filme = (Filme) buscarMidia(entrada.nextInt());
        
        if (filme == null) {
            throw new IllegalArgumentException("Código inválido!");
        }

        return filme;
    }

    static void cadastrarFilmes() {
        Arquivo arquivo = new Arquivo();
        String[][] filmes = arquivo.lerArquivo("filmes.txt", 10, 7);

        for (String[] filme : filmes) {
            midias[quantidadeMidias] = new Filme(
                Integer.parseInt(filme[0]), 
                filme[1], 
                filme[2], 
                filme[3], 
                Double.parseDouble(filme[4]), 
                filme[5],
                Integer.parseInt(filme[6])
            );
            quantidadeMidias++;
        }
    }

    static void cadastrarLivros() {
        Arquivo arquivo = new Arquivo();
        String[][] livros = arquivo.lerArquivo("livros.txt", 10, 8);

        for (String[] livro : livros) {
            midias[quantidadeMidias] = new Livro(
                Integer.parseInt(livro[0]), 
                livro[1], 
                livro[2], 
                livro[3], 
                Double.parseDouble(livro[4]), 
                livro[5],
                livro[6],
                Integer.parseInt(livro[7])
            );
            quantidadeMidias++;
        }
    }

    static void cadastrarJogos() {
        Arquivo arquivo = new Arquivo();
        String[][] jogos = arquivo.lerArquivo("jogos.txt", 10, 6);

        for (String[] jogo : jogos) {
            midias[quantidadeMidias] = new Jogo(
                Integer.parseInt(jogo[0]), 
                jogo[1], 
                jogo[2], 
                jogo[3], 
                Double.parseDouble(jogo[4]), 
                jogo[5]
            );
            quantidadeMidias++;
        }
    }

    static void cadastrarClientes() {
        Arquivo arquivo = new Arquivo();
        String[][] clientesArray = arquivo.lerArquivo("clientes.txt", 5, 3);

        for (String[] cliente : clientesArray) {
            clientes[quantidadeClientes] = new Cliente(
                Integer.parseInt(cliente[0]),
                cliente[1],
                Integer.parseInt(cliente[2])
            );
            quantidadeClientes++;
        }
    }

    static void exibirClientes() {
        for (int i = 0; i < quantidadeClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    static void exibirFilmes() {
        for (int i = 0; i < quantidadeMidias; i++) {
            if (midias[i] instanceof Filme) {
                System.out.println(midias[i]);
            }
        }
    }

    static void exibirLivros() {
        for (int i = 0; i < quantidadeMidias; i++) {
            if (midias[i] instanceof Livro) {
                System.out.println(midias[i]);
            }
        }
    }

    static void exibirJogos() {
        for (int i = 0; i < quantidadeMidias; i++) {
            if (midias[i] instanceof Jogo) {
                System.out.println(midias[i]);
            }
        }
    }

    static Cliente buscarCliente(int codigo) {
        Cliente cliente = null;

        for (int i = 0; i < quantidadeClientes; i++) {
            if (clientes[i].getCodigo() == codigo) {
                cliente = clientes[i];
            }
        }

        return cliente;
    }

    static Midia buscarMidia(int codigo) {
        Midia midia = null;

        for (int i = 0; i < quantidadeMidias; i++) {
            if (midias[i].getCodigo() == codigo) {
                midia = midias[i];
            }
        }

        return midia;
    }
}
