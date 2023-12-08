algoritmo "Coordenadas"

var

   x, y: real
   q : caractere
inicio

  escreva("Valor de X: ")
  leia(x)
  escreva("Valor de Y: ")
  leia(y)
  
  se (x > 0) e (y > 0) entao
     q <- "Q1"
  senao
       se (x > 0) e (y < 0) entao
          q <- "Q4"
       senao
            se (x < 0) e (y > 0) entao
               q <- "Q2"
             senao
                  se (x = 0) e (y = 0) entao
                     q <- "ORIGEM"
                  senao
                       se (x < 0) e (y < 0) entao
                          q <- "Q3"
                       senao
                            se x = 0 entao
                               escreval("Eixo Y")
                            senao
                                 escreval("Eixo X")
                            fimse
                       fimse
                  fimse
             fimse
       fimse
  fimse
  
  escreva(q)
fimalgoritmo
