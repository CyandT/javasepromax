package d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection api用法
 */
public class Collection_demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        //1.添加
        c.add("JAVA");
        c.add("MYSQL");
        c.add("HTML");
        System.out.println(c);

        //2.删除
        c.remove("JAVA");
        System.out.println(c);

        //3.判断集合中是否含有该元素
        System.out.println(c.contains("JAVA"));
        System.out.println(c.contains("MYSQL"));

        //4.判断集合是否为空
        boolean rs = c.isEmpty();
        System.out.println(rs);

        //5.判断集合元素个数
        System.out.println(c.size());

        //6.把集合中的元素，存储到数组中
        Object[] arr = c.toArray();
        System.out.println("数组:" + Arrays.toString(arr));
    }
}
