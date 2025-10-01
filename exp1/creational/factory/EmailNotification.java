package creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(" EMAIL NOTIFICATION");
        System.out.println("   To: user@example.com");
        System.out.println("   Subject: Important Update");
        System.out.println("   Body: " + message);
        System.out.println("   Status: Sent successfully ✓");
    }
}
