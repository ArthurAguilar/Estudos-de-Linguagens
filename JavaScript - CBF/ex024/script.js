const carro = document.querySelector('#carro')
const btnPlay = document.querySelector('#btn_esquerda')
const btnStop = document.querySelector('#btn_direita')

let pos = 0
let animacao;
let widthCarro = 100
let heightCarro = 40

const init = () => {    
    carro.style = `position:relative;left:${pos}px;width:${widthCarro}; height:${heightCarro}`
}
window.onload = init


const animacaoCarro = () => {
    const tamanhoMax = window.innerWidth - widthCarro
    const tamanhoMin = 0

    if (parseInt(carro.style.left) >= tamanhoMax) {
        pos = -1
    } else if (parseInt(carro.style.left) <= tamanhoMin) {
        pos = 1
    }
    
    carro.style.left = parseInt(carro.style.left) + (10*pos) + "px"
    animacao = setTimeout(animacaoCarro, 20)
}

const atualizarTamanhoCarro = () => {
    carro.style.height = `${heightCarro}px`
    carro.style.width = `${widthCarro}px`
}

btnPlay.addEventListener('click', () => {
    clearTimeout(animacao)
    animacaoCarro()
})

btnStop.addEventListener('click', () => {
    clearTimeout(animacao)
})

window.addEventListener('keydown', (tecla) => {
    if (tecla.code === "ArrowUp") {
        widthCarro += 10
        heightCarro += 10
        atualizarTamanhoCarro()
    }
    if (tecla.code === "ArrowDown") {
        widthCarro -= 10
        heightCarro -= 10
        atualizarTamanhoCarro()
    }
})


