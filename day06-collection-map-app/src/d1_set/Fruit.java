package d1_set;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private double price;
    private int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.price, price) == 0 && weight == fruit.weight && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public Fruit() {
    }

    public Fruit(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 进行对象内部变量的比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(Fruit o) {
//        return this.getWeight() - o.getWeight();  去掉相同的元素的对象，进行升序排列
        return (this.getWeight() - o.getWeight())>=0?1:-1; // 保留相同元素对象，进行升序排列
    }
}
