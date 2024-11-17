package Mercado.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;
    
    public OrderItem() {}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(Integer quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity (Integer quantity) {
        this.quantity -= quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%nProduto: %s%nPreço: %.2f%nQuantidade: %d%nTotal: %.2f%n",
                                            product.getName(),
                                            price,
                                            quantity,
                                            subTotal()));
        return sb.toString();
    } 

    
    
}
