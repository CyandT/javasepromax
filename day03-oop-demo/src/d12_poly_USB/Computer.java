package d12_poly_USB;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void role(USB usb,Computer computer){
        System.out.println(computer.name + "已开机~");
        usb.input();

        if(usb instanceof Mouse){
            Mouse mouse =(Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.play();
        }

        usb.output();
    }
    public static void run(){

    }
}
