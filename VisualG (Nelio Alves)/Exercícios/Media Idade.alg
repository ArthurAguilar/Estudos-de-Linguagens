algoritmo "Media_Idade"

var

  idade, qtd, soma: inteiro
  media: real

inicio

  escreval("Digite as idades: ")
  leia(idade)
  
  soma <- 0
  qtd <- 0
  
  enquanto idade >= 0 faca
    qtd <- qtd + 1
    soma <- soma + idade
    leia(idade)
  fimenquanto

  se qtd = 0 entao
    escreva("Impossível calcular, meu jovem!")
  senao
    media <- soma / qtd
    escreva("MEDIA = ", media:4:2)
  fimse
fimalgoritmo
