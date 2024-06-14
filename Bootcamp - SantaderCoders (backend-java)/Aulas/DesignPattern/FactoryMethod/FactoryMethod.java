package Aulas.DesignPattern.FactoryMethod;

public class FactoryMethod {

    public static Produtos getInstance(TiposProdutosEnum tiposProdutosEnum){

        switch(tiposProdutosEnum) {

            case FISICO:
                ProdutosFisicos produtoFisico = new ProdutosFisicos();
                produtoFisico.setPossuiDimensaoFisica(true);
                return produtoFisico;

            case DIGITAL:
                ProdutosFisicos produtoDigital = new ProdutosFisicos();
                produtoDigital.setPossuiDimensaoFisica(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto inválido");
        }
    }
}
