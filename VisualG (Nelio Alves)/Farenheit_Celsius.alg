algoritmo "Temperatura"
var
fahrenheit, celsius: real
temperatura: caracter
inicio
   escreva("Temperatura em qual escala (C/F)? ")
   leia(temperatura)
   
      se temperatura = "F" entao
         escreva("Digite a temperatura em Fahrenheit: ")
         leia(fahrenheit)
         celsius <- 5/9 * (fahrenheit - 32)
         escreva("Temperatura equivalente em Celsius: ", celsius:4:2)
      senao
           escreva("Digite a temperatura em Celsius: ")
           leia(celsius)
           fahrenheit <- (9/5) * celsius + 32
           escreva("Temperatura equivalente em Fahrenheit: ", fahrenheit:4:2)
           fimse

      
fimalgoritmo
