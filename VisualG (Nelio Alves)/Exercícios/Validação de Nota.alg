algoritmo "Validação de Nota"

var

x, y, media : real

inicio

 escreva("Digite a 1ª nota: ")
 leia(x)

  enquanto (x < 0) ou (x > 10) faca
    escreva("Valor inválido! Tente novamente: ")
    leia(x)
  fimenquanto

 escreva("Digite a 2ª nota: ")
 leia(y)

  enquanto (y < 0) ou (y > 10) faca
   escreva("Valor inválido! Tente novamente: ")
   leia(y)
  fimenquanto

   media <- (x + y) / 2

   escreva("MÉDIA = ", media)
 
fimalgoritmo
