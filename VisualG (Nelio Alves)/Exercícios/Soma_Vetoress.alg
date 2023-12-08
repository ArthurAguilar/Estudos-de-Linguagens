algoritmo "Soma_Vetores"

var

n, i, soma: inteiro
vet1, vet2: vetor[0..9] de inteiro

inicio

 escreva("Quantos valores vai ter cada vetor? ")
 leia(n)
 
    escreval("Digite os valores do Vetor A: ")
    para i de 0 ate n-1 faca
       leia(vet1[i])
    fimpara
 
    escreval("Digite os valores do Vetor B: ")
    para i de 0 ate n-1 faca
       leia(vet2[i])
    fimpara
    
    escreval
    escreval("VETOR RESULTANTE: ")
    para i de 0 ate n-1 faca
       soma <- vet1[i] + vet2[i]
       escreval(soma)
    fimpara





 


fimalgoritmo
