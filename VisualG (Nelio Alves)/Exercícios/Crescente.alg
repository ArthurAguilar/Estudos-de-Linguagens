algoritmo "Crescente"

var

x, y: inteiro

inicio

  escreval("Digite dois n�meros: ")
  leia(x)
  leia(y)
  
  enquanto x <> y faca
  
    se x > y entao
      escreval("Decrescente!")
      escreval("Digite outros dois n�meros: ")
      leia(x)
      leia(y)
    senao
      escreval("Crescente!")
      escreval("Digite outros dois n�meros: ")
      leia(x)
      leia(y)
    fimse
    
  fimenquanto
fimalgoritmo
