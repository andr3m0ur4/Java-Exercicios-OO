import java.util.Scanner;

public class Floresta {
    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);
    static Planta[] plantas = new Planta[10];
    static int quantidade;

    public static void main(String[] args) {
        boolean op = true;

        while (op) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Cadastrar planta");
            System.out.println("2 - Listar plantas");
            System.out.println("3 - Mostrar quantidade de plantas na floresta");
            System.out.println("4 - Mostrar quantidade de arvores");
            System.out.println("5 - Mostrar quantidade de flores");
            System.out.println("6 - Mostrar quantidade de carnivoras");
            System.out.println("9 - Finalizar programa");
            int menu = entrada.nextInt();

            switch (menu) {
                case 1 -> {
                    cadastrarPLantas();
                }
                case 2 -> {
                    listarPLantas();
                }
                case 3 -> {
                    mostrarQuantidadeDePlantas();
                }
                case 4 -> {
                    mostrarQuantidadeDeArvores();
                }
                case 5 -> {
                    mostrarQuantidadeDeFlores();
                }
                case 6 -> {
                    mostrarQuantidadeDeCarnivoras();
                }
                case 9 -> {
                    System.out.println("Ate breve!");
                    op = false;
                }
                default -> {
                    System.out.println("Opcao invalida!\n");
                }
            }
        }
    }

    public static void cadastrarPLantas() {
        System.out.println("Qual planta voce gostaria de cadastrar?");
        System.out.println("1 - Arvore");
        System.out.println("2 - Flor");
        System.out.println("3 - Carnivora");
        int tipo = entrada.nextInt();

        switch (tipo) {
            case 1 -> {
                System.out.print("Digite o nome da arvore: ");
                String nome = texto.nextLine();
                System.out.print("A arvore eh frutifera? S/N ");
                boolean frutifera = entrada.next().toLowerCase().charAt(0) == 's';
                plantas[quantidade] = new Arvore(nome, frutifera);
                quantidade++;
            }
            case 2 -> {
                System.out.print("Digite o nome da flor: ");
                String nome = texto.nextLine();
                System.out.print("Digite a cor da flor: ");
                String cor = texto.nextLine();
                plantas[quantidade] = new Flor(nome, cor);
                quantidade++;
            }
            case 3 -> {
                System.out.print("Digite o nome da carnivora: ");
                String nome = texto.nextLine();
                System.out.print("A carnivora eh venenosa? S/N ");
                boolean venenosa = entrada.next().toLowerCase().charAt(0) == 's';
                plantas[quantidade] = new Carnivora(nome, venenosa);
                quantidade++;
            }
            default -> {
                System.out.println("Opcao invalida!");
            }
        }
        System.out.println();
    }

    public static void listarPLantas() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("======================================================");
            System.out.println("Nome: " + plantas[i].getNome());
            System.out.println("Especie: " + plantas[i].getEspecie());

            if (plantas[i] instanceof Arvore) {
                Arvore arvore = (Arvore) plantas[i];
                if (arvore.isFrutifera()) {
                    System.out.println("Arvore eh frutifera");
                } else {
                    System.out.println("Arvore nao eh frutifera");
                }
            }

            if (plantas[i] instanceof Flor) {
                Flor flor = (Flor) plantas[i];
                System.out.println("Cor: " + flor.getCor());
            }

            if (plantas[i] instanceof Carnivora) {
                Carnivora carnivora = (Carnivora) plantas[i];
                if (carnivora.isVenenosa()) {
                    System.out.println("Carnivora eh venenosa");
                } else {
                    System.out.println("Carnivora nao eh venenosa");
                }
            }
        }
        System.out.println("======================================================\n");
    }

    public static void mostrarQuantidadeDePlantas() {
        System.out.println("Quantidade de plantas na floresta: " + quantidade);
        System.out.println();
    }

    public static void mostrarQuantidadeDeArvores() {
        int arvores = 0;

        for (int i = 0; i < quantidade; i++) {
            if (plantas[i] instanceof Arvore) arvores++;
        }

        System.out.println("Quantidade de arvores: " + arvores);
        System.out.println();
    }

    public static void mostrarQuantidadeDeFlores() {
        int flores = 0;

        for (int i = 0; i < quantidade; i++) {
            if (plantas[i] instanceof Flor) flores++;
        }

        System.out.println("Quantidade de flores: " + flores);
        System.out.println();
    }

    public static void mostrarQuantidadeDeCarnivoras() {
        int carnivoras = 0;

        for (int i = 0; i < quantidade; i++) {
            if (plantas[i] instanceof Carnivora) carnivoras++;
        }

        System.out.println("Quantidade de carnivoras: " + carnivoras);
        System.out.println();
    }
}
