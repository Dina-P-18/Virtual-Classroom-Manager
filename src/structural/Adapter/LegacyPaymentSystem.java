package structural.Adapter;

public class LegacyPaymentSystem {
    public void makePayment(double amount, String currency) {
        System.out.println("Legacy System: Processing payment of " + amount + " " + currency);
        System.out.println("Using old protocol...");
        System.out.println("Payment processed successfully");
    }

    public boolean verifyPayment(String transactionId) {
        System.out.println("Legacy System: Verifying transaction " + transactionId);
        System.out.println("Checking legacy database...");
        System.out.println("Transaction verified: Valid");
        return true;
    }
}