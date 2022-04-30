package d8_abstract_demo;

/**
 * 理解抽象类模板方法模式
 */
public class Test {
    public static void main(String[] args) {
        StudentChild s1 = new StudentChild();
        s1.homeWork();
        System.out.println("-------------------------------");
        StudentMiddle s2 = new StudentMiddle();
        s2.homeWork();
    }
}
