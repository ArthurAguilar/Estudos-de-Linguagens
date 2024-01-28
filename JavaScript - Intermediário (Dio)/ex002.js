// Você terá 5 variáveis. Sendo elas:
// 1 - Preço do etanol;
// 2 - preco da gasolina;
// 3 - tipo de combustivel que está no seu carro;
// 4 - gasto médio de combustível do carro por KM;
// 5. distancia em KM da viagem;

//Imprima no console o valor que será gasto nesta viagem

const precoEtanol = 4.53;
const precoGasolina = 6.26;
const tipoCombustível = 'gasolina';
const kmPorLitro = 8.38;
const kmDistancia = 200;
let precoViagem;

if (tipoCombustível === 'gasolina') {
    precoViagem = (kmDistancia / kmPorLitro) * gasolina
} else {
    precoViagem = (kmDistancia / kmPorLitro) * etanol
}

console.log(precoViagem.toLocaleString('pt-br', {style: 'currency', currency: 'brl'}))
