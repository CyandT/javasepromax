package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 集合的循环遍历
 */
public class Collection_demo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("JAVA");
        c.add("MYSQL");
        c.add("HTML");
        c.add("MYBATIS");
        System.out.println(c);

        //1、迭代器循环
        Iterator<String> it = c.iterator();
        System.out.println(it.next());

        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
        System.out.println("------------------------------");
        //2、增强for循环
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //3、foreach循环
        c.forEach( s -> System.out.println(s));
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
