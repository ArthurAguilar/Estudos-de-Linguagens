algoritmo "Tempo de Jogos"

var

  i, f, duracao : inteiro
  
inicio

  escreva("Hora inicial: ")
  leia(i)
  escreva("Hora final: ")
  leia(f)
  
  se i > f entao
   duracao <- 24 - i + f
  senao
     duracao <- f - i
  fimse
  
  escreva("O jogo durou: ", duracao, " hora(s)")
fimalgoritmo
