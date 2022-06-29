package SOLID.isp;

interface IPayment {
    void payMoney();
    void getScrachCard();

}
interface CashBack{
    void getCreditBalance();
}

class GooglePlay implements IPayment,CashBack{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScrachCard() {

    }

    @Override
    public void getCreditBalance() {

    }
}

class PayPhone implements IPayment{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScrachCard() {

    }
}
