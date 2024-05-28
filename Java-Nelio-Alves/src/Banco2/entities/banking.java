package Banco2.entities;

public class banking {

    public int accountNumber;
    public String accountHolder;
    private double accountBalance;
    
    public banking(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public banking(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void withdrawMoney(double withdrawValue) {
        if (withdrawValue < accountBalance) {
            this.accountBalance -= (withdrawValue - 5); 
        }
    }

    public void showAccount() {
        System.out.print("Account data {\n Account: %d, Holder: %s, Balance: %2.f}");
    }
}
