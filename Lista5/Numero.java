public class Numero {
    private int numero;

    public Numero() {

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public int inverter() {
        StringBuilder str;
        
        if (this.numero < 0) {
            str = new StringBuilder(Integer.toString(Math.abs(this.numero)));
            return -Integer.parseInt(str.reverse().toString());
        }

        str = new StringBuilder(Integer.toString(this.numero));
        return Integer.parseInt(str.reverse().toString());
    }
}
