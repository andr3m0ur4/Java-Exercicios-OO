public class TestarData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setDia(28);
        data.setMes(3);
        data.setAno(2021);

        Data data2 = new Data();
        data2.setDia(7);
        data2.setMes(4);
        data2.setAno(2021);

        if (data.validarData() && data2.validarData()) {
            System.out.println("Data: " + data.mostrarData());
            System.out.println("Data é válida: " + data2.validarData());
            System.out.println("Data: " + data2.mostrarData());

            System.out.println(data.compararDatas(data2));
        } else {
            System.out.println("Data é inválida!");
        }
    }
}
