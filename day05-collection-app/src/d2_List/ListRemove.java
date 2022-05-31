package d2_List;

import java.util.*;

/**
 * 集合遍历删除元素方法
 */
public class ListRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("JAVA");
        list.add("MATLAB");
        list.add("C#");
        System.out.println(list);
        iterator(list);
        For(list);
        For2(list);

    }
    public static void iterator(List<String> list){
        //1、迭代器删除(解决方案一)
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String rs = it.next();
            if("JAVA".equals(rs)){
                it.remove();
            }
        }
        System.out.println(list);
    }
    public static void For(List<String> list){
        //2.for循环删除(解决方案二)
        for (int i = 0; i < list.size(); i++) {
            String rs = list.get(i);
            if("JAVA".equals(rs)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    public static void For2(List<String> list){
        for (int i = list.size()-1; i >=0 ; i--) {
            String rs = list.get(i);
            if("JAVA".equals(rs)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
