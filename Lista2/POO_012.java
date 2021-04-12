import java.util.Scanner;

public class POO_012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char resposta = 's';

        while (resposta != 'n') {
            System.out.print("Jogar o dado [s/n]: ");
            resposta = entrada.next().toLowerCase().charAt(0);

            if (resposta != 'n') {
                System.out.println("Saiu: " + dado());
            }
        }
        entrada.close();
    }

    public static int dado() {
        return (int) (Math.random() * 6) + 1;
    }
}
