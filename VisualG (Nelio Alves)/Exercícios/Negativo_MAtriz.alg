algoritmo "Negativo_MAtriz"
// Função :
// Autor :
// Data : 23/06/2023
// Seção de Declarações 
var

   c, l, j, i: inteiro
   mat: vetor[0..2,0..2] de inteiro

inicio

   escreva("Qual a quantidade de linhas da matriz? ")
   leia(l)
   escreva("Qual a quantidade de colunas da matriz? ")
   leia(c)
   escreval
   
   para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
         escreva("Elemento [", i:1,",", j:1, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara
   
   escreval
   escreval("VALORES NEGATIVOS: ")
   para i de 0 ate l-1 faca
      para j de 0 ate c-1 faca
         se mat[i,j] < 0 entao
            escreval(mat[i,j])
         fimse
      fimpara
   fimpara
   
   
fimalgoritmo
