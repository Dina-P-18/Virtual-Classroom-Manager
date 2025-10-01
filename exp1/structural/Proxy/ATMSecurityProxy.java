package structural.Proxy;

public class ATMSecurityProxy implements ATM {
    private RealATM realATM;
    private String enteredPIN;
    private int failedAttempts;

    public ATMSecurityProxy(double initialBalance, String initialPIN) {
        this.realATM = new RealATM(initialBalance, initialPIN);
        this.failedAttempts = 0;
        System.out.println("ATM Security Proxy initialized");
    }

    public void authenticate(String pin) {
        this.enteredPIN = pin;
        System.out.println("Authentication attempted");
    }

    private boolean isAuthenticated() {
        return enteredPIN != null && failedAttempts < 3;
    }

    @Override
    public void withdraw(double amount) {
        if (isAuthenticated()) {
            System.out.println("Access granted for withdrawal");
            realATM.withdraw(amount);
            failedAttempts = 0;
        } else {
            System.out.println("Access denied. Please authenticate first.");
            failedAttempts++;
        }
    }

    @Override
    public double checkBalance() {
        if (isAuthenticated()) {
            System.out.println("Access granted for balance check");
            double balance = realATM.checkBalance();
            System.out.println("Current Balance: $" + balance);
            failedAttempts = 0;
            return balance;
        } else {
            System.out.println("Access denied. Please authenticate first.");
            failedAttempts++;
            return 0;
        }
    }

    @Override
    public void changePIN(String newPIN) {
        if (isAuthenticated()) {
            System.out.println("Access granted for PIN change");
            realATM.changePIN(newPIN);
            this.enteredPIN = newPIN;
            failedAttempts = 0;
        } else {
            System.out.println("Access denied. Please authenticate first.");
            failedAttempts++;
        }
    }
}
