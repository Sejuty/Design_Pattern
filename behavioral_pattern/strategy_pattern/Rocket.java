package behavioral_pattern.strategy_pattern;

public class Rocket implements IPayment {

    @Override
    public void payBill(double amount) {
        amount -= (amount * 1.5 / 100);
        System.out.println("Payable amount using Rocket " + amount);
    }
}
