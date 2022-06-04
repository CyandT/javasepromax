package d3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Map集合投票案例
 */
public class MapDemo2 {
    public static void main(String[] args) {
        String[] selects = {"A" , "B" , "C" , "D"};
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            String select = selects[r.nextInt(selects.length)];
            builder.append(select);
        }
        System.out.println(builder);

        Map<Character,Integer> rs = new HashMap<>();

        for (int i = 0; i <builder.length(); i++) {
            char ch = builder.charAt(i);
            if(rs.containsKey(ch)){
                rs.put(ch,rs.get(ch) + 1);
            }else {
                rs.put(ch,1);
            }
        }
        System.out.println(rs);
    }
}
