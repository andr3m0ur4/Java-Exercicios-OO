import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        
        String midia = "";
        String[] midias = { "a", "b", "c", "d", "e", null, null, null, null, null };
        int quantidade = 5;

        for (int i = 0; i < midias.length; i++) {
            if (midias[i].equals("b")) {
                midia = midias[i];
                for (int j = i; j < midias.length - 1; j++) {
                    midias[j] = midias[j + 1];
                }
                midias[quantidade] = null;
                quantidade--;
                break;
            }
        }


        //this.quantidadeMidias--;
        //midias = novasMidias;
        System.out.println(Arrays.toString(midias));
        System.out.println(midia);
        System.out.println(quantidade);

    }
}
