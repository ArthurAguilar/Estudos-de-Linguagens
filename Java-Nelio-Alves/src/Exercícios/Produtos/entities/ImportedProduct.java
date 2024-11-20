package Produtos.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String pricetag() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - R$%.2f (Taxa Alfandegária: R$%.2f)", getName(), getPrice(), getCustomsFee()));
        return sb.toString();
    }


    

}
