import java.util.Scanner;

public class Zoologico {
    static Jaula jaula = new Jaula(250);
    static Gaiola gaiola = new Gaiola(10);
    static Aquario aquario = new Aquario(50);
    static Lago lago = new Lago(200);
    static Viveiro viveiro = new Viveiro(15);

    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarVoadores();
        cadastrarTerrestres();
        cadastrarAquaticos();

        exibirMenu();
    }

    static void exibirMenu() {
        boolean op = true;

        while (op) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar voador");
            System.out.println("2 - Cadastrar terrestre");
            System.out.println("3 - Cadastrar aquático");
            System.out.println("4 - Listar animais");
            System.out.println("5 - Mostrar quantidade de animais no Zoológico");
            System.out.println("6 - Mostrar quantidade de voadores");
            System.out.println("7 - Mostrar quantidade de terrestres");
            System.out.println("8 - Mostrar quantidade de aquáticos");
            System.out.println("9 - Mostrar quantidade de animais por habitat");
            System.out.println("10 - Exibir área total que os animais ocupam");
            System.out.println("0 - Sair");
            System.out.print(">>> ");

            switch (entrada.nextInt()) {
                case 0 -> {
                    op = false;
                }
                case 1 -> {
                    cadastrarVoador();
                }
                case 2 -> {
                    cadastrarTerrestre();
                }
                case 3 -> {
                    cadastrarAquatico();
                }
                case 4 -> {
                    listarAnimais();
                }
                case 5 -> {
                    exibirQuatidadeDeAnimaisNoZoo();
                }
                case 6 -> {
                    exibirQuantidadeDeVoadores();
                }
                case 7 -> {
                    exibirQuantidadeDeTerrestres();
                }
                case 8 -> {
                    exibirQuantidadeDeAquaticos();
                }
                case 9 -> {
                    exbirQuantidadeDeAnimaisPorHabitat();
                }
                case 10 -> {
                    exibirAreaTotal();
                }
                default -> {
                    System.out.println("Código inválido!\n");
                }
            }
        }

        System.out.println("Até logo...\n");
    }

    static void cadastrarVoador() {
        Voador voador = new Voador();

        System.out.print("Digite o nome do voador: ");
        voador.setNome(texto.nextLine());

        System.out.print("Digite a espécie do voador: ");
        voador.setEspecie(texto.nextLine());

        System.out.print("Digite a cor da pena do voador: ");
        voador.setCorPena(texto.nextLine());

        escolherHabitat(voador);
    }

    static void cadastrarTerrestre() {
        Terrestre terrestre = new Terrestre();

        System.out.print("Digite o nome do terrestre: ");
        terrestre.setNome(texto.nextLine());

        System.out.print("Digite a espécie do terrestre: ");
        terrestre.setEspecie(texto.nextLine());

        System.out.print("Digite a quantidade de patas do terrestre: ");
        terrestre.setQuantidadePatas(entrada.nextInt());

        escolherHabitat(terrestre);
    }

    static void cadastrarAquatico() {
        Aquatico aquatico = new Aquatico();

        System.out.print("Digite o nome do aquático: ");
        aquatico.setNome(texto.nextLine());

        System.out.print("Digite a espécie do aquático: ");
        aquatico.setEspecie(texto.nextLine());

        System.out.print("Aquático pode respirar fora da água? [S/N] ");
        aquatico.setRespiraForaDaAgua(texto.next().toUpperCase().charAt(0) == 'S');

        escolherHabitat(aquatico);
    }

    static void escolherHabitat(Animal animal) {
        while (true) {
            System.out.println("Escolha um habitat:");
            System.out.println("1 - Jaula");
            System.out.println("2 - Gaiola");
            System.out.println("3 - Aquário");
            System.out.println("4 - Lago");
            System.out.println("5 - Viveiro");
            System.out.print(">>> ");

            switch (entrada.nextInt()) {
                case 1 -> {
                    jaula.cadastrarAnimal(animal);
                }
                case 2 -> {
                    gaiola.cadastrarAnimal(animal);
                }
                case 3 -> {
                    aquario.cadastrarAnimal(animal);
                }
                case 4 -> {
                    lago.cadastrarAnimal(animal);
                }
                case 5 -> {
                    viveiro.cadastrarAnimal(animal);
                }
                default -> {
                    System.out.println("Código inválido!\n");
                    continue;
                }
            }

            break;
        }
    }

    static void listarAnimais() {
        System.out.println("\tJaula");
        jaula.listarAnimais();

        System.out.println("\tGaiola");
        gaiola.listarAnimais();

        System.out.println("\tAquário");
        aquario.listarAnimais();

        System.out.println("\tLago");
        lago.listarAnimais();

        System.out.println("\tViveiro");
        viveiro.listarAnimais();
    }

    static void exibirQuatidadeDeAnimaisNoZoo() {
        int contador = 0;

        contador += jaula.quantidadeAnimais();
        contador += gaiola.quantidadeAnimais();
        contador += aquario.quantidadeAnimais();
        contador += lago.quantidadeAnimais();
        contador += viveiro.quantidadeAnimais();

        System.out.println("Quantidade de animais no zoológico: " + contador);
    }

    static void exibirQuantidadeDeVoadores() {
        int contador = 0;

        contador += jaula.quantidadeVoador();
        contador += gaiola.quantidadeVoador();
        contador += aquario.quantidadeVoador();
        contador += lago.quantidadeVoador();
        contador += viveiro.quantidadeVoador();

        System.out.println("Quantidade de voadores: " + contador);
    }

    static void exibirQuantidadeDeTerrestres() {
        int contador = 0;

        contador += jaula.quantidadeTerrestre();
        contador += gaiola.quantidadeTerrestre();
        contador += aquario.quantidadeTerrestre();
        contador += lago.quantidadeTerrestre();
        contador += viveiro.quantidadeTerrestre();

        System.out.println("Quantidade de terrestres: " + contador);
    }

    static void exibirQuantidadeDeAquaticos() {
        int contador = 0;

        contador += jaula.quantidadeAquatico();
        contador += gaiola.quantidadeAquatico();
        contador += aquario.quantidadeAquatico();
        contador += lago.quantidadeAquatico();
        contador += viveiro.quantidadeAquatico();

        System.out.println("Quantidade de aquáticos: " + contador);
    }

    static void exbirQuantidadeDeAnimaisPorHabitat() {
        System.out.println("Quantidade de animais na jaula: " + jaula.quantidadeAnimais());
        System.out.println("Quantidade de animais na gaiola: " + gaiola.quantidadeAnimais());
        System.out.println("Quantidade de animais no aquário: " + aquario.quantidadeAnimais());
        System.out.println("Quantidade de animais no lago: " + lago.quantidadeAnimais());
        System.out.println("Quantidade de animais no viveiro: " + viveiro.quantidadeAnimais());
    }

    static void exibirAreaTotal() {
        int contador = 0;

        contador += jaula.getArea();
        contador += gaiola.getArea();
        contador += aquario.getArea();
        contador += lago.getArea();
        contador += viveiro.getArea();

        System.out.println("Area total que os animais ocupam: " + contador + "m²");
    }

    static void cadastrarVoadores() {
        Arquivo arquivo = new Arquivo();

        for (String[] voador : arquivo.lerArquivo("voador.txt", 5, 3)) {
            Voador animal = new Voador(voador[0], voador[1], voador[2]);
            gaiola.cadastrarAnimal(animal);
        }
    }

    static void cadastrarTerrestres() {
        Arquivo arquivo = new Arquivo();

        for (String[] terrestre : arquivo.lerArquivo("terrestre.txt", 5, 3)) {
            Terrestre animal = new Terrestre(terrestre[0], terrestre[1], Integer.parseInt(terrestre[2]));
            jaula.cadastrarAnimal(animal);
        }
    }

    static void cadastrarAquaticos() {
        Arquivo arquivo = new Arquivo();

        for (String[] aquatico : arquivo.lerArquivo("aquatico.txt", 5, 3)) {
            Aquatico animal = new Aquatico(aquatico[0], aquatico[1], Boolean.parseBoolean(aquatico[2]));
            lago.cadastrarAnimal(animal);
        }
    }
}
