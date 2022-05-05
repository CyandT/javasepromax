package d11_polymorphism_demo;

public class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("🐕跑的很快~~~");
    }
    public void way(){
        System.out.println("🐕会帮主人看🚪 !!!");
    }
}
