algoritmo "senha_fixa"

var

senhaV, senhaI: inteiro

inicio

senhaV <- 2002

  escreva("Digite a sua senha: ")
  leia(senhaI)
  
  enquanto senhaI <> senhaV faca
    escreva("Senha incorreta! Tente novamente: ")
    leia(senhaI)
  fimenquanto
  
  escreva("Acesso permitido!")
fimalgoritmo
