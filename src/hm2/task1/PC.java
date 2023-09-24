package hm2.task1;

public class PC {
    private int CPus;
    private int RAM;
    private double Monitor;

    public PC() {
    }

    public PC(int CPus, int RAM, double monitor) {
        this.CPus = CPus;
        this.RAM = RAM;
        Monitor = monitor;
    }

    public int getCPus() {
        return CPus;
    }

    public void setCPus(int CPus) {
        this.CPus = CPus;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getMonitor() {
        return Monitor;
    }

    public void setMonitor(double monitor) {
        Monitor = monitor;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "CPus=" + CPus +
                ", RAM=" + RAM +
                ", Monitor=" + Monitor +
                '}';
    }
}
