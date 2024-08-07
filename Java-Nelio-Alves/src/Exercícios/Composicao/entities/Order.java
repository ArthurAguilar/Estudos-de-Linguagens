package Composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Composicao.entities.enums.OrderStatus;

public class Order {
    
    private LocalDateTime orderMoment;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> listItems = new ArrayList<>();
    

    public Order(){}

    public Order(LocalDateTime orderMoment, OrderStatus orderStatus, Client client) {
        this.orderMoment = orderMoment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public LocalDateTime getOrderMoment() {
        return orderMoment;
    }

    public void setOrderMoment(LocalDateTime orderMoment) {
        this.orderMoment = orderMoment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        listItems.add(item);
    }

    public void removeItem(OrderItem item) {
        listItems.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        sb.append(String.format("ORDER SUMMARY:%nOrder moment: %s%nOrder status: %s%nClient: %s (%s) - %s%nOrder items:%n", 
                                orderMoment.format(fmt2), 
                                orderStatus, 
                                client.getName(),
                                client.getBirthDate().format(fmt1),
                                client.getEmail()));

        for (OrderItem item : listItems) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }    
}
