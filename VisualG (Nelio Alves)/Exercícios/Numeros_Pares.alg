algoritmo "Números_Pares"

var

n, i, soma: inteiro
x: vetor[0..9] de inteiro

inicio

 escreva("Quantos números serão calculados? ")
 leia(n)
 
 para i de 0 ate n-1 faca
    escreval("Digite um número: ")
    leia(x[i])
 fimpara
 
 escreval
 escreval("NÚMEROS PARES: ")
 
 soma <- 0
 para i de 0 ate n-1 faca
    se x[i] % 2 = 0 entao
       escreva(x[i], "  ")
       soma <- soma + 1
    fimse
 fimpara
 
 escreval
 escreval
 escreval("QUANTIDADE DE PARES = ", soma)
 
 fimalgoritmo
