const caixa = document.querySelector('#caixa')

cursos = ['CSS', 'JavaScript', 'Python', '.Net']
cores = ['Azul', 'Roxo', 'Vermelho', 'Verde']

cursos.shift()
cursos.unshift('Django')
cursos.pop()
cursos.push('React')

cursos.map((el) => {
    let p = document.createElement('p')
    p.textContent = el
    caixa.appendChild(p)
})

cursos.push(cores)
console.log(cursos[4][1])