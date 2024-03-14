const timer = document.querySelector('#timer')
const btnIniciar = document.querySelector('#btnIniciar')
const btnParcial = document.querySelector('#btnParcial')
const btnParar = document.querySelector('#btnParar')
const btnZerar = document.querySelector('#btnZerar')

const parciaisRegistradas = document.querySelector('#parciaisregistradas')

let tStampIni
let intervaloCronometro;

function cronometro() {
    let tStampAtual = Date.now()
    let contadorSegundos = Math.floor((tStampAtual - tStampIni)/1000)
    // console.log(contadorSegundos)
    timer.textContent = relogio(contadorSegundos)
}

function relogio(seg) {
    let hora = Math.floor(seg / 3600)
    let restoHora = seg % 3600
    let minutos = Math.floor(restoHora / 60)
    let segundos = Math.floor(restoHora % 60)

    let formatacao = 
        (hora < 10 ? '0' + hora : hora) + ':' +
        (minutos < 10 ? '0' + minutos : minutos) + ':' +
        (segundos < 10 ? '0' + segundos : segundos) 

    return formatacao
}

btnIniciar.addEventListener('click', () => {
    tStampIni = Date.now()
    intervaloCronometro = setInterval(cronometro, 1000)
})

btnParcial.addEventListener('click', () => {
    parciaisRegistradas.innerHTML += '<div>' + timer.textContent + '</div>'
})

btnParar.addEventListener('click', () => {
    clearInterval(intervaloCronometro)
})

btnZerar.addEventListener('click', () => {
    clearInterval(intervaloCronometro)
    timer.textContent = '00:00:00' 
    parciaisRegistradas.textContent = ""
}) 
