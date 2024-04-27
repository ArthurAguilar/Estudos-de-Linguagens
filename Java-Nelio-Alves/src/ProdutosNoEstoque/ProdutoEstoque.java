package ProdutosNoEstoque;

import java.util.Scanner;

import ProdutosNoEstoque.Entities.Produto;

public class ProdutoEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        Produto produto = new Produto();


        System.out.println("Entre os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();
        

        int qtdAdd;
        int qtdRem;
        System.out.print(produto);

        System.out.print("Gostaria de adicionar mais quantos produtos? ");
        qtdAdd = sc.nextInt();
        System.out.print(produto.addProduto(qtdAdd));


        System.out.print("Gostaria de remover quantos produtos? ");
        qtdRem = sc.nextInt();
        System.out.print(produto.removerProduto(qtdRem)); 


        sc.close();
    }

}
