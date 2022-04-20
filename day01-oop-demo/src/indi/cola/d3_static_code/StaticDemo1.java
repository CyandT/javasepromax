package indi.cola.d3_static_code;

public class StaticDemo1 {
    private static String name;
    /*
       静态代码块，与类优先运行，可以初始化静态成员变量
     */
    static {
        System.out.println("=============开始============");
        name = "五类哇";
    }
    public static void main(String[] args) {
        System.out.println("=============结束============");
        System.out.println(name);
        System.out.println(StaticDemo1.name);
    }
}
