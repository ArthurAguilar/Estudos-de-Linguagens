algoritmo "Impar_Par"

var

n, i, x : inteiro

inicio

 escreval("Quantos n�meros ser�o adicionados?")
 leia(n)

 para i de 1 ate n faca
 escreval("Digite um n�mero :")
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
