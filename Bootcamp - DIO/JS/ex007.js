/* 
    1. Crie uma classe para reprsentar carros.

    Os carros possuem uma marca, uma cor e um gasto médio por Km.
    Crie um método que dado a quantidade de kms e o preço do combustível, nos dê o valor gasto em reais para realizar este percurso
*/

class Carro {
    marca;
    cor;
    kmPorLitro;

    constructor(marca, cor, kmPorLitro) {
        this.marca = marca
        this.cor = cor
        this.kmPorLitro = kmPorLitro
    }

    valorGasto(distancia, precoCombustivel) {
        return (distancia / this.kmPorLitro) * precoCombustivel
    }
}

const meuCarro = new Carro('Toyota', 'Preto', 10)
console.log(meuCarro.valorGasto(10, 15).toLocaleString('pt-br', {style: 'currency', currency: 'brl'}))