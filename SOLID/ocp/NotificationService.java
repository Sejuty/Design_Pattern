package SOLID.ocp;

public interface NotificationService {
    void sendOTP(String m);
    void transactionReport(String m);
}

class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String m) {
        System.out.println("Send OTP");
    }

    @Override
    public void transactionReport(String m) {
        System.out.println("Send Report");
    }
}
class MobileNotificationService implements NotificationService{
    @Override
    public void sendOTP(String m) {
        System.out.println("Send Notification");
    }

    @Override
    public void transactionReport(String m) {
        System.out.println("Send Report");
    }
}
class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendOTP(String m) {
        System.out.println("Send OTP");
    }

    @Override
    public void transactionReport(String m) {
        System.out.println("Send Report");
    }
}
