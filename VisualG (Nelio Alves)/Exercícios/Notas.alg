algoritmo "Se..então"
var
   a, b, c, menor : inteiro
inicio
   escreval("Digite o 1°valor:")
   leia(a)
   escreval("Digite o 2°valor:")
   leia(b)
   escreval("Digite o 3°valor:")
   leia(c)

  se (a < b) e (a < c) entao
      menor <- a
  senao
    se (b < a) e (b < c) entao
      menor <- b
    senao
      menor <- c
    fimse
  fimse

   escreval("O menor valor dos 3 é: ", menor)
   
   
fimalgoritmo
