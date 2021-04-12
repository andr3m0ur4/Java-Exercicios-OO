public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    private double calcularDelta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    private boolean ehZero(double numero) {
        return numero == 0.0;
    }

    private boolean ehPositivo(double numero) {
        return numero >= 0.0;
    }

    public double[] bhaskara() {
        double raiz[];

        if (ehZero(this.a) || !ehPositivo(calcularDelta())) {
            raiz = new double[0];
            return raiz;
        }

        if (ehZero(calcularDelta())) {
            raiz = new double[1];
            raiz[0] = -this.b / 2.0 * this.a;
        } else {
            raiz = new double[2];
            raiz[0] = (-this.b + Math.sqrt(calcularDelta())) / 2.0 * this.a;
            raiz[1] = (-this.b - Math.sqrt(calcularDelta())) / 2.0 * this.a;
        }

        return raiz;
    }
}
