package d1_set;
/**
 * TreeSet对于引用类型比较，可以使用两种方法1.comparator 2.Comparable接口
 */

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Fruit> fruits = new TreeSet<>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
//                return o1.getWeight() - o2.getWeight();
//                比较浮点型数据时，要使用Double.compare()来进行比较
                return Double.compare(o2.getPrice(),o1.getPrice());
            }
        });
        fruits.add(new Fruit("苹果",23.4,8));
        fruits.add(new Fruit("西瓜",39.8,20));
        fruits.add(new Fruit("葡萄",14.7,4));
        fruits.add(new Fruit("梨",12.3,5));
        System.out.println(fruits);
    }
}
