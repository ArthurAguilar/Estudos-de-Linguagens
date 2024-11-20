package Produtos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct() {
    super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String pricetag() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (usado) - R$%.2f (Fabricação: %s)", getName(), getPrice(), getManufactureDate().format(fmt)));
        return sb.toString();
    }    
}
