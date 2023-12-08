algoritmo "Troco_Verificado"
var
preco, qtd, dinheiro, troco, resto : real
inicio
  escreval("Digite o preco do produto:")
  leia(preco)
  escreval("Digite a quantidade:")
  leia(qtd)
  escreval("Digite o valor pago pelo cliente:")
  leia(dinheiro)
  
  troco <- dinheiro - preco * qtd
  resto <- preco * qtd - dinheiro
  
        se preco*qtd > dinheiro entao
           escreval("Valor insuficiente para o pagamento, restam: R$", resto:8:2)
        senao
           escreval("O valor do troco é: R$", troco:8:2)
        fimse
        
fimalgoritmo
