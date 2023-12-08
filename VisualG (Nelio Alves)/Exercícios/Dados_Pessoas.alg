algoritmo "Dados_Pessoas"

var

   n, i, h, m: inteiro
   gen: vetor[0..9] de caractere
   alt: vetor[0..9] de real
   contH, contM, soma1, soma2, media, mediaH, mediaM, maiorA, menorA: real
inicio

   escreva("Quantas pessoas serão digitadas? ")
   leia(n)

   para i de 0 ate n-1 faca
      escreva("Altura da", i+1, "ª pessoa: ")
      leia(alt[i])
      escreva("Gênero da", i+1, "ª pessoa: ")
      leia(gen[i])
   fimpara
   
   h <- 0
   m <- 0
   para i de 0 ate n-1 faca
       escolha gen[i]
       caso "h"
          h <- h + 1
       caso "m"
          m <- m + 1
       fimescolha
 fimpara

   maiorA <- alt[0]
   menorA <- alt[0]
   para i de 1 ate n-1 faca
      se alt[i] > maiorA entao
         maiorA <- alt[i]
      fimse
         
      se alt[i] < menorA entao
         menorA <- alt[i]
      fimse
   fimpara
      
   soma1 <- 0
   soma2 <- 0
   contH <- 0
   contM <- 0
   para i de 0 ate n-1 faca
      se gen[i] = "h" entao
         soma1 <- soma1 + alt[i]
         contH <- contH + 1
      fimse
      
      se gen[i] = "m" entao
         soma2 <- soma2 + alt[i]
         contM <- contM + 1
      fimse
   fimpara
   
   mediaH <- soma1 / contH
   mediaM <- soma2 / contM
   
   escreval
   escreval
   escreval("Menor altura = ", menorA)
   escreval("Maior altura = ", maiorA)
   escreval("Número de homens = ", h)
   escreval("Média das alturas dos homens = ", mediaH:3:2)
   escreval("Número de mulheres = ", m)
   escreval("Média das alturas das mulheres = ", mediaM:3:2)

   
   
   
   

fimalgoritmo
