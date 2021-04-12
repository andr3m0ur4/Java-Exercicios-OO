public class Ano {
    private int ano;

    public Ano() {

    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public boolean ehBissexto() {
        return (this.ano % 4 == 0) || (this.ano % 400 == 0) && (this.ano % 100 != 0);
    }
}
