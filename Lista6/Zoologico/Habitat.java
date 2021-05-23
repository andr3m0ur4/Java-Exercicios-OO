abstract public class Habitat {
    private Animal[] animais;
    private int quantidade;
    private double area;

    public Habitat() {
        this.animais = new Animal[10];
    }

    public Habitat(double area) {
        this.animais = new Animal[10];
        setArea(area);
    }

    public void cadastrarAnimal(Animal animal) {
        this.animais[quantidade] = animal;
        quantidade++;
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            if (animal != null) System.out.println(animal);
        }
        System.out.println();
    }

    public int quantidadeAnimais() {
        return this.quantidade;
    }

    public int quantidadeVoador() {
        int contador = 0;

        for (Animal animal : animais) {
            if (animal != null) {
                if (animal instanceof Voador) contador++;
            }
        }

        return contador;
    }

    public int quantidadeTerrestre() {
        int contador = 0;

        for (Animal animal : animais) {
            if (animal != null) {
                if (animal instanceof Terrestre) contador++;
            }
        }

        return contador;
    }

    public int quantidadeAquatico() {
        int contador = 0;

        for (Animal animal : animais) {
            if (animal != null) {
                if (animal instanceof Aquatico) contador++;
            }
        }

        return contador;
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }

    public double getArea() {
        return this.area;
    }
}
