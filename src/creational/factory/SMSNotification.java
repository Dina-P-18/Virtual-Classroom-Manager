package creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(" SMS NOTIFICATION");
        System.out.println("   To: +1234567890");
        System.out.println("   Message: " + message);
        System.out.println("   Status: Delivered ✓");
    }
}
