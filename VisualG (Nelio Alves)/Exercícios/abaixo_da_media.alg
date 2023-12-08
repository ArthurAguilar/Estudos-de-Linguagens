algoritmo "Abaixo_da_Média"

var

n, i: inteiro
x: vetor[0..9] de real
media, soma: real
inicio

  escreva("Quantos elementos vai ter o vetor? ")
  leia(n)
  
  para i de 0 ate n-1 faca
     escreva("Digite o", i+1, "° número: ")
     leia(x[i])
  fimpara
  
  soma <- 0
  para i de 0 ate n-1 faca
     soma <- soma + x[i]
  fimpara
  
  media <- soma / n
  escreval("MÉDIA DO VETOR = ", media:4:3)
  escreval("ELEMENTOS ABAIXO DA MÉDIA: ")
  para i de 0 ate n-1 faca
     se x[i] < media entao
        escreval(x[i]:4:1)
     fimse
  fimpara
  

     

fimalgoritmo
