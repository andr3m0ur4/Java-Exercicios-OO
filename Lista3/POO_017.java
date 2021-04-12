import java.util.Scanner;

public class POO_017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com a nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Entre com a nota 2: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Entre com a nota 3: ");
        double nota3 = entrada.nextDouble();
        entrada.close();

        double[] medias = calcularMedias(nota1, nota2, nota3);

        System.out.println();
        System.out.println("Médias maiores: " + medias[0]);
        System.out.println("Médias aritmética: " + medias[1]);
        System.out.println("Maior nota: " + medias[2]);
        System.out.println("Menor nota: " + medias[3]);
    }

    public static double[] calcularMedias(double nota1, double nota2, double nota3) {
        double[] notas = new double[4];

        nota1 = (nota1 >= 0 && nota1 <= 10) ? nota1 : 0;
        nota2 = (nota2 >= 0 && nota2 <= 10) ? nota2 : 0;
        nota3 = (nota3 >= 0 && nota3 <= 10) ? nota3 : 0;

        notas[0] = (Math.max(nota1, nota2) + Math.max(Math.min(nota1, nota2), nota3)) / 2.0;
        notas[1] = (nota1 + nota2 + nota3) / 3.0;
        notas[2] = Math.max(Math.max(nota1, nota2), nota3);
        notas[3] = Math.min(Math.min(nota1, nota2), nota3);

        return notas;
    }
}
