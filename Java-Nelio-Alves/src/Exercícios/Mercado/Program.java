package Mercado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Mercado.entities.OrderItem;
import Mercado.entities.Client;
import Mercado.entities.Order;
import Mercado.entities.Product;
import Mercado.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento: ");
        LocalDate birth = LocalDate.parse(sc.nextLine(), fmt);

        Client client = new Client(nome, email, birth);

        // ------------------------------------------------------

        System.out.println("Status do Pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        LocalDateTime dateNow = LocalDateTime.now();

        Order order = new Order(dateNow, status, client);

        System.out.print("Quantos items neste pedido? ");
        int item = sc.nextInt();
        sc.nextLine(); // Limpa o buffer após nextInt()

        for (int i = 0; i < item; i++) {
            System.out.printf("Adicione os dados do #%d pedido:%n", i + 1);
            System.out.print("Nome do Produto: ");
            String productName = sc.nextLine(); // Agora captura corretamente
            System.out.print("Preço: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int productQtt = sc.nextInt();
            sc.nextLine(); // Limpa o buffer após nextInt()

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQtt, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
