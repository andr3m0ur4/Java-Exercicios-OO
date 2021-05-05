import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Midia[] midias = new Midia[30];
        midias = cadastrarFilmes(midias);
        midias = cadastrarLivros(midias);
        midias = cadastrarJogos(midias);

        Cliente[] clientes = cadastrarClientes();

        exibirMenu(midias, clientes);
    }

    public static void exibirMenu(Midia[] midias, Cliente[] clientes) {
        Cliente cliente = definirCliente(clientes);
        Aluguel aluguel = new Aluguel(cliente);

        if (cliente != null) {
            int menu = 0;

            while (menu != 9) {
                menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma Opcao:\n" +
                    "1 - Alugar Midia\n" +
                    "2 - Devolver Midia\n" +
                    "3 - Verificar valor de pagamento\n" +
                    "9 - Sair"
                ));

                switch (menu) {
                    case 1 -> {
                        alugarMidia(aluguel, midias);
                    }
                    case 2 -> {
                        devolverMidia(aluguel, midias);
                    }
                    case 3 -> {
                        exibirValorDePagamento(aluguel);
                    }
                    case 9 -> {}
                    default -> {
                        JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    }
                }
            }
        }
    }

    public static Cliente definirCliente(Cliente[] clientes) {
        int op = 1;

        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                exibirClientes(clientes) +
                " Cod: 0 - Sair\n\n" +
                "Escolha o codigo do usuario"
            ));

            if (op == 0) break;

            if (clientes[op - 1] == null) {
                JOptionPane.showMessageDialog(null, "Codigo invalido");
                continue;
            }
            return clientes[op - 1];
        }
        return null;
    }

    public static void alugarMidia(Aluguel aluguel, Midia[] midias) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha uma opcao:\n" +
            "1 - Alugar Filme\n" +
            "2 - Alugar Livro\n" +
            "3 - Alugar Jogo"
        ));

        switch (menu) {
            case 1 -> {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                    exibirFilmes(midias) + "\nEscolha um codigo:"
                ));

                if (midias[codigo - 1] != null) {
                    aluguel.alugarMidia(midias[codigo - 1]);
                }
            }

            case 2 -> {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                    exibirLivros(midias) + "\nEscolha um codigo:"
                ));

                if (midias[codigo - 1] != null) {
                    aluguel.alugarMidia(midias[codigo - 1]);
                }
            }

            case 3 -> {
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(
                    exibirJogos(midias) + "\nEscolha um codigo:"
                ));

                if (midias[codigo - 1] != null) {
                    aluguel.alugarMidia(midias[codigo - 1]);
                }
            }
        }
    }

    public static void devolverMidia(Aluguel aluguel, Midia[] midias) {
        int codigo = Integer.parseInt(
            JOptionPane.showInputDialog(aluguel.mostrarMidiasAlugadas() + "\nDigite um codigo")
        );

        aluguel.devolverMidia(codigo);
    }

    public static void exibirValorDePagamento(Aluguel aluguel) {
        JOptionPane.showMessageDialog(null, aluguel.mostrarMidiasAlugadas());
        JOptionPane.showMessageDialog(
            null, "Cliente: " + aluguel.getNomeCliente() +
            "\nValor Total: R$ " + aluguel.exibirValorTotal()
        );
    }

    public static String exibirFilmes(Midia[] midias) {
        String mensagem = "";
        for (int i = 0; i < 10; i++) {
            Filme filme = ((Filme) midias[i]);
            mensagem += filme.getCodigo() + ": " + filme.getTitulo() + " - "
                + filme.getTipo() + " - " + filme.getGenero() + " - "
                + "R$ " + filme.getValor() + " - " + filme.getClassificacao() + " - "
                + filme.getDuracao() + " minutos\n\n";
        }

        return mensagem;
    }

    public static String exibirLivros(Midia[] midias) {
        String mensagem = "";
        for (int i = 10; i < 20; i++) {
            Livro livro = ((Livro) midias[i]);
            mensagem += livro.getCodigo() + ": " + livro.getTitulo() + " - "
                + livro.getTipo() + " - " + livro.getGenero() + " - "
                + "R$ " + livro.getValor() + " - " + livro.getAutor() + " - "
                + livro.getEditora() + " - " + livro.getEdicao() + " edicao\n\n";
        }

        return mensagem;
    }

    public static String exibirJogos(Midia[] midias) {
        String mensagem = "";
        for (int i = 20; i < 30; i++) {
            Jogo jogo = ((Jogo) midias[i]);
            mensagem += jogo.getCodigo() + ": " + jogo.getTitulo() + " - "
                + jogo.getTipo() + " - " + jogo.getGenero() + " - "
                + "R$ " + jogo.getValor() + " - " + jogo.getConsole() + " edicao\n\n";
        }

        return mensagem;
    }

    public static String exibirClientes(Cliente[] clientes) {
        String mensagem = "";
        for (int i = 0; i < 5; i++) {
            mensagem += "Cod: " + clientes[i].getCodigo() + " - " +
                clientes[i].getNome() + " - " + clientes[i].getIdade() + " anos\n\n";
        }
        return mensagem;
    }

    public static Midia[] cadastrarFilmes(Midia[] midias) {
        String[][] filmesArray = {
            { "1", "Homem de Ferro", "DVD", "Acao", "4.0", "Maiores de 12 anos", "160" },
            { "2", "Corra que a policia vem ai", "DVD", "Comedia", "3.0", "Maiores de 14 anos", "100" },
            { "3", "Os outros", "DVD", "Suspense", "3.0", "Maiores de 14 anos", "90" },
            { "4", "Jurassic Park", "Blu-ray", "Aventura", "4.0", "Maiores de 12 anos", "120" },
            { "5", "Vingadores", "Blu-ray", "Acao", "5.0", "Maiores de 12 anos", "160" },
            { "6", "Invocacao do mal", "DVD", "Terror", "3.0", "Maiores de 16 anos", "100" },
            { "7", "A culpa eh das estrelas", "DVD", "Romance", "3.0", "Livre", "90" },
            { "8", "Guardiao das Galaxias", "Blu-ray", "Acao", "4.0", "Maiores de 12 anos", "120" },
            { "9", "Senhor dos Aneis", "Blu-ray", "Aventura", "4.0", "Maiores de 12 anos", "160" },
            { "10", "Matrix", "DVD", "Acao", "3.0", "Maiores de 12 anos", "120" }
        };

        Filme[] filmes = new Filme[10];
        for (int i = 0; i < 10; i++) {
            filmes[i] = new Filme();
            filmes[i].setCodigo(Integer.parseInt(filmesArray[i][0]));
            filmes[i].setTitulo(filmesArray[i][1]);
            filmes[i].setTipo(filmesArray[i][2]);
            filmes[i].setGenero(filmesArray[i][3]);
            filmes[i].setValor(Double.parseDouble(filmesArray[i][4]));
            filmes[i].setClassificacao(filmesArray[i][5]);
            filmes[i].setDuracao(Integer.parseInt(filmesArray[i][6]));
            midias[i] = filmes[i];
        }

        return midias;
    }

    public static Midia[] cadastrarLivros(Midia[] midias) {
        String[][] livrosArray = {
            { "11", "Harry Potter", "Brochura", "Aventura", "10.0", "J. K. Rowling", "Alguma editora", "3"} ,
            { "12", "O Senhor dos Aneis", "Brochura", "Aventura", "10.0", "J. R. R. Tolkien", "Outra editora", "7"} ,
            { "13", "As Cronicas de Narnia", "Comum", "Fantasia", "5.0", "C. S. Lewis", "Uma editora", "2"} ,
            { "14", "Crepusculo", "Comum", "Romance", "8.0", "Stephenie Meyer", "Editora Vampiros", "4"} ,
            { "15", "Alice no Pais das Maravilhas", "Comum", "Infantil", "4.0", "Charles", "Editora Classic", "11"} ,
            { "16", "O Pequeno Principe", "Brochura", "Aventura", "5.0", "Antoine", "Amazon", "12"} ,
            { "17", "Meu pe de laranja lima", "Comum", "Romance", "4.0", "Jose Mauro", "Editora brasileira", "4"} ,
            { "18", "Branca de Neve", "Brochura", "Infantil", "4.0", "Wihelm Grimm", "Alguma editora", "4"} ,
            { "19", "Chapelzinho vermelho", "Brochura", "Infantil", "7.0", "Charles Perrault", "Alguma editora", "5"} ,
            { "20", "O Gato de Botas", "Comum", "Aventura", "7.0", "Charles Perrault", "Mail uma editora", "7" }
        };

        Livro[] livros = new Livro[10];
        for (int i = 0; i < 10; i++) {
            livros[i] = new Livro();
            livros[i].setCodigo(Integer.parseInt(livrosArray[i][0]));
            livros[i].setTitulo(livrosArray[i][1]);
            livros[i].setTipo(livrosArray[i][2]);
            livros[i].setGenero(livrosArray[i][3]);
            livros[i].setValor(Double.parseDouble(livrosArray[i][4]));
            livros[i].setAutor(livrosArray[i][5]);
            livros[i].setEditora(livrosArray[i][6]);
            livros[i].setEdicao(Integer.parseInt(livrosArray[i][7]));
            midias[i + 10] = livros[i];
        }

        return midias;
    }

    public static Midia[] cadastrarJogos(Midia[] midias) {
        String[][] jogosArray = {
            { "21", "God of War", "DVD", "Aventura", "4.0", "PlayStation 3" },
            { "22", "Tomb Raider", "CD", "Aventura", "1.0", "PlayStation 1" },
            { "23", "Super Mario World", "Digital", "Aventura", "1.0", "Super Nintendo" },
            { "24", "GTA 5", "Blu-Ray", "Acao", "6.0", "PlayStation 4" },
            { "25", "Sonic", "Cartucho", "Aventura", "1.0", "Mega Drive" },
            { "26", "Fortnite", "Digital", "FPS", "2.0", "X box One" },
            { "27", "Pokemon Red", "Cartucho", "RPG", "2.0", "Game Boy Advance" },
            { "28", "Mario Kart", "Digital", "Corrida", "4.0", "Nintendo Wii" },
            { "29", "Futebol", "Blu-ray", "Esporte", "5.0", "PlayStation 5" },
            { "30", "Zelda", "Digital", "RPG", "5.0", "Nintendo Swift" }
        };

        Jogo[] jogos = new Jogo[10];
        for (int i = 0; i < 10; i++) {
            jogos[i] = new Jogo();
            jogos[i].setCodigo(Integer.parseInt(jogosArray[i][0]));
            jogos[i].setTitulo(jogosArray[i][1]);
            jogos[i].setTipo(jogosArray[i][2]);
            jogos[i].setGenero(jogosArray[i][3]);
            jogos[i].setValor(Double.parseDouble(jogosArray[i][4]));
            jogos[i].setConsole(jogosArray[i][5]);
            midias[i + 20] = jogos[i];
        }

        return midias;
    }

    public static Cliente[] cadastrarClientes() {
        String[][] clientesArray = {
            { "1", "Andre Moura", "30" },
            { "2", "Fulano", "99" },
            { "3", "Ciclano", "25" },
            { "4", "Beltrano", "21" },
            { "5", "Maria", "30" }
        };

        Cliente[] clientes = new Cliente[10];
        for (int i = 0; i < 5; i++) {
            clientes[i] = new Cliente();
            clientes[i].setCodigo(Integer.parseInt(clientesArray[i][0]));
            clientes[i].setNome(clientesArray[i][1]);
            clientes[i].setIdade(Integer.parseInt(clientesArray[i][2]));
        }

        return clientes;
    }
}
