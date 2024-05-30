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

    public int getAccountNumber() {
        return this.accountNumber;
    } 

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String newName) {
        this.accountHolder = newName;
    }

    public void depositMoney(double depositValue) {
        this.accountBalance += depositValue;
    }

    public void withdrawMoney(double withdrawValue) {
        if (withdrawValue < accountBalance) {
            this.accountBalance -= (withdrawValue + 5); 
        }
    }

    public void showAccount() {
        System.out.printf("Account data: \n{ Account: %d, Holder: %s, Balance: %.2f}\n", this.accountNumber, this.accountHolder, this.accountBalance);
    }
}
