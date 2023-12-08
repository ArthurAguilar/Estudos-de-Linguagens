algoritmo "Dentro_Fora"

var

x, y, i, dentro, fora : inteiro

inicio

   escreval("Quantos números você vai digitar?")
   leia(x)
   
   dentro <- 0
   fora <- 0
   
   para i de 1 ate x faca
      escreval("Digite um número: ")
      leia(y)
      
        se (y >= 10) e (y <= 20) entao
           dentro <- dentro + 1
        senao
           fora <- fora + 1
        fimse
        
   fimpara
   
   escreval(dentro, " DENTRO")
   escreval(fora, " FORA")


fimalgoritmo
