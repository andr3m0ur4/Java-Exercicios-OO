public class Lampada {
    String marca;
    String modelo;
    int tipo;
    int estado;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        if (this.tipo == 0) {
            return "Fluorescente";
        } else if (this.tipo == 1) {
            return "LED";
        } else {
            return "incandescente";
        }
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstado() {
        if (this.estado == 0) {
            return "apagada";
        } else if (this.estado == 1) {
            return "acesa";
        } else {
            return "meia-luz";
        }
    }
}