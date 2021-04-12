import java.util.Scanner;

public class POO_016 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char op;

        do {
            System.out.print("[C] Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
            op = entrada.next().toUpperCase().charAt(0);

            if (op == 'C') {
                System.out.print("Entre com a temperatura: ");
                int celsius = entrada.nextInt();

                System.out.printf("F: %d e K: %d\n",
                    celsiusParaFahrenheit(celsius), celsiusParaKelvin(celsius));
            } else if (op == 'F') {
                System.out.print("Entre com a temperatura: ");
                int fahrenheit = entrada.nextInt();

                System.out.printf("C: %d e K: %d\n",
                    fahrenheitParaCelsius(fahrenheit), celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit)));
            } else if (op == 'K') {
                System.out.print("Entre com a temperatura: ");
                int kelvin = entrada.nextInt();

                System.out.printf("C: %d e F: %d\n",
                    kelvinParaCelsius(kelvin), celsiusParaFahrenheit(kelvinParaCelsius(kelvin)));
            } else if (op != 'S') {
                System.out.println("Opção Inválida!");
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

    public static int celsiusParaKelvin(int celsius) {
        return celsius + 273;
    }

    public static int kelvinParaCelsius(int kelvin) {
        return kelvin - 273;
    }
}
