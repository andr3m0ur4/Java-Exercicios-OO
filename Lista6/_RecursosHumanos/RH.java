import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RH {
    static Scanner entrada = new Scanner(System.in);
    static Scanner texto = new Scanner(System.in);

    static int quantidadeCandidatos = 0, maxCandidatos = 100;
    static int quantidadeVagas = 0, maxVagas = 100;
    static int quantidadeCandidatosVagas = 0, maxCandidatosVagas = quantidadeCandidatos * quantidadeVagas;

    static Candidato[] candidatos = new Candidato[maxCandidatos];
    static Vaga[] vagas = new Vaga[maxVagas];
    static CandidatoVaga[] candidatosVagas = new CandidatoVaga[maxCandidatosVagas];

    public static void main(String[] args) {
        lerCandidatosDoArquivo();
        lerVagasDoArquivo();

        int opcao = 0;

        while (opcao != 9) {
            System.out.println("=== M E N U ===");
            System.out.println("1 - Cadastrar Candidato");
            System.out.println("2 - Cadastrar Vaga");
            System.out.println("3 - Cadastrar Candidato x Vaga");
            System.out.println("4 - Listar Candidatos");
            System.out.println("5 - Listar Vagas");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    cadastrarCandidato();
                }
                case 2 -> {
                    cadastrarVaga();
                }
                case 3 -> {
                    try {
                        cadastrarCandidatoVaga();
                    } catch (IllegalArgumentException erro) {
                        System.out.println(erro.getMessage());
                    }
                }
                case 4 -> {
                    listarCandidatos();
                }
                case 5 -> {
                    listarVagas();
                }
                default -> {}
            }
        }
    }

    static void cadastrarCandidato() {
        if (quantidadeCandidatos < maxCandidatos) {

            System.out.print("Nome do Candidato: ");
            String nome = texto.nextLine();

            System.out.print("Idade do Candidato: ");
            int idade = entrada.nextInt();

            System.out.print("Candidato Empregado ou Desempregado [E/D]: ");
            char opcaoCandidato = entrada.next().toUpperCase().charAt(0);

            if (opcaoCandidato == 'E') {
                System.out.print("Nome da Empresa: ");
                String empresa = texto.nextLine();

                candidatos[quantidadeCandidatos] = new Empregado(nome, idade, empresa);
            } else {
                System.out.print("Tempo em meses que está desempregado: ");
                int meses = entrada.nextInt();

                candidatos[quantidadeCandidatos] = new Desempregado(nome, idade, meses);
            }

            System.out.print("Salvar cadastro do candidato [S/N]: ");
            if (texto.nextLine().equalsIgnoreCase("S")) {
                quantidadeCandidatos++;
            } else {
                candidatos[quantidadeCandidatos] = null;
            }
        } else {
            System.out.println("Erro! Capacidade máxima de candidatos atingida...\n");
        }
    }

    static void cadastrarVaga() {
        if (quantidadeVagas < maxVagas) {

            System.out.print("Vaga de Estágio ou de Contrato [E/C]: ");
            char opcaoVaga = entrada.next().toUpperCase().charAt(0);

            if (opcaoVaga == 'E') {
                vagas[quantidadeVagas] = new Estagio();
            } else {
                vagas[quantidadeVagas] = new Contrato();
            }

            System.err.print("Descrição da Vaga: ");
            vagas[quantidadeVagas].setDescricao(texto.nextLine());

            System.out.print("Salário da Vaga: R$ ");
            vagas[quantidadeVagas].setSalario(entrada.nextDouble());

            if (opcaoVaga == 'E') {
                System.out.print("Estágio por quanto tempo em meses: ");
                ((Estagio) vagas[quantidadeVagas]).setMeses(entrada.nextInt());
            } else {
                System.out.print("Trabalho temporário [S/N]: ");
                ((Contrato) vagas[quantidadeVagas])
                    .setTemporario(entrada.next().toUpperCase().charAt(0) == 'S');
            }

            System.out.print("Salvar cadastro da vaga [S/N]: ");
            if (texto.nextLine().equalsIgnoreCase("S")) {
                quantidadeVagas++;
            } else {
                vagas[quantidadeVagas] = null;
            }
        } else {
            System.out.println("Erro! Capacidade máxima de vagas atingida...\n");
        }
    }

    static void cadastrarCandidatoVaga() {
        System.out.println("Escolha um candidato:\n");
        for (int i = 0; i < quantidadeCandidatos; i++) {
            System.out.println("Cod: " + (i + 1) + " - " + candidatos[i]);
        }
        System.out.print(">>> Cod: ");
        int codigo = entrada.nextInt() - 1;

        if (codigo < 0 || codigo >= quantidadeCandidatos) {
            throw new IllegalArgumentException("Codigo invalido!");
        }
        Candidato candidato = candidatos[codigo];
        
        System.out.println("Escolha uma vaga:\n");
        for (int i = 0; i < quantidadeVagas; i++) {
            System.out.println("Cod: " + (i + 1) + " - " + vagas[i]);
        }
        System.out.print(">>> Cod: ");
        codigo = entrada.nextInt() - 1;

        if (codigo < 0 || codigo >= quantidadeVagas) {
            throw new IllegalArgumentException("Codigo invalido!");
        }
        Vaga vaga = vagas[codigo];

        candidatosVagas[quantidadeCandidatosVagas] = new CandidatoVaga(candidato, vaga);
        quantidadeCandidatosVagas++;
    }

    static void listarCandidatos() {
        System.out.println("\n\tListagem de Candidatos\n");

        for (int i = 0; i < quantidadeCandidatos; i++) {
            System.out.println(candidatos[i]);
        }

        System.out.println();
    }

    static void listarVagas() {
        System.out.println("\n\tListagem de Vagas\n");

        for (int i = 0; i < quantidadeVagas; i++) {
            System.out.println(vagas[i]);
        }
        
        System.out.println();
    }

    static void lerCandidatosDoArquivo() {
        try {
            FileReader reader = new FileReader("candidato-empregado.txt");
            BufferedReader buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String linha = buffer.readLine();

                String[] campos = linha.split(";");

                if (campos.length == 3) {
                    candidatos[quantidadeCandidatos] = new Empregado(
                        campos[0],
                        Integer.parseInt(campos[1]),
                        campos[2]
                    );

                    quantidadeCandidatos++;
                }
            }

            buffer.close();
            reader.close();

            reader = new FileReader("candidato-desempregado.txt");
            buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String linha = buffer.readLine();

                String[] campos = linha.split(";");

                if (campos.length == 3) {
                    candidatos[quantidadeCandidatos] = new Desempregado(
                        campos[0],
                        Integer.parseInt(campos[1]),
                        Integer.parseInt(campos[2])
                    );

                    quantidadeCandidatos++;
                }
            }

            buffer.close();
            reader.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    static void lerVagasDoArquivo() {
        try {
            FileReader reader = new FileReader("vaga-estagio.txt");
            BufferedReader buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String linha = buffer.readLine();

                String[] campos = linha.split(";");

                if (campos.length >= 3) {
                    vagas[quantidadeVagas] = new Estagio(
                        campos[0],
                        Double.parseDouble(campos[1]),
                        Integer.parseInt(campos[2])
                    );

                    quantidadeVagas++;
                }
            }

            buffer.close();
            reader.close();

            reader = new FileReader("vaga-contrato.txt");
            buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String linha = buffer.readLine();

                String[] campos = linha.split(";");

                if (campos.length == 3) {
                    vagas[quantidadeVagas] = new Contrato(
                        campos[0],
                        Integer.parseInt(campos[1]),
                        Boolean.parseBoolean(campos[2])
                    );

                    quantidadeVagas++;
                }
            }

            buffer.close();
            reader.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }
}
