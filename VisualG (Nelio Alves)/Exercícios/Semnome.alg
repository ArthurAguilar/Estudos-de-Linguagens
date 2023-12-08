algoritmo "semnome"
// Função :
// Autor :
// Data : 26/05/2023
// Seção de Declarações 
var

largura, comprimento, m2, area, preco : real

inicio
escreva("Digite a largura do terreno: ")
   leia(largura)
   escreva("Digite o comprimento do terreno: ")
   leia(comprimento)
   escreva("Digite o preço do m2 do terreno: ")
   leia(m2)

    area <- largura * comprimento
    preco <- area * m2

    escreval("Área do Terreno: ", area)
    escreval("Preço do Terreno: ", preco)
fimalgoritmo
