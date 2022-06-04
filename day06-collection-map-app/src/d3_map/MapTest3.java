package d3_map;

import java.util.*;

/**
 * 投票系统嵌套集合实现
 */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String, List<String>> selects = new HashMap<>();

        List<String> value = new ArrayList<>();
        Collections.addAll(value, "A", "C", "D");
        selects.put("Mark", value);

        List<String> value1 = new ArrayList<>();
        Collections.addAll(value1, "C", "D");
        selects.put("Cola", value);

        List<String> value2 = new ArrayList<>();
        Collections.addAll(value2,"B","C","A");
        selects.put("Jackson",value2);

        System.out.println(selects);

        //将值放入一个新的集合中统计
        Map<String,Integer> rs = new HashMap<>();

//        [[A, C, D], [A, C, D], [B, C, A]] values
//           infos

        Collection<List<String>> values = selects.values();
        System.out.println(values);
        for (List<String> infos : values) {
//            info是新集合里的键
            for (String info : infos) {
                if(rs.containsKey(info)){
                    rs.put(info,rs.get(info)+1);
                }else {
                    rs.put(info,1);
                }
            }
        }
        System.out.println(rs);
    }
}
