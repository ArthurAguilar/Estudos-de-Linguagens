package Aulas.DesignPattern.FactoryMethod;

public class Produtos {

    private String nome;
    private String descricao;
    private float preco;
    private boolean possuiDimensaoFisica;

    public Produtos() {
    }

    public void setPossuiDimensaoFisica(boolean possuiDimensaoFisica) {
        this.possuiDimensaoFisica = possuiDimensaoFisica;
    }

    @Override
    public String toString() {
        return "Produtos [nome=" + nome + 
        ", descricao=" + descricao + 
        ", preco=" + preco + 
        ", possuiDimensaoFisica=" + possuiDimensaoFisica + "]";
    }
}
