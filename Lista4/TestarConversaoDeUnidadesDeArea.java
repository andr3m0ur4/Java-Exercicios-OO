public class TestarConversaoDeUnidadesDeArea {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea conversao = new ConversaoDeUnidadesDeArea();
        conversao.setMetroQuadrado(10);
        conversao.setPeQuadrado(5);
        conversao.setMilhaQuadrado(2);
        conversao.setAcreQuadrado(20);

        System.out.println(conversao.getMetroQuadrado() + " metros em pés quadrados: " + conversao.metrosParaPes());
        System.out.println(conversao.getPeQuadrado() + " pés em centímetros quadrados: " + conversao.pesParaCentimetros());
        System.out.println(conversao.getMilhaQuadrada() + " milhas em acres: " + conversao.milhasParaAcres());
        System.out.println(conversao.getAcreQuadrado() + " acres em pés quadrados: " + conversao.acresParaPes());
    }
}
