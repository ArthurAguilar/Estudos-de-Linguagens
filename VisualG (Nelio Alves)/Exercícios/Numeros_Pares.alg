algoritmo "N�meros_Pares"

var

n, i, soma: inteiro
x: vetor[0..9] de inteiro

inicio

 escreva("Quantos n�meros ser�o calculados? ")
 leia(n)
 
 para i de 0 ate n-1 faca
    escreval("Digite um n�mero: ")
    leia(x[i])
 fimpara
 
 escreval
 escreval("N�MEROS PARES: ")
 
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
