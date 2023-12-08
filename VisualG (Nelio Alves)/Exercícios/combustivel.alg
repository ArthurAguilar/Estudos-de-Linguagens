algoritmo "Combustivel"

var

codigo, alcool, gasolina, diesel : inteiro

inicio

alcool <- 0
gasolina <- 0
diesel <- 0

  escreva("Informe um código (1, 2, 3) ou 4 para parar: ")
  leia(codigo)
  
   enquanto (codigo >= 1) e (codigo < 4) faca

     escolha codigo
     caso 1
       alcool <- alcool + 1
     caso 2
       gasolina <- gasolina + 1
     caso 3
       diesel <- diesel + 1
     caso 4
     fimescolha

     escreva("Continue: ")
     leia(codigo)
     
   fimenquanto
     
     
       escreval("Muito obrigado, volte sempre!")
       escreval("Alcool = ",alcool)
       escreval("Gasolina = ", gasolina)
       escreval("Diesel = ", diesel)

     


  
  

fimalgoritmo
