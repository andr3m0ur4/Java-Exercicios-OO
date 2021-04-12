import java.util.Scanner;

public class TestarModeloDeComputador {
    public static void main(String[] args) {
        ModeloDeComputador modelo = new ModeloDeComputador();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o tipo de processador:");
        System.out.println("1 - 1600Mhz a R$700");
        System.out.println("2 - 1800Mhz a R$830");
        System.out.println("3 - 1900Mhz a R$910");
        modelo.setTipoProcessador(entrada.nextInt());

        System.out.println("Escolha a memória RAM:");
        System.out.println("1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350");
        modelo.setMemoriaRAM(entrada.nextInt());

        System.out.println("Escolha o tamanho do disco rígido:");
        System.out.println("1 - 500GB a R$300");
        System.out.println("2 - 1TB a R$420");
        System.out.println("3 - 2TB a R$500");
        modelo.setTamanhoDiscoRigido(entrada.nextInt());

        System.out.println("Escolha o tamanho do monitor:");
        System.out.println("1 - 15 polegadas a R$320");
        System.out.println("2 - 17 polegadas a R$520");
        modelo.setTamanhoMonitor(entrada.nextInt());
        entrada.close();

        System.out.println("Preço do computador: R$ " + modelo.calcularPreco());
    }
}
