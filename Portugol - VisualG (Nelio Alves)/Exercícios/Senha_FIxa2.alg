algoritmo "Senha"

var

senha,x  : inteiro

inicio

senha <- 2002

  repita
     escreval("Digite a senha: ")
     leia(x)
       se x <> senha entao
          escreval("Errouuu!")
       fimse
  ate x = senha
  
  se x = senha entao
     escreva("Acesso permitido!")
  fimse
  
fimalgoritmo
