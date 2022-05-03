package d8_abstract_demo.bank;

import java.util.Scanner;

public abstract class Account {
    private String cardID ;
    private double yuE;
    Scanner sc = new Scanner(System.in);

    public final void MoBan(String loginName,String passWord){
        System.out.println("================BANK==============");
        System.out.println("正在进行身份验证!请稍后~");
        if("cola11".equals(loginName) && "123456".equals(passWord)){
            System.out.println("恭喜您!登录成功~");
            System.out.println("您的卡号是:" + cardID);
        }
        System.out.println("请选择您的账户类型:");
        switch (sc.next()){
            case "活期":
                System.out.println("您的活期利息为:"+aLive(yuE));
                double totalH = aLive(yuE) + yuE;
                System.out.println("您的总余额为:"+totalH);
                break;
            case "定期":
                System.out.println("您的定期利息为:" + deathAccount(yuE));
                double totalD = deathAccount(yuE) + yuE;
                System.out.println("您的总余额为:"+totalD);
                break;
            default:
                System.out.println("无此期类账户!");
        }
    }
    public abstract double aLive(double yuE);
    public abstract double deathAccount(double yuE);

    public Account(String cardID, double yuE) {
        this.cardID = cardID;
        this.yuE = yuE;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }


    public double getYuE() {
        return yuE;
    }

    public void setYuE(double yuE) {
        this.yuE = yuE;
    }
}
