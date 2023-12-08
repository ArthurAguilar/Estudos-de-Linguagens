algoritmo "Matriz_Geral"
// Função :
// Autor :
// Data : 23/06/2023
// Seção de Declarações 
var

   l, c, n, i, j: inteiro
   mat: vetor[0..2,0..2] de real
   soma: real

inicio

   escreva("Qual a ordem da matriz? ")
   leia(n)

   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         escreva("Elemento [", i:1, ",", j:1, "]: ")
         leia(mat[i,j])
      fimpara
   fimpara

   escreval

   //a) SOMA
   
   soma <- 0
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         se mat[i,j] > 0 entao
            soma <- soma + mat[i,j]
         fimse
      fimpara
   fimpara
   escreva("Soma dos Positivos = ", soma:2:1)
   escreval

   //b) SELEÇÃO DA LINHA
   
   escreval
   escreva("Escolha uma linha: ")
   leia(l)
   escreva("Linha escolhida = ")
      para i de 0 ate n-1 faca
         escreva(mat[l, i]:2:1, " ")
      fimpara
   escreval

   //c) SELEÇÃO DA COLUNA
   
   escreval
   escreva("Escolha uma coluna: ")
   leia(c)
   escreva("Coluna escolhida = ")
      para i de 0 ate n-1 faca
         escreva(mat[i,c]:2:1, " ")
      fimpara
   escreval
   
   //d) DIAGONAL PRINCIPAL
   
   escreval
   escreva("Diagonal Principal = ")
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         se i = j entao
            escreva(mat[i,j]:2:1, " ")
         fimse
      fimpara
   fimpara
   escreval
   
   //e) MATRIZ ALTERADA (ELEVADA AO ²)
   
   escreval
   escreval("Matriz Alterada: ")
   para i de 0 ate n-1 faca
      para j de 0 ate n-1 faca
         se mat[i,j] < 0 entao
            mat[i,j] <- mat[i,j] ^ 2
         fimse
         escreva(mat[i,j]:2:1, " ")
      fimpara
      escreval
   fimpara

   
   
   
fimalgoritmo
