import java.util.Scanner;

public class RH {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;

        while (op != 9) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar candidatos");
            System.out.println("2 - Cadastrar vagas");
            System.out.println("3 - Cadastrar candidato para a vaga");
            System.out.println("4 - Listar vagas por tipo");
            System.out.println("5 - Mostrar quantidade de candidatos");
            System.out.println("6 - Mostrar candidatos x vagas");
            System.out.println("9 - Sair do programa");
            op = entrada.nextInt();

            switch (op) {
                case 1 -> {
                    
                }
            }
        }
    }
}
