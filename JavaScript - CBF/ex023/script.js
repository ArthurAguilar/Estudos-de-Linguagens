const carro = document.querySelector('#carro')
const btnDireito = document.querySelector('#btn_direita')
const btnEsquerdo = document.querySelector('#btn_esquerda')
const btnParar = document.querySelector('#btn_parar')

let pos = 0
let animacao;
let larguraCarro = 100

const init = () => {    
    carro.style = `position:relative;left:${pos}px`
}

const animacaoEsquerda = () => {
    if (pos > 0) {
        pos -= 10
        carro.style = `position:relative;left:${pos}px`
        animacao = setTimeout(animacaoEsquerda, 20)
    }
    console.log('ok')
}

const animacaoDireita = () => {
    const limiteDireita = window.innerWidth - larguraCarro
    if (pos < limiteDireita) {
        pos += 10
        carro.style = `position:relative;left:${pos}px`
        animacao = setTimeout(animacaoDireita, 20)
    }
    console.log('ko')
}

btnEsquerdo.addEventListener('click', () => {
    clearTimeout(animacao)
    animacaoEsquerda()
})

btnDireito.addEventListener('click', () => {
    clearTimeout(animacao)
    animacaoDireita()
})

btnParar.addEventListener('click', () => {
    clearTimeout(animacao)
})

window.onload = init