algoritmo "Valida��o de Nota"

var

x, y, media : real

inicio

 escreva("Digite a 1� nota: ")
 leia(x)

  enquanto (x < 0) ou (x > 10) faca
    escreva("Valor inv�lido! Tente novamente: ")
    leia(x)
  fimenquanto

 escreva("Digite a 2� nota: ")
 leia(y)

  enquanto (y < 0) ou (y > 10) faca
   escreva("Valor inv�lido! Tente novamente: ")
   leia(y)
  fimenquanto

   media <- (x + y) / 2

   escreva("M�DIA = ", media)
 
fimalgoritmo
