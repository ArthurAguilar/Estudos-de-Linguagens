package Aulas.Enumeracao.entities;

import Aulas.Enumeracao.entities.enums.OrderStatus;

public class Order {
    
    private int id;
    private String moment;
    private OrderStatus status;
    
    public Order(int id, String moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Ordem [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
    
}
