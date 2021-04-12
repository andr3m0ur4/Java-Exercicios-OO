import java.util.Scanner;

public class TesteNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.print("Digite um número: ");
        numero.setNumero(entrada.nextInt());
        entrada.close();

        System.out.println("Número invertido: " + numero.inverter());
    }
}
