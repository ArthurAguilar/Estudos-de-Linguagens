package Aulas.UpDowncasting.entities;

public class SavingAccounts extends Account {

    private Double interestRate;

    public SavingAccounts(){}
    
    public SavingAccounts(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance =+ balance * interestRate;
    }
}
