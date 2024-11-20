package Produtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Produtos.entities.ImportedProduct;
import Produtos.entities.Product;
import Produtos.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> prodList = new ArrayList<>();

        System.out.print("Quantos produtos serão adicionados? ");
        int totalProduct = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalProduct; i++) {
            System.out.printf("Dados do #%dº Produto: %n", i + 1);
            System.out.print("Comum, Usado ou Importado? (C/U/I): ");

            while (true) {
                String typeProd = sc.nextLine();
                char firstChar = Character.toUpperCase(typeProd.charAt(0));

                if (firstChar == 'C' || firstChar == 'U' || firstChar == 'I') {
                    System.out.print("Nome: ");
                    String prodName = sc.nextLine();
                    System.out.print("Preço: ");
                    Double prodPrice = sc.nextDouble();
                    sc.nextLine();

                    if (firstChar == 'U') {
                        System.out.print("Data de Fabricação (dd/mm/aaaa): ");
                        String manufDate = sc.nextLine();

                        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate manufDateFmt = LocalDate.parse(manufDate, fmt);
                        
                        prodList.add(new UsedProduct(prodName, prodPrice, manufDateFmt));
                        break;
                    } else if (firstChar == 'I') {
                        System.out.print("Valor da Taxa Alfandegária: R$");
                        Double alfanFee = sc.nextDouble();
                        sc.nextLine();
                        prodList.add(new ImportedProduct(prodName, prodPrice, alfanFee));
                        break;
                    } else {
                        prodList.add(new Product(prodName, prodPrice));
                        break;
                    }
                    
                } else {
                    System.out.println("Tente novamente: Comum, Usado ou Importado? (C/U/I): ");
                }
            }
        }

        System.out.println();
        System.out.println("Etiquetas de Preço: ");
        for (Product product : prodList) {
            System.out.println(product.pricetag());
        }

        sc.close();
    }
}
