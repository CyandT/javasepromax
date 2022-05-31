package d2_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List系列集合的增删改查API
 */
public class List_api {
      public static void main(String[] args) {
            List<String> list = new ArrayList<>();

            System.out.println("---------增---------");
            list.add("JAVA");
            list.add("MYSQL");
            list.add("HTML");
            System.out.println(list);

            System.out.println("---------删---------");
            list.remove(2);
            System.out.println(list);

            System.out.println("---------改---------");
            list.set(1,"高斯林");
            System.out.println(list);

            System.out.println("---------查---------");
            String rs = list.get(1);
            System.out.println(rs);
      }
}
