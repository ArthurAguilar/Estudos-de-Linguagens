const carro = document.querySelector('#carro')
const btnDireito = document.querySelector('#btn_direita')
const btnEsquerdo = document.querySelector('#btn_esquerda')

let pos = 0

const init = () => {    
    carro.style = `position:relative;left:${pos}px`
}

btnDireito.addEventListener('click', () => {
    pos += 50
    carro.style = `position:relative;left:${pos}px`
})

btnEsquerdo.addEventListener('click', () => {
    pos -= 50
    carro.style = `position:relative;left:${pos}px`
})

window.onload = init