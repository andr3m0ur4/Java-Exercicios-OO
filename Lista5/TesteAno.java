import java.util.Scanner;

public class TesteAno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ano ano = new Ano();

        System.out.print("Digite o ano: ");
        ano.setAno(entrada.nextInt());
        entrada.close();

        if (ano.ehBissexto()) {
            System.out.println("É ano bissexto!");
        } else {
            System.out.println("Não é ano bissexto!");
        }
    }
}
