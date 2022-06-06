package d1_stream;

public class TopPerformer {
    private String name;
    private double allMoney;

    @Override
    public String toString() {
        return "TopPerformer{" +
                "name='" + name + '\'' +
                ", allMoney=" + allMoney +
                '}';
    }

    public TopPerformer() {
    }

    public TopPerformer(String name, double allMoney) {
        this.name = name;
        this.allMoney = allMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }
}
