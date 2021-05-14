import java.util.Scanner;

public class Floresta {
    public static Scanner entrada = new Scanner(System.in);
    public static Scanner texto = new Scanner(System.in);
    private static Planta[] plantas = new Planta[5];
    private static int quantidade;

    public static void inserir(Planta planta) {
        aumentarTamanho();
        plantas[quantidade] = planta;
        quantidade++;
    }

    public static String mostrarPlanta(int posicao) {
        String planta = "Nome: " + plantas[posicao].getNome();
        planta += "\nEspecie: " + plantas[posicao].getEspecie();

        if (plantas[posicao] instanceof Arvore) {
            if (((Arvore) plantas[posicao]).isFrutifera()) {
                planta += "\nArvore eh frutifera";
            } else {
                planta += "\nArvore nao eh frutifera";
            }
        }

        if (plantas[posicao] instanceof Flor) {
            planta += "\nCor: " + ((Flor) plantas[posicao]).getCor();
        }

        if (plantas[posicao] instanceof Carnivora) {
            if (((Carnivora) plantas[posicao]).isVenenosa()) {
                planta += "\nCarnivora eh venenosa";
            } else {
                planta += "\nCarnivora nao eh venenosa";
            }
        }

        return planta;
    }

    private static void aumentarTamanho() {
        if (quantidade == plantas.length) {
            Planta[] novasPlantas = new Planta[plantas.length + 5];

            for (int i = 0; i < quantidade; i++) {
                novasPlantas[i] = plantas[i];
            }

            plantas = novasPlantas;
        }
    }

    public static void main(String[] args) {
        int op = 0;

        while (op != 9) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Cadastrar planta");
            System.out.println("2 - Listar plantas");
            System.out.println("3 - Mostrar quantidade de plantas na floresta");
            System.out.println("4 - Mostrar quantidade de arvores");
            System.out.println("5 - Mostrar quantidade de flores");
            System.out.println("6 - Mostrar quantidade de carnivoras");
            System.out.println("9 - Finalizar programa");
            System.out.print(">> ");
            op = entrada.nextInt();

            switch (op) {
                case 1 -> {
                    cadastrarPlantas();
                }
                case 2 -> {
                    listarPlantas();
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
                }
                default -> {
                    System.out.println("Opcao invalida!\n");
                }
            }
        }
    }

    public static void cadastrarPlantas() {
        System.out.println("Qual planta voce gostaria de cadastrar?");
        System.out.println("1 - Arvore");
        System.out.println("2 - Flor");
        System.out.println("3 - Carnivora");
        System.out.print(">> ");
        int tipo = entrada.nextInt();

        switch (tipo) {
            case 1 -> {
                System.out.print("Digite o nome da arvore: ");
                String nome = texto.nextLine();
                System.out.print("A arvore eh frutifera? [S/N] ");
                boolean frutifera = entrada.next().toLowerCase().charAt(0) == 's';
                inserir(new Arvore(nome, frutifera));
            }
            case 2 -> {
                System.out.print("Digite o nome da flor: ");
                String nome = texto.nextLine();
                System.out.print("Digite a cor da flor: ");
                String cor = texto.nextLine();
                inserir(new Flor(nome, cor));
            }
            case 3 -> {
                System.out.print("Digite o nome da carnivora: ");
                String nome = texto.nextLine();
                System.out.print("A carnivora eh venenosa? [S/N] ");
                boolean venenosa = entrada.next().toLowerCase().charAt(0) == 's';
                inserir(new Carnivora(nome, venenosa));
            }
            default -> {
                System.out.println("Opcao invalida!");
            }
        }
        System.out.println();
    }

    public static void listarPlantas() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("======================================================");
            System.out.println(mostrarPlanta(i));
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
