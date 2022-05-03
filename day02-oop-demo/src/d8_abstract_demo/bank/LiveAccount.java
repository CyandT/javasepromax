package d8_abstract_demo.bank;

public class LiveAccount extends Account{

    public LiveAccount(String cardID, double yuE) {
        super(cardID, yuE);
    }

    @Override
    public double aLive(double yuE) {
        double money = yuE*0.0035;
        return money;
    }

    @Override
    public double deathAccount(double yuE) {
        double money = yuE*0.0175;
        return money;
    }
}
