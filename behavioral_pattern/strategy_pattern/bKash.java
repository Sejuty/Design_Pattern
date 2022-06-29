package behavioral_pattern.strategy_pattern;

public class bKash implements IPayment {
    @Override
    public void payBill(double amount) {
        amount -= (amount * 3 / 100);
        System.out.println("Payable amount using bkash " + amount);
    }
}
