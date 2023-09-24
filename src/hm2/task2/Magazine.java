package hm2.task2;

public class Magazine extends Book{
    private int thickness;

    public Magazine() {
    }

    public Magazine(int size, int pages, int thickness) {
        super(size, pages);
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
        return "Magazine{" +
                "thickness=" + thickness +
                '}' + super.toString();
    }
}
