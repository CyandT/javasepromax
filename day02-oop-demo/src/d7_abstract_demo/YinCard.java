package d7_abstract_demo;

public class YinCard extends TotalCard{

    @Override
    public void pay(double old) {
        double New = old*0.85;
        System.out.println("优惠后的价格为:"+New);
    }
}
