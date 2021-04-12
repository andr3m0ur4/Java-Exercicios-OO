public class TestarLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setEstado(1);
        lampada.setMarca("Light");
        lampada.setModelo("2500");
        lampada.setTipo(2);

        System.out.println("Marca: " + lampada.getMarca());
        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Estado: " + lampada.getEstado());
        System.out.println("Tipo: " + lampada.getTipo());
    }
}
