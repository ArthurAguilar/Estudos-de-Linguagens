package Produtos.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double precoTotalEstoque() {
        return quantidade * preco;
    }

    public String addProduto(int qtd) {
        this.quantidade += qtd;
        return String.format("\nDados atualizados:\n %s, R$%.2f, %d unidades, total no estoque: R$%.2f\n\n", nome, preco, quantidade, precoTotalEstoque());
    }
    

    public String removerProduto(int qtd) {
        this.quantidade -= qtd;
        return String.format("\nDados atualizados:\n %s, R$%.2f, %d unidades, total no estoque: R$%.2f\n\n", nome, preco, quantidade, precoTotalEstoque());
    }

    public String toString() {
        return String.format("\nDados do produto:\n %s, R$%.2f, %d unidades, total no estoque: R$%.2f\n\n", nome, preco, quantidade, precoTotalEstoque());
    }
}

