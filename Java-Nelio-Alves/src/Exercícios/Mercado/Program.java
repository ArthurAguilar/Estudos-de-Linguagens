package Mercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Composicao.entities.Client;
import Mercado.entities.Product;

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

        //------------------------------------------------------
        
        System.out.print("Quantos items neste pedido? ");
        int item = sc.nextInt();

        for (int i = 0; i < item; i++) {
            System.out.printf("Adicione os dados do #%d pedido: ", i + 1);
            System.out.print("Nome do Produto: ");
            String productName = sc.nextLine();
            System.out.print("Preço: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int productQtt = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);

            

            

        }





        sc.close();
    }
}
