package d3_map;
/**
 * Map的循环遍历方式
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> shops = new HashMap<>();
        shops.put("bag",1);
        shops.put("pencil",10);
        shops.put("book",8);
        shops.put("ruler",15);
        System.out.println(shops);

//        1、遍历方式一(把键取出放入Set集合里，再用map.get（）得到值)
        Set<String> keys = shops.keySet();
        for (String key : keys) {
            int value = shops.get(key);
            System.out.println(key +"===>" + value);
        }
        System.out.println("------------------------");
//        2、foreach遍历
        Set<Map.Entry<String, Integer>> entries = shops.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
              String key = entry.getKey();
              int value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
        System.out.println("------------------------");
//        3、lambda遍历(BiConsumer)
        shops.forEach( (key, value) -> System.out.println(key + "===>" + value));
    }
}
