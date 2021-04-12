import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private Date data;
    static DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public boolean validarData() {
        String data = this.dia + "/" + this.mes + "/" + this.ano;
        dataFormatada.setLenient(false);

        try {
            this.data = dataFormatada.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public String mostrarData() {
        return dataFormatada.format(this.data);
    }

    public String compararDatas(Data data2) {
        if (this.data.compareTo(data2.data) == 0) {
            return "Datas são iguais";
        } else if (this.data.compareTo(data2.data) < 0) {
            return "Datas não são iguais.\n"
                + "Data: " + dataFormatada.format(this.data) + " é menor.\n"
                + "Data: " + dataFormatada.format(data2.data) + " é maior\n"
                + "Diferença em dias: " + calcularDiferencaEmDias(this.data, data2.data);
        } else {
            return "Datas não são iguais.\n"
                + "Data: " + dataFormatada.format(data2.data) + " é menor.\n"
                + "Data: " + dataFormatada.format(this.data) + " é maior\n"
                + "Diferença em dias: " + calcularDiferencaEmDias(this.data, data2.data);
        }
    }

    private long calcularDiferencaEmDias(Date data1, Date data2) {
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();

        calendario1.setTime(data1);
        calendario2.setTime(data2);

        long qtdDia1 = calendario1.getTimeInMillis();
        long qtdDia2 = calendario2.getTimeInMillis();
        return (Math.max(qtdDia1, qtdDia2) - Math.min(qtdDia1, qtdDia2)) / 86400000;
    }
}
