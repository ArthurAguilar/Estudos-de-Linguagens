package Aulas.UpDowncasting.entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }    

    public void loan (double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    
}
