package d12_poly_USB;

public class Keyboard implements USB{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void input() {
        System.out.println(name + "已成功连接~");
    }

    @Override
    public void output() {
        System.out.println(name + "已成功拔出~");
    }
    public void play(){
        System.out.println(name + "可以打出优美的文字!");
    }
}
