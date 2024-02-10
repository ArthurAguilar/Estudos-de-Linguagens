const resultado = document.querySelector('#res')
const btnSoma = document.querySelector('#btn_soma')
const btnSubt = document.querySelector('#btn_subtracao')
const btnMult = document.querySelector('#btn_multiplicacao')
const btnDiv = document.querySelector('#btn_divisao')

const operacoesMatematicas = [
    () => {
        const primeiroValor = parseFloat(document.querySelector('#valor1').value);
        const segundoValor = parseFloat(document.querySelector('#valor2').value);
        resultado.value = primeiroValor + segundoValor;
    },
    () => {
        const primeiroValor = parseFloat(document.querySelector('#valor1').value);
        const segundoValor = parseFloat(document.querySelector('#valor2').value);
        resultado.value = primeiroValor - segundoValor;
    },
    () => {
        const primeiroValor = parseFloat(document.querySelector('#valor1').value);
        const segundoValor = parseFloat(document.querySelector('#valor2').value);
        resultado.value = primeiroValor * segundoValor;
    },
    () => {
        const primeiroValor = parseFloat(document.querySelector('#valor1').value);
        const segundoValor = parseFloat(document.querySelector('#valor2').value);
        resultado.value = primeiroValor / segundoValor;
    }
];

btnSoma.addEventListener('click', operacoesMatematicas[0])
btnSubt.addEventListener('click', operacoesMatematicas[1])
btnMult.addEventListener('click', operacoesMatematicas[2])
btnDiv.addEventListener('click', operacoesMatematicas[3])

