import java.util.Scanner;

public class POO_015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char op;

        do {
            System.out.print("[C] Celsius, [F] Fahrenheit e [S] Sair: ");
            op = entrada.next().toUpperCase().charAt(0);

            if (op == 'C') {
                System.out.print("Entre com a temperatura: ");
                int celsius = entrada.nextInt();

                System.out.println("Saída: " + celsiusParaFahrenheit(celsius));
            } else if (op == 'F') {
                System.out.print("Entre com a temperatura: ");
                int fahrenheit = entrada.nextInt();

                System.out.println("Saída: " + fahrenheitParaCelsius(fahrenheit));
            } else if (op != 'S') {
                System.out.println("Opção inválida!");
            }
        } while (op != 'S');
        entrada.close();
    }

    public static int celsiusParaFahrenheit(int celsius) {
        return (int) (9 * celsius / 5.0) + 32;
    }

    public static int fahrenheitParaCelsius(int fahrenheit) {
        return 5 * (fahrenheit - 32) / (int) 9.0;
    }
}
