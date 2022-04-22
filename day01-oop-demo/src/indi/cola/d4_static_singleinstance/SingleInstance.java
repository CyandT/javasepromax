package indi.cola.d4_static_singleinstance;

public class SingleInstance {

    /**
     * 1.构造饿汉单例，对象提前准备一个，并且只能有一个对象，所以需要定义静态成员变量
     */
    public static SingleInstance instance = new SingleInstance();

    /**
     * 2.必须将构造器私有
     */
    private SingleInstance(){

    }
}
