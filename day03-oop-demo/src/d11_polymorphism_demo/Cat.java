package d11_polymorphism_demo;

public class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("🐱跑的也快~~~");
    }
    public void way(){
        System.out.println("🐱是主人的主人");
    }
}
