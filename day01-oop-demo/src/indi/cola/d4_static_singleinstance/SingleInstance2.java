package indi.cola.d4_static_singleinstance;

public class SingleInstance2 {
    /**
     * 1.懒汉单例：先私有化构造器
     * 2.定义一个静态成员变量，并且将其私有化，因为第一次访问的值为null，不要给别人埋坑
     * 3.定义一个方法返回单例
     */
    private static SingleInstance2 instance2;

    public static SingleInstance2 getInstance(){
        if(instance2 == null){
            instance2 = new SingleInstance2();
        }
        return instance2;
    }

    private SingleInstance2(){
    }
}
