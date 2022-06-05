package d1_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 集合、数组创建Stream流的方法
 */
public class CreatStream {
    public static void main(String[] args) {
//        1、Collection集合
        Collection<String> lists = new ArrayList<>();
        Stream<String> collectionStream = lists.stream();

//        2、Set集合
        Set<String> sets = new HashSet<>();
        Stream<String> setStream = sets.stream();

//        3、Map集合
        Map<String,Integer> maps = new HashMap<>();
//        1)键流
        Stream<String> keyStream = maps.keySet().stream();
//        2)值流
        Stream<Integer> valueStream = maps.values().stream();
//        3)键值对
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

//        4、数组
        String[] name = {"逍遥","姑姑","贝尔"};
        Stream<String> ArrayStream = Arrays.stream(name);
        Stream<String> stringStream = Stream.of(name);
    }
}
