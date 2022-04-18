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

    //1.静态方法可以访问静态成员变量/方法，不能"直接"访问实例成员变量
    public static int peopleNumber = 10;
    public static void Test1(){}
    public void Test2(){}
    public static void Test(){
        System.out.println(Student.peopleNumber);
        System.out.println(peopleNumber);
        Test1();

        //System.out.println(name);
        Student s = new Student();
        System.out.println(s.name);
    }
    //2.实例成员方法，可以访问实例成员方法和变量，也可以访问静态
    public void TestShiLI(){
        System.out.println(name);
        Test2();
        Test1();
        System.out.println(peopleNumber);
    }
    //3.静态方法中不能使用this
    public static void TestJ(String name){
        //this.name = name;
    }
}
