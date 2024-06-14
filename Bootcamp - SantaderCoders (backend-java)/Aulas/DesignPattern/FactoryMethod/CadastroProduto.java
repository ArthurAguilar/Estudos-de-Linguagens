package Aulas.DesignPattern.FactoryMethod;

public class CadastroProduto {
    
    public static void main(String[] args) {
        
        ProdutosFisicos produto1 = new ProdutosFisicos();
        produto1.setPossuiDimensaoFisica(true);
        System.out.println(produto1);

        ProdutosDigitais produto2 = new ProdutosDigitais();
        produto2.setPossuiDimensaoFisica(false);
        System.out.println(produto2);
        

        Produtos produto3 = FactoryMethod.getInstance(TiposProdutosEnum.DIGITAL);
        Produtos produto4 = FactoryMethod.getInstance(TiposProdutosEnum.FISICO);
        Produtos produto5 = FactoryMethod.getInstance(TiposProdutosEnum.FISICO);

        System.out.println(produto3);
        System.out.println(produto4);    
        System.out.println(produto5);

    }
    
}
