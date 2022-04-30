package d7_abstract_demo;

public class WhiteGold extends TotalCard{

    @Override
    public void pay(double old) {
        System.out.println("您好!"+getName()+"先生");
        System.out.println("您的消费是:" + old);
        System.out.println("您当前账户的余额是:" + getYuE());
        double New = old*0.8;
        System.out.println("优惠后的价格为:"+New);
        setYuE(getYuE()-New);
        System.out.println("您的账户余额还剩:" + getYuE());
    }
}
