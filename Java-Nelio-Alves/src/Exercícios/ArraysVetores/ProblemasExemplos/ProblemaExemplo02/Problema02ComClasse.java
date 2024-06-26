package ArraysVetores.ProblemasExemplos.ProblemaExemplo02;
import java.util.Scanner;
import ArraysVetores.ProblemasExemplos.ProblemaExemplo02.Entities.Produtos;

public class Problema02ComClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos produtos serão adicionados? ");
        int qtdProdutos = sc.nextInt();
        sc.nextLine();
        Produtos[] vetorProdutos = new Produtos[qtdProdutos];

        double somaTotalPrecos = 0;
        double mediaTotalPrecos = 0;
        for (int i = 0; i < qtdProdutos; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Digite o preço do " + (i + 1) +  "º produto: ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();
            vetorProdutos[i] = new Produtos(nomeProduto, precoProduto);
            somaTotalPrecos += precoProduto;
        }

        System.out.println("\nProdutos adicionados: ");

        for (Produtos produto : vetorProdutos) {
            System.out.printf("Nome: %s, Preço: %.2f%n", produto.getNome(), produto.getPreco());
        }
        
        mediaTotalPrecos = somaTotalPrecos / qtdProdutos;
        System.out.printf("\nA média total dos preços é R$%.2f", mediaTotalPrecos);

        sc.close();
    }
}
