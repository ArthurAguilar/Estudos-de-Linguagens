const precoCombustivel = 6;
const kmPorLitro = 13;
const kmDistancia = 992;

const precoViagem = (kmDistancia / kmPorLitro) * precoCombustivel

console.log(precoViagem.toLocaleString('pt-br', {style: 'currency', currency: 'brl'}))