package d7_abstract_demo;

public abstract class TotalCard {
    private String name;
    private double YuE;
    public abstract void pay(double old);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYuE() {
        return YuE;
    }

    public void setYuE(double yuE) {
        YuE = yuE;
    }
}
