package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流常用的API
 */
public class StreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张松","张强","蔡正","龙一","张无忌","张无忌");
        System.out.println(list);

//        1、过滤( filter() )
        Stream<String> zhangList = list.stream().filter(s -> s.startsWith("张"));
        List<String> collect = zhangList.collect(Collectors.toList());
        System.out.println(collect);
//        2、取(跳过skip)前几个元素limit()
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
//        3、去除重复元素
        list.stream().distinct().forEach(s -> System.out.println(s));
//        4、计算元素个数
        long size = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(size);
//        5、合并两个集合
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"腕豪");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = list1.stream();
        Stream<String> list3 = Stream.concat(stream,stream1);
        list3.forEach(s -> System.out.println(s));
    }
}
