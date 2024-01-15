algoritmo "Media_pares"

var

n, i, cont: inteiro
vet: vetor[0..9] de inteiro
media, soma: real

inicio

  escreva("Quantos elementos vai ter o vetor? ")
  leia(n)
  
  para i de 0 ate n-1 faca
     escreva("Digite o", i+1, "° número: ")
     leia(vet[i])
  fimpara
  
  soma <- 0
  cont <- 0
  para i de 0 ate n-1 faca
     se vet[i] % 2 = 0 entao
        soma <- soma + vet[i]
        cont <- cont + 1
     fimse
  fimpara
  
  se cont = 0 entao
     escreva("NENHUM NÚMERO PAR!")
  senao
     media <- soma / cont
     escreval("MÉDIA DOS PARES = ", media:3:1)
  fimse
  
  
  

  
  
  

fimalgoritmo
