package Contribuintes.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax;

        if (getAnualIncome() < 20000) {
            tax = getAnualIncome() * 0.15;
        } else {
            tax = getAnualIncome() * 0.25;
        }

        if (getHealthExpenditures() > 0) {
            tax -= getHealthExpenditures() * 0.5;
        }

        return Math.max(tax, 0);
    }
    
}
