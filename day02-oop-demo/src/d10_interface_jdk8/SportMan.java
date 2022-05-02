package d10_interface_jdk8;

public interface SportMan {

    default void run(){
        System.out.println("跑的很快");
        go();
    }

    static void eat(){
        System.out.println("吃大口的饭");
    }

    private void go(){
        System.out.println("去学校拉！！");
    }
}
