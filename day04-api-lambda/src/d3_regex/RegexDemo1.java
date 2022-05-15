package d3_regex;

/**
 * 截取、替换（正则表达式）
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        String str = "我爱adaffssa中国asddaad工厂店";
        String [] name = str.split("\\w+");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        String name1 = str.replaceAll("\\w+","  ");
        System.out.println(name1);
    }
}
