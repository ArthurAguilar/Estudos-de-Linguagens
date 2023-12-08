algoritmo "Cada_Linha"
// Função :
// Autor :
// Data : 23/06/2023
// Seção de Declarações 
var

   n, i, j, maior: inteiro
   mat: vetor[0..3,0..3] de inteiro
   

inicio

   escreva("Qual a ordem da matriz? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         escreva("Elemento [", i:1, ",", j:1, "]: ")
         leia (mat[i,j])
      fimpara
   fimpara
   
   escreval
   escreval("Maior elemento de cada linha: ")
   para i de 0 ate n-1 faca
      maior <- mat[i,0]
      para j de 0 ate n-1 faca
         se mat[i,j] > maior entao
            maior <- mat[i,j]
         fimse
      fimpara
     escreval(maior)
   fimpara
   


   


   
   
fimalgoritmo
