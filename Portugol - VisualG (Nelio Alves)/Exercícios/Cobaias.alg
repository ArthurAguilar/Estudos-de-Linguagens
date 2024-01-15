algoritmo "Experiências"

var

teste, x, n, i, c, r, s, total : inteiro
tipo : caractere

inicio

 c <- 0
 r <- 0
 s <- 0
 total <- 0
 
  escreval("Quantos casos de teste serão digitados?")
  leia(n)
  
  para i de 1 ate n faca

     escreval("Quantidade de cobaias?")
     leia(x)
     escreval("Qual o tipo da cobaia?")
     leia(tipo)

     escolha tipo
        caso "c"
        c <- c + x
        caso "r"
        r <- r + x
        caso "s"
        s <- s + x
     fimescolha
  fimpara
  
  total <- c + s + r
  
  
  
  escreval("RELATÓRIO FINAL: ")
  escreval("TOTAL = ", total)
  escreval("TOTAL DE COELHOS: ", c)
  escreval("TOTAL DE RATOS ", r)
  escreval("TOTAL DE SAPOS ", s)
  escreval("Percentual de Coelhos: ", c / total * 100:4:2)
  escreval("Percentual de Ratos: ", r / total * 100:4:2)
  escreval("Percentual de Sapos: ", s / total * 100:4:2)
  
  

fimalgoritmo
