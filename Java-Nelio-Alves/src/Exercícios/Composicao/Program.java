package Composicao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Composicao.entities.enums.OrderStatus;
import Composicao.entities.Client;
import Composicao.entities.Order;
import Composicao.entities.OrderItem;
import Composicao.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(sc.nextLine(), fmt);

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println();
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String statusOrder = sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(statusOrder.toUpperCase());
        
        Order order = new Order(LocalDateTime.now(), orderStatus, client);

        System.out.println();
        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numItems; i++) {
            System.out.printf("Enter #%d item data: %n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);            
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);        
        
        sc.close();
    }
}
