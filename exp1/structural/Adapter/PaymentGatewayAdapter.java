package structural.Adapter;

public class PaymentGatewayAdapter implements ModernPaymentGateway {
    private LegacyPaymentSystem legacySystem;

    public PaymentGatewayAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Adapter: Converting modern payment to legacy format");
        legacySystem.makePayment(amount, "USD");
    }

    @Override
    public boolean validateTransaction(String transactionId) {
        System.out.println("Adapter: Converting modern validation to legacy format");
        return legacySystem.verifyPayment(transactionId);
    }
}