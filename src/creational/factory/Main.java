package creational.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println(" FACTORY PATTERN - Notification Creator");

        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        Notification sms = factory.createNotification("sms");
        Notification push = factory.createNotification("push");

        System.out.println(" Sending notifications...\n");

        email.send("Welcome to our service! Your account has been created successfully.");
        System.out.println();

        sms.send("Your OTP is 123456. Valid for 10 minutes.");
        System.out.println();

        push.send("You have a new message from John.");
    }
}
