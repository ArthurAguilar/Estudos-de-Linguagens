package Employees.entities;

public class Outsourced extends Employee {
    private Double additionalCharge;

    public Outsourced() {
        super();
    }
    
    public Outsourced(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payments() {
        return super.payments() + additionalCharge * 1.1;
    }

    

}
