algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 26/05/2023
// Se��o de Declara��es 
var

largura, comprimento, m2, area, preco : real

inicio
escreva("Digite a largura do terreno: ")
   leia(largura)
   escreva("Digite o comprimento do terreno: ")
   leia(comprimento)
   escreva("Digite o pre�o do m2 do terreno: ")
   leia(m2)

    area <- largura * comprimento
    preco <- area * m2

    escreval("�rea do Terreno: ", area)
    escreval("Pre�o do Terreno: ", preco)
fimalgoritmo
