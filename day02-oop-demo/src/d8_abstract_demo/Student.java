package d8_abstract_demo;

/**
 * 模板部分可以用final修饰，无法被子类继承
 */
public abstract class Student {
    public final void homeWork(){
        System.out.println("\t\t\t\t《我的爸爸》");
        System.out.println("请介绍你的爸爸:");

        System.out.println(mainWork());

        System.out.println("我的爸爸真是太好了~");
    }
    public abstract String mainWork();
}
