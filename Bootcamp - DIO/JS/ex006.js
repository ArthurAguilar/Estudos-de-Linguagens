// Exercício Pagamentos com 'functions'

function valorDesconto(valor, desconto) {
    return valor - (valor * (desconto / 100))
}

function valorJuros(valor, juros) {
    return valor + (valor * juros/100)
}

formaPagamento = '5x'
precoProduto = 100
let valorFinal

if (formaPagamento == 'debito') {
    valorFinal = valorDesconto(precoProduto, 10)
}else if (formaPagamento =='dinheiro' || formaPagamento =='pix'){
    valorFinal = valorDesconto(precoProduto, 15)
}else if (formaPagamento == '2x') {
    valorFinal = precoProduto
} else {
    valorFinal = valorJuros(precoProduto, 10)
}

console.log(`Seu produto ficou em ${valorFinal.toLocaleString('pt-br', {style: 'currency', currency: 'brl'})}, volte sempre!`)