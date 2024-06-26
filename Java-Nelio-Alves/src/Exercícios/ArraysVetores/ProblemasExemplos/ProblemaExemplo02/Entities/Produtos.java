package ArraysVetores.ProblemasExemplos.ProblemaExemplo02.Entities;

public class Produtos {
    private String nome;
    private double preco;    
    
    public Produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produtos [nome=" + nome + ", preco=" + preco + "]";
    }

}
