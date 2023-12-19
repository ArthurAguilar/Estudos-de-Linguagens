algoritmo "Divisão"

var

n, nmr, dnm, i : inteiro
r : real

inicio

  escreval("Quantos casos você vai digitar?")
  leia(n)
  
  
  para i de 1 ate n faca
    escreval("Entre com o numerador: ")
    leia(nmr)
    escreval("Entre com o denominador: ")
    leia(dnm)
    
      se dnm = 0 entao
         escreval("Divisão impossível!")
      senao
         r <- nmr / dnm
         escreval("RESULTADO = ", r:4:2)
      fimse
      

    
    fimpara
fimalgoritmo
