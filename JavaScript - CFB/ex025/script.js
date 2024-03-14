const q1 = document.querySelector('#q1')
const q2 = document.querySelector('#q2')
const posx = document.querySelector('#posx')
const posy = document.querySelector('#posy')
const altura = document.querySelector('#altura')
const largura = document.querySelector('#largura')


const info = (el) => {
    let DomRect = el.getBoundingClientRect()
    posx.innerHTML = `PosX: ${DomRect.x}`
    posy.innerHTML = `PosY: ${DomRect.y}`
    altura.innerHTML = `Altura: ${DomRect.height}`
    largura.innerHTML = `Largura: ${DomRect.width}`
}

q1.addEventListener('click', (evt) => {
    info(evt.target)
    console.log(q1.getBoundingClientRect())
})

q2.addEventListener('click', (evt) => {
    info(evt.target)
})

q1.accessKey = 'q'
q2.accessKey = 'w'




