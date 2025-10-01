package structural.Proxy;

public class RealATM implements ATM {
    private double balance;
    private String pin;

    public RealATM(double initialBalance, String initialPIN) {
        this.balance = initialBalance;
        this.pin = initialPIN;
        System.out.println("Real ATM initialized with balance: $" + initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Remaining: $" + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void changePIN(String newPIN) {
        this.pin = newPIN;
        System.out.println("PIN changed successfully");
    }
}