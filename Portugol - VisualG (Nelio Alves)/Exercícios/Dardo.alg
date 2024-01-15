algoritmo "Dardo"
var
distancia1, distancia2, distancia3, maior: real
inicio
   escreval("Digite o valor da 1 distancia: ")
   leia(distancia1)
   escreval("Digite o valor da 2 distancia: ")
   leia(distancia2)
   escreval("Digite o valor da 3 distancia: ")
   leia(distancia3)
   
      se (distancia1 > distancia2) e (distancia1 > distancia3) entao
         maior <- distancia1
      senao
           se distancia2 > distancia3 entao
              maior <- distancia2
           senao
                maior <- distancia3
                fimse
           fimse

      escreva("A maior distancia arremessada foi: ", maior:6:2)

fimalgoritmo
