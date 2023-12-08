algoritmo "Impar_Par"

var

n, i, x : inteiro

inicio

 escreval("Quantos números serão adicionados?")
 leia(n)

 para i de 1 ate n faca
 escreval("Digite um número :")
 leia(x)
  
  se x = 0 entao
     escreval("Nulo")
  senao
    se x % 2 = 0 entao
      se x > 0 entao
        escreval("Par - Positivo")
      senao
        escreval("Par - Negativo")
      fimse
    senao
      se x > 0 entao
        escreval("Impar - Positivo")
      senao
        escreval("Impar - Negativo")
      fimse
    fimse
  fimse
 fimpara
fimalgoritmo
