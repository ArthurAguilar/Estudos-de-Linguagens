const texto = document.querySelector('#texto')

const endpoint = 'texto.txt'

fetch(endpoint)
    .then(res => res.json())
    .then(data => {
        console.log(data)
        console.log(data.Aluno)
        console.log(data.Idade)
    })