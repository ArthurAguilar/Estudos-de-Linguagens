algoritmo "Lanchonete"
var
codigo, qtd : inteiro
preco,pagamento: real
inicio
escreva("Digite o código do produto: ")
leia(codigo)
escreva("Digite a quantidade: ")
leia(qtd)

   escolha codigo
      caso 1
         preco <- 5.00
      caso 2
         preco <- 3.50
      caso 3
         preco <- 4.80
      caso 4
         preco <- 8.90
      caso 5
         preco <- 7.32
      outrocaso
         escreva("Código inválido, meu chapa!")
   fimescolha
   
    pagamento <- preco * qtd
       se codigo <= 5 entao
       escreva("O valor a pagar é: R$", pagamento:8:2)
    fimse

fimalgoritmo
