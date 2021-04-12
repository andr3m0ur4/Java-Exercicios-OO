import java.util.Scanner;

public class POO_014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com temperatura em Celsius: ");
        int celsius = entrada.nextInt();
        entrada.close();

        System.out.println("A temperatura em Fahrenheit é: " + celsiusParaFahrenheit(celsius));
    }

    public static int celsiusParaFahrenheit(int celsius) {
        return (int) (9 * celsius / 5.0) + 32;
    }
}