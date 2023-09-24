package hm2.task1;

public class UltraBook extends Laptop{
    private int thickness;

    public UltraBook() {
    }

    public UltraBook(int CPus, int RAM, double monitor, int weight, int thickness) {
        super(CPus, RAM, monitor, weight);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "thickness=" + thickness +
                '}' + super.toString();
    }
}
