algoritmo "Par_Impar"

var

  n, x, i: inteiro

inicio

  escreval("Quantos n�meros voc� vai digitar?")
  leia(n)
  
  para i de 1 ate n faca
  escreval("Digite um n�mero: ")
  leia(x)
  
     se x = 0 entao
        escreval("NULO!")
     senao
        se x % 2 = 0 entao
           se x > 0 entao
              escreval("Par - Positivo!")
           senao
              escreval("Par - Negativo!")
           fimse
        senao
           se x % 2 <> 0 entao
              se x > 0 entao
                 escreval("Impar - Positivo!")
              senao
                 escreval("Impar - Negativo!")
              fimse
           fimse
        fimse
     fimse
  fimpara
  
fimalgoritmo
