algoritmo "Retângulo"

var

   base, altura, area, perimetro, diagonal : real

inicio

   escreval("Digite a base do retângulo: ")
   leia(base)
   escreval("Digite a altura do retângulo: ")
   leia(altura)
   
   area <- base * altura
   perimetro <- 2*base + 2*altura
   diagonal <- raizq(Exp(base,2) + Exp(altura, 2))
   
   escreval("A área é:", area:8:4)
   escreval("O perímetro é:", perimetro:8:4)
   escreval("A diagonal é:", diagonal:8:4)
   



fimalgoritmo
