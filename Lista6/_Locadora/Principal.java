import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    static void cadastrarFilmes() {
        Arquivo arquivo = new Arquivo();
        String[][] filmes = arquivo.lerArquivo("filmes.txt", 10, 7);

        for (String[] filme : filmes) {
            
        }
    }
}
