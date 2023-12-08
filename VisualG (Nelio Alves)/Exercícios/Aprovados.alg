algoritmo "Aprovados"

var

   n, i, aprovados: inteiro
   nome: vetor[0..9] de caractere
   nota1, nota2: vetor[0..9] de real
   media: real


inicio

   escreva("Quantos alunos serão digitados? ")
   leia(n)
   
   para i de 0 ate n-1 faca
      escreval("Digite o nome, 1ª e 2ª nota do", i+1, "° aluno")
      leia(nome[i])
      leia(nota1[i])
      leia(nota2[i])
   fimpara
   
   aprovados <- 0
   escreval("Alunos aprovados: ")
   para i de 0 ate n-1 faca
        media <- (nota1[i] + nota2[i]) / 2
        se media >= 6 entao
           aprovados <- i
           escreval(nome[aprovados])
        fimse
   fimpara
   

   


fimalgoritmo
