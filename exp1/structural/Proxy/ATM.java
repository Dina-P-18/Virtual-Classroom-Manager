package structural.Proxy;

public interface ATM {
    void withdraw(double amount);
    double checkBalance();
    void changePIN(String newPIN);
}
