package proxy;

public class Star implements Skill{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "跳舞很好看!");
    }

    @Override
    public void sing() {
        System.out.println(name + "唱歌很好听!");
    }
}
