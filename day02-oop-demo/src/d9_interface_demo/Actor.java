package d9_interface_demo;

public class Actor implements People{
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void law() {
        System.out.println(name + "遵守法律");
    }

    @Override
    public void eat() {
        System.out.println(name+"喜欢吃猪肉");
    }

    @Override
    public void sleep() {
        System.out.println(name+"一般12点睡觉");
    }

    @Override
    public void run() {
        System.out.println(name+"每天都跑步");
    }
}
