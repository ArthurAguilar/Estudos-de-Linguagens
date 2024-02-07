const caixa1 = document.querySelector('#caixa1')
const caixa2 = document.querySelector('#caixa2')
const btnMover = document.querySelector('#btnMover')
const todosCursos = [...document.querySelectorAll('.curso')]

todosCursos.map((elem) => {
    elem.addEventListener('click', (evt) => {
        elem.classList.toggle('selecionado')
        // console.log(evt.target)
    })
})

btnMover.addEventListener('click', () => {
    const cursosSelecionados = [...document.querySelectorAll('.selecionado')]

    const cursosNaoSelecionados =[...document.querySelectorAll('.curso:not(.selecionado')]
    
    cursosSelecionados.map((el) => {
        caixa2.appendChild(el)
    })

    cursosNaoSelecionados.map((el) => {
        caixa1.appendChild(el)
    })

})
