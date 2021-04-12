public class POO_013 {
    public static void main(String[] args) {
        int um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0, milhao = 1000000;

        for (int i = 0; i < milhao; i++) {
            int numero = dado();
            switch (numero) {
                case 1 -> {
                    um++;
                }
                case 2 -> {
                    dois++;
                }
                case 3 -> {
                    tres++;
                }
                case 4 -> {
                    quatro++;
                }
                case 5 -> {
                    cinco++;
                }
                case 6 -> {
                    seis++;
                }
            }
        }

        double perUm = um * 100 / (double) milhao;
        double perDois = um * 100 / (double) milhao;
        double perTres = um * 100 / (double) milhao;
        double perQuatro = um * 100 / (double) milhao;
        double perCinco = um * 100 / (double) milhao;
        double perSeis = um * 100 / (double) milhao;

        System.out.printf("1: %d - %.2f%%\n", um, perUm);
        System.out.printf("2: %d - %.2f%%\n", dois, perDois);
        System.out.printf("3: %d - %.2f%%\n", tres, perTres);
        System.out.printf("4: %d - %.2f%%\n", quatro, perQuatro);
        System.out.printf("5: %d - %.2f%%\n", cinco, perCinco);
        System.out.printf("6: %d - %.2f%%\n", seis, perSeis);
    }

    public static int dado() {
        return (int) (Math.random() * 6) + 1;
    }
}
