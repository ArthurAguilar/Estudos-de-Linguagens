package Aulas.Produtos;

import java.util.Scanner;

import Aulas.Produtos.entities.*;

public class AppProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Entre os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto meuProduto = new Produto(nome, preco, quantidade);
        
        System.out.print(meuProduto);
        meuProduto.getNome();
        meuProduto.setNome("Computador");
        meuProduto.getNome();
        
        System.out.print("Gostaria de adicionar mais quantos produtos? ");
        int qtdAdd= sc.nextInt();
        System.out.print(meuProduto.addProduto(qtdAdd));

        System.out.print("Gostaria de remover quantos produtos? ");
        int qtdRem = sc.nextInt();
        System.out.print(meuProduto.removerProduto(qtdRem)); 

        sc.close();
    }
}
