import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Midia[] midias = new Midia[30];
        System.arraycopy(cadastrarFilmes(), 0, midias, 0, 10);
        System.arraycopy(cadastrarLivros(), 0, midias, 10, 10);
        System.arraycopy(cadastrarJogos(), 0, midias, 20, 10);

        /* for (int i = 0; i < midias.length; i++) {
            System.out.println(midias[i].getTitulo());
        } */

        exibirMenu();
    }

    public static void exibirMenu() {
        JOptionPane.showInputDialog(
            "Escolha uma opção:\n"
            + "1 - Alugar filme\n"
            + "2 - Alugar Livro\n"
            + "3 - Alugar Jogo\n"
        );
    }

    public static Filme[] cadastrarFilmes() {
        Filme[] filmes = new Filme[10];
        filmes[0] = new Filme(1, "Homem de Ferro", "DVD", "Acao", 4.0, "Maiores de 12 anos", 160);
        filmes[1] = new Filme(2, "Corra que a policia vem ai", "DVD", "Comedia", 3.0, "Maiores de 14 anos", 100);
        filmes[2] = new Filme(3, "Os outros", "DVD", "Suspense", 3.0, "Maiores de 14 anos", 90);
        filmes[3] = new Filme(4, "Jurassic Park", "Blu-ray", "Aventura", 4.0, "Maiores de 12 anos", 120);
        filmes[4] = new Filme(5, "Vingadores", "Blu-ray", "Acao", 5.0, "Maiores de 12 anos", 160);
        filmes[5] = new Filme(6, "Invocacao do mal", "DVD", "Terror", 3.0, "Maiores de 16 anos", 100);
        filmes[6] = new Filme(7, "A culpa eh das estrelas", "DVD", "Romance", 3.0, "Livre", 90);
        filmes[7] = new Filme(8, "Guardiao das Galaxias", "Blu-ray", "Acao", 4.0, "Maiores de 12 anos", 120);
        filmes[8] = new Filme(9, "Senhor dos Aneis", "Blu-ray", "Aventura", 4.0, "Maiores de 12 anos", 160);
        filmes[9] = new Filme(10, "Matrix", "DVD", "Acao", 3.0, "Maiores de 12 anos", 120);
        return filmes;
    }

    public static Livro[] cadastrarLivros() {
        Livro[] livros = new Livro[10];
        livros[0] = new Livro(1, "Harry Potter", "Brochura", "Aventura", 10.0, "J. K. Rowling", "Alguma editora", 3);
        livros[1] = new Livro(2, "O Senhor dos Aneis", "Brochura", "Aventura", 10.0, "J. R. R. Tolkien", "Outra editora", 7);
        livros[2] = new Livro(3, "As Cronicas de Narnia", "Comum", "Fantasia", 5.0, "C. S. Lewis", "Uma editora", 2);
        livros[3] = new Livro(4, "Crepusculo", "Comum", "Romance", 8.0, "Stephenie Meyer", "Editora Vampiros", 4);
        livros[4] = new Livro(5, "Alice no Pais das Maravilhas", "Comum", "Infantil", 4.0, "Charles", "Editora Classic", 11);
        livros[5] = new Livro(6, "O Pequeno Principe", "Brochura", "Aventura", 5.0, "Antoine", "Amazon", 12);
        livros[6] = new Livro(7, "Meu pe de laranja lima", "Comum", "Romance", 4.0, "Jose Mauro", "Editora brasileira", 4);
        livros[7] = new Livro(8, "Branca de Neve", "Brochura", "Infantil", 4.0, "Wihelm Grimm", "Alguma editora", 4);
        livros[8] = new Livro(9, "Chapelzinho vermelho", "Brochura", "Infantil", 7.0, "Charles Perrault", "Alguma editora", 5);
        livros[9] = new Livro(10, "O Gato de Botas", "Comum", "Aventura", 7.0, "Charles Perrault", "Mail uma editora", 7);
        return livros;
    }

    public static Jogo[] cadastrarJogos() {
        Jogo[] jogos = new Jogo[10];
        jogos[0] = new Jogo(1, "God of War", "DVD", "Aventura", 4.0, "PlayStation 3");
        jogos[1] = new Jogo(2, "Tomb Raider", "CD", "Aventura", 1.0, "PlayStation 1");
        jogos[2] = new Jogo(3, "Super Mario World", "Digital", "Aventura", 1.0, "Super Nintendo");
        jogos[3] = new Jogo(4, "GTA 5", "Blu-Ray", "Acao", 6.0, "PlayStation 4");
        jogos[4] = new Jogo(5, "Sonic", "Cartucho", "Aventura", 1.0, "Mega Drive");
        jogos[5] = new Jogo(6, "Fortnite", "Digital", "FPS", 2.0, "X box One");
        jogos[6] = new Jogo(7, "Pokemon Red", "Cartucho", "RPG", 2.0, "Game Boy Advance");
        jogos[7] = new Jogo(8, "Mario Kart", "Digital", "Corrida", 4.0, "Nintendo Wii");
        jogos[8] = new Jogo(9, "Futebol", "Blu-ray", "Esporte", 5.0, "PlayStation 5");
        jogos[9] = new Jogo(10, "Zelda", "Digital", "RPG", 5.0, "Nintendo Swift");
        return jogos;
    }
}
