algoritmo "Alturas"

var

 n, i, cont, x: inteiro
 nome: vetor[0..9] de caractere
 idade: vetor[0..9] de inteiro
 altura: vetor[0..9] de real
 soma, media, porcentagem : real
inicio

   escreva("Quantas pessoas serão digitadas? ")
   leia(n)

   para i de 1 ate n faca
      escreval("Dados da ", i ,"ª pessoa: ")
      escreva("Nome: ")
      leia(nome[i])
      escreva("Idade: ")
      leia(idade[i])
      escreva("Altura: ")     .
      leia(altura[i])
   fimpara
   
   soma <- 0
   para i de 1 ate n faca
      soma <- soma + altura[i]
   fimpara
   
   media <- soma / n
   
   cont <- 0
   para i de 1 ate n faca
        se idade[i] < 16 entao
           cont <- cont + 1
        fimse
   fimpara
   
   porcentagem <- (cont * 100) / n
   


   
   escreval("*********************************************************")
   
   escreval("ALTURA MÉDIA = ", media:4:2)
   escreval("MENOS DE 16 ANOS = ", porcentagem:4:2, "%")
   escreva("NOMES = ")
   para i de 1 ate n faca
        se idade[i] < 16 entao
           escreva(nome[i], " - ")
        fimse
   fimpara

   
   
   

   
   
   

   
   
   
   
fimalgoritmo
