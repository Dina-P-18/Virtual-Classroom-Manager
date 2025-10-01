package creational.factory;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(" PUSH NOTIFICATION");
        System.out.println("   Device: Android/iOS");
        System.out.println("   Title: App Notification");
        System.out.println("   Body: " + message);
        System.out.println("   Status: Received ✓");
    }
}
