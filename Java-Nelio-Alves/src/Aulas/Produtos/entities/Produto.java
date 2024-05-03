package Aulas.Produtos.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        System.out.println(nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        System.out.println(preco);
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantitade() {
        System.out.println(quantidade);
        return quantidade;
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

