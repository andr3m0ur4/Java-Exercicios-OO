import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
    public Arquivo() {

    }

    public String[][] lerArquivo(String path, int linhas, int colunas) {
        String[][] dados = new String[linhas][colunas];
        
        try {
            FileReader reader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(reader);
            String[] campos;
            int quantidade = 0;

            while (buffer.ready()) {
                String linha = buffer.readLine();

                campos = linha.split(";");
                
                dados[quantidade] = campos;
                quantidade++;
                
                /* if (campos.length == 3) {
                    candidatos[quantidadeCandidatos] = new Empregado(
                        campos[0],
                        Integer.parseInt(campos[1]),
                        campos[2]
                        );
                        
                        quantidadeCandidatos++;
                    } */
            }
            
            buffer.close();
            reader.close();

            /* reader = new FileReader("candidato-desempregado.txt");
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
            reader.close(); */

        } catch (IOException erro) {
            erro.printStackTrace();
        }

        return dados;
    }
}
