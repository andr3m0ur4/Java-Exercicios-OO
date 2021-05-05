import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Passeio[] passeios = new Passeio[10];
        Carga[] cargas = new Carga[5];
        int quantidadePasseio = 0;
        int quantidadeCarga = 0;

        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        int opcao = 0;
    
        while (opcao != 4) {
            System.out.println("Menu Locadora");
            System.out.println("1 - Cadastrar Passeio [" + quantidadePasseio + "/10]");
            System.out.println("2 - Cadastrar Carga [" + quantidadePasseio + "/10]");
            System.out.println("4 - Listar todos os veículos");
            System.out.println("4 - Sair");
            System.out.print(">>> Opção? ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    passeios[quantidadePasseio] = new Passeio();
                    System.out.println("Caddastro de veículos do tipo passeio");
                    System.out.print("PLaca: ");
                    passeios[quantidadePasseio].setPlaca(texto.nextLine());
                    System.out.print("Marca: ");
                    passeios[quantidadePasseio].setMarca(texto.nextLine());
                    System.out.print("Modelo: ");
                    passeios[quantidadePasseio].setModelo(entrada.nextDouble());
                    System.out.print("Ano: ");
                    passeios[quantidadePasseio].setAno(entrada.nextInt());
                    System.out.print("Km nicial: ");
                    passeios[quantidadePasseio].setKmInicial(entrada.nextInt());
                    System.out.print("Km final: ");
                    passeios[quantidadePasseio].setKmFinal(entrada.nextInt());
                    System.out.print("Valor do Km: ");
                    passeios[quantidadePasseio].setValorKmRodado(entrada.nextDouble());
                    System.out.print("Tem ar condicionado [s/n]: ");
                    passeios[quantidadePasseio].setArCondicionado(texto.nextLine().equalsIgnoreCase("s"));
                    System.out.print("Quantidade de portas: ");
                    passeios[quantidadePasseio].setPortas(entrada.nextInt());

                    System.out.println("\n>>> " + passeios [ quantidadePasseio ] + "\n");

                    quantidadePasseio++;
                }
                case 2 -> {
                    cargas[quantidadeCarga] = new Carga();

                    System.out.println("Caddastro de veículos do tipo carga");
                    System.out.print("PLaca: ");
                    cargas[quantidadePasseio].setPlaca(texto.nextLine());
                    System.out.print("Marca: ");
                    cargas[quantidadePasseio].setMarca(texto.nextLine());
                    System.out.print("Modelo: ");
                    cargas[quantidadePasseio].setModelo(entrada.nextDouble());
                    System.out.print("Ano: ");
                    cargas[quantidadePasseio].setAno(entrada.nextInt());
                    System.out.print("Km nicial: ");
                    cargas[quantidadePasseio].setKmInicial(entrada.nextInt());
                    System.out.print("Km final: ");
                    cargas[quantidadePasseio].setKmFinal(entrada.nextInt());
                    System.out.print("Valor do Km: ");
                    cargas[quantidadePasseio].setValorKmRodado(entrada.nextDouble());
                    System.out.print("Capacidade: ");
                    cargas[quantidadePasseio].setCapacidade(entrada.nextInt());

                    System.out.println("\n>>> " + cargas [ quantidadePasseio ] + "\n");

                    quantidadePasseio++;
                }
                case 3 -> {
                    System.out.println("Listagem de todos os veículos");

                    for (int i = 0; i < quantidadePasseio; i++) {
                        System.err.println(passeios[i]);
                    }

                    for (int i = 0; i < quantidadeCarga; i++) {
                        System.err.println(cargas[i]);
                    }
                }
                default -> {

                }
            }
        }
        
    }
}
