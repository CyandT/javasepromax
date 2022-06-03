package d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("兰博基尼",30,52.3));
        cars.add(new Car("奔驰",20,22.3));
        cars.add(new Car("布加迪",50,42.3));

//        Collections.shuffle(cars);
//        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(cars);
    }
}
