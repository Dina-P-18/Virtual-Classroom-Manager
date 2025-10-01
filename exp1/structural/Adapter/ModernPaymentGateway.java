package structural.Adapter;

public interface ModernPaymentGateway {
    void processPayment(double amount);
    boolean validateTransaction(String transactionId);
}