package behavioral_pattern.strategy_pattern;

public class PaymentStrategy {

    private IPayment iPayment;

    public PaymentStrategy(IPayment iPayment) {
        this.iPayment = iPayment;
    }

    public void payAmount(double amount) {
        iPayment.payBill(amount);
    }

}
