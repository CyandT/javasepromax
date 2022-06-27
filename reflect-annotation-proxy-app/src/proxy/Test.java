package proxy;

public class Test {
    public static void main(String[] args) {
        Star s = new Star("周二伦");

        //创建一个代理对象
        Skill proxy = StarProxy.getProxy(s);
        proxy.run();
    }
}
