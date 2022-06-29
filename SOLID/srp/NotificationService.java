package SOLID.srp;

public class NotificationService {

    public void sendOTP(String m)
    {
        if(m.equalsIgnoreCase("Email"))
            System.out.println("Email OTP");
        if(m.equalsIgnoreCase("Phone"))
            System.out.println("Phone Otp");
    }
}
