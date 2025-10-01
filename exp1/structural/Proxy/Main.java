package structural.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROXY PATTERN - ATM Security System");
        System.out.println(" ");

        ATMSecurityProxy atm = new ATMSecurityProxy(1000.0, "1234");

        System.out.println("\nTrying to access without authentication:");
        atm.checkBalance();
        atm.withdraw(100.0);

        System.out.println("\nAuthenticating and accessing features:");
        atm.authenticate("1234");
        atm.checkBalance();
        atm.withdraw(200.0);
        atm.changePIN("5678");

        System.out.println("\nFinal transaction:");
        atm.withdraw(50.0);
    }
}
