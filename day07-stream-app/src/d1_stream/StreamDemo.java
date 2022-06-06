package d1_stream;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static double allMoney;
    public static double totalMoney;

    public static void main(String[] args) {
        List<Performer> one = new ArrayList<>();
        one.add(new Performer("A","男",8500,5430.5,"无"));
        one.add(new Performer("B","男",7500,8530.5,"迟到"));
        one.add(new Performer("C","女",10500,6740.5,"无"));
        one.add(new Performer("D","女",6500,2490.5,"无"));

        List<Performer> two = new ArrayList<>();
        two.add(new Performer("E","男",7500,8530.5,"无"));
        two.add(new Performer("F","男",9500,1430.5,"顶撞上司"));
        two.add(new Performer("G","男",6500,3540.5,"无"));
        two.add(new Performer("H","女",12500,6540.5,"无"));
        two.add(new Performer("I","女",4500,7771.5,"缺勤"));

    TopPerformer t1 =  one.stream().max((e1 , e2) -> Double.compare(e1.getSalary() + e1.getBonus(),e2.getSalary() +e2.getBonus() ))
                .map(e ->new TopPerformer(e.getName(),e.getBonus() + e.getSalary())).get();
        System.out.println("one部门的" + t1);
    TopPerformer t2 =  two.stream().max((e1 , e2) -> Double.compare(e1.getSalary() + e1.getBonus(),e2.getSalary() +e2.getBonus() ))
                .map(e ->new TopPerformer(e.getName(),e.getBonus() + e.getSalary())).get();
        System.out.println("two部门的" + t2);

        one.stream().sorted((e1 , e2) -> Double.compare(e1.getSalary() + e1.getBonus(),e2.getSalary() +e2.getBonus()))
                .skip(1).limit(one.size() - 2).forEach(s ->
                       allMoney += (s.getBonus() + s.getSalary())
                );
        System.out.println("one部门的平均薪资是:" + allMoney/ (one.size()-2) );

        Stream<Performer> OneStream = one.stream();
        Stream<Performer> TwoStream = two.stream();
        Stream<Performer> total = Stream.concat(OneStream,TwoStream);

        total.sorted((e1 , e2) -> Double.compare(e1.getSalary() + e1.getBonus(),e2.getSalary() +e2.getBonus()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(s ->
                       totalMoney += (s.getBonus() + s.getSalary())
        );

//      保留两位小数，四舍五入
        BigDecimal a = BigDecimal.valueOf(totalMoney);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size());
        System.out.println("两个部门的平均薪资是:" + a.divide(b,2, RoundingMode.HALF_UP));
    }
}
