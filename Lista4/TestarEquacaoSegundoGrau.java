public class TestarEquacaoSegundoGrau {
    public static void main(String[] args) {
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(0, 4, 4);
        if (equacao.bhaskara().length > 0) {
            for (double raiz : equacao.bhaskara()) {
                System.out.println("Raiz: " + raiz);
            }
        } else {
            System.out.println("Não é uma equação do segundo grau.");
        }
    }
}
