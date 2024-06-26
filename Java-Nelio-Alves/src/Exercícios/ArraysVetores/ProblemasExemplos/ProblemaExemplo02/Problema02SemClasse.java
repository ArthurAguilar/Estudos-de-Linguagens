package ArraysVetores.ProblemasExemplos.ProblemaExemplo02;

import java.util.Scanner;

public class Problema02SemClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos produtos serão adicionados? ");
        int qtdProdutos = sc.nextInt();

        String[] nomesProdutos = new String[qtdProdutos];
        double[] precosProdutos = new double[qtdProdutos];
        double somaTotal = 0;        
        for (int i = 0; i < qtdProdutos; i++) {
            System.out.print("Digite o nome do produto: ");
            nomesProdutos[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            precosProdutos[i] = sc.nextDouble();
            somaTotal += precosProdutos[i];
        }

        double mediaPrecos = somaTotal / qtdProdutos;
        System.out.printf("O preço médio dos produtos é R$%.2f", mediaPrecos);        
        sc.close();
    }
}
