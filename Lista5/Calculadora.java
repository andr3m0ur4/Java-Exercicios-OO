public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora() {

    }

    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public int somar() {
        return this.numero1 + this.numero2;
    }

    public int subtrair() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        return this.numero1 * this.numero2;
    }

    public double dividir() {
        return this.numero1 / (double) this.numero2;
    }
}
