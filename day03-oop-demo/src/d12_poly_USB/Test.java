package d12_poly_USB;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("惠普");
        USB usb = new Mouse("罗技");
        USB usb1 = new Keyboard("外星人");

        computer.role(usb,computer);
        System.out.println("-----------------------");
        computer.role(usb1,computer);

    }
}
