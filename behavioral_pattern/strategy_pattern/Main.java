package behavioral_pattern.strategy_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Welcome to E-Payment--");
        System.out.println("How do you want to complete your payment???");
        System.out.println("1.Bkash\n2.Rocket");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Payment Option: ");
        int s = scan.nextInt();

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double amount = scan.nextInt();

        PaymentStrategy paymentStrategy = new PaymentStrategy(new bKash());
        PaymentStrategy paymentStrategy2 = new PaymentStrategy(new Rocket());



        switch (s) {
            case 1:
                paymentStrategy.payAmount(amount);
                break;
            case 2:
                paymentStrategy2.payAmount(amount);
                break;
            default:
                System.out.println("Enter valid option");
        }



    }
}
