package SOLID.dip;

 class CreditCard implements  BankCard {
    public void transaction(long amount)
    {
        System.out.println("Credit Card");
    }
}
 class DebitCard implements BankCard {
    public void transaction(long amount)
    {
        System.out.println("DebitCard Card");
    }
}
interface BankCard{
    public void transaction(long amount);
}

class ShoppingMall{
     private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void buy(long amount){
        bankCard.transaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);

        shoppingMall.buy(456789);
    }
}
