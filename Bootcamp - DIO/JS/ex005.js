/*
    Formas de Pagamento

        debito = 10% de desconto
        dinheiro/pix = 15% de desconto
        2x = preço normal
        acima de 2x = juros de 10%
*/

const precoProduto = 10
const formaPagamento = 'pix'
let valorFinal;

if (formaPagamento == 'debito') {
    let desconto = precoProduto * 0.1;
    valorFinal = precoProduto - desconto
}else if (formaPagamento =='dinheiro' || formaPagamento == 'pix'){
    let desconto = precoProduto * 0.15;
    valorFinal = precoProduto - desconto
}else if (formaPagamento == '2x') {
    valorFinal = precoProduto
} else {
    acrescimo = precoProduto * 1.1
    valorFinal = precoProduto + acréscimo
}

console.log(`Seu produto ficou em ${valorFinal.toLocaleString('pt-br', {style: 'currency', currency: 'brl'})}, volte sempre!`)