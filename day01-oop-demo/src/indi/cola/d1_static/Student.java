package indi.cola.d1_static;
//1.静态成员方法 static修饰
//   类名.方法名/对象名
public class Student {
    private String name;
    public static int getMax(int a,int b){
        return a > b ? a:b;
    }
    public static void main(String[] args) {
        System.out.println(Student.getMax(10, 50));
        //在同一个类中，访问静态方法，类名可以不写
        System.out.println(getMax(10,42));
    }
}
