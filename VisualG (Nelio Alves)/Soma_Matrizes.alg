algoritmo "Soma_Matrizes"
// Função :
// Autor :
// Data : 23/06/2023
// Seção de Declarações 
var

   l, c, i, j : inteiro
   matA: vetor[0..2,0..2] de inteiro
   matB: vetor[0..2,0..2] de inteiro
   matC: vetor[0..2,0..2] de inteiro
   
inicio

   escreva("Quantas linhas vai ter cada matriz? ")
   leia(l)
   escreva("Quantas colunas vai ter cada matriz? ")
   leia(c)
   
   escreval("Digite os valores da matriz A: ")
   para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
         escreva("Elemento [", i:1, ",", j:1, "]: ")
         leia(matA[i,j])
      fimpara
   fimpara
   
   escreval("Digite os valores da matriz B: ")
   para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
         escreva("Elemento [", i:1, ",", j:1, "]: ")
         leia(matB[i,j])
      fimpara
   fimpara
   
   escreval
   escreval("MATRIZ SOMA: ")
   para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
         matC[i,j] <- matA[i,j] + matB[i,j]
         escreva(matC[i,j])
      fimpara
      escreval
   fimpara
   
fimalgoritmo
