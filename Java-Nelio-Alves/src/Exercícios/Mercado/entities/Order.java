package Mercado.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Mercado.enums.OrderStatus;

public class Order {
    private LocalDate moment;
    private OrderStatus status;

    private Client client;
    private OrderItem orderItem;
    private List<OrderItem> items = new ArrayList<>();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public Order() {}

    public Order(LocalDate moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    };

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem orderItem : items) {
            sum =+ orderItem.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Resumo do Pedido:%nData e Hora: %s%n%Status: %s%n%s%n%s%n",
                                        moment.format(fmt),
                                        status,
                                        client,
                                        orderItem
                                        ));
        
        return sb.toString();
    }
    
    

    
}
