import java.util.Scanner;

public class RH {
    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);
    static Candidato[] candidatos = new Candidato[10];
    static Vaga[] vagas = new Vaga[10];
    static int quantidadeCandidatos;
    static int quantidadeVagas;

    public static void inserir(Candidato candidato) {
        aumentarTamanho();
        candidatos[quantidadeCandidatos] = candidato;
        quantidadeCandidatos++;
    }

    public static void inserir(Vaga vaga) {
        aumentarTamanho();
        vagas[quantidadeVagas] = vaga;
        quantidadeVagas++;
    }

    public static Candidato getCandidato(int posicao) {
        if (posicao >= quantidadeCandidatos) {
            throw new IllegalArgumentException("Candidato nao existe!");
        }

        return candidatos[posicao];
    }

    public static Vaga getVaga(int posicao) {
        if (posicao >= quantidadeVagas) {
            throw new IllegalArgumentException("Vaga nao existe!");
        }

        return vagas[posicao];
    }

    private static void aumentarTamanho() {
        if (quantidadeCandidatos == candidatos.length) {
            Candidato[] novosCandidatos = new Candidato[candidatos.length + 5];

            for (int i = 0; i < quantidadeCandidatos; i++) {
                novosCandidatos[i] = candidatos[i];
            }

            candidatos = novosCandidatos;
        }

        if (quantidadeVagas == vagas.length) {
            Vaga[] novasVagas = new Vaga[vagas.length + 5];

            for (int i = 0; i < quantidadeVagas; i++) {
                novasVagas[i] = vagas[i];
            }

            vagas = novasVagas;
        }
    }

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
                    cadastrarCandidato();
                }
                case 2 -> {
                    cadastrarVaga();
                }
                case 3 -> {
                    if (cadastrarCandidadoXVaga()) {
                        System.out.println("Cadastrado com sucesso!\n");
                    } else {
                        System.out.println("Codigo invalido!\n");
                    }
                }
                case 4 -> {
                    listarVagasPorTipo();
                }
                case 5 -> {
                    mostrarQuantidadeDeCandidatos();
                }
                case 6 -> {
                    mostrarCandidatosXVaga();
                }
                case 9 -> {
                    System.out.println("Saindo...");
                }
                default -> {
                    System.out.println("Codigo invalido!\n");
                }
            }
        }
    }

    public static void cadastrarCandidato() {
        System.out.print("Digite o nome do candidato: ");
        String nome = texto.nextLine();
        System.out.print("Digite a idade do candidato: ");
        int idade = entrada.nextInt();
        System.out.println("Qual a situacao do candidato?");
        System.out.println("1 - desempregado");
        System.out.println("2 - empregado");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Informe o tempo em meses que o candidato esta desempregado: ");
                int tempo = entrada.nextInt();
                inserir(new Desempregado(nome, idade, tempo));
            }
            case 2 -> {
                System.out.print("Informe o nome da empresa onde o candidato esta atualmente: ");
                String empresa = texto.nextLine();
                inserir(new Empregado(nome, idade, empresa));
            }
            default -> {
                System.out.println("Opcao invalida!");
            }
        }
        System.out.println();
    }

    public static void cadastrarVaga() {
        System.out.print("Digite a descricao da vaga: ");
        String descricao = texto.nextLine();
        System.out.print("Digite o salario oferecido: R$ ");
        double salario = entrada.nextDouble();
        System.out.println("Qual o tipo da vaga?");
        System.out.println("1 - estagio");
        System.out.println("2 - contrato");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Informe o tempo em meses da vaga: ");
                int tempo = entrada.nextInt();
                inserir(new Estagio(descricao, salario, tempo));
            }
            case 2 -> {
                System.out.print("A vaga eh temporaria? (S/N) ");
                boolean temporario = entrada.next().toLowerCase().charAt(0) == 's';
                inserir(new Contrato(descricao, salario, temporario));
            }
            default -> {
                System.out.println("Opcao invalida!");
            }
        }
        System.out.println();
    }

    public static boolean cadastrarCandidadoXVaga() {
        System.out.println("Escolha o candidado:");
        for (int i = 0; i < quantidadeCandidatos; i++) {
            System.out.printf("Codigo: %d - Nome: %s\n", i + 1, candidatos[i].getNome());
        }
        System.out.print("Informe o codigo: ");
        int candidato = entrada.nextInt() - 1;
        if (candidatos[candidato] == null) return false;

        System.out.println("Escolha a vaga:");
        for (int i = 0; i < quantidadeVagas; i++) {
            System.out.printf("Codigo: %d - Descricao: %s - Salario: R$ %.2f\n",
                i + 1, vagas[i].getDescricao(), vagas[i].getSalario());
        }
        System.out.print("Informe o codigo: ");
        int vaga = entrada.nextInt() - 1;
        if (vagas[vaga] == null) return false;

        vagas[vaga].cadastrarCandidato(candidatos[candidato]);

        return true;
    }

    public static void listarVagasPorTipo() {
        System.out.println("Vagas de estagio:");
        for (int i = 0; i < quantidadeVagas; i++) {
            if (vagas[i] instanceof Estagio) {
                System.out.println("Descricao: " + vagas[i].getDescricao());
                System.out.println("Salario: R$ " + vagas[i].getSalario());
                System.out.println("Tempo em meses: " + ((Estagio) vagas[i]).getTempoEmMeses());
                System.out.println("=====================================================");
            }
        }

        System.out.println("Vagas de contrato:");
        for (int i = 0; i < quantidadeVagas; i++) {
            if (vagas[i] instanceof Contrato) {
                System.out.println("Descricao: " + vagas[i].getDescricao());
                System.out.println("Salario: R$ " + vagas[i].getSalario());
                if (((Contrato) vagas[i]).isTemporario()) {
                    System.out.println("Vaga eh temporaria");
                } else {
                    System.out.println("Vaga nao eh temporaria");
                }
                System.out.println("=====================================================");
            }
        }
        System.out.println();
    }

    public static void mostrarQuantidadeDeCandidatos() {
        int desempregados = 0;
        int empregados = 0;

        for (int i = 0; i < quantidadeCandidatos; i++) {
            if (candidatos[i] instanceof Desempregado) desempregados++;
            if (candidatos[i] instanceof Empregado) empregados++;
        }

        System.out.println("Quantidade de candidatos: " + quantidadeCandidatos);
        System.out.println("Quantidade de desempregados: " + desempregados);
        System.out.println("Quantidade de empregados: " + empregados);
        System.out.println();
    }

    public static void mostrarCandidatosXVaga() {
        System.out.println("=====================================================");

        for (int i = 0; i < quantidadeVagas; i++) {
            System.out.println("Vaga: " + vagas[i].getDescricao());

            for (int j = 0; j < vagas[i].getCandidatos().length; j++) {
                if (vagas[i].getCandidatos()[j] != null) {
                    Candidato[] candidatosVaga = vagas[i].getCandidatos();
                    System.out.println("Nome: " + candidatosVaga[j].getNome());
                    System.out.println("Idade: " + candidatosVaga[j].getIdade());

                    if (candidatosVaga[j] instanceof Desempregado) {
                        System.out.println("Tempo em meses sem trabalho: "
                            + ((Desempregado) candidatosVaga[j]).getMesesSemTrabalhar());
                    }
                    if (candidatosVaga[j] instanceof Empregado) {
                        System.out.println("Nome da empresa onde esta trabalhando atualmente: "
                            + ((Empregado) candidatosVaga[j]).getNomeEmpresa());
                    }

                    System.out.println("=====================================================");
                }
            }
        }
        System.out.println();
    }
}
