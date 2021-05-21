public class Habitat {
    private double area;

    public Habitat() {

    }

    public Habitat(double area) {
        setArea(area);
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
