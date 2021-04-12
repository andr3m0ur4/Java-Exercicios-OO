import java.util.Scanner;

public class POO_027 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = entrada.nextInt();
        entrada.close();

        System.out.println(">> " + inverterNumero(numero));
    }

    public static int inverterNumero(int numero) {
        StringBuilder texto;

        if (numero >= 0) {
            texto = new StringBuilder(Integer.toString(numero));
            numero = Integer.parseInt(texto.reverse().toString());
        } else {
            numero = Math.abs(numero);
            texto = new StringBuilder(Integer.toString(numero));
            numero = -Integer.parseInt(texto.reverse().toString());
        }
        
        return numero;
    }
}
