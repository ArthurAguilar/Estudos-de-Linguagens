algoritmo "Acima_Diagonal"
// Função :
// Autor :
// Data : 23/06/2023
// Seção de Declarações 
var

n, i, j, soma: inteiro
mat: vetor[0..3,0..3] de inteiro

inicio

   escreva("Qual a ordem da matriz? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         escreva("Elemento [", i:1, ",", j:1, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara
   
    soma <- 0
    para i de 0 ate n-1 faca
       para j de 0 ate n-1 faca
          se j > i entao
             soma <- soma + mat[i,j]
          fimse
       fimpara
    fimpara

    escreval
    escreva("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)
    
    
fimalgoritmo
