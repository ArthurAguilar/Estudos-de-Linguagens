algoritmo "Ret�ngulo"

var

   base, altura, area, perimetro, diagonal : real

inicio

   escreval("Digite a base do ret�ngulo: ")
   leia(base)
   escreval("Digite a altura do ret�ngulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- 2*base + 2*altura
   diagonal <- raizq(Exp(base,2) + Exp(altura, 2))
   
   escreval("A �rea �:", area:8:4)
   escreval("O per�metro �:", perimetro:8:4)
   escreval("A diagonal �:", diagonal:8:4)
   



fimalgoritmo
