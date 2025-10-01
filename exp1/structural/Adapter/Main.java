package structural.Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("ADAPTER PATTERN - Payment Gateway Integration");
        System.out.println(" ");

        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();

        PaymentGatewayAdapter adapter = new PaymentGatewayAdapter(legacySystem);

        System.out.println("Processing payment through adapter:");
        adapter.processPayment(150.0);

        System.out.println("\nValidating transaction through adapter:");
        adapter.validateTransaction("TXN12345");
    }
}
