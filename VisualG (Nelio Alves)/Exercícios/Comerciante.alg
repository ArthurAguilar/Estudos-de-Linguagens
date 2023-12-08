algoritmo "Comerciante"

var

n, i: inteiro
compra, venda: vetor[0..9] de real
nome: vetor[0..9] de caractere
lucroTotal, valorV, valorC, lucro, percL, acima, abaixo, entre: real

inicio

   escreva("Serão digitados dados de quantos produtos? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("**", i+1, "° Produto **")
      escreva("Nome = ")
      leia(nome[i])
      escreva("Preço de compra = ")
      leia(compra[i])
      escreva("Preço de venda = ")
      leia(venda[i])
   fimpara
   
   lucroTotal <- 0
   valorV <- 0
   valorC <- 0
   para i de 0 ate n-1 faca
      lucroTotal <- lucroTotal + (venda[i] - compra[i])
      valorV <- valorV + venda[i]
      valorC <- valorC + compra[i]
   fimpara
   
   abaixo <- 0
   entre <- 0
   acima <- 0
   para i de 0 ate n-1 faca
      lucro <- venda[i] - compra[i]
      percL <- (lucro * 100) / compra[i]
      
      se percL < 10 entao
         abaixo <- abaixo + 1
      senao
         se percL <= 20 entao
            entre <- entre + 1
         senao
            acima <- acima + 1
         fimse
      fimse
   fimpara
   
   escreval
   escreval("*****RELATÓRIO*****")
   escreval("COMPRA TOTAL = ", valorC:4:2)
   escreval("VENDA TOTAL = ", valorV:4:2)
   escreval("LUCRO TOTAL = ", lucroTotal:4:2)
   escreval
   escreval("LUCRO ABAIXO DE 10% = ", abaixo)
   escreval("LUCRO ENTRE 10 E 20% = ", entre)
   escreval("LUCRO ACIMA DE 20% = ", acima)
   

fimalgoritmo
